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

        //Here i perfectly print firstName but can't print lastName and Email address.  How can i improve it...

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

                    System.out.println("We got her name in the system her position is>>>>>>>>>>>" + actFirstName +"   "+"and position is >>>>>"+ i);
                    break;
                }
                Assert.assertEquals(actFirstName,global_studentFirstName);


            }




    }


    public void webTablePlayer(){
        // here result found complete row result by using firstName but problem is it's print so many time




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

    public void webTableHandleWithFnameLnameEmail(){

        //it's acting like ghost ....sometimes acting good sometimes not

        List<WebElement>row=driver.findElements(By.tagName("tr"));
        int rowCount=row.size();
        System.out.println("totall row in this table is>>>>>"+rowCount);

        List<WebElement>clm=driver.findElements(By.tagName("td"));
        int clmCount=clm.size();
//		System.out.println(clmCount);


        for(WebElement rows:row) {
            List<WebElement>colms=rows.findElements(By.tagName("td"));
            for(WebElement colomn:colms) {

                if(colomn.getText().contains(global_studentFirstName)) {
                    System.out.println("student firstname exist:>>>>>"+colomn.getText());

                }
//                if(colomn.getText().contains(global_studentLastName)) {
//                    System.out.println("student lastName exist>>>>>>"+colomn.getText());
//
//                }
//                if(colomn.getText().contains(global_studentEmail)) {
//                    System.out.println("student email exist>>>>>>>"+colomn.getText());
//
//                }


            }

        }





    }




}
