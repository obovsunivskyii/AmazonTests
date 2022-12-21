package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import pages.AmazonMainPage;
import utilities.Config;
import utilities.Driver;

public class SearchTests {

    @Test
    public void LoginWithValidUserNameID() throws InterruptedException {
        AmazonMainPage AmazonMainPage = new AmazonMainPage(Driver.getDriver());
        Driver.getDriver().get(Config.getProperties("amazonUrl"));

        AmazonMainPage.hamburgerMenu.click();
        AmazonMainPage.tvCategory.click();
        Thread.sleep(2000);
        AmazonMainPage.television.click();
        AmazonMainPage.brandsSamsung.click();
        Thread.sleep(2000);
        JavascriptExecutor executorDropdown = (JavascriptExecutor)Driver.getDriver();
        executorDropdown.executeScript("arguments[0].click();", AmazonMainPage.dropDownPrice);
        AmazonMainPage.highToLow.click();
        AmazonMainPage.itemClick.click();
        Thread.sleep(5000);
        String newTab = Driver.getDriver().getWindowHandle();
        for (String tab : Driver.getDriver().getWindowHandles()) {
            if (!tab.equals(newTab)){
                Driver.getDriver().switchTo().window(tab);
            }
        }
        String aboutItemExpectedMessage = AmazonMainPage.assertionText.getText();
        String descriptionExpectedMessage = AmazonMainPage.description.getText();
        Assert.assertEquals("About this item", aboutItemExpectedMessage);
        Assert.assertEquals("Resolution : 4K Ultra HD (3840 x 2160) Resolution || Refresh Rate : 100 Hertz", descriptionExpectedMessage);

        Driver.closeDriver();
    }
}
