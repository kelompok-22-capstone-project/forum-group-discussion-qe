package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Threads.UserTreadsCreate.IDPOSTREADSUESR;
import static starter.ramean.Threads.UserTreadsCreate.urlposttreads;

public class UserDeleteTreadsID {

    @Step("user send DELETE request by id")
    public void userDeleteTreadID(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).delete(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send DELETE request by id without api key")
    public void userDeleteTreadIDApi(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).delete(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send DELETE request by id without token")
    public void userDeleteTreadIDToken(){
        SerenityRest.given().header("API-Key", API_Key).delete(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("user send DELETE request by id with invalid id treads")
    public void userDeleteTreadIDTreads(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).delete(urlposttreads + "/" + IDPOSTREADSUESR + "/aha");
    }




}
