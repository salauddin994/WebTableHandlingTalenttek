package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class config {

    public static WebDriver driver;
    public static WebDriver initDriver(String driverType){
        if(driverType.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(driverType.equalsIgnoreCase("ff")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else if (driverType.equalsIgnoreCase("edg")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();

        }


        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        return driver;
    }


}
