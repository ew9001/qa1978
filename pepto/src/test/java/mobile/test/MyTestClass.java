package mobile.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyTestClass {
    public static void main(String[] args) {
          //WebDriver driver = new FirefoxDriver();
          WebDriver driver =new SafariDriver();
          driver.get("http://only-testing-blog.blogspot.in");
          String i = driver.getCurrentUrl();
          System.out.println(i);
          driver.close();
         }
}