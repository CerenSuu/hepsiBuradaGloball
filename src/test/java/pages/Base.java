package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import utilities.Driver;
import java.time.Duration;

public abstract class Base {

    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void clickFunction(WebElement clickElement){

        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement, String value){

        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);

    }
    public void Assertion(WebElement actual, String expected){

        wait.until((ExpectedConditions.visibilityOf(actual)));

        Assert.assertEquals(actual.getText(),expected);
        System.out.println("My Message :  " + actual.getText());

    }


    public void selectElementFromDropDown(WebElement dropdown, String element){

     Select select = new Select(dropdown);
     select.selectByVisibleText(element);

    }
}

