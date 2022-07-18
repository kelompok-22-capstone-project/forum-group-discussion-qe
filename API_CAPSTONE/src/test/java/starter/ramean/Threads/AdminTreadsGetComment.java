package starter.ramean.Threads;


import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Threads.UserThreadsAll.urltrds;

public class AdminTreadsGetComment {

    public static String ID_ADMIN_GET_TREAD = "";

    @Step("admin send get request all threads and validate first ID")
    public void getAdminCommentIDFirst(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds);

        Response resp = SerenityRest.lastResponse();
        ID_ADMIN_GET_TREAD = resp.getBody().jsonPath().get("data.list.ID[0]");
    }
    @Step("admin send GET COMMENT request by id")
    public void getAdminCommentIDGet(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments");
    }
    @Step("admin send GET COMMENT request by id without Api")
    public void getadminCommentIDApikey(){
        SerenityRest.given().header("Authorization","Bearer "+ token).get(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments");

    }
    @Step("admin send GET COMMENT request by id without token")
    public void getadminCommentIDToken(){
        SerenityRest.given().header("API-Key", API_Key).get(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments");
    }
    @Step("admin send GET COMMENT request by id with invalid endpoint")
    public void getadminCommentIDInvalidEndpoint(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments500");
    }
    @Step("admin send GET COMMENT request by id with negative page and limit")
    public void getadminCommentIDNegative(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments?page=-1&limit=-5");

    }
    @Step("admin send GET COMMENT request by id with symbol page and limit")
    public void getadminCommentIDSymbolPageLimit() {
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments?page=()&limit=-=)");

    }
}
