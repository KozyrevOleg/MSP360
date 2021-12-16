package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.safari.SafariDriver;

import java.util.HashMap;
import java.util.Map;



public class ApplicationManager {
  WebDriver driver;
  private Browser browser;
  private ContactHelper contactHelper;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  public Map<String, Object> vars;
  JavascriptExecutor js;

  public ApplicationManager(Browser browser) {
    this.browser = browser;
  }

  public void init() {
    System.setProperty("webdriver.gecko.driver", "C:\\Java test\\Selenium\\geckodriver.exe");
    System.setProperty("webdrider.chrome.driver", "C:\\Java test\\Selenium\\chrome.exe");
    if (browser.equals(Browser.FIREFOX)) {
      driver = new FirefoxDriver();
    } else if (browser.equals(Browser.CHROME)) {
      driver = new ChromeDriver();
    } else if (browser.equals(Browser.SAFARI)) {
      driver = new SafariDriver();
    }
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    driver.get("http://localhost:8080/addressbook/");
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    contactHelper = new ContactHelper(driver);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
