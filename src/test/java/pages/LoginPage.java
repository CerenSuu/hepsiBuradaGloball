package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;

public class LoginPage extends Base {

    WebDriver driver;

    public LoginPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "myAccount")
    private WebElement clickGirisYapButtonVeyaUyeOlButton;
    public void clickGirisYapButtonVeyaUyeOlButton() {

        clickFunction(clickGirisYapButtonVeyaUyeOlButton);
    }

    @FindBy(xpath = "//a[@id='login']")
    private WebElement girisYapButton;
    public void clickgirisYapButton() {
        clickFunction(girisYapButton);
    }

    @FindBy(id = "txtUserName")
    private WebElement typeEMailTextArea;
    public void typeeMail(String email) {
        sendKeysFunction(typeEMailTextArea,email);
    }

    @FindBy(id = "btnLogin")
    private WebElement loginButton;
    public void clickLoginButton() {
        clickFunction(loginButton);
    }

    @FindBy(id = "txtPassword")
    private WebElement typePasswordTextArea;
    public void typePassword(String password) throws InterruptedException {
        sendKeysFunction(typePasswordTextArea, password);
        Thread.sleep(500);
    }

    @FindBy(id = "btnEmailSelect")
    private WebElement loginnButton;
    public void clickloginnButton() throws InterruptedException {
         loginnButton.isDisplayed();
       Thread.sleep(500);
        clickFunction(loginnButton);
    }


    public void assertMyMessage() {
        Assert.assertTrue(driver.getPageSource().contains("giriş yap"));
    }

    @FindBy(xpath = "//div[@class='Xb9hP']")
    private WebElement mailYaz;
    public void yazMail() {
        sendKeysFunction(mailYaz, "su.yilmazz3@gmail.com");
        //clickFunction(sonrakibutton);
    }

    @FindBy(id = "btnGoogle")
    private WebElement google;
    public void clickGoogle() {
        clickFunction(google);
    }
}
