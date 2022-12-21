package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage {
    WebDriver driver;
    public AmazonMainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//div[contains(text(),'TV, Appliances, Electronics')]")
    public WebElement tvCategory;

    @FindBy(xpath = "//a[contains(text(),'Televisions')]")
    public WebElement television;

    @FindBy(xpath = "//*[@id=\"s-refinements\"]/div[24]/ul/li[4]/span/a/div/label/i")
    public WebElement brandsSamsung;

    @FindBy(xpath = "//span[contains(text(),'Featured')]")
    public WebElement dropDownPrice;

    @FindBy(xpath = "//a[@id='s-result-sort-select_2']")
    public WebElement highToLow;

    @FindBy(xpath = "//span[contains(text(),'Samsung 214 cm (85 inches) 4K Ultra HD Smart Neo Q')]")
    public WebElement itemClick;

    @FindBy(xpath = "//h1[contains(text(),'About this item')]")
    public WebElement assertionText;

    @FindBy(xpath = "//*[@id=\"feature-bullets\"]/ul/li[1]/span")
    public WebElement description;
}
