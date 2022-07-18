package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Threads.UserThreadsAll.urltrds;

public class UserAddPutModerator {

    @Step("user send PUT add moderator request a thread")
    public void putUserAddModerator(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "Firga");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).put(urltrds + "/t-OtpkxLf/moderators/add");
    }
    @Step("user remove moderator thread")
    public void putUserRemoveModerator(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "Firga");

        SerenityRest.given().header("Content-Type", "application/json").header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).body(requestBody.toJSONString()).put(urltrds + "/t-OtpkxLf/moderators/remove");
    }


}
