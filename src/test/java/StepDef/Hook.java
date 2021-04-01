package StepDef;

import Base.config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends config {

    public static String url;
    public static String baseUrl=System.getProperty("env");
    public static String browserType=System.getProperty("browser");


    public static String defEnv="qa";
    public static String defBrowser="ch";


    @Before
    public void openBrowser(){
        if(Strings.isNullOrEmpty(baseUrl)){
            baseUrl=defEnv;
        }
        if(Strings.isNullOrEmpty(browserType)){
            browserType=defBrowser;
        }

        driver=initDriver(browserType);
        switch (baseUrl){
            case "qa":
                url="http://qa.taltektc.com/";
                break;
            case "stage":
                url="http://stage.taltektc.com/";
                break;
            case "prod":
                url="http://taltektc.com/";
                break;
        }
        driver.get(url);
    }


    @After
    public void tearDown(){
//        driver.quit();
    }


}
