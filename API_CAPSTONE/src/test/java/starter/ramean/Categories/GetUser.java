package starter.ramean.Categories;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static starter.ramean.Categories.PostAdmin.token;

public class GetUser {

    protected static String url = "https://moot-rest-api.herokuapp.com/api/v1/";
    protected static String API_Key = "2ry3HBOBLi1YkCma49pdnH3RpMguwgNZ1bvU2eqCOzZg2y0g2j";

    @Step("user set endpoint for categories")
    public String setEndpointUser(){
        return url + "categories";
    }
    @Step("user set invalid endpoint for categories")
    public String invalidEdpointUser(){
        return url + "categorie12s";
    }
    @Step("user send get request with valid all data")
    public void validAllDataReqUser(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(setEndpointUser());
    }
    @Step("user send get request with valid data without Api Key")
    public void withoutApiKeyUser(){
        SerenityRest.given().header("Authorization","Bearer "+ token).get(setEndpointUser());
    }
    @Step("user send get request with valid all data with invalid endpoint")
    public void requestInvalidEndpointUser(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(invalidEdpointUser());
    }
    @Step("user see succees status 200")
    public void seeStatus200User(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("user see unsuccees status 404")
    public void seeStatus404User(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("user validate massage status")
    public void validateMassageUser(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("status");
        Assert.assertEquals(status, "success");
    }
    @Step("user see message status message not found")
    public void validateNotFoundUser(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Not Found");
    }


}
