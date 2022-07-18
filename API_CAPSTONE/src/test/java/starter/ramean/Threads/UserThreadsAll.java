package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;

public class UserThreadsAll {

    protected static String urltrds = "https://moot-rest-api.herokuapp.com/api/v1/threads";

    @Step("input endpoint threads")
    public String endpointThreads(){
        return urltrds;
    }
    @Step("user send get request all threads")
    public void userGetAllThreads(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(endpointThreads());
    }
    @Step("user send get request all threads without Api Key")
    public void userGetThreadsApiKey(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).get(endpointThreads());
    }
    @Step("user send get request all threads without token")
    public void userGetThreadsToken(){
        SerenityRest.given().header("API-Key", API_Key).get(endpointThreads());
    }
    @Step("user send get request all threads with invalid endpoint")
    public void userGetThreadsInvld(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds + "-@31");
    }
    @Step("user send get request all threads with negative page and limit")
    public void userGetThreadsNegativePage(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds + "?page=-1&limit=-2");
    }
    @Step("user send get request all threads with symbol page and limit")
    public void userGetThreadsSymbolPage(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds + "?page=%&limit=-@");
    }
}
