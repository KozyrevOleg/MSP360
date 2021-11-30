import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.*;
import java.lang.*;

public class gecko {
  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:\\Java test\\Selenium\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get ("https://www.google.com");
    System.out.println(driver.getTitle());
  }
}