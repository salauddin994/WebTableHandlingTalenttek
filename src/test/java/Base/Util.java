package Base;

import PageObject.WebTablePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class Util extends config {

    WebTablePage page = new WebTablePage(driver);

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



}
