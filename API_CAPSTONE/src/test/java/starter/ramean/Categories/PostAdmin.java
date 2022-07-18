package starter.ramean.Categories;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class PostAdmin {

    public static String token = "";
    protected static String url = "https://moot-rest-api.herokuapp.com/api/v1/";
    public static String API_Key = "2ry3HBOBLi1YkCma49pdnH3RpMguwgNZ1bvU2eqCOzZg2y0g2j";

    @Step("admin succees auth using admin account")
    public void secceesAuthExixt(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username","admin");
        requestBody.put("password","kelompok22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post("https://moot-rest-api.herokuapp.com/api/v1/login");
        Response resp = SerenityRest.lastResponse();
        token = resp.getBody().jsonPath().get("data.token");
    }
    @Step("admin set endpoint for create categories")
    public String setEndpointpost(){
        return url + "categories";
    }
    @Step("admin send post request with valid all data")
    public void sendPostReq(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Keolahragaan");
        requestBody.put("description","ini testing body keolahragaan");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(setEndpointpost());
    }
    @Step("admin see succees status 201")
    public void statusCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }
    @Step("admin validate massage status")
    public void validateMassage(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("status");
        Assert.assertEquals(status, "success");

    }
    @Step("admin unsuccees auth using admin account")
    public void unsucsessLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username","ad min");
        requestBody.put("password","kelompok 22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post("https://moot-rest-api.herokuapp.com/api/v1/login");
        Response resp = SerenityRest.lastResponse();
        token = resp.getBody().jsonPath().get("data.token");
    }
    @Step("admin see succees status 401")
    public void statusCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
    @Step("admin see massage status missing or malformed jwt")
    public void massageExpiredJwt(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "invalid or expired jwt");
    }
    @Step("admin set invalid endpoint for create categories")
    public String invalidEndpoint(){
        return url + "categoriess";
    }
    @Step("admin send post request with valid all data with invalid endpoint")
    public void invalidEndpointBody(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Keolahragaan");
        requestBody.put("description","ini testing body keolahragaan");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(invalidEndpoint());
    }
    @Step("admin see succees status 404")
    public void statusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("admin see message status message not found")
    public void notFoundMessage(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Not Found");
    }
    @Step("admin send post request with empty all body")
    public void emptyBodyData(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","");
        requestBody.put("description","");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(setEndpointpost());
    }
    @Step("admin see unsuccees status 400")
    public void statusCode400(){
        restAssuredThat(response -> response.statusCode(400));;
    }
    @Step("admin see message status Invalid payload")
    public void invalidPayloadMessage(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Invalid payload. Please check the payload schema in the API Documentation.");
    }
    @Step("admin send post request with empty name body")
    public void emptyNameBodyData(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","");
        requestBody.put("description","inidesktipsisingkatnya");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(setEndpointpost());
    }
    @Step("admin send post request with empty description body")
    public void emptyDescriptionBodyData(){
        JSONObject requestBody =new JSONObject();
        requestBody.put("name","Ini Kategori");
        requestBody.put("description","");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(setEndpointpost());
    }

}
