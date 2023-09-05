package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayMotorsPage extends BasePage{

    @FindBy(xpath = "//span[text()='Car & Truck Parts & Accessories']")
    private WebElement carAndTruckAccessoriesButton;

    @FindBy(xpath = "//span[text()='Interior Parts & Accessories']")
    private WebElement interiorPartsAndAccessoriesButton;

    public EbayMotorsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCarAndTruckAccessoriesButton(){
        carAndTruckAccessoriesButton.click();
    }

    public void clickOnInteriorAndAccessoriesButton(){
        interiorPartsAndAccessoriesButton.click();
    }
}
