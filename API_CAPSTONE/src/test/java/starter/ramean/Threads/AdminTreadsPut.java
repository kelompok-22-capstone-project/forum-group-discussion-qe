package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Categories.PutAdmin.ID;
import static starter.ramean.Threads.AdminTreadsCreate.IDPOSTREADSADMIN;
import static starter.ramean.Threads.UserTreadsCreate.urlposttreads;

public class AdminTreadsPut {


    @Step("admin send PUT request by id")
    public void putReqAdminThreadsID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send PUT request by id without title")
    public void adminPutTreadsWithoutTitle(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send PUT request by id without description")
    public void adminPutTreadsWithoutDesc(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send PUT request by id without categories ID")
    public void adminPutTreadsWithoutCatID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", "" );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send PUT request by id without Api Key")
    public void adminPutTreadsWithoutApi(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send PUT request by id without token")
    public void adminPutTreadsWithoutToken(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "PUT Testing Rian");
        requestBody.put("description","ini merupakan PUT testing dari create threads");
        requestBody.put("categoryID", ID );

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).put(urlposttreads + "/" + IDPOSTREADSADMIN);
    }

}
