package starter.ramean.Threads;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PutAdmin.ID;


public class UserTreadsCreate {

    public static String urlposttreads = "https://moot-rest-api.herokuapp.com/api/v1/threads";
    public static String IDPOSTREADSUESR = "";


    @Step("user send post request threads with all valid data validate ID Post")
    public void userPostTreadsNew(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","ini merypakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).post(urlposttreads);
        Response resp = SerenityRest.lastResponse();
        IDPOSTREADSUESR = resp.getBody().jsonPath().get("data.ID");
    }
    @Step("user send post request threads without title")
    public void userPostTreadsWithoutTitle(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("description","ini merypakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).post(urlposttreads);
    }
    @Step("user send post request threads without description")
    public void userPostTreadsWithoutDesc(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).post(urlposttreads);
    }
    @Step("user send post request threads without categoryID")
    public void userPostTreadsWithoutCatID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","ini merypakan testing dari create threads");
        requestBody.put("categoryID", "" );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).post(urlposttreads);
    }
    @Step("user send post request threads without api key")
    public void userPostTreadsWithoutApi(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","ini merypakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).post(urlposttreads);
    }
    @Step("user send post request threads without token")
    public void userPostTreadsWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","ini merypakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(urlposttreads);
    }
}
