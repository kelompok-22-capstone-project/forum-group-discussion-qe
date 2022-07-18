package starter.stepdefinitions.threads;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Threads.*;

public class Threadsteps {

    @Steps
    UserThreadsAll userthreads;

    @Steps
    AdminThreadsAll adminthreads;

    @Steps
    UserTreadsCreate userposttreads;

    @Steps
    AdminTreadsCreate adminposttreads;

    @Steps
    UserThreadsID userthreadsID;

    @Steps
    AdminThreadsID adminThreadsID;

    @Steps
    UserTreadsPut userputtreads;

    @Steps
    AdminTreadsPut adminputtreads;

    @Steps
    UserDeleteTreadsID userdeleteid;

    @Steps
    AdminDeleteTreadsID admindeleteid;

    @Steps
    UserThreadsCommentGET usercommentget;

    @Steps
    AdminTreadsGetComment admincommentget;

    @Steps
    UserThreadsCommentPost usercompost;

    @Steps
    UserAdmiPutFollow userfollow;

    @Steps
    UserAdmiPutLike userlike;

    @Steps
    UserAddPutModerator useraddmoderator;





    @When("input endpoint threads")
    public void endpointThreads(){
        userthreads.endpointThreads();
    }
    @And("user send get request all threads")
    public void userGetAllThreads(){
        userthreads.userGetAllThreads();
    }
    @And("user send get request all threads without Api Key")
    public void userGetThreadsApiKey(){
        userthreads.userGetThreadsApiKey();
    }
    @And("user send get request all threads without token")
    public void userGetThreadsToken(){
        userthreads.userGetThreadsToken();
    }
    @And("user send get request all threads with invalid endpoint")
    public void userGetThreadsInvld(){
        userthreads.userGetThreadsInvld();
    }
    @And("user send get request all threads with negative page and limit")
    public void userGetThreadsNegativePage(){
        userthreads.userGetThreadsNegativePage();
    }
    @And("user send get request all threads with symbol page and limit")
    public void userGetThreadsSymbolPage(){
        userthreads.userGetThreadsSymbolPage();
    }

//  -------------------------------------------------------------------------------

    @And("admin send get request all threads")
    public void adminGetAllThreads(){
        adminthreads.adminGetAllThreads();
    }
    @And("admin send get request all threads without Api Key")
    public void adminGetThreadsApiKey(){
        adminthreads.adminGetThreadsApiKey();
    }
    @And("admin send get request all threads without token")
    public void adminGetThreadsToken(){
        adminthreads.adminGetThreadsToken();
    }
    @And("admin send get request all threads with invalid endpoint")
    public void adminGetThreadsInvld(){
        adminthreads.adminGetThreadsInvld();
    }
    @And("admin send get request all threads with negative page and limit")
    public void adminGetThreadsNegativePage(){
        adminthreads.adminGetThreadsNegativePage();
    }
    @And("admin send get request all threads with symbol page and limit")
    public void adminGetThreadsSymbolPage() {
        adminthreads.adminGetThreadsSymbolPage();
    }

//  -------------------------------------------------------------------------------

    @When("user send post request threads with all valid data validate ID Post")
    public void userPostTreadsNew(){
        userposttreads.userPostTreadsNew();
    }
    @When("user send post request threads without title")
    public void userPostTreadsWithoutTitle(){
        userposttreads.userPostTreadsWithoutTitle();
    }
    @When("user send post request threads without description")
    public void userPostTreadsWithoutDesc(){
        userposttreads.userPostTreadsWithoutDesc();
    }
    @When("user send post request threads without categoryID")
    public void userPostTreadsWithoutCatID(){
        userposttreads.userPostTreadsWithoutCatID();
    }
    @When("user send post request threads without api key")
    public void userPostTreadsWithoutApi(){
        userposttreads.userPostTreadsWithoutApi();
    }
    @When("user send post request threads without token")
    public void userPostTreadsWithoutToken(){
        userposttreads.userPostTreadsWithoutToken();
    }

//  -------------------------------------------------------------------------------

    @When("admin send post request threads with all valid data validate ID Post")
    public void adminPostTreadsNew(){
        adminposttreads.adminPostTreadsNew();
    }
    @When("admin send post request threads without title")
    public void adminPostTreadsWithoutTitle(){
        adminposttreads.adminPostTreadsWithoutTitle();
    }
    @When("admin send post request threads without description")
    public void adminPostTreadsWithoutDesc(){
        adminposttreads.adminPostTreadsWithoutDesc();
    }
    @When("admin send post request threads without categoryID")
    public void adminPostTreadsWithoutCatID(){
        adminposttreads.adminPostTreadsWithoutCatID();
    }
    @When("admin send post request threads without api key")
    public void adminPostTreadsWithoutApi(){
        adminposttreads.adminPostTreadsWithoutApi();
    }
    @When("admin send post request threads without token")
    public void adminPostTreadsWithoutToken(){
        adminposttreads.adminPostTreadsWithoutToken();
    }

//  -------------------------------------------------------------------------------

    @When("user send get request by id")
    public void getReqUserThreadsID(){
        userthreadsID.getReqUserThreadsID();
    }
    @When("user send get request by id without apikey")
    public void getReqUserThreadsIDApi(){
        userthreadsID.getReqUserThreadsIDApi();
    }
    @When("user send get request by id without token")
    public void getReqUserThreadsIDToken(){
        userthreadsID.getReqUserThreadsIDToken();
    }
    @When("user send get request by id with invalid ID")
    public void getReqUserInvldID(){
        userthreadsID.getReqUserInvldID();
    }

//  -------------------------------------------------------------------------------

    @When("admin send get request by id")
    public void getReqadminThreadsID(){
        adminThreadsID.getReqadminThreadsID();
    }
    @When("admin send get request by id without apikey")
    public void getReqadminThreadsIDApi(){
        adminThreadsID.getReqadminThreadsIDApi();
    }
    @When("admin send get request by id without token")
    public void getReqadminThreadsIDToken(){
        adminThreadsID.getReqadminThreadsIDToken();
    }
    @When("admin send get request by id with invalid ID")
    public void getReqAdminInvldID(){
        adminThreadsID.getReqAdminInvldID();
    }

//  -------------------------------------------------------------------------------

    @When("user send PUT request by id")
    public void putReqUserThreadsID(){
        userputtreads.putReqUserThreadsID();
    }
    @And("user see status code 204")
    public void putStatusCode204(){
        userputtreads.putStatusCode204();
    }
    @When("user send PUT request by id without title")
    public void userPutTreadsWithoutTitle(){
        userputtreads.userPutTreadsWithoutTitle();
    }
    @When("user send PUT request by id without description")
    public void userPutTreadsWithoutDesc(){
        userputtreads.userPutTreadsWithoutDesc();
    }
    @When("user send PUT request by id without categories ID")
    public void userPutTreadsWithoutCatID(){
        userputtreads.userPutTreadsWithoutCatID();
    }
    @When("user send PUT request by id without Api Key")
    public void userPutTreadsWithoutApi(){
        userputtreads.userPutTreadsWithoutApi();
    }
    @When("user send PUT request by id without token")
    public void userPutTreadsWithoutToken(){
        userputtreads.userPutTreadsWithoutToken();
    }

//  -------------------------------------------------------------------------------

    @When("admin send PUT request by id")
    public void putReqAdminThreadsID(){
        adminputtreads.putReqAdminThreadsID();
    }
    @When("admin send PUT request by id without title")
    public void adminPutTreadsWithoutTitle(){
        adminputtreads.adminPutTreadsWithoutTitle();
    }
    @When("admin send PUT request by id without description")
    public void adminPutTreadsWithoutDesc(){
        adminputtreads.adminPutTreadsWithoutDesc();
    }
    @When("admin send PUT request by id without categories ID")
    public void adminPutTreadsWithoutCatID(){
        adminputtreads.adminPutTreadsWithoutCatID();
    }
    @When("admin send PUT request by id without Api Key")
    public void adminPutTreadsWithoutApi(){
        adminputtreads.adminPutTreadsWithoutApi();
    }
    @When("admin send PUT request by id without token")
    public void adminPutTreadsWithoutToken(){
        adminputtreads.adminPutTreadsWithoutToken();
    }

//  -------------------------------------------------------------------------------

    @When("user send DELETE request by id")
    public void userDeleteTreadID(){
        userdeleteid.userDeleteTreadID();
    }
    @When("user send DELETE request by id without api key")
    public void userDeleteTreadIDApi(){
        userdeleteid.userDeleteTreadIDApi();
    }
    @When("user send DELETE request by id without token")
    public void userDeleteTreadIDToken(){
        userdeleteid.userDeleteTreadIDToken();
    }
    @When("user send DELETE request by id with invalid id treads")
    public void userDeleteTreadIDTreads(){
        userdeleteid.userDeleteTreadIDTreads();
    }

//  -------------------------------------------------------------------------------

    @When("admin send DELETE request by id admin")
    public void adminDeleteTreadIDAdmin(){
        admindeleteid.adminDeleteTreadIDAdmin();
    }
    @When("admin send DELETE request by id user")
    public void adminDeleteTreadIDUser(){
        admindeleteid.adminDeleteTreadIDUser();
    }
    @When("admin send DELETE request by id admin without Api key")
    public void adminDeleteTreadIDApiKey(){
        admindeleteid.adminDeleteTreadIDApiKey();
    }
    @When("admin send DELETE request by id admin without token")
    public void adminDeleteTreadIDToken(){
        admindeleteid.adminDeleteTreadIDToken();
    }
    @When("admin send DELETE request by id admin with invalid id treads")
    public void adminDeleteTreadIDTreads(){
        admindeleteid.adminDeleteTreadIDTreads();
    }

//  -------------------------------------------------------------------------------

    @And("user send get request all threads and validate first ID")
    public void getUserValidateFirstID(){
        usercommentget.getUserValidateFirstID();
    }
    @When("user send GET COMMENT request by id")
    public void getUserCommentID(){
        usercommentget.getUserCommentID();
    }
    @When("user send GET COMMENT request by id without api key")
    public void getUserCommentIDApikey(){
        usercommentget.getUserCommentIDApikey();
    }
    @When("user send GET COMMENT request by id without token")
    public void getUserCommentIDToken(){
        usercommentget.getUserCommentIDToken();
    }
    @When("user send GET COMMENT request by id with invalid endpoint")
    public void getUserCommentIDInvalidEndpoint(){
        usercommentget.getUserCommentIDInvalidEndpoint();
    }
    @When("user send GET COMMENT request by id with with negative page and limit")
    public void getUserCommentIDNegative(){
        usercommentget.getUserCommentIDNegative();
    }
    @When("user send GET COMMENT request by id with with symbol page and limit")
    public void getUserCommentIDSymbolPageLimit(){
        usercommentget.getUserCommentIDSymbolPageLimit();
    }

//  -------------------------------------------------------------------------------

    @And("admin send get request all threads and validate first ID")
    public void getAdminCommentIDFirst(){
        admincommentget.getAdminCommentIDFirst();
    }
    @When("admin send GET COMMENT request by id")
    public void getAdminCommentIDGet(){
        admincommentget.getAdminCommentIDGet();
    }
    @When("admin send GET COMMENT request by id without Api")
    public void getadminCommentIDApikey(){
        admincommentget.getadminCommentIDApikey();
    }
    @When("admin send GET COMMENT request by id without token")
    public void getadminCommentIDToken(){
        admincommentget.getadminCommentIDToken();
    }
    @When("admin send GET COMMENT request by id with invalid endpoint")
    public void getadminCommentIDInvalidEndpoint(){
        admincommentget.getadminCommentIDInvalidEndpoint();
    }
    @When("admin send GET COMMENT request by id with negative page and limit")
    public void getadminCommentIDNegative(){
        admincommentget.getadminCommentIDNegative();
    }
    @When("admin send GET COMMENT request by id with symbol page and limit")
    public void getadminCommentIDSymbolPageLimit() {
        admincommentget.getadminCommentIDSymbolPageLimit();
    }

//  -------------------------------------------------------------------------------

    @When("user send POST COMMENT request by id")
    public void postUserCommentID(){
        usercompost.postUserCommentID();
    }
    @When("user send POST COMMENT request by id with empty comment")
    public void postUserCommentIDInvalidComment(){
        usercompost.postUserCommentIDInvalidComment();
    }

//  -------------------------------------------------------------------------------

    @When("admin send POST COMMENT request by id with empty comment")
    public void postAdminCommentIDEmpty(){
        usercompost.postAdminCommentIDEmpty();
    }
    @When("admin send POST COMMENT request by id")
    public void postAdminCommentID(){
        usercompost.postAdminCommentID();
    }

//  -------------------------------------------------------------------------------

    @When("user send PUT follow request by id")
    public void putUserFollow(){
        userfollow.putUserFollow();
    }
    @When("user send PUT follow request by id without api key")
    public void putUserFollowApi(){
        userfollow.putUserFollowApi();
    }
    @When("admin send PUT follow request by id")
    public void putAdminFollow(){
        userfollow.putAdminFollow();
    }
    @When("admin send PUT follow request by id without token")
    public void putAdminFollowToken(){
        userfollow.putAdminFollowToken();
    }

//  -------------------------------------------------------------------------------

    @When("user send PUT like request by id")
    public void putUserLike(){
        userlike.putUserLike();
    }
    @When("user send PUT like request by id without api key")
    public void putUserLikeApi(){
        userlike.putUserLikeApi();
    }
    @When("admin send PUT like request by id")
    public void putAdminLike(){
        userlike.putAdminLike();
    }
    @When("admin send PUT like request by id without token")
    public void putAdminLikeToken(){
        userlike.putAdminLikeToken();
    }

//  -------------------------------------------------------------------------------

    @When("user send PUT add moderator request a thread")
    public void putUserAddModerator(){
        useraddmoderator.putUserAddModerator();
    }
    @And("user remove moderator thread")
    public void putUserRemoveModerator(){
        useraddmoderator.putUserRemoveModerator();
    }


//  -------------------------------------------------------------------------------
//  -------------------------------------------------------------------------------

}
