package StepDef;

import Base.config;
import PageObject.ProfilePage;
import io.cucumber.java.en.Then;

public class Profile_Steps extends config {
    ProfilePage profile=new ProfilePage(driver);
    @Then("I will verify i loggedIn successfully in my existing account")
    public void iWillVerifyILoggedInSuccessfullyInMyExistingAccount() {

    }

    @Then("I click on WebTable Option from profile page")
    public void iClickOnWebTableOptionFromProfilePage() {

        profile.clickOnWebTable();


    }
}
