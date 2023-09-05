package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//button[@data-test-id='cart-remove-item'] ")
    private WebElement removeButton;

    @FindBy(xpath = "(//div[@class='font-title-3']//span)[last()]")
    private WebElement textCart;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTextCart(){
        return textCart;
    }

    public boolean textCartIsDisplayed(){
        return textCart.isDisplayed();
    }

    public void clickOnRemoveButton(){
        removeButton.click();
    }
}
