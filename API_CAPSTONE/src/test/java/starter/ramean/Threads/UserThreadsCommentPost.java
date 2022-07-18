package starter.ramean.Threads;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import java.util.Random;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Threads.AdminTreadsGetComment.ID_ADMIN_GET_TREAD;
import static starter.ramean.Threads.UserThreadsAll.urltrds;
import static starter.ramean.Threads.UserThreadsCommentGET.ID_FIRST_GET_TREAD;

public class UserThreadsCommentPost {

    public static String ID_POST_COMMENTKU = "";
    public static String ID_POST_COMMENTKU_ADMIN = "";


    @Step("user send POST COMMENT request by id")
    public void postUserCommentID(){
        Random rand = new Random();
        int number = rand.nextInt(100);

        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "Wahhh testingnya berhasil sekali min " + String.valueOf(number));

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).post(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments");

        Response resp = SerenityRest.lastResponse();
        ID_POST_COMMENTKU = resp.getBody().jsonPath().get("data.ID");

    }
    @Step("user send POST COMMENT request by id with empty comment")
    public void postUserCommentIDInvalidComment(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).post(urltrds + "/" + ID_FIRST_GET_TREAD + "/comments");
    }


//-----------------------------------------------------------------------------------------
//----- Admin ------------

    @Step("admin send POST COMMENT request by id with empty comment")
    public void postAdminCommentIDEmpty(){
        Random rand = new Random();
        int number = rand.nextInt(100);

        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments");

        Response resp = SerenityRest.lastResponse();
        ID_POST_COMMENTKU_ADMIN = resp.getBody().jsonPath().get("data.ID");

    }
    @Step("admin send POST COMMENT request by id")
    public void postAdminCommentID(){
        Random rand = new Random();
        int number = rand.nextInt(100);

        JSONObject requestBody = new JSONObject();
        requestBody.put("comment", "Wahhh testingnya berhasil sekali, Ini Admin " + String.valueOf(number));

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ token).body(requestBody.toJSONString()).post(urltrds + "/" + ID_ADMIN_GET_TREAD + "/comments");

        Response resp = SerenityRest.lastResponse();
        ID_POST_COMMENTKU_ADMIN = resp.getBody().jsonPath().get("data.ID");
    }

}
