package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {
    public WebTablePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"page-content-wrapper\"]/div/table/tbody")
    public WebElement tableBody;

    public void findDataFromWebTable(){

    }

}
