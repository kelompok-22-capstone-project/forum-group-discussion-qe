package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PutAdmin.ID;
import static starter.ramean.Threads.UserTreadsCreate.IDPOSTREADSUESR;
import static starter.ramean.Threads.UserTreadsCreate.urlposttreads;

public class UserTreadsPut {

    @Step("user send PUT request by id")
    public void putReqUserThreadsID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user see status code 204")
    public void putStatusCode204(){
        restAssuredThat(response -> response.statusCode(204));
    }
    @Step("user send PUT request by id without title")
    public void userPutTreadsWithoutTitle(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send PUT request by id without description")
    public void userPutTreadsWithoutDesc(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send PUT request by id without categories ID")
    public void userPutTreadsWithoutCatID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", "" );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send PUT request by id without Api Key")
    public void userPutTreadsWithoutApi(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send PUT request by id without token")
    public void userPutTreadsWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSUESR);
    }

}
