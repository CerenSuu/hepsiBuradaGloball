package org.login.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.YurtDisindanUrunlerPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class YurtDisindanUrunlerStepDefn {

    private WebDriver driver;
    YurtDisindanUrunlerPage yurtDisindanUrunlerPage = new YurtDisindanUrunlerPage();
    String expectedUrl="";

    @Given("User logged in")
    public void successfull_login() {
        driver= Driver.getDriver();
        //driver= Driver.getDriver().get(ConfigurationReader.getProperty("hepsiBuradaYurtDışı"));
        System.out.println("Login olundu");
    }
    @When("Click Pet Shop")
    public void click_pet_shop() throws InterruptedException {
        yurtDisindanUrunlerPage.clickPetShop();
        System.out.println("PetShop seçildi");
    }

    @And("Hoover over for 2nd item")
    public void hooverOverForNdItem() {

        ReusableMethods.hover(yurtDisindanUrunlerPage.productHover);
        System.out.println("Hoverlandı");
    }

    @And("Click select sepete ekle button for 2nd item")
    public void click_select_sepete_ekle_button_for_2nd_item() {
        yurtDisindanUrunlerPage.clickSepeteEkle();
        System.out.println("Ürün sepete eklendi");
    }
    @And("Click sepetim")
    public void click_sepetim() {
        yurtDisindanUrunlerPage.clickSepetim();
        yurtDisindanUrunlerPage.assertMySepetPage();
        System.out.println("Sepete gidildi");
    }
    @Then("Verify your product in your cart")
    public void verify_your_product_in_your_cart() throws InterruptedException {
        yurtDisindanUrunlerPage.checkProductName();
        System.out.println("product kontrol edildi");
    }
    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(1000);
    }

}
