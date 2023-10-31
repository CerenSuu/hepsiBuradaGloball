package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utilities.Driver;

public class LoginPageStepDef {

    LoginPage loginPage = new LoginPage();
    private WebDriver driver;

    @Given("Go to hepsi burada website")
    public void go_to_hepsi_burada_website() {

        driver = Driver.getDriver();
    }

    @When("Click to Giris Yap veya üye ol button")
    public void click_to_giris_yap_veya_üye_ol_button() {
        try {
            loginPage.clickGirisYapButtonVeyaUyeOlButton();
        } catch (Exception e) {
            Assert.fail("click_to_giris_yap_veya_üye_ol_button butonu is not completed! The reason: " + e.getMessage());
        }
    }

    @And("Click to Giris Yap button")
    public void click_to_giris_yap_button() {
        try {
            loginPage.clickgirisYapButton();
        } catch (Exception e) {
            Assert.fail("click_to_giris_yap_button is not completed! The reason: " + e.getMessage());
        }
    }

    @And("Click {string} adresi field")
    public void click_to_eposta_adresi_field(String email) {
        try {
            loginPage.typeeMail(email);
        } catch (Exception e) {
            Assert.fail("click_to_eposta_adresi_field is not completed! The reason: " + e.getMessage());
        }
    }

    @And("Click to login button")
    public void click_to_login_button() {
        try {
            loginPage.clickLoginButton();
        } catch (Exception e) {
            Assert.fail("click_to_login_button is not completed! The reason: " + e.getMessage());
        }
    }

    @And("Type {string}")
    public void type_password(String password)  {
        try {
            loginPage.typePassword(password);
        } catch (Exception e) {
            Assert.fail("type_password is not completed! The reason: " + e.getMessage());
        }
    }

    @And("Click to loginn button")
    public void click_to_loginn_button() {
        try {
            loginPage.clickloginnButton();
        } catch (Exception e) {
            Assert.fail("click_to_loginn_button is not completed! The reason: " + e.getMessage());
        }
    }

    @Then("Verify success message")
    public void verify_success_message() {
        try {
            loginPage.assertMyMessage();
        } catch (Exception e) {
            Assert.fail("verify_success_message is not completed! The reason: " + e.getMessage());
        }
    }
}
