package StepDef;

import Base.TestData;
import Base.config;
import PageObject.WebTablePage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class WebTableSteps extends config {
    WebTablePage webtable=new WebTablePage(driver);
    @Then("I will Verify firstName,lastName and email from WebTable page")
    public void iWillVerifyFirstNameLastNameAndEmailFromWebTablePage() {

//        webtable.WebTableHandling();

        webtable.webTablePlayer();




    }
}
