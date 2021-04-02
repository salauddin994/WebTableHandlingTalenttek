package PageObject;

import Base.config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends config {
    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME,using = "new-account")
    public WebElement createNewAccount;

        public void ClickCreateNewAccount(){
            createNewAccount.click();
        }

    @FindBy(how = How.XPATH,using = "//*[@id=\"login_form\"]/input[1]")
    public WebElement StudentEmailOrID;

        public void inputStudentEmailOrID(String StudentId){
            StudentEmailOrID.sendKeys(StudentId);
        }

    @FindBy(how = How.XPATH,using = "//*[@id=\"login_form\"]/input[2]")
    public WebElement StudentPassword;

        public void inputStudentPassword(String StudentsPassword){
            StudentPassword.sendKeys(StudentsPassword);
        }


    @FindBy(how = How.XPATH,using = "//*[@id=\"login_form\"]/input[3]")
    public WebElement logInButton;

    public void clickOnlogInButton(){
        logInButton.click();
    }







}
