package starter.ramean.Categories;


import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static starter.ramean.Categories.PostAdmin.token;
import static starter.ramean.Categories.PostAdmin.url;
import static starter.ramean.Categories.PutAdmin.API_Key;
import static starter.ramean.Categories.PutAdmin.ID;

public class DeletAdmin {


    @Step("admin send delete request categori")
    public void delReqCat(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).delete(url + "categories/" + ID);
    }
    @Step("admin send delete request categori without API Key")
    public void delCatAPIKey(){
        SerenityRest.given().header("Authorization","Bearer "+ token).delete(url + "categories/" + ID);

    }
    @Step("admin send delete request categori without Token ")
    public void delCatToken(){
        SerenityRest.given().header("API-Key", API_Key).delete(url + "categories/" + ID);

    }
    @Step("admin send delete request categori with invalid endpoint")
    public void delCatEndpoint(){
        SerenityRest.given().header("API-Key", API_Key).header("Authorization","Bearer "+ token).delete(url + "categoriesnya/" + ID);

    }
}
