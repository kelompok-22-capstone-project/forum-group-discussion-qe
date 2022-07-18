package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Threads.AdminTreadsGetComment.ID_ADMIN_GET_TREAD;
import static starter.ramean.Threads.UserThreadsAll.urltrds;
import static starter.ramean.Threads.UserThreadsCommentGET.ID_FIRST_GET_TREAD;

public class UserAdmiPutLike {

    @Step("user send PUT like request by id")
    public void putUserLike(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).put(urltrds + "/" + ID_FIRST_GET_TREAD + "/like");
    }
    @Step("user send PUT like request by id without api key")
    public void putUserLikeApi(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).put(urltrds + "/" + ID_FIRST_GET_TREAD + "/like");
    }

//------------------------------------------------------------------------------
//------------------Admin-------------------------------------------------------

    @Step("admin send PUT like request by id")
    public void putAdminLike(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).put(urltrds + "/" + ID_ADMIN_GET_TREAD + "/like");
    }
    @Step("admin send PUT like request by id without token")
    public void putAdminLikeToken(){
        SerenityRest.given().header("API-Key", API_Key).put(urltrds + "/" + ID_ADMIN_GET_TREAD + "/like");
    }
    
}
