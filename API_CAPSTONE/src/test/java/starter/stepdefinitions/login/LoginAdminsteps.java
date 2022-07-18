package starter.stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Login.LoginAdmin;

public class LoginAdminsteps {

    @Steps
    LoginAdmin logmin;

    @Given("user set endpoint for login admin")
    public void loginEndpointAdmin(){
        logmin.setLoginEndpoint();
    }
    @Given("user set invalid endpoint for login admin")
    public void loginInvalidEndpointAdmin(){
        logmin.setInvalidLoginEndpoint();
    }
    @And("user see login sucsess status admin status")
    public void adminStatusCode(){
        logmin.adminStatus();
    }
    @When("user input valid data in body, set API-Key, and send post request login admin")
    public void validBodyLogin(){
        logmin.validBodyLogin();
    }
    @When("user input invalid username in body, set API-Key, and send post request login admin")
    public void invalidUsername(){
        logmin.invalidUsername();
    }
    @When("user input valid username and invalid pass, set API-Key, and send post request login admin")
    public void invalidPassword(){
        logmin.invalidPassword();
    }
    @When("user input unregisted data in body, set API-Key, and send post request login admin")
    public void unregistedDataBody(){
        logmin.unregistedDataBody();
    }
    @When("user input valid data in body and send post request login admin")
    public void withoutApiKey(){
        logmin.withoutApiKey();
    }
    @When("user set API-Key and send post request login admin")
    public void emptyBodyData(){
        logmin.emptyBodyData();
    }
    @When("user input valid data in body, set API-Key, and send put request login admin")
    public void putMethode(){
        logmin.putMethode();
    }
    @When("user input valid data in body, set API-Key, and send post request loginn admin")
    public void invalidEndpoint(){
        logmin.invalidEndpoint();
    }

}
