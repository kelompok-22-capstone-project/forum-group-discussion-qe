package starter.stepdefinitions.Categories;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.ramean.Categories.DeletAdmin;

public class CatDelSteps {

    @Steps
    DeletAdmin catdelmin;

    @When("admin send delete request categori")
    public void delReqCat(){
        catdelmin.delReqCat();
    }
    @When("admin send delete request categori without API Key")
    public void delCatAPIKey(){
        catdelmin.delCatAPIKey();
    }
    @When("admin send delete request categori without Token")
    public void delCatToken(){
        catdelmin.delCatToken();
    }
    @When("admin send delete request categori with invalid endpoint")
    public void delCatEndpoint(){
        catdelmin.delCatEndpoint();
    }

}
