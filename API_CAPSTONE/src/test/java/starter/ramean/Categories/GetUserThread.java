package starter.ramean.Categories;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static starter.ramean.Categories.PutAdmin.ID;
import static starter.ramean.Categories.GetUser.API_Key;
import static starter.ramean.Categories.GetUser.url;

public class GetUserThread {

    public static String tokenuser = "";

    @Step("user succees auth using exist account")
    public void userSucceesLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "syahmull");
        requestBody.put("password","Mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(url + "login");
        Response resp = SerenityRest.lastResponse();
        tokenuser = resp.getBody().jsonPath().get("data.token");

    }
    @Step("input endpoint categori threads")
    public String inputEndpointCat(){
        return url + "categories/" + ID + "/threads";
    }
    @Step("user send get request categori threads")
    public void userSendReqCat(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).header("API-Key", API_Key).get(inputEndpointCat());
    }
    @Step("user send get request categori threads without API Key")
    public void getCatApiKey(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).get(inputEndpointCat());

    }
    @Step("user send get request categori threads without Token")
    public void getCatToken(){
        SerenityRest.given().header("API-Key", API_Key).get(inputEndpointCat());

    }
    @Step("user see message status jwt")
    public void userStatusJwt(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "missing or malformed jwt");
    }
    @Step("user send get request categori threads with invalid ID")
    public void sendInvalidId(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).header("API-Key", API_Key).get(url+"categories/"+ID+"a"+"/threads");

    }
    @Step("user see message status ID not found")
    public void messageStatusId(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Resource with given ID not found.");
    }

}
