import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonHeaderSiteTests extends TestInit{

    @Test
    public void todayDealsHeaderBtnTest (){
        HeaderAmazonSitePage headerAmazonSitePage = new HeaderAmazonSitePage(driver);
        headerAmazonSitePage.getSite();
        sleep(2);
        if (headerAmazonSitePage.getChengesAdressWind().size()>0){
            headerAmazonSitePage.getChengesAdressWind().get(0).click();
        }
        headerAmazonSitePage.getTodayDeals().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb"));
    }

    @Test
    public void customerServicesHeaderBtnTest (){
        HeaderAmazonSitePage headerAmazonSitePage = new HeaderAmazonSitePage(driver);
        headerAmazonSitePage.getSite();
        sleep(2);
        if (headerAmazonSitePage.getChengesAdressWind().size()>0){
            headerAmazonSitePage.getChengesAdressWind().get(0).click();
        }
        headerAmazonSitePage.getCustomerService().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice"));
    }

    @Test
    public void registryHeaderBtnTest (){
        HeaderAmazonSitePage headerAmazonSitePage = new HeaderAmazonSitePage(driver);
        headerAmazonSitePage.getSite();
        sleep(2);
        if (headerAmazonSitePage.getChengesAdressWind().size()>0){
            headerAmazonSitePage.getChengesAdressWind().get(0).click();
        }
        headerAmazonSitePage.getRegistry().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/registries?ref_=nav_cs_registry"));
    }
    @Test
    public void giftListHeaderBtnTest (){
        HeaderAmazonSitePage headerAmazonSitePage = new HeaderAmazonSitePage(driver);
        headerAmazonSitePage.getSite();
        sleep(2);
        if (headerAmazonSitePage.getChengesAdressWind().size()>0){
            headerAmazonSitePage.getChengesAdressWind().get(0).click();
        }
        headerAmazonSitePage.getGiftList().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc"));
    }

    @Test
    public void sellHeaderBtnTest (){
        HeaderAmazonSitePage headerAmazonSitePage = new HeaderAmazonSitePage(driver);
        headerAmazonSitePage.getSite();
        sleep(2);
        if (headerAmazonSitePage.getChengesAdressWind().size()>0){
            headerAmazonSitePage.getChengesAdressWind().get(0).click();
        }
        headerAmazonSitePage.getSell().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell"));
    }

}

