package starter.ramean.Categories;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static starter.ramean.Categories.PostAdmin.token;

public class GetAdmin {

    protected static String url = "https://moot-rest-api.herokuapp.com/api/v1/";
    protected static String API_Key = "2ry3HBOBLi1YkCma49pdnH3RpMguwgNZ1bvU2eqCOzZg2y0g2j";

    @Step("admin set endpoint for categories")
    public String adminSetEndpoint(){
        return url + "categories";
    }
    @Step("admin set invalid endpoint for categories")
    public String invalidEndpoint(){
        return url + "categorie12s";
    }
    @Step("admin send get request with valid all data")
    public void getReqValidData(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(adminSetEndpoint());
    }
    @Step("admin send get request with valid data without Api Key")
    public void getReqApiKey(){
        SerenityRest.given().header("Authorization","Bearer "+ token).get(adminSetEndpoint());
    }
    @Step("admin send get request with valid all data with invalid endpoint")
    public void getReqinvalidEndpoint(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(invalidEndpoint());
    }
    @Step("admin see status code 400")
    public void statusCode400(){
        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("admin see succees status 200")
    public void success200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("admin see message status missing key")
    public void missingKey(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "missing key in request header");
    }

}
