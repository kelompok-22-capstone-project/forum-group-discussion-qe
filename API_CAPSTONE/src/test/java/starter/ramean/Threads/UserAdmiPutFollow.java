package starter.ramean.Threads;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.GetUserThread.tokenuser;
import static starter.ramean.Categories.PostAdmin.API_Key;
import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Threads.AdminTreadsGetComment.ID_ADMIN_GET_TREAD;
import static starter.ramean.Threads.UserThreadsAll.urltrds;
import static starter.ramean.Threads.UserThreadsCommentGET.ID_FIRST_GET_TREAD;

public class UserAdmiPutFollow {



    @Step("user send PUT follow request by id")
    public void putUserFollow(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ tokenuser).put(urltrds + "/" + ID_FIRST_GET_TREAD + "/follow");
    }
    @Step("user send PUT follow request by id without api key")
    public void putUserFollowApi(){
        SerenityRest.given().header("Authorization","Bearer "+ tokenuser).put(urltrds + "/" + ID_FIRST_GET_TREAD + "/follow");
    }

//------------------------------------------------------------------------------
//------------------Admin-------------------------------------------------------

    @Step("admin send PUT follow request by id")
    public void putAdminFollow(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).put(urltrds + "/" + ID_ADMIN_GET_TREAD + "/follow");
    }
    @Step("admin send PUT follow request by id without token")
    public void putAdminFollowToken(){
        SerenityRest.given().header("API-Key", API_Key).put(urltrds + "/" + ID_ADMIN_GET_TREAD + "/follow");
    }
    
}
