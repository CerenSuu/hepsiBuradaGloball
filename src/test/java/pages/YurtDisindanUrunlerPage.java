package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utilities.Driver;
import utilities.ReusableMethods;

public class YurtDisindanUrunlerPage extends Base {
    @FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement cerezkabulbutonu;
    @FindBy(xpath = "//*[@id='i1']/div/a/div[2]")
    public WebElement productHover;
    WebDriver driver;
    @FindBy(xpath = "//*[@id='AllCategories.CategoryId']/div/div/div/div/div/div[2]/div[17]/div/div[1]/div")
    private WebElement petShop;
    @FindBy(xpath = "//*[@id='i1']/div/a/div[2]/button")
    private WebElement sepeteEkle;
    @FindBy(xpath = "//div[contains(text(),'Sepete ekle')]")
    private WebElement sepeteEkle2;
    @FindBy(id = "shoppingCart")
    private WebElement sepetim;
    @FindBy(xpath = "//div[@class='product_name_2Klj3']")
    private WebElement productName;

    public YurtDisindanUrunlerPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

        cerezkabulbutonu.click();
    }

    public void clickPetShop() {
        try {
            clickFunction(petShop);
            Thread.sleep(500);
            driver.navigate().refresh();
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, "https://www.hepsiburada.com/kampanyalar/yurt-disindan-urunler?kategori=2147483616&wt_int=hytop.yurtdisi.kampanya");
        } catch (Exception e) {
            Assert.fail("clickPetShop is not completed! The reason: " + e.getMessage());
        }
    }

    public void clickSepeteEkle(){
        try {
            clickFunction(sepeteEkle);
            ReusableMethods.waitFor(2);
            if (productHover.isEnabled()){
                ReusableMethods.waitFor(2);
            }else {
                clickFunction(sepeteEkle2);
                ReusableMethods.waitFor(2);
            }
        } catch (Exception e) {
            Assert.fail("clickSepeteEkle is not completed! The reason: " + e.getMessage());
        }
    }

    public void clickSepetim() {
        try {
            clickFunction(sepetim);
        } catch (Exception e) {
            Assert.fail("clickSepetim is not completed! The reason: " + e.getMessage());
        }
    }

    public void assertMySepetPage() {
        try {
            String actualUrl = driver.getCurrentUrl();
            Assert.assertEquals(actualUrl, "https://checkout.hepsiburada.com/sepetim");
        } catch (Exception e) {
            Assert.fail("assertMySepetPage is not completed! The reason: " + e.getMessage());
        }
    }

    public void checkProductName() {
        try {
            ReusableMethods.waitFor(4);
            Assert.assertTrue(productName.isDisplayed());
            //Assert.assertTrue(driver.getPageSource().contains("Sunsky"));
        } catch (Exception e) {
            Assert.fail("checkProductName is not completed! The reason: " + e.getMessage());
        }
    }
}
