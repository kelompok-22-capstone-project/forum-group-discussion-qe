package starter.ramean.Categories;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static starter.ramean.Categories.PostAdmin.token;

public class PutAdmin {

    public static String ID = "";
    protected static String url = "https://moot-rest-api.herokuapp.com/api/v1/";
    protected static String API_Key = "2ry3HBOBLi1YkCma49pdnH3RpMguwgNZ1bvU2eqCOzZg2y0g2j";

    @Step("admin send post request and validate data ID")
    public void postRequestID(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Testing Olahraga");
        requestBody.put("description","ini testing body keolahragaan");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(url + "categories");
        Response resp = SerenityRest.lastResponse();
        ID = resp.getBody().jsonPath().get("data.ID");
    }
    @Step("admin send put request with valid all data")
    public void sendRequestData(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Keolahragaan Baru");
        requestBody.put("description","ini testing perubahan untuk put keolahragaan");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(url + "categories/" + ID);
    }
    @Step("admin see succees status 204")
    public void seeStatus204(){
        restAssuredThat(response -> response.statusCode(204));
    }
    @Step("admin send put request with empty description")
    public void sendEmptyDesc(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Keolahragaan Baru");
        requestBody.put("description","");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(url + "categories/" + ID);

    }
    @Step("admin send put request with empty name")
    public void sendEmptyName(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","");
        requestBody.put("description","ini testing perubahan untuk put keolahragaan");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(url + "categories/" + ID);

    }
    @Step("admin send put request with empty data")
    public void sendEmptyData(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","");
        requestBody.put("description","");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(url + "categories/" + ID);

    }
    @Step("admin send put request with valid all data without API Key")
    public void sendApiKey(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Keolahragaan Baru");
        requestBody.put("description","ini testing perubahan untuk put keolahragaan");

        SerenityRest.given().header("Content-Type", "application/json").header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).put(url + "categories/" + ID);
    }
    @Step("admin send put request with valid all data without Token")
    public void sendTokennya(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Keolahragaan Baru");
        requestBody.put("description","ini testing perubahan untuk put keolahragaan");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).put(url + "categories/" + ID);

    }

}
