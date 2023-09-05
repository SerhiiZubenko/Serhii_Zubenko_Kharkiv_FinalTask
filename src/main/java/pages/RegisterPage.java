package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "//input[@id='firstname'] ")
    private WebElement fistNameInput;

    @FindBy(xpath = "//input[@id='lastname'] ")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='Email'] ")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password'] ")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='showpassword'] ")
    private WebElement checkBox;

    @FindBy(xpath = "//span[text()='Continue with Google']")
    private WebElement continueWithGoogleButton;

    @FindBy(xpath = "//span[text()='Continue with Facebook']" +
            "//button[@class='scl-btn scl-btn--facebook btn btn--primary btn--large btn--fluid']")
    private WebElement continueWithFacebook;

    @FindBy(xpath = "//span[text()='Continue with Apple']")
    private WebElement continueWithApple;

    @FindBy(xpath = "//span[text()='Please enter your first name ']")
    private WebElement firstNameErrorMessage;

    @FindBy(xpath = "//span[text()='Please enter your last name ']")
    private WebElement enterLastNameErrorMessage;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public boolean enterLastNameErrorMessageIsDisplayed(){
        return enterLastNameErrorMessage.isDisplayed();
    }

    public void enterFirstName(){
        fistNameInput.click();
    }

    public void enterFirstName(final String firstName){
        fistNameInput.click();
        fistNameInput.sendKeys(firstName);
    }

    public void enterLastName(final String lastName){
        lastNameInput.click();
        lastNameInput.sendKeys(lastName);
    }

    public void enterLastName(){
        lastNameInput.click();
    }

    public void clickOnEmailInput(final String email){
        emailInput.click();
        emailInput.sendKeys(email);
    }

    public WebElement getEmailInput(){
        return emailInput;
    }

    public boolean firstNameErrorMessageIsDisplayed(){
       return firstNameErrorMessage.isDisplayed();
    }

    public boolean passwordInputIsDisplayed(){
        return passwordInput.isDisplayed();
    }

    public boolean continueWithAppleIsDisplayed(){
        return continueWithApple.isDisplayed();
    }

    public boolean continueWithFacebookIsDisplayed(){
        return continueWithGoogleButton.isDisplayed();
    }

    public boolean continueWithGoogleButtonIsDisplayed(){
        return continueWithGoogleButton.isDisplayed();
    }

    public boolean emailInputIsDisplayed(){
        return emailInput.isDisplayed();
    }

    public boolean lastNameIsDisplayed(){
        return lastNameInput.isDisplayed();
    }

    public boolean fistNameIsDisplayed(){
        return fistNameInput.isDisplayed();
    }
}
