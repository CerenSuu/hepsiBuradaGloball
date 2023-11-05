package stepDefs;

import com.sun.org.apache.regexp.internal.RE;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.YurtDisindanUrunlerPage;
import utilities.Driver;
import utilities.ReusableMethods;
import com.github.javafaker.Faker;

public class YurtDisindanUrunlerStepDefn {

    YurtDisindanUrunlerPage yurtDisindanUrunlerPage = new YurtDisindanUrunlerPage();
    private WebDriver driver;
    Faker faker = new Faker();
    String product = "";

    @Given("User logged in")
    public void user_logged_in() {
        driver = Driver.getDriver();
        //driver.get(ConfigurationReader.getProperty("hepsiBuradaYurtDışı"));
    }

    @When("Click Pet Shop")
    public void click_pet_shop() {
        yurtDisindanUrunlerPage.clickPetShop();
    }

    @And("Verify PetShop Page")
    public void verifyPetShopPage() {
        yurtDisindanUrunlerPage.assertPetShopPage();
    }

    @When("Hoover over for 2nd item")
    public void hoover_over_for_2nd_item() {
        ReusableMethods.hover(yurtDisindanUrunlerPage.productHover);
    }

    @When("Click select sepete ekle button for 2nd item")
    public void click_select_sepete_ekle_button_for_2nd_item() {
        yurtDisindanUrunlerPage.clickSepeteEkle();
    }

    @When("Click sepetim")
    public void click_sepetim() {
        yurtDisindanUrunlerPage.clickSepetim();

    }

    @Then("Verify sepet Page")
    public void verifySepetPage() {
        yurtDisindanUrunlerPage.assertMySepetPage();
    }

    @Then("Verify your product in your cart")
    public void verify_your_product_in_your_cart() {
        yurtDisindanUrunlerPage.checkProductName();
    }

    @When("Hoover over for any product")
    public void hoover_over_for_any_product() {
        ReusableMethods.hover(yurtDisindanUrunlerPage.petShopUrunler.get(0));


    }

    @When("Click select sepete ekle button for this {string}")
    public void click_select_sepete_ekle_button_for_this_product(String string) {
        if (string.contains("<urun>")) {
            try {
                yurtDisindanUrunlerPage.clickSepeteEkle();
            } catch (Exception e) {
            }
        }
    }
}



