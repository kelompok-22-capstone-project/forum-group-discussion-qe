package starter.ramean;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.junit.Assert;

import java.util.Random;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {

    protected static String url = "https://moot-rest-api.herokuapp.com/api/v1/";
    protected static String API_Key = "2ry3HBOBLi1YkCma49pdnH3RpMguwgNZ1bvU2eqCOzZg2y0g2j";

    @Step("user set endpoint for register")
    public String setEndponts(){
        return url + "register";
    }

    @Step("user input valid data in body, set API-Key, and send post request")
    public void inputValidBody() {
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testing" + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+"@gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setEndponts());
    }

    @Step("user see status code 201")
    public void statusCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("user see sucsess status")
    public void validateStatus(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("status");
        Assert.assertEquals(status, "success");
    }

    @Step("user input already exists data in body, set API-Key, and send post request")
    public void withoutInputBody(){
        SerenityRest.given().header("API-Key", API_Key).post(setEndponts());
    }

    @Step("user see status code 400")
    public void statusCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user see massage Invalid payload")
    public void validasiStatus() {
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Invalid payload. Please check the payload schema in the API Documentation.");
    }

    @Step("user set invalid endpoint")
    public String invalidEndponito(){
        return url + "registerto";
    }

    @Step("user input valid data in body, set API-Key, and send post requesto")
    public void sendRequestto(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testing" + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+"@gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(invalidEndponito());
    }

    @Step("user see status code 404")
    public void statusCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("user see massage not found")
    public void validasiNotFound(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Not Found");
    }

    @Step("user input valid data in body, set API-Key, and send get request")
    public void invalidMethodee(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testing" + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+"@gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).get(setEndponts());
    }

    @Step ("user input valid data in body and send post request")
    public void validDataPost(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testing" + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+"@gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setEndponts());
    }

    @Step("user see massage missing key in request header")
    public void missingKey(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "missing key in request header");
    }

    @Step ("user input username,email, and password data in body, set API-Key, and send post request")
    public void oneEmptyData(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testing" + String.valueOf(number));
        requestBody.put("email", "");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setEndponts());
    }

    @Step ("user input username and email data in body, set API-Key, and send post request")
    public void sendSameBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "riansyahmulloh");
        requestBody.put("email", "riansyahmulloh@gmail.com");
        requestBody.put("name","Rian Syahmulloh H");
        requestBody.put("Password", "Mamahmuda1234");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setEndponts());
    }

    @Step("user see massage data already exists")
    public void alreadyExistsMessage(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Data already exists.");
    }

    @Step ("user input valid all data and invalid email without @ in body, set API-Key, and send post request")
    public void withoutTypeAt(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testing" + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+" gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setEndponts());
    }

    @Step ("user input valid all data and invalid username with spacebar in body, set API-Key, and send post request")
    public void usernameWithoutSpacebar(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "testing " + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+" gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setEndponts());
    }
    @Step ("user input valid all data and invalid username with capital letters in body, set API-Key, and send post request")
    public void usernameWithCapital(){
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "Testing" + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+" gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).body(requestBody.toJSONString()).post(setEndponts());
    }
}
