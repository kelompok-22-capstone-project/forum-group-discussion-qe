package starter.ramean.Threads;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Threads.UserThreadsAll.urltrds;

public class UserThreadsCommentGET {

    public static String ID_FIRST_GET_TREAD = "";

    @Step("user send get request all threads and validate first ID")
    public void getUserValidateFirstID(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds);

        Response resp = SerenityRest.lastResponse();
        ID_FIRST_GET_TREAD = resp.getBody().jsonPath().get("data.list.ID[0]");
    }
    @Step("user send GET COMMENT request by id")
    public void getUserCommentID(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments");
    }
    @Step("user send GET COMMENT request by id without api key")
    public void getUserCommentIDApikey(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).get(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments");
    }
    @Step("user send GET COMMENT request by id without token")
    public void getUserCommentIDToken(){
        SerenityRest.given().header("API-Key", API_Key).get(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments");
    }
    @Step("user send GET COMMENT request by id with invalid endpoint")
    public void getUserCommentIDInvalidEndpoint(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments12");
    }
    @Step("user send GET COMMENT request by id with with negative page and limit")
    public void getUserCommentIDNegative(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments?page=-1&limit=-5");
    }
    @Step("user send GET COMMENT request by id with with symbol page and limit")
    public void getUserCommentIDSymbolPageLimit(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments?page=()&limit=!@#");
    }

}
