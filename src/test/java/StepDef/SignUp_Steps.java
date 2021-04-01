package StepDef;

import Base.config;
import PageObject.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SignUp_Steps extends config {
    SignUpPage signUp = new SignUpPage(driver);

    @Then("I filled out all the required field with valid information")
    public void iFilledOutAllTheRequiredFieldWithValidInformation() {
        signUp.inputValidInformation();

    }

    @Then("I click on agree terms to terms cookies and data use policy")
    public void iClickOnAgreeTermsToTermsCookiesAndDataUsePolicy() {

        signUp.clickAgreeTermsButton();
    }

    @Then("I click on Create My Account button")
    public void iClickOnCreateMyAccountButton() {

        signUp.clickCreateMyAccountButton();
    }

    @And("I verify with Newly Created Student ID")
    public void iVerifyWithNewlyCreatedStudentID() {

    }

    @Then("I click on LogIn link")
    public void iClickOnLogInLink() {

    }
}
