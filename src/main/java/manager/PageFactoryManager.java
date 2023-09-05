package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }

    public SearchPage getSearchPage(){
        return new SearchPage(driver);
    }

    public AllCategoriesPage getAllCategoriesPage(){
        return new AllCategoriesPage(driver);
    }

    public EbayMotorsPage getEbayMotorsPages(){
        return new EbayMotorsPage(driver);
    }

    public RegisterPage getRegisterPage(){
        return new RegisterPage(driver);
    }

    public CartPage getCartPage() {
        return new CartPage(driver);
    }
}
