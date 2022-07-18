package starter.stepdefinitions.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Categories.PutAdmin;

public class CatPutSteps {

    @Steps
    PutAdmin putadmin;

    @And("admin send post request and validate data ID")
    public void postRequestID(){
        putadmin.postRequestID();
    }
    @When("admin send put request with valid all data")
    public void sendRequestData(){
        putadmin.sendRequestData();
    }
    @Then("admin see succees status 204")
    public void seeStatus204(){
        putadmin.seeStatus204();
    }
    @When("admin send put request with empty description")
    public void sendEmptyDesc(){
        putadmin.sendEmptyDesc();
    }
    @When("admin send put request with empty name")
    public void sendEmptyName(){
        putadmin.sendEmptyName();
    }
    @When("admin send put request with empty data")
    public void sendEmptyData(){
        putadmin.sendEmptyData();
    }
    @When("admin send put request with valid all data without API Key")
    public void sendApiKey(){
        putadmin.sendApiKey();
    }
    @When("admin send put request with valid all data without Token")
    public void sendTokennya(){
        putadmin.sendTokennya();
    }


}
