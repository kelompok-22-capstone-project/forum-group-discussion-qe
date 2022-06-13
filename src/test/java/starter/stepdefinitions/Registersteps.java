package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Register;

public class Registersteps {
    @Steps
    Register postRegis;

    @Given("user set endpoint for register")
    public void setPostRegisEndponit(){
        postRegis.setEndponts();
    }
    @And("user set headers value API-Key")
    public void setApiKeyValue(){
        postRegis.valueApiKey();
    }
    @When("user input valid all data in body")
    public void inputValidDataBody(){
        postRegis.inputValidBody();
    }

    @Then("user see status code 201")
    public void statusCode201(){
        postRegis.statusCode201();
    }
    @And("user see sucsess status")
    public void validateStatus(){
        postRegis.validateStatus();
    }

}
