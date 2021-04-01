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





}
