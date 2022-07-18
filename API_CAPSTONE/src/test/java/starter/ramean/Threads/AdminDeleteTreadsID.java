package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Threads.AdminTreadsCreate.IDPOSTREADSADMIN;
import static starter.ramean.Threads.UserTreadsCreate.IDPOSTREADSUESR;
import static starter.ramean.Threads.UserTreadsCreate.urlposttreads;

public class AdminDeleteTreadsID {

    @Step("admin send DELETE request by id admin")
    public void adminDeleteTreadIDAdmin(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).delete(urlposttreads + "/" + IDPOSTREADSADMIN);
    }
    @Step("admin send DELETE request by id user")
    public void adminDeleteTreadIDUser(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).delete(urlposttreads + "/" + IDPOSTREADSUESR);
    }
    @Step("admin send DELETE request by id admin without Api key")
    public void adminDeleteTreadIDApiKey(){
        SerenityRest.given().header("Authorization","Bearer "+ token).delete(urlposttreads + "/" + IDPOSTREADSADMIN);

    }
    @Step("admin send DELETE request by id admin without token")
    public void adminDeleteTreadIDToken(){
        SerenityRest.given().header("API-Key", API_Key).delete(urlposttreads + "/" + IDPOSTREADSADMIN);

    }
    @Step("admin send DELETE request by id admin with invalid id treads")
    public void adminDeleteTreadIDTreads(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).delete(urlposttreads + "/" + IDPOSTREADSADMIN + "ehe");
    }
}
