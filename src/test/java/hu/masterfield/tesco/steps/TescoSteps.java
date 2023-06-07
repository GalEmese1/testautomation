package hu.masterfield.tesco.steps;

import hu.masterfield.Utils;
import hu.masterfield.tesco.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class TescoSteps {


    protected static WebDriver driver;

    protected static WebDriverWait wait;

    public static Logger log = LogManager.getLogger();

    @Before // cucumber annotáció
    public static void setup() throws IOException {
        WebDriverManager.chromedriver().setup();

        // loading arguments, properties
        Properties props = new Properties(); // java.util
        InputStream is = TescoSteps.class.getResourceAsStream("/browser.properties");
        props.load(is);

        // set chrome options
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(props.getProperty("chrome.arguments"));
        //chromeOptions.setHeadless(true);

        // init driver
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().setSize(new Dimension(900, 900)); // ...selenium.Dimension
    }

    @After
    public static void cleanup() {
        driver.quit();
    }

    @BeforeStep
    public void screenshot() {
        log.info("Take screenshot");
        Utils.takeSnapShot(driver);
    }


    @Given("nyito oldalon vagyok")
    public void nyitoOldalonVagyok() {

        HomePage home = new HomePage(driver);
        home.open();

    }

    @And("a nyelv magyarra van beallitva")
    public void aNyelvMagyarraVanBeallitva() {
    }

    @When("klikkelek a Bejelentkezes-re")
    public void klikkelekABejelentkezesRe() {
    }

    @Then("megjelenik a Bejelentkezes")
    public void megjelenikABejelentkezes() {
    }

    @When("pontosan megadom az e-mail-t")
    public void pontosanMegadomAzEMailT() {
    }

    @And("pontosan megadom a psw-ot")
    public void pontosanMegadomAPswOt() {
    }

    @Then("bejelentkeztet, az Udvozlunk megjelenik")
    public void bejelentkeztetAzUdvozlunkMegjelenik() {
    }

    @When("rosszul adom meg az e-mail-t, de jo formatummal")
    public void rosszulAdomMegAzEMailTDeJoFormatummal() {
    }

    @And("akármilyen psw-ot adok meg")
    public void akármilyenPswOtAdokMeg() {
    }

    @Then("Megjelenik a Sajnos nem sikerult azonosítani a megadott adatokat uzenet")
    public void megjelenikASajnosNemSikerultAzonosítaniAMegadottAdatokatUzenet() {
    }
}
