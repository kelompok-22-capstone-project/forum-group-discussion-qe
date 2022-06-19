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

    @When("user input valid data in body, set API-Key, and send post request")
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

    @When("user input already exists data in body, set API-Key, and send post request")
    public void inputExistsData(){
        postRegis.withoutInputBody();
    }
    @Then("user see status code 400")
    public void statusCode400(){
        postRegis.statusCode400();
    }
    @And("user see massage Invalid payload")
    public void massageData(){
        postRegis.validasiStatus();
    }

    @Given ("user set invalid endpoint")
    public void invalidEndponit(){
        postRegis.invalidEndponito();
    }
    @When ("user input valid data in body, set API-Key, and send post requesto")
    public void sendRequesto(){
        postRegis.sendRequestto();
    }

    @Then("user see status code 404")
    public void statusCode404(){
        postRegis.statusCode404();
    }
    @And("user see massage not found")
    public void notFoundMessage(){
        postRegis.validasiNotFound();
    }
    @When ("user input valid data in body, set API-Key, and send get request")
    public void invalidMethode(){
        postRegis.invalidMethodee();
    }

    @When ("user input valid data in body and send post request")
    public void validDataPost(){
        postRegis.validDataPost();
    }
    @And ("user see massage missing key in request header")
    public void missingKety(){
        postRegis.missingKey();
    }

    @When ("user input username,email, and password data in body, set API-Key, and send post request")
    public void oneDataEmpty(){
        postRegis.oneEmptyData();
    }

    @When ("user input username and email data in body, set API-Key, and send post request")
    public void sendSameBody(){
        postRegis.sendSameBody();
    }

    @And("user see massage data already exists")
    public void alreadyExistsMessage(){
        postRegis.alreadyExistsMessage();
    }

    @When ("user input valid all data and invalid email without @ in body, set API-Key, and send post request")
    public void withoutTypeAt(){
        postRegis.withoutTypeAt();
    }

    @When ("user input valid all data and invalid username with spacebar in body, set API-Key, and send post request")
    public void usernameWithoutSpacebar(){
        postRegis.usernameWithoutSpacebar();
    }
    @When ("user input valid all data and invalid username with capital letters in body, set API-Key, and send post request")
    public void usernameWithCapital(){
        postRegis.usernameWithCapital();
    }
}
