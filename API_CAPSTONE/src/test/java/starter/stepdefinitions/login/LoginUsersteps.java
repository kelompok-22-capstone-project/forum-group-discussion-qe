package starter.stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Login.LoginUser;

public class LoginUsersteps {

    @Steps
    LoginUser logus;

    @Given("user set endpoint for login")
    public void loginEndpoint(){
        logus.setLoginEndpoint();
    }

    @Given("user set invalid endpoint for login")
    public void loginInvalidEndpoint(){
        logus.setInvalidLoginEndpoint();
    }

    @Then("user see login status code 200")
    public void statusLoginCode200(){
        logus.statusLoginCode200();
    }

    @Then("user see login status code 400")
    public void statusLoginCode400(){
        logus.statusLoginCode400();
    }
    @Then("user see login status code 401")
    public void statusLoginCode401(){
        logus.statusLoginCode401();
    }
    @Then("user see login status code 404")
    public void statusLoginCode404(){
        logus.statusLoginCode404();
    }
    @When("user input valid data in body, set API-Key, and send post request login")
    public void validBodyLogin(){
        logus.validBodyLogin();
    }
    @When("user input invalid username in body, set API-Key, and send post request login")
    public void invalidUsername(){
        logus.invalidUsername();
    }
    @When("user input valid username and invalid pass, set API-Key, and send post request login")
    public void invalidPassword(){
        logus.invalidPassword();
    }
    @When("user input unregisted data in body, set API-Key, and send post request login")
    public void unregistedDataBody(){
        logus.unregistedDataBody();
    }
    @When("user input valid data in body and send post request login")
    public void withoutApiKey(){
        logus.withoutApiKey();
    }
    @When("user set API-Key and send post request login")
    public void emptyBodyData(){
        logus.emptyBodyData();
    }
    @When("user input valid data in body, set API-Key, and send put request login")
    public void putMethode(){
        logus.putMethode();
    }
    @When("user input valid data in body, set API-Key, and send post request loginn")
    public void invalidEndpoint(){
        logus.invalidEndpoint();
    }
    @And("user see login sucsess status")
    public void sucsessLogin(){
        logus.sucsessLogin();
    }
    @And("user see message username not found")
    public void usernameNotFound(){
        logus.usernameNotFound();
    }
    @And("user see message password not match")
    public void notMatch(){
        logus.notMatch();
    }
    @And("user see message status missing key")
    public void missingApiKey(){
        logus.missingApiKey();
    }
    @And("user see message Invalid payload")
    public void invalidPayload(){
        logus.invalidPayload();
    }
    @And("user see message Not Found")
    public void notFound(){
        logus.notFound();
    }
}
