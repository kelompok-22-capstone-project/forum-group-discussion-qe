package starter.stepdefinitions.AdminDashboard;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.AdminDashboard.GetAdminDashboard;

public class AdminDasGetSteps {

    @Steps
    GetAdminDashboard inistepadmin;

    @When("admin input endpoint admin dashboard")
    public void adminInputEndpoint(){
        inistepadmin.adminInputEndpoint();
    }
    @And("admin send get request admin dashboard")
    public void adminGetRequest(){
        inistepadmin.adminGetRequest();
    }
    @And("user send get request admin dashboard")
    public void getAdminDashboard(){
        inistepadmin.getAdminDashboard();
    }
    @And("admin send get request admin dashboard without Api Key")
    public void getAdminApiKey(){
        inistepadmin.getAdminApiKey();
    }
    @And("admin send get request admin dashboard without Token")
    public void getAdminToken(){
        inistepadmin.getAdminToken();
    }
    @When("admin send get request admin dashboard with invalid endpoint")
    public void getAdminInvalidEndpoint(){
        inistepadmin.getAdminInvalidEndpoint();
    }
    @And("admin validate massage Status")
    public void statusMessageAdmin(){
        inistepadmin.statusMessageAdmin();
    }
    @Then("user see status code 403")
    public void status403(){
        inistepadmin.status403();
    }
    @And("user see message Access forbidden role")
    public void messageForbiddenRole(){
        inistepadmin.messageForbiddenRole();
    }
}
