package starter.ramean.Categories;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static starter.ramean.Categories.GetUser.API_Key;
import static starter.ramean.Categories.GetUser.url;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Categories.PutAdmin.ID;

public class GetAdminThread {


    @Step("admin send get request categori threads")
    public void getReqAdminThreads(){
        SerenityRest.given().header("Authorization","Bearer "+ token).header("API-Key", API_Key).get(url+"categories/"+ID+"/threads");
    }
    @Step("admin send get request categori threads without API Key")
    public void getAdminThreadsApiKey(){
        SerenityRest.given().header("Authorization","Bearer "+ token).get(url+"categories/"+ID+"/threads");
    }
    @Step("admin send get request categori threads without Token")
    public void getAdminThreadsToken(){
        SerenityRest.given().header("API-Key", API_Key).get(url+"categories/"+ID+"/threads");
    }
    @Step("admin send get request categori threads with invalid ID")
    public void getAdminThreadsId(){
        SerenityRest.given().header("Authorization","Bearer "+ token).header("API-Key", API_Key).get(url+"categories/"+ID+"a"+"/threads");
    }
    @Step("admin see message status ID not found")
    public void adminMessageIdNotFound(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Resource with given ID not found.");
    }
    @Step("admin see message status missing or malformed jwt")
    public void adminSeeMissingJwt(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "missing or malformed jwt");
    }
}
