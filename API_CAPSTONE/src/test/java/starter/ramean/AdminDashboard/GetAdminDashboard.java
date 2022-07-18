package starter.ramean.AdminDashboard;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;

public class GetAdminDashboard {

    protected String urladmin = "https://moot-rest-api.herokuapp.com/api/v1/admin/dashboard";


    @Step("admin input endpoint admin dashboard")
    public String adminInputEndpoint(){
        return urladmin;
    }
    @Step("admin send get request admin dashboard")
    public void adminGetRequest(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(adminInputEndpoint());
    }
    @Step("user send get request admin dashboard")
    public void getAdminDashboard(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(adminInputEndpoint());

    }
    @Step("admin send get request admin dashboard without Api Key")
    public void getAdminApiKey(){
        SerenityRest.given().header("Authorization","Bearer "+ token).get(adminInputEndpoint());

    }
    @Step("admin send get request admin dashboard without Token")
    public void getAdminToken(){
        SerenityRest.given().header("API-Key", API_Key).get(adminInputEndpoint());

    }
    @Step("admin send get request admin dashboard with invalid endpoint")
    public void getAdminInvalidEndpoint(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urladmin+"tetsing");
    }
    @Step("admin validate massage Status")
    public void statusMessageAdmin(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("status");
        Assert.assertEquals(status, "Success");
    }
    @Step("user see status code 403")
    public void status403(){
        restAssuredThat(response -> response.statusCode(403));
    }
    @Step("user see message Access forbidden role")
    public void messageForbiddenRole(){
        Response resp = SerenityRest.lastResponse();
        String status = resp.getBody().jsonPath().get("message");
        Assert.assertEquals(status, "Access to this resource is forbidden for current role.");

    }
}
