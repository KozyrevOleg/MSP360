package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class BaseHelper {
  public WebDriver driver;

  public BaseHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public void type(By locator, String text) {
    click(locator);
    driver.findElement(locator).sendKeys(text);
  }

  public void typeContact(By locator, String text) {
    driver.findElement(locator).sendKeys(text);
  }
  public boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
