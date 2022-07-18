package starter.stepdefinitions.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Categories.GetAdmin;
import starter.ramean.Categories.GetUser;

public class CatGetsteps {

    @Steps
    GetAdmin getadminku;

    @Steps
    GetUser getuserku;

    @And("admin set endpoint for categories")
    public void adminSetEndpoint(){
        getadminku.adminSetEndpoint();
    }
    @And("admin set invalid endpoint for categories")
    public void invalidEndpoint(){
        getadminku.invalidEndpoint();
    }
    @When("admin send get request with valid all data")
    public void getReqValidData(){
        getadminku.getReqValidData();
    }
    @When("admin send get request with valid data without Api Key")
    public void getReqApiKey(){
        getadminku.getReqApiKey();
    }
    @When("admin send get request with valid all data with invalid endpoint")
    public void getReqinvalidEndpoint(){
        getadminku.getReqinvalidEndpoint();
    }
    @Then("admin see status code 400")
    public void statusCode400(){
        getadminku.statusCode400();
    }
    @Then("admin see succees status 200")
    public void success200(){
        getadminku.success200();
    }
    @And("admin see message status missing key")
    public void missingKey(){
        getadminku.missingKey();
    }
    @Given("user set endpoint for categories")
    public void setEndpointUser(){
        getuserku.setEndpointUser();
    }
    @Given("user set invalid endpoint for categories")
    public void invalidEdpointUser(){
        getuserku.invalidEdpointUser();
    }
    @When("user send get request with valid all data")
    public void validAllDataReqUser(){
        getuserku.validAllDataReqUser();
    }
    @When("user send get request with valid data without Api Key")
    public void withoutApiKeyUser(){
        getuserku.withoutApiKeyUser();
    }
    @When("user send get request with valid all data with invalid endpoint")
    public void requestInvalidEndpointUser(){
        getuserku.requestInvalidEndpointUser();
    }
    @Then("user see succees status 200")
    public void seeStatus200User(){
        getuserku.seeStatus200User();
    }
    @Then("user see unsuccees status 404")
    public void seeStatus404User(){
        getuserku.seeStatus404User();
    }
    @And("user validate massage status")
    public void validateMassageUser(){
        getuserku.validateMassageUser();
    }
    @And("user see message status message not found")
    public void validateNotFoundUser(){
        getuserku.validateNotFoundUser();
    }
}
