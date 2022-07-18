package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Threads.UserTreadsCreate.IDPOSTREADSUESR;
import static starter.ramean.Threads.UserTreadsCreate.urlposttreads;

public class UserThreadsID {

    @Step("user send get request by id")
    public void getReqUserThreadsID(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send get request by id without apikey")
    public void getReqUserThreadsIDApi(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).get(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send get request by id without token")
    public void getReqUserThreadsIDToken(){
        SerenityRest.given().header("API-Key", API_Key).get(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send get request by id with invalid ID")
    public void getReqUserInvldID(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).get(urlposttreads + "/" + IDPOSTREADSUESR + "12");
    }
}

