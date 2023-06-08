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



//    @FindBy(className = "beans-cookies-notification__form") -> Access Denied
   // @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]") -> Access Denied

  //  @FindBy(linkText = "https://bevasarlas.tesco.hu/help/hu-HU/set-cookie-preferences?returnUrl=https%3A%2F%2Fbevasarlas.tesco.hu%2Fgroceries%2Fhu-HU%2F")
  //  WebElement cookieButton;
   // <button class="styled__BaseButton-rsekm1-0 styled__SecondaryButton-rsekm1-3 jChbeY kYpvCr beans-cookies-notification__button beans-button__container" type="submit"><span class="base-components__BaseElement-sc-1mosoyj-0 styled__InnerContainer-rsekm1-1 oznwo fuFres beans-button__inner-container"><span class="base-components__BaseElement-sc-1mosoyj-0 styled__TextSpan-rsekm1-4 oznwo GDiMp beans-button__text">Minden Cookie elfogadása</span></span></button>
    // //*[@id="sticky-bar-cookie-wrapper"]/span/div/div/div[2]/form[1]
    // #sticky-bar-cookie-wrapper > span > div > div > div.base-components__BaseElement-sc-1mosoyj-0.styled__ButtonContainer-sc-1vnc1v2-4.oznwo.ksIudk.beans-cookies-notification__buttons-container > form:nth-child(1) > button > span > span
    // https://bevasarlas.tesco.hu/help/hu-HU/set-cookie-preferences?returnUrl=https%3A%2F%2Fbevasarlas.tesco.hu%2Fgroceries%2Fhu-HU%2F
    public void open() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/");
        assertTrue(isLoaded(tescoLogo));
        assertTrue(isLoaded(bejelentkezesMenu));

    //    assertTrue(isLoaded(cookieButton));
          }

    String nyelv;
          public void aNyelvBeallitas() {


              if (isLoaded(english)) {
                  nyelv = "magyar";
              } else {
                nyelv = "english";
                english.click();
              }

          }
  /*  public void cookieElfogadas() {
        cookieButton.click();
    }
   */

    public void bejelentkezes() {
        bejelentkezesMenu.click();
    }

}
