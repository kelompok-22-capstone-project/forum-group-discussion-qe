package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Threads.UserThreadsAll.urltrds;

public class AdminThreadsAll {

    @Step("admin send get request all threads")
    public void adminGetAllThreads(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds);
    }
    @Step("admin send get request all threads without Api Key")
    public void adminGetThreadsApiKey(){
        SerenityRest.given().header("Authorization","Bearer "+ token).get(urltrds);
    }
    @Step("admin send get request all threads without token")
    public void adminGetThreadsToken(){
        SerenityRest.given().header("API-Key", API_Key).get(urltrds);
    }
    @Step("admin send get request all threads with invalid endpoint")
    public void adminGetThreadsInvld(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds + "is8%2");
    }
    @Step("admin send get request all threads with negative page and limit")
    public void adminGetThreadsNegativePage(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds + "?page=-1&limit=-2");
    }
    @Step("admin send get request all threads with symbol page and limit")
    public void adminGetThreadsSymbolPage() {
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds + "?page=%&limit=-@");
    }
}
