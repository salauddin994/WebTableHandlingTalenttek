package PageObject;

import Base.TestData;
import Base.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebTablePage {
    public WebTablePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"page-content-wrapper\"]/div/table/tbody")
    public WebElement tableBody;

    public void find_FirsName_LastName_Email_FromWebTable(){
        Util.FirstNameFromWebTable();
        Util.LastNameFromWebTable();
        Util.EmailFromWebTable();


    }

}
