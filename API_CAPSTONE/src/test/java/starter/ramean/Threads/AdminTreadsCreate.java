package starter.ramean.Threads;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.Random;

import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Categories.PutAdmin.ID;
import static starter.ramean.Threads.UserTreadsCreate.urlposttreads;

public class AdminTreadsCreate {

    public static String IDPOSTREADSADMIN = "";

    @Step("admin send post request threads with all valid data validate ID Post")
    public void adminPostTreadsNew(){
        Random rand = new Random();
        int number = rand.nextInt(100000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian" + String.valueOf(number));
        requestBody.put("description","ini merupakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(urlposttreads);
        Response resp = SerenityRest.lastResponse();
        IDPOSTREADSADMIN = resp.getBody().jsonPath().get("data.ID");
    }
    @Step("admin send post request threads without title")
    public void adminPostTreadsWithoutTitle(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("description","ini merupakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(urlposttreads);

    }
    @Step("admin send post request threads without description")
    public void adminPostTreadsWithoutDesc(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(urlposttreads);

    }
    @Step("admin send post request threads without categoryID")
    public void adminPostTreadsWithoutCatID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","ini merupakan testing dari create threads");
        requestBody.put("categoryID", "" );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(urlposttreads);

    }
    @Step("admin send post request threads without api key")
    public void adminPostTreadsWithoutApi(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","ini merupakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(urlposttreads);

    }
    @Step("admin send post request threads without token")
    public void adminPostTreadsWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "Testing Rian");
        requestBody.put("description","ini merupakan testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(urlposttreads);
    }
}
