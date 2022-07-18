package starter.ramean.Login;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class LoginAdmin {

    protected static String urlLogin = "https://moot-rest-api.herokuapp.com/api/v1/";
    protected static String API_Key = "2ry3HBOBLi1YkCma49pdnH3RpMguwgNZ1bvU2eqCOzZg2y0g2j";

    @Step("user set endpoint for login admin")
    public String setLoginEndpoint(){
        return urlLogin + "login";
    }
    @Step("user set invalid endpoint for login admin")
    public String setInvalidLoginEndpoint(){
        return urlLogin + "loginadmin";
    }

    @Step("user see login sucsess status admin status")
    public void adminStatus(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        String status2 = resp.getBody().jsonPath().get("data.role");
        Assert.assertEquals(status, "Login successful.");
        Assert.assertEquals(status2, "admin");
    }

    @Step("user input valid data in body, set API-Key, and send post request login")
    public void validBodyLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password","kelompok22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input invalid username in body, set API-Key, and send post request login")
    public void invalidUsername(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "ad min");
        requestBody.put("password","kelompok22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input valid username and invalid pass, set API-Key, and send post request login")
    public void invalidPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password","Kelompok22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input unregisted data in body, set API-Key, and send post request login")
    public void unregistedDataBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "adamimin");
        requestBody.put("password","kelom pox22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input valid data in body and send post request login")
    public void withoutApiKey(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password","kelompok22");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user set API-Key and send post request login")
    public void emptyBodyData(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "");
        requestBody.put("password","");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input valid data in body, set API-Key, and send put request login")
    public void putMethode(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password","kelompok22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).put(setLoginEndpoint());
    }
    @Step("user input valid data in body, set API-Key, and send post request loginn")
    public void invalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "admin");
        requestBody.put("password","kelompok22");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).put(setInvalidLoginEndpoint());
    }

}
