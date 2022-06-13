package starter.ramean;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
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

    @Step("user set headers value API-Key")
      public void valueApiKey(){
        JSONArray bodyArray = new JSONArray();

        SerenityRest.given().header("Authorization","API-Key " +API_Key).body(bodyArray.toJSONString()).post(setEndponts());
    }


    @Step("user input valid all data in body")
    public void inputValidBody() {
        Random rand = new Random();
        int number = rand.nextInt(1000000);

        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "Testing" + String.valueOf(number));
        requestBody.put("email", "amulloh"+ String.valueOf(number)+"@gmail.com");
        requestBody.put("name","Testing Rian");
        requestBody.put("Password", "mamahmuda12");

        SerenityRest.given().header("Conten-Type", "application/json").body(requestBody.toJSONString()).post(setEndponts());
    }

    @Step("user see status code 201")
    public void statusCode201(){
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("user see sucsess status")
    public void validateStatus(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("data.status");
        Assert.assertEquals(status, "success");
    }

}
