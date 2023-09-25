package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends BasePage {

     public LoginPage(WebDriver driver) {
        super(driver);


    }
    @FindBy (css ="input[type='email']")
    WebElement emailField;
    @FindBy (css ="input[type='password']")
    WebElement passwordField;
    @FindBy (css ="[type='submit']")
    WebElement submitBtn;

    public void loginCorrectCred() {
        provideEmail("eric.stetson@testpro.io");
        providePassword("Testpro@2023");
        clickSubmit();
    }


    public LoginPage provideEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField)).clear();
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage providePassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField)).clear();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        return this;
    }
}