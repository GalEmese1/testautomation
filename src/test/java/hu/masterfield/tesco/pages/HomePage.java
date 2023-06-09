package hu.masterfield.tesco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "brand-header__logo")
    WebElement tescoLogo;

    @FindBy(id = "utility-header-language-switch-link")
    WebElement english;
    @FindBy(id = "utility-header-login-link")
    WebElement bejelentkezesMenu;

    @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button/span/span")
    WebElement cookieButton;

    @FindBy(id = "utility-header-greetings")
    WebElement udvozlunk;


    public void open() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/");
        assertTrue(isLoaded(tescoLogo));
        assertTrue(isLoaded(bejelentkezesMenu));
        assertTrue(isLoaded(cookieButton));
    }

    public void aNyelvBeallitas() {
        String nyelv;
        if (isLoaded(english)) {
            nyelv = "magyar";
        } else {
            nyelv = "english";
            english.click();
        }
    }

    public void cookieElfogadas() {
        cookieButton.click();
    }

    // a Bejelentkezés menüpont-ra kattint
    public void bejelentkezes() {
        bejelentkezesMenu.click();
    }

    public void bejelentkezve() {
        assertTrue(isLoaded(udvozlunk));;
    }



}
