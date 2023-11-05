package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class YurtDisindanUrunlerPage extends Base {
    @FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']")
    public WebElement cerezkabulbutonu;
    @FindBy(xpath = "//*[@id='i1']/div/a/div[2]")
    public WebElement productHover;
    WebDriver driver;
    @FindBy(xpath = "//div[contains(text(),'Pet Shop')]")
    private WebElement petShop;
    @FindBy(xpath = "//*[@id='i1']/div/a/div[2]/button")
    private WebElement sepeteEkle;
    @FindBy(xpath = "//div[contains(text(),'Sepete ekle')]")
    private WebElement sepeteEkle2;
    @FindBy(id = "shoppingCart")
    private WebElement sepetim;
    @FindBy(xpath = "//div[@class='product_name_2Klj3']")
    private WebElement productName;
    @FindBy(xpath = "//*[@class='productListContent-zAP0Y5msy8OHn5z7T_K_']")
    public List<WebElement> petShopUrunler;
    @FindBy(id = "SearchBoxOld_eacfe68b-4a8d-4226-f9c2-6b39c8ddd0c1")
    public  WebElement searchBox;

    public YurtDisindanUrunlerPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

        cerezkabulbutonu.click();
    }

    public void clickPetShop() {
        try {
            clickFunction(petShop);
            ReusableMethods.waitFor(3);
            driver.navigate().refresh();
        } catch (Exception e) {
            Assert.fail("clickPetShop is not completed! The reason: " + e.getMessage());
        }
    }
    public void assertPetShopPage() {
        try {
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
            //ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"div > div > div.hb-toast-close-icon-holder > svg\")");
            ReusableMethods.waitFor(4);
            clickFunction(sepeteEkle2);
                ReusableMethods.waitFor(3);

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
            Assert.assertTrue(productName.getText().contains("Better"));
            //Assert.assertTrue(driver.getPageSource().contains("Sunsky"));
        } catch (Exception e) {
            Assert.fail("checkProductName is not completed! The reason: " + e.getMessage());
        }
    }
}
