package hu.masterfield.tesco.steps;

import hu.masterfield.Utils;
import hu.masterfield.tesco.pages.HomePage;
import hu.masterfield.tesco.pages.LoginPage;
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
    HomePage home = new HomePage(driver);

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

        home.open();
    }


    @And("cookiekat elfogadtam")
    public void cookiekatElfogadtam() {
    // Órákig próbálkoztam, nem megy
     //   home.cookieElfogadas();
    }


    @And("a nyelv magyar")
    public void aNyelvMagyar() {

        home.aNyelvBeallitas();
    }

    @When("bejelentkezek a {string} és {string} adatokkal")
    public void bejelentkezekAÉsAdatokkal(String felhasznaloNev, String jelszo) {

        home.bejelentkezes();


       LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
      //  loginPage.login("standard_user", "secret_sauce");


    }

    @Then("bejelentkeztet, a megjelenik a\\(z) {string} felirat")
    public void bejelentkeztetAMegjelenikAZFelirat(String arg0) {
    }

    @Then("Megjelenik a Sajnos nem sikerult azonosítani a megadott adatokat uzenet")
    public void megjelenikASajnosNemSikerultAzonosítaniAMegadottAdatokatUzenet() {
    }


}
