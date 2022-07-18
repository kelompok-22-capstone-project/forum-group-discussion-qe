package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Threads.AdminTreadsCreate.IDPOSTREADSADMIN;
import static starter.ramean.Threads.UserTreadsCreate.urlposttreads;


public class AdminThreadsID {

    @Step("admin send get request by id")
    public void getReqadminThreadsID(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send get request by id without apikey")
    public void getReqadminThreadsIDApi(){
        SerenityRest.given().header("Authorization","Bearer "+ token).get(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send get request by id without token")
    public void getReqadminThreadsIDToken(){
        SerenityRest.given().header("API-Key", API_Key).get(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send get request by id with invalid ID")
    public void getReqAdminInvldID(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).get(urlposttreads + "/" + IDPOSTREADSADMIN + "13");
    }
}
