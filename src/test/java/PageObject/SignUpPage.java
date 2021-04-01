package PageObject;



import Base.TestData;
import Base.Util;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    Faker faker=new Faker();




    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Filled up the following box with valid information
    @FindBy(how = How.XPATH,using = "//input[@name='firstName']")
    public WebElement firstName;

    @FindBy(how = How.XPATH,using = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(how = How.XPATH,using = "//input[@name='email']")
    public WebElement email;

    @FindBy(how = How.XPATH,using = "//input[@name='password']")
    public WebElement password;

    @FindBy(how = How.XPATH,using = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;

    public void inputValidInformation(){

        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        email.sendKeys(faker.internet().safeEmailAddress());
        password.sendKeys(TestData.global_studentPassword);
        confirmPassword.sendKeys(TestData.global_studentPassword);
        Util.dropDownByXpath("//*[@id='signup-form']/div[4]/div[1]/select","Nov");
        Util.dropDownByName("day","09");
        Util.dropDownByName("year","1994");
        Util.radioButtonByXpath("//label[@class='radio-inline']");

    }

    @FindBy(how = How.CLASS_NAME,using = "form-check-input")
    public WebElement agreeTermsButton;

    public void clickAgreeTermsButton(){
        agreeTermsButton.click();
    }


    @FindBy(how = How.XPATH,using = "//*[@id='signup-form']/button")
    public WebElement createMyAccountButton;

    public void clickCreateMyAccountButton(){
        createMyAccountButton.click();
    }

}