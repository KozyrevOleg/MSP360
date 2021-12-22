package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void goToGroupPage() {
    //optimization
    if (isElementPresent(By.tagName("h1"))
      && driver.findElement(By.tagName("h1").getText().equals("Groups"))
            && isElementPresent(By.name("new"))) {
      return;
    }
    click(By.linkText("groups"));
  }

  public void goToHomePage() {
    click(By.linkText("home page"));
  }
}
