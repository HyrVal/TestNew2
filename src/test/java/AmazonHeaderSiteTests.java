import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonHeaderSiteTests extends TestInit{

    HeaderAmazonSitePage headerAmazonSitePage;
    @BeforeMethod
        public void startUp () {
    headerAmazonSitePage = new HeaderAmazonSitePage(driver);
    headerAmazonSitePage.getSite();
    sleep(3);
    if (headerAmazonSitePage.getChengAddressWind().size() > 0) {
        headerAmazonSitePage.getChengAddressWind().get(0).click();
    }
    sleep(1);
}

    @Test
    public void todayDealsHeaderBtnTest (){

       headerAmazonSitePage.getTodayDeals().click();
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb"));
        Assert.assertTrue(driver.getCurrentUrl().contains("bad locator"));

    }

    @Test
   public void customerServicesHeaderBtnTest (){

        headerAmazonSitePage.getCustomerService().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice"));
    }

    @Test
    public void registryHeaderBtnTest (){

        headerAmazonSitePage.getRegistry().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/registries?ref_=nav_cs_registry"));
    }
    @Test
    public void giftListHeaderBtnTest (){

        headerAmazonSitePage.getGiftList().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc"));
    }

    @Test
    public void sellHeaderBtnTest (){

        headerAmazonSitePage.getSell().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell"));
    }

}

