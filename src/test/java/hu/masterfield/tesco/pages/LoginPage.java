package hu.masterfield.tesco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
      //  driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/login?from=https%3A%2F%2Fbevasarlas.tesco.hu%2Fgroceries%2Fhu-HU%2F");
    //    assertTrue(isLoaded(loginLogo));
      //  assertTrue(isLoaded(userName));
       // assertTrue(isLoaded(passWord));
      //  assertTrue(isLoaded(loginButton));
    }

    // tescós:
    // Bejelentkezésen belül a Bejelentkezés felirat:
    // <h1>Bejelentkezés</h1>

    // Az e-mail mező:
    // <input type="email" class="" id="email" name="email" placeholder="E-mail cím" data-err-required="Kérjük, adj meg egy e-mail címet!" data-err-email-format="Érvénytelen e-mail cím" data-err-email-missing-at="Az e-mail címnek tartalmaznia kell a @ jelet!" value="">

    // A psw mező:
    // <input type="password" class="" id="password" name="password" autocomplete="off" autocorrect="off" autocapitalize="off" placeholder="Jelszó" data-err-required="Kérjük, adj meg egy jelszót!" value="">

/*
    @FindBy(className = "login_logo")
    WebElement loginLogo;

    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    //tescós:
    @FindBy(className ="button button-primary")
    // Bejelentkezés menüpont fent:
            // <a class="styled__Anchor-sc-1xbujuz-0 bDhkHK beans-menu__menu-item-node beans-link__anchor" role="button" href="/groceries/hu-HU/login?from=https%3A%2F%2Fbevasarlas.tesco.hu%2Fgroceries%2Fhu-HU%2F" id="utility-header-login-link" aria-current="false" aria-haspopup="false"><span class="styled__Text-sc-1xbujuz-1 ldbwMG beans-link__text">Bejelentkezés</span></a>

            // Bejelentkezés menü az oldal közepén:
            // <div class="signin-register--signin-button" data-auto="hp-signin-btn"><a href="/groceries/hu-HU/login?from=https%3A%2F%2Fbevasarlas.tesco.hu%2Fgroceries%2Fhu-HU%2F" class="button button-primary">Bejelentkezés</a></div>

            // azon belül a Bejelentkezés gomb:
            //  <div class="smart-submit-button"><button class="button button-primary" type="submit"><span aria-hidden="false">Bejelentkezés</span></button><div class="spinner hidden"></div></div>


            WebElement loginButton;

    //   @FindBy(xpath = "//button[contains(text(), 'Keresés')]")
    // WebElement searchButton;






    public void login(String name, String psw) {

        userName.sendKeys(name);
        passWord.sendKeys(psw);
        loginButton.click();
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
