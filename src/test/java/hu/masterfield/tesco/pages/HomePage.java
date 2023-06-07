package hu.masterfield.tesco.pages;

import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/");
       // assertTrue(isLoaded(acceptButton));
        // assert
    }

}
