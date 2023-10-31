package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class LoginPage extends Base {

    WebDriver driver;
    @FindBy(id = "myAccount")
    private WebElement clickGirisYapButtonVeyaUyeOlButton;
    @FindBy(xpath = "//a[@id='login']")
    private WebElement girisYapButton;
    @FindBy(id = "txtUserName")
    private WebElement typeEMailTextArea;
    @FindBy(id = "btnLogin")
    private WebElement loginButton;
    @FindBy(id = "txtPassword")
    private WebElement typePasswordTextArea;
    @FindBy(id = "btnEmailSelect")
    private WebElement loginnButton;

    public LoginPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    public void clickGirisYapButtonVeyaUyeOlButton() {

        clickFunction(clickGirisYapButtonVeyaUyeOlButton);
    }

    public void clickgirisYapButton() {
        clickFunction(girisYapButton);
    }

    public void typeeMail(String email) {
        sendKeysFunction(typeEMailTextArea, email);
    }

    public void clickLoginButton() {
        clickFunction(loginButton);
    }

    public void typePassword(String password) throws InterruptedException {
        sendKeysFunction(typePasswordTextArea, password);
        Thread.sleep(500);
    }

    public void clickloginnButton() throws InterruptedException {
        loginnButton.isDisplayed();
        Thread.sleep(500);
        clickFunction(loginnButton);
    }


    public void assertMyMessage() {
        Assert.assertTrue(driver.getPageSource().contains("Hesabım"));
    }

}
