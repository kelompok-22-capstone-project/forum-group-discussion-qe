package starter.ramean.Login;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginUser {

    protected static String urlLogin = "https://moot-rest-api.herokuapp.com/api/v1/";
    protected static String API_Key = "2ry3HBOBLi1YkCma49pdnH3RpMguwgNZ1bvU2eqCOzZg2y0g2j";

    @Step("user set endpoint for login")
    public String setLoginEndpoint(){
        return urlLogin + "login";
    }
    @Step("user set invalid endpoint for login")
    public String setInvalidLoginEndpoint(){
        return urlLogin + "login/login";
    }
    @Step("user see login status code 200")
    public void statusLoginCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("user see login status code 400")
    public void statusLoginCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("user see login status code 401")
    public void statusLoginCode401(){
        restAssuredThat(response -> response.statusCode(401));
    }
    @Step("user see login status code 404")
    public void statusLoginCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("user input valid data in body, set API-Key, and send post request login")
    public void validBodyLogin(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "syahmull");
        requestBody.put("password","Mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input invalid username in body, set API-Key, and send post request login")
    public void invalidUsername(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "syah mull");
        requestBody.put("password","Mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input valid username and invalid pass, set API-Key, and send post request login")
    public void invalidPassword(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "syahmull");
        requestBody.put("password","Mamah-muda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input unregisted data in body, set API-Key, and send post request login")
    public void unregistedDataBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "Rsyahmulloh123");
        requestBody.put("password","bukanmamahmuda");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setLoginEndpoint());
    }
    @Step("user input valid data in body and send post request login")
    public void withoutApiKey(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "syahmull");
        requestBody.put("password","Mamahmuda12");

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
        requestBody.put("username", "syahmull");
        requestBody.put("password","Mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).put(setLoginEndpoint());
    }
    @Step("user input valid data in body, set API-Key, and send post request loginn")
    public void invalidEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "syahmull");
        requestBody.put("password","Mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).put(setInvalidLoginEndpoint());
    }
    @Step("user see login sucsess status")
    public void sucsessLogin(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        String status2 = resp.getBody().jsonPath().get("data.role");
        Assert.assertEquals(status, "Login successful.");
        Assert.assertEquals(status2, "user");
    }
    @Step("user see message username not found")
    public void usernameNotFound(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "User with given username not found.");
    }
    @Step("user see message password not match")
    public void notMatch(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Username and password not match.");
    }
    @Step("user see message status missing key")
    public void missingApiKey(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "missing key in request header");
    }
    @Step("user see message Invalid payload")
    public void invalidPayload(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Invalid payload. Please check the payload schema in the API Documentation.");
    }
    @Step("user see message Not Found")
    public void notFound(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Not Found");
    }

}
