package PageObject;


import Base.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablePage extends config {


    public WebTablePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void webtableHandling(){
        List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr"));
        int rowsize=rows.size();
        System.out.println("total number of the row  :>>>>>>"+rowsize);

        List<WebElement> colums=driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[1]/td"));
        int columsize=colums.size();
        System.out.println("total number of the coloum:>>>>>"+columsize);

        String bxpath="//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[";
        String axpath="]/td";


        List<WebElement>firstname=driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr/td"));
        for(int i=1;i<=rowsize;i++){

               WebElement comxpath= driver.findElement(By.xpath(bxpath+i+axpath));

               if (comxpath.getText().contains(global_studentFirstName)){
                   System.out.println("firstName is exist>>>>>>>"+global_studentFirstName);
               }


        }


    }



}
