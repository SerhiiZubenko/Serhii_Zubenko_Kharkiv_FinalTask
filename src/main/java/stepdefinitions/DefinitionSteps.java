package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 300;

    WebDriver driver;
    HomePage homePage;
    SearchPage searchPage;
    AllCategoriesPage allCategoriesPage;
    PageFactoryManager pageFactoryManager;
    EbayMotorsPage ebayMotorsPage;
    RegisterPage registerPage;
    CartPage cartPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Given("user opens {string} page")
    public void userOpensHomePagePage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("user enters {string} to search field")
    public void userEntersTextToSearchField(final String text) {
        homePage.enterTexTotSearchField(text);
    }

    @And("user clicks on the submit button")
    public void userClicksTheSubmitButton() {
        homePage.clickOnSubmitButton();
    }

    @Then("user checks the search result")
    public void userCheckTheResultSearchResult() {
        searchPage = pageFactoryManager.getSearchPage();
        Assert.assertTrue(searchPage.itemIsDisplayed());
    }

    @And("user clicks on the 'Shop by category' button")
    public void userClicksOnTheShopByCategoryButton() {
        homePage.clickOnShopByCategoryButton();
    }

    @And("users clicks on the 'See all categories' button")
    public void usersClicksOnTheSeeAllCategoriesButton() {
        homePage.clickSeeAllCategoryButton();
    }

    @Then("user checks that all categories are displayed")
    public void userCheckThatAllCategoriesAreDisplayed() {
        allCategoriesPage = pageFactoryManager.getAllCategoriesPage();
        assertTrue(allCategoriesPage.electronicsSectionIsDisplayed());
        assertTrue(allCategoriesPage.collectiblesAndArtSectionIsDisplayed());
        assertTrue(allCategoriesPage.fashionSectionIsDisplayed());
        assertTrue(allCategoriesPage.ebayMotorsSectionIsDisplayed());
        assertTrue(allCategoriesPage.toysAndHobbiesIsDisplayed());
        assertTrue(allCategoriesPage.sportingGoodsSectionIsDisplayed());
        assertTrue(allCategoriesPage.healthAndBeautySectionIsDisplayed());
        assertTrue(allCategoriesPage.booksMoviesAndMusicSectionIsDisplayed());
        assertTrue(allCategoriesPage.businessAndIndustrialSectionIsDisplayed());
        assertTrue(allCategoriesPage.homeAndGardenIsDisplayed());
        assertTrue(allCategoriesPage.othersSectionIsDisplayed());
    }

    @And("user clicks on the 'Motors' button")
    public void userClickOnTheMotorsButton() {
        homePage.clickMotorsButton();
    }

    @And("user clicks on the 'Cars and Trucks Parts' button")
    public void userClickOnTheCarsAndTrucksPartsButton() {
        ebayMotorsPage = pageFactoryManager.getEbayMotorsPages();
        ebayMotorsPage.clickOnCarAndTruckAccessoriesButton();
    }

    @And("user clicks on the 'Interior Parts and Accessories' button")
    public void userClicksOnTheInteriorPartsAndAccessoriesButton() {
        ebayMotorsPage.clickOnInteriorAndAccessoriesButton();
    }

    @Then("user checks that url contains required section")
    public void userChecksThatUrlContainsRequiredSection() {
        assertTrue(driver.getCurrentUrl().contains("nkw=Auto+Parts+Accessories"));
    }

    @And("user clicks on the 'Register' button")
    public void userClicksOnTheRegisterButton() {
        homePage.clickRegisterButton();
    }

    @Then("user checks input fields")
    public void userChecksInputs() {
        registerPage = pageFactoryManager.getRegisterPage();
        registerPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        registerPage.waitForAjaxToCompletePdp(DEFAULT_TIMEOUT);
        assertTrue(registerPage.fistNameIsDisplayed());
        assertTrue(registerPage.lastNameIsDisplayed());
        assertTrue(registerPage.emailInputIsDisplayed());
        assertTrue(registerPage.passwordInputIsDisplayed());
        assertTrue(registerPage.emailInputIsDisplayed());
        assertTrue(registerPage.continueWithGoogleButtonIsDisplayed());
        assertTrue(registerPage.continueWithFacebookIsDisplayed());
        assertTrue(registerPage.continueWithAppleIsDisplayed());
    }

    @And("user enters {string} item")
    public void userEnterNameItem(final String name) {
        homePage.enterTexTotSearchField(name);
    }

    @And("user clicks on item")
    public void userClicksOnItem() {
        searchPage = pageFactoryManager.getSearchPage();
        searchPage.clickOnItemSearchResult();
        searchPage.switchBetweenWindows();
    }

    @And("user clicks on the 'Add to cart' button")
    public void userClicksOnTheAddToCartButton() {
        searchPage.clickAddToCartButton();
    }

    @And("user chooses 'color' telephone")
    public void userChooseColorTelephone() {
        searchPage.chooseModel();
    }

    @Then("user checks cart")
    public void userChecksCart() {
        assertTrue(searchPage.namePhoneIsDisplayed());
    }

    @And("user enters to first name input")
    public void userEntersFirstName() {
        registerPage = pageFactoryManager.getRegisterPage();
        registerPage.enterFirstName();
    }

    @And("user enters {string}  to last name input")
    public void userEntersLastNameToLastNameInput(final String lastName) {
        registerPage.enterLastName(lastName);
    }

    @Then("user checks that an 'enter first name' error message is displayed")
    public void userChecksThatAnErrorMessageIsDisplayed() {
        assertTrue(registerPage.firstNameErrorMessageIsDisplayed());
    }

    @And("user enters {string} to first name input")
    public void userEntersFirstNameToFirstNameInput(final String firstName) {
        registerPage.enterFirstName(firstName);
    }

    @And("user enters 'last name' to last name input")
    public void userEntersLastNameToLastNameInput() {
        registerPage = pageFactoryManager.getRegisterPage();
        registerPage.enterLastName();
    }

    @Then("user checks that an 'enter last name' error message is displayed")
    public void userChecksThatAnEnterLastNameErrorMessageIsDisplayed() {
        assertTrue(registerPage.enterLastNameErrorMessageIsDisplayed());
    }

    @And("user clicks on 'logo'")
    public void userClicksOnLogo() {
        homePage.clickOnLogo();
    }

    @Then("user checks that functional home page is displayed")
    public void userChecksThatFunctionalHomePageIsDisplayed() {
        assertTrue(homePage.signInButtonIsDisplayed());
        assertTrue(homePage.registerButtonIsDisplayed());
        assertTrue(homePage.helpAndContactsButtonIsDisplayed());
        assertTrue(homePage.dailyDealsButtonIsDisplayed());
        assertTrue(homePage.shipToButtonIsDisplayed());
        assertTrue(homePage.sellButtonIsDisplayed());
        assertTrue(homePage.watchlistButtonIsDisplayed());
        assertTrue(homePage.alertButtonIsDisplayed());
        assertTrue(homePage.cartButtonIsDisplayed());
        assertTrue(homePage.logoImgIsDisplayed());
        assertTrue(homePage.searchFieldIsDisplayed());
        assertTrue(homePage.allCategoryButtonIsDisplayed());
        assertTrue(homePage.allCategoriesButtonIsDisplayed());
        assertTrue(homePage.advancedButtonIsDisplayed());
        assertTrue(homePage.myEbayButtonIsDisplayed());
        assertTrue(homePage.searchButtonIsDisplayed());
    }

    @And("user clicks on the logo")
    public void userClicksOnTheLogo() {
        searchPage.clickOnLogo();
    }

    @And("user clicks on the cart button")
    public void userClicksOnTheCartButton() {
        homePage=pageFactoryManager.getHomePage();
        homePage.clickOnCartButton();
    }

    @And("user removes item from cart")
    public void userRemovesItemFromCart() {
        cartPage = pageFactoryManager.getCartPage();
        cartPage.clickOnRemoveButton();
    }

    @Then("user checks that cart is empty")
    public void userChecksThatCartIsEmpty() {
        cartPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, cartPage.getTextCart());
        assertTrue(cartPage.textCartIsDisplayed());
    }

    @And("user clicks on 'sign in' button")
    public void userClicksOnSignInButton() {
        homePage.clickOnSignInButton();
    }

    @And("user enters {string} to email input")
    public void userClicksOnSignInButton(final String email) {
        registerPage = pageFactoryManager.getRegisterPage();
        registerPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, registerPage.getEmailInput());
        registerPage.clickOnEmailInput(email);
    }

    @And("user chooses {string} pieces")
    public void userChooseAmountPieces(final String amount) {
        searchPage.enterRequiredAmount(amount);
    }

    @Then("user checks available quantity")
    public void userChecksAvailableQuantity() {
        assertTrue(searchPage.errorMessageIsDisplayed());
    }
}
