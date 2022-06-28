import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderAmazonSitePage extends BasePage{

    HeaderAmazonSitePage(WebDriver driver){
        super(driver);
    }

    public void getSite() {
        driver.get("https://www.amazon.com/");
    }

    public List<WebElement> getChengesAdressWind() {
        return driver.findElements(By.xpath("//span[@class='a-button a-spacing-top-base a-button-base " +
                "glow-toaster-button glow-toaster-button-dismiss']"));
    }

    public WebElement getTodayDeals() {
        return driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-slot-id='nav_cs_0']"));
    }

    public WebElement getCustomerService() {
        return driver.findElement(By.xpath("//a[@class='nav-a  'and contains(text(),'Customer Service')] "));

    }

    public WebElement getRegistry() {
        return driver.findElement(By.xpath("//a[@class='nav-a  'and contains(text(),'Registry')] "));
    }

    public WebElement getGiftList() {
        return driver.findElement(By.xpath("//a[@class='nav-a  'and contains(text(),'Gift Cards')] "));
    }

    public WebElement getSell() {
        return driver.findElement(By.xpath("//a[@class='nav-a  'and contains(text(),'Sell')] "));
    }
}
