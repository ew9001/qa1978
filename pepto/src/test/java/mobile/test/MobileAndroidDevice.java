package mobile.test;

import io.selendroid.standalone.android.AndroidSdk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MobileAndroidDevice {
    private static WebDriver driver;
    
    @BeforeClass
    public void setUp() throws Exception {
        driver = (WebDriver) new AndroidSdk();
        driver.get("http://techblog.polteq.com/prestashop/");
    }
    
    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
    
    @Test
    public void measurePerformance() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("ipod nano");
        driver.findElement(By.cssSelector("input[name='submit_search']")).click();
        java.lang.String searchHeader = driver.findElement(By.cssSelector("H1")).getText().toLowerCase();
            
        Assert.assertTrue(searchHeader.contains("ipod nano"));
    }
}