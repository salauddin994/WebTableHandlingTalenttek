package StepDef;

import Base.config;
import PageObject.WebTablePage;
import io.cucumber.java.en.Then;

public class WebTable_Steps extends config {
    WebTablePage webtable=new WebTablePage(driver);
    @Then("I will Verify firstName,lastName and email from WebTable page")
    public void iWillVerifyFirstNameLastNameAndEmailFromWebTablePage() {
        webtable.find_FirsName_LastName_Email_FromWebTable();

    }
}
