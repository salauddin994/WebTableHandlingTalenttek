package StepDef;

import Base.TestData;
import Base.config;
import PageObject.LogInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LogIn_Steps extends config {

    LogInPage login=new LogInPage(driver);

    @Given("I am at talenttek logIn page")
    public void iAmAtTalenttekLogInPage() {

        String expTitle="Sign In";
        String actTitle =driver.getTitle();
        Assert.assertEquals(actTitle,expTitle);

    }

    @Then("I click on Create New account button")
    public void iClickOnCreateNewAccountButton() {
        login.ClickCreateNewAccount();
    }

    @Then("I input my newly created credentials")
    public void iInputMyNewlyCreatedCredentials() {
        login.inputStudentEmailOrID(TestData.global_studentID);
        login.inputStudentPassword(TestData.global_studentPassword);

    }

    @When("I click on LogIn button")
    public void iClickOnLogInButton() {
        login.clickOnlogInButton();

    }

    @Then("I input valid email address")
    public void iInputValidEmailAddress() {

    }

    @Then("I input valid password")
    public void iInputValidPassword() {

    }
}
