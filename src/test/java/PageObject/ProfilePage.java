package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.LINK_TEXT,using = "Web Table")
    public WebElement WebTable;

    public void clickOnWebTable(){
        WebTable.click();
    }


}
