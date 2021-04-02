package PageObject;



import Base.TestData;
import Base.Util;
import Base.config;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignUpPage extends config {
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

        TestData.global_studentFirstName = faker.name().firstName();
        firstName.sendKeys(global_studentFirstName);
        System.out.println("Student firstName ==>" + global_studentFirstName);

        TestData.global_studentLastName=faker.name().lastName();
        lastName.sendKeys(global_studentLastName);
        System.out.println("Student lastName>>>"+global_studentLastName);

        TestData.global_studentEmail=faker.internet().safeEmailAddress();
        email.sendKeys(global_studentEmail);
        System.out.println("Student email address<<>>>>>"+global_studentEmail);

       password.sendKeys(global_studentPassword);

        confirmPassword.sendKeys(global_studentPassword);

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

    @FindBy(how = How.XPATH,using = "//*[@id=\"success_message\"]/div")
    public WebElement verifyStudentID;

    @FindBy(how = How.XPATH,using = "//*[@id=\"signup-form\"]/input[1]")
    public WebElement verifyStudentEmail;


    public void AssertionWithStudentID(){

        TestData.global_studentID = verifyStudentID.getText().substring(38);
        Assert.assertEquals(verifyStudentID.getText().substring(38),TestData.global_studentID);
        System.out.println(global_studentID);
        TestData.global_studentEmail = verifyStudentEmail.getText();
        Assert.assertEquals(verifyStudentEmail.getText(),TestData.global_studentEmail);
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    public WebElement LogInLinkFromHeader;

    public void clickOnLogInLinkFromHeader(){
        LogInLinkFromHeader.click();
    }


}