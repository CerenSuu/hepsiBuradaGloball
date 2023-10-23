package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YurtDisindanUrunlerPage extends Base{
    WebDriver driver;

    public YurtDisindanUrunlerPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

        cerezkabulbutonu.click();
    }
    @FindBy(xpath = "//*[@id='AllCategories.CategoryId']/div/div/div/div/div/div[2]/div[17]/div/div[1]/div")
    private WebElement petShop;
    public void clickPetShop() throws InterruptedException {
        clickFunction(petShop);
        Thread.sleep(500);
        driver.navigate().refresh();
    }

    @FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement cerezkabulbutonu;

    @FindBy(xpath = "//*[@id='i1']/div/a/div[2]")
    public WebElement productHover;


    @FindBy(xpath = "//*[@id='i1']/div/a/div[2]/button")
    private WebElement sepeteEkle;
    public void clickSepeteEkle() {
        clickFunction(sepeteEkle);
    }

    @FindBy(id = "shoppingCart")
    private WebElement sepetim;
    public void clickSepetim() {
        clickFunction(sepetim);
    }

    @FindBy(xpath = "//div[@class='product_name_2Klj3']")
    private WebElement productName;
    public void checkProductName() {
        clickFunction(productName);
    }

    @FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[1]/header/div[2]")
    private WebElement sil;
    public void seeProductName() throws InterruptedException {
        clickFunction(sil);
        Thread.sleep(1000);
    }

}
