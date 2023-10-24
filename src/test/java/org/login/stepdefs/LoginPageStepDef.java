package org.login.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginPageStepDef {

    private WebDriver driver;
    LoginPage loginPage = new LoginPage();

    @Given("Go to hepsi burada website")
    public void go_to_hepsi_burada_website() {

        driver= Driver.getDriver();
        System.out.println("Siteye Gidildi");
    }
    @When("Click to Giris Yap veya üye ol button")
    public void click_to_giris_yap_veya_üye_ol_button() {

        loginPage.clickGirisYapButtonVeyaUyeOlButton();
        System.out.println("Giris Yap Button Veya UyeOlbutonuna tiklanildi");
    }
    @And("Click to Giris Yap button")
    public void click_to_giris_yap_button() {

        loginPage.clickgirisYapButton();
        System.out.println("Giris yap butonuna tiklanildi");
    }
    @And("Click {string} adresi field")
    public void click_to_eposta_adresi_field(String email) {

        loginPage.typeeMail(email);
        System.out.println("E-posta girildi");
    }
    @And("Click to login button")
    public void click_to_login_button() {

        loginPage.clickLoginButton();
        System.out.println("Login butonuna tıklandı");
    }
    @And("Type {string}")
    public void type_password(String password) throws InterruptedException  {

        loginPage.typePassword(password);
        System.out.println("Şifre girildi");
    }
    @And("Click to loginn button")
    public void click_to_loginn_button() throws InterruptedException {
        loginPage.clickloginnButton();
        System.out.println("Giris yap butonuna tiklanildi");

    }
    @Then("Verify success message")
    public void verify_success_message() {

        loginPage.assertMyMessage();

    }

    @And("Click e-posta adresi and sonraki button")
    public void clickEPostaAdresiAndSonrakiButton() {
        loginPage.yazMail();
    }

    @And("Click goggle button")
    public void clickGoggleButton() {
        loginPage.clickGoogle();
    }

}
