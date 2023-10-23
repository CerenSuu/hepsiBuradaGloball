package utilities;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Driver {
    //We make WebDriver private, because we want to close access from outside the class.
    private static WebDriver driver; //// value is null by default

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){

                case "chrome":
                    driver = WebDriverManager.chromedriver().create();
                    driver.get("https://www.hepsiburada.com/kampanyalar/yurt-disindan-urunler?wt_int=hytop.yurtdisi.kampanya");
                    driver.manage().window().maximize();
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("window.scroll(0,700)");
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
                    chromeOptions.setPageLoadTimeout(Duration.ofSeconds(14));
                    break;

                case "safari" :
                    driver = WebDriverManager.safaridriver().create();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    driver = WebDriverManager.firefoxdriver().create();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    break;

                default:
                    System.out.println("Unknown browser type: "+browserType);
                    driver=null;

            }
        }
            return driver;
        }
    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
    }
