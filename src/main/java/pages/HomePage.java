package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@class = 'gh-tb ui-autocomplete-input']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@class = 'btn btn-prim gh-spr']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@id='gh-shop-a']")
    private WebElement allCategoryButton;

    @FindBy(xpath = "//a[@id='gh-shop-see-all']")
    private WebElement seeAllCategoryButton;

    @FindBy(xpath = "//li[@class = 'hl-cat-nav__js-tab']/a[contains(text(),'Motors')]")
    private WebElement motorsSection;

    @FindBy(xpath = "//span[@id='gh-ug-flex']//a")
    private WebElement registerButton;

    @FindBy(xpath = "//span[@class='gh-ug-guest']/a")
    private WebElement signInButton;

    @FindBy(xpath = "//li[@class='gh-t gh-divider-l']/a[@href='https://www.ebay.com/globaldeals']")
    private WebElement dailyDealsButton;

    @FindBy(xpath = "//a[@href='https://ocsnext.ebay.com/ocs/home']")
    private WebElement helpAndContactsButton;

    @FindBy(xpath = "//button[@class='gh-eb-li-a gh-icon']")
    private WebElement shipToButton;

    @FindBy(xpath = "//li[@class='gh-eb-li gh-t-rt gh--link__divider rt'] //a[@href='https://www.ebay.com/sl/sell']")
    private WebElement sellButton;

    @FindBy(xpath = "//a[@class='gh-eb-li-a gh-rvi-menu watchlist-menu']")
    private WebElement watchlistButton;

    @FindBy(xpath = "//a[@href='https://www.ebay.com/mys/home?source=GBH']")
    private WebElement myEbayButton;

    @FindBy(xpath = "//i[@id='gh-Alerts-i'] ")
    private WebElement alertButton;

    @FindBy(xpath = "//a[@href='https://cart.payments.ebay.com/sc/view']")
    private WebElement cartButton;

    @FindBy(xpath = "//img[@src='https://ir.ebaystatic.com/rs/v/fxxj3ttftm5ltcqnto1o4baovyl.png']")
    private WebElement logoImg;

    @FindBy(xpath = "//a[@href='https://www.ebay.com/sch/ebayadvsearch']")
    private WebElement advancedButton;

    @FindBy(xpath = "//select[@id='gh-cat']")
    private WebElement allCategoriesButton;

    @FindBy(xpath = "//a[@href='https://www.ebay.com']")
    private WebElement logoButton;

    public void clickOnCartButton(){
        cartButton.click();
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }

    public void clickOnLogo(){
        logoButton.click();
    }

    public boolean allCategoriesButtonIsDisplayed(){
        return allCategoriesButton.isDisplayed();
    }

    public boolean advancedButtonIsDisplayed(){
        return advancedButton.isDisplayed();
    }

    public boolean searchButtonIsDisplayed(){
        return searchButton.isDisplayed();
    }

    public boolean searchFieldIsDisplayed(){
        return searchField.isDisplayed();
    }

    public boolean allCategoryButtonIsDisplayed(){
        return allCategoryButton.isDisplayed();
    }

    public boolean logoImgIsDisplayed(){
        return logoImg.isDisplayed();
    }

    public boolean cartButtonIsDisplayed(){
        return cartButton.isDisplayed();
    }

    public boolean alertButtonIsDisplayed(){
        return alertButton.isDisplayed();
    }

    public boolean myEbayButtonIsDisplayed(){
        return myEbayButton.isDisplayed();
    }

    public boolean watchlistButtonIsDisplayed(){
        return watchlistButton.isDisplayed();
    }

    public boolean sellButtonIsDisplayed(){
        return sellButton.isDisplayed();
    }

    public boolean shipToButtonIsDisplayed(){
        return signInButton.isDisplayed();
    }

    public boolean helpAndContactsButtonIsDisplayed(){
        return helpAndContactsButton.isDisplayed();
    }

    public boolean dailyDealsButtonIsDisplayed(){
        return dailyDealsButton.isDisplayed();
    }

    public boolean signInButtonIsDisplayed(){
        return signInButton.isDisplayed();
    }

    public boolean registerButtonIsDisplayed(){
        return registerButton.isDisplayed();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void clickMotorsButton(){
        motorsSection.click();
    }

    public void clickSeeAllCategoryButton(){
        seeAllCategoryButton.click();
    }

    public void clickOnShopByCategoryButton(){
        allCategoryButton.click();
    }

    public void enterTexTotSearchField(final String text){
        searchField.click();
        searchField.sendKeys(text);
    }

    public void clickOnSubmitButton(){
        searchButton.click();
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }


}
