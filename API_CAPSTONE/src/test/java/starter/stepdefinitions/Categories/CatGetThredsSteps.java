package starter.stepdefinitions.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Categories.GetAdminThread;
import starter.ramean.Categories.GetUserThread;

public class CatGetThredsSteps {

    @Steps
    GetUserThread iniuserthread;

    @Steps
    GetAdminThread iniadminthread;

    @And("user succees auth using exist account")
    public void userSucceesLogin(){
        iniuserthread.userSucceesLogin();
    }
    @When("input endpoint categori threads")
    public void inputEndpointCat(){
        iniuserthread.inputEndpointCat();
    }
    @And("user send get request categori threads")
    public void userSendReqCat(){
        iniuserthread.userSendReqCat();
    }
    @And("user send get request categori threads without API Key")
    public void getCatApiKey(){
        iniuserthread.getCatApiKey();
    }
    @And("user send get request categori threads without Token")
    public void getCatToken(){
        iniuserthread.getCatToken();
    }
    @And("user see message status jwt")
    public void userStatusJwt(){
        iniuserthread.userStatusJwt();
    }
    @And("user send get request categori threads with invalid ID")
    public void sendInvalidId(){
        iniuserthread.sendInvalidId();
    }
    @And("user see message status ID not found")
    public void messageStatusId(){
        iniuserthread.messageStatusId();
    }
    @And("admin send get request categori threads")
    public void getReqAdminThreads(){
        iniadminthread.getReqAdminThreads();
    }
    @And("admin send get request categori threads without API Key")
    public void getAdminThreadsApiKey(){
        iniadminthread.getAdminThreadsApiKey();
    }
    @And("admin send get request categori threads without Token")
    public void getAdminThreadsToken(){
        iniadminthread.getAdminThreadsToken();
    }
    @And("admin send get request categori threads with invalid ID")
    public void getAdminThreadsId(){
        iniadminthread.getAdminThreadsId();
    }
    @And("admin see message status ID not found")
    public void adminMessageIdNotFound(){
        iniadminthread.adminMessageIdNotFound();
    }
    @And("admin see message status missing or malformed jwt")
    public void adminSeeMissingJwt(){
        iniadminthread.adminSeeMissingJwt();
    }
}
