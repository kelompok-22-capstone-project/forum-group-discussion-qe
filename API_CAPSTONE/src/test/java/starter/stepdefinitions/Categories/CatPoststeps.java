package starter.stepdefinitions.Categories;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Categories.PostAdmin;

public class CatPoststeps {

    @Steps
    PostAdmin postcatmin;

    @Given("admin succees auth using admin account")
    public void secceesAuthExixt(){
        postcatmin.secceesAuthExixt();
    }
    @And("admin set endpoint for create categories")
    public void setEndpointpost(){
        postcatmin.setEndpointpost();
    }
    @When("admin send post request with valid all data")
    public void sendPostReq(){
        postcatmin.sendPostReq();
    }
    @Then("admin see succees status 201")
    public void statusCode201(){
        postcatmin.statusCode201();
    }
    @And("admin validate massage status")
    public void validateMassage(){
        postcatmin.validateMassage();
    }
    @Given("admin unsuccees auth using admin account")
    public void unsucsessLogin(){
        postcatmin.unsucsessLogin();
    }
    @Then("admin see unsuccees status 401")
    public void statusCode401(){
        postcatmin.statusCode401();
    }
    @And("admin see massage status invalid or expired jwt")
    public void massageExpiredJwt(){
        postcatmin.massageExpiredJwt();
    }
    @And("admin set invalid endpoint for create categories")
    public void invalidEndpoint(){
        postcatmin.invalidEndpoint();
    }
    @When("admin send post request with valid all data with invalid endpoint")
    public void invalidEndpointBody(){
        postcatmin.invalidEndpointBody();
    }
    @Then("admin see unsuccees status 404")
    public void statusCode404(){
        postcatmin.statusCode404();
    }
    @And("admin see message status message not found")
    public void notFoundMessage(){
        postcatmin.notFoundMessage();
    }
    @When("admin send post request with empty all body")
    public void emptyBodyData(){
        postcatmin.emptyBodyData();
    }
    @Then("admin see unsuccees status 400")
    public void statusCode400(){
        postcatmin.statusCode400();
    }
    @And("admin see message status Invalid payload")
    public void invalidPayloadMessage(){
        postcatmin.invalidPayloadMessage();
    }
    @When("admin send post request with empty name body")
    public void emptyNameBodyData(){
        postcatmin.emptyNameBodyData();
    }
    @When("admin send post request with empty description body")
    public void emptyDescriptionBodyData(){
        postcatmin.emptyDescriptionBodyData();
    }


}
