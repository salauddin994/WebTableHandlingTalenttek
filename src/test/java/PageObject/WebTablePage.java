package PageObject;


import Base.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class WebTablePage extends config {


    public WebTablePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void WebTableHandling(){

        List<WebElement>row=driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr"));
        int rowsize=row.size();
        System.out.println("totall row in the table>>>>"+rowsize);
//
//        List<WebElement>clm=driver.findElements(By.xpath("//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[1]/td"));
//        int clmsize=clm.size();
//        System.out.println("totall clm in the table>>>>"+clmsize);



            String startXpath = "//*[@id=\"page-content-wrapper\"]/div/table/tbody/tr[";
            String endXpath = "]/td[1]";


            for (int i = 1; i <=rowsize; i++) {

                String fullXpath = startXpath + i + endXpath;
                WebElement tableData = driver.findElement(By.xpath(fullXpath));

                String actFirstName=tableData.getText();
                System.out.println(actFirstName);

                if (tableData.getText().equalsIgnoreCase(global_studentFirstName)) {

                    System.out.println("We got her name in the system her position is>>>>>>>>>>>" + global_studentFirstName +"   "+"and position is >>>>>"+ i);
                    break;
                }
                Assert.assertEquals(actFirstName,global_studentFirstName);


            }




    }


    public void webTablePlayer(){
        String firstname = global_studentFirstName;
        List<WebElement> rows2 = driver.findElements(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr"));

        for(WebElement row2:rows2)
        {
            List<WebElement> columns2 = row2.findElements(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr[1]/td"));

            for(WebElement col2:columns2)
            {
                if(col2.getText().equalsIgnoreCase(global_studentFirstName))
                {
                    firstname = global_studentFirstName;
                }

                if (firstname == global_studentFirstName)
                {

                    //Print the required player details
                    System.out.print(col2.getText() + " ");

                }
            }
            firstname = global_studentFirstName;
            System.out.println();
        }

    }






}
