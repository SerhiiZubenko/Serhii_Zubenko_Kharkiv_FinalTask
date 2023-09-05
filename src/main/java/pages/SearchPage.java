package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//li[@class = 's-item s-item__pl-on-bottom']//div[@class = 's-item__wrapper clearfix']")
    private WebElement itemResult;

    @FindBy(xpath = "//h3[text()='Xiaomi Redmi Note 9 128GB 4GB RAM GSM Factory Unlocked Global Version (NEW)']")
    private WebElement itemSearchResult;

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//select[@id='msku-sel-1'] ")
    private WebElement selectButton;

    @FindBy(xpath = "//option[@id='msku-opt-3']")
    private WebElement selectColor;

    @FindBy(xpath = "//span[text()='Xiaomi Redmi Note 9 128GB 4GB RAM GSM Factory Unlocked Global Version (NEW)']")
    private WebElement namePhone;

    @FindBy(xpath = "//a[@id='gh-la']")
    private WebElement logoButton;

    @FindBy(xpath = "//input[@class='qtyInput']")
    private WebElement quantityInput;

    @FindBy(xpath = "//div[@id='w1-13-_errMsg']")
    private WebElement errorMessage;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public boolean errorMessageIsDisplayed(){
        return errorMessage.isDisplayed();
    }

    public void enterRequiredAmount(final String amount){
        quantityInput.click();
        quantityInput.sendKeys(amount);
    }

    public void clickOnLogo(){
        logoButton.click();
    }

    public boolean namePhoneIsDisplayed(){
        return namePhone.isDisplayed();
    }

    public void chooseModel(){
        selectButton.click();
        selectColor.click();
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public void clickOnItemSearchResult(){
        itemSearchResult.click();
    }

    public boolean itemIsDisplayed(){
       return itemResult.isDisplayed();
    }
}
