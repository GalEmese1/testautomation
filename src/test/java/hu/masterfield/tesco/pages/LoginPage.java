package hu.masterfield.tesco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BasePage {

    @FindBy(className = "simple-boxed-layout--content")
    WebElement bejelentkezesBox;

    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(className = "smart-submit-button")
    WebElement bejelentkezesButton;

    @FindBy(className = "flash-message.icon-error")
    WebElement sajnosUzenet;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
      //  driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/login?from=https%3A%2F%2Fbevasarlas.tesco.hu%2Fgroceries%2Fhu-HU%2F");
        assertTrue(isLoaded(bejelentkezesBox));
        assertTrue(isLoaded(userEmail));
        assertTrue(isLoaded(passWord));
        assertTrue(isLoaded(bejelentkezesButton));
    }


    //   @FindBy(xpath = "//button[contains(text(), 'Keresés')]")
    //   WebElement searchButton;


    public void login(String name, String psw) {

        userEmail.sendKeys(name);
        passWord.sendKeys(psw);
        bejelentkezesButton.click();
    }

    public void loginFailed() {
        assertTrue(isLoaded(sajnosUzenet));
    }


    /*
    public SearchResultPage search(String word) {
        searchInput.sendKeys(word);
        searchButton.click();

        return new SearchResultPage(driver);
    }

  public void acceptCookies() {
        cookieOK.click();
    }

    public void closeBanner() {
        bannerClose.click();
    }

    public SearchResultPage search(String word) {
        searchInput.sendKeys(word);
        searchButton.click();

        return new SearchResultPage(driver);
    } */
}
