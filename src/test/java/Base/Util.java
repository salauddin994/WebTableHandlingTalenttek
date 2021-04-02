package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Util extends config {

    public static void dropDownByXpath(String locator, String text) {
        WebElement dropDownListBox = driver.findElement(By.xpath(locator));
        Select clickThis = new Select(dropDownListBox);
        clickThis.selectByVisibleText(text);
    }

    public static void dropDownByID(String locator, int selectByIndex) {
        WebElement dropDownListBox = driver.findElement(By.id(locator));
        Select clickThis = new Select(dropDownListBox);
        clickThis.selectByIndex(selectByIndex);
    }

    public static void dropDownByName(String locator, String value) {
        WebElement dropDownListBox = driver.findElement(By.name(locator));
        Select clickThis = new Select(dropDownListBox);
        clickThis.selectByValue(value);
    }

    public static void radioButtonByXpath(String locator) {

        List<WebElement> radioButtons = driver.findElements(By.xpath(locator));
        radioButtons.get(0).click();
    }

    public static void FirstNameFromWebTable() {

        //*[@id="page-content-wrapper"]/div/table/tbody
        //*[@id="page-content-wrapper"]/div/table/tbody/tr[1]
        //*[@id="page-content-wrapper"]/div/table/tbody/tr[1]/td[1]

        // FirstName verifying

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr"));
        int rowcount = rows.size();
        System.out.println("Total rows are>>>>" + rowcount);

        String before_Xpath = "//*[@id='page-content-wrapper']/div/table/tbody/tr[";
        String after_Xpath = "]/td[1]";
        for (int i = 1; i <= rowcount; i++) {
            String name = driver.findElement(By.xpath(before_Xpath + i + after_Xpath)).getText();
            if (name.contains(TestData.global_studentFirstName)) {
                WebElement element = driver.findElement(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr[" + i + "]/td[1]"));
                System.out.println("Student firstName exist>>>>>" + element.getText());
            }

        }




    }

    //LastName verifying

    public static void LastNameFromWebTable() {
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr"));
        int rowcount = rows.size();
        System.out.println("Total rows are>>>>" + rowcount);

        String before_Xpath = "//*[@id='page-content-wrapper']/div/table/tbody/tr[";
        String after_Xpath = "]/td[2]";
        for (int i = 1; i <= rowcount; i++) {
            String name = driver.findElement(By.xpath(before_Xpath + i + after_Xpath)).getText();
            if (name.contains(TestData.global_studentLastName)) {
                WebElement element = driver.findElement(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr[" + i + "]/td[2]"));
                System.out.println("Student LastName exist>>>>>" + element.getText());
            }

        }


    }


    //Email verifying

    public static void EmailFromWebTable() {
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr"));
        int rowcount = rows.size();
        System.out.println("Total rows are>>>>" + rowcount);

        String before_Xpath = "//*[@id='page-content-wrapper']/div/table/tbody/tr[";
        String after_Xpath = "]/td[3]";
        for (int i = 1; i <= rowcount; i++) {
            String name = driver.findElement(By.xpath(before_Xpath + i + after_Xpath)).getText();
            if (name.contains(TestData.global_studentEmail)) {
                WebElement element = driver.findElement(By.xpath("//*[@id='page-content-wrapper']/div/table/tbody/tr[" + i + "]/td[3]"));
                System.out.println("Student Email exist>>>>>" + element.getText());
            }

        }


    }
}
