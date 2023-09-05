package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCategoriesPage extends BasePage{

    @FindBy(xpath = "//a[@href='#electronics']")
    private WebElement electronicsSection;

    @FindBy(xpath = "//a[@href='#collectibles-and-art']")
    private WebElement collectiblesAndArtSection;

    @FindBy(xpath = "//a[@href='#fashion']")
    private WebElement fashionSection;

    @FindBy(xpath = "//a[@href='#ebay-motors']")
    private WebElement ebayMotorsSection;

    @FindBy(xpath = "//a[@href='#toys-and-hobbies']")
    private WebElement toysAndHobbiesSection;

    @FindBy(xpath = "//a[@href='#sporting-goods']")
    private WebElement sportingGoodsSection;

    @FindBy(xpath = "//a[@href='#health-and-beauty']")
    private WebElement healthAndBeautySection;

    @FindBy(xpath = "//a[@href='#books-movies-and-music']")
    private WebElement booksMoviesAndMusicSection;

    @FindBy(xpath = "//a[@href='#business-and-industrial']")
    private WebElement businessAndIndustrialSection;

    @FindBy(xpath = "//a[@href='#home-and-garden']")
    private WebElement homeAndGardenSection;

    @FindBy(xpath = "//a[@href='#others']")
    private WebElement othersSection;

    public AllCategoriesPage(WebDriver driver) {
        super(driver);
    }

    public boolean othersSectionIsDisplayed(){
        return othersSection.isDisplayed();
    }

    public boolean homeAndGardenIsDisplayed(){
        return homeAndGardenSection.isDisplayed();
    }

    public boolean businessAndIndustrialSectionIsDisplayed(){
        return businessAndIndustrialSection.isDisplayed();
    }

    public boolean booksMoviesAndMusicSectionIsDisplayed(){
        return booksMoviesAndMusicSection.isDisplayed();
    }

    public boolean healthAndBeautySectionIsDisplayed(){
        return healthAndBeautySection.isDisplayed();
    }

    public boolean sportingGoodsSectionIsDisplayed(){
        return sportingGoodsSection.isDisplayed();
    }

    public boolean toysAndHobbiesIsDisplayed(){
        return toysAndHobbiesSection.isDisplayed();
    }

    public boolean ebayMotorsSectionIsDisplayed(){
        return ebayMotorsSection.isDisplayed();
    }

    public boolean fashionSectionIsDisplayed(){
        return fashionSection.isDisplayed();
    }

    public boolean collectiblesAndArtSectionIsDisplayed(){
        return collectiblesAndArtSection.isDisplayed();
    }

    public boolean electronicsSectionIsDisplayed(){
        return electronicsSection.isDisplayed();
    }
}

