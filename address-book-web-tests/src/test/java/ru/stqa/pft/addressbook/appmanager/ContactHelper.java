package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData1;

public class ContactHelper {
  private WebDriver driver;

  public ContactHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void addNewContact() {
    driver.findElement(By.linkText("add new")).click();
  }

  public void goToHomePage () {
    driver.findElement(By.linkText("home page")).click();
  }

  public void submitContactCreation() {
    driver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }

  public void fillContactForm(ContactData1 contactData1) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(contactData1.firstName());
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).sendKeys(contactData1.middleName());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys(contactData1.lastName());
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).sendKeys(contactData1.nickName());
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("title")).sendKeys(contactData1.title());
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys(contactData1.company());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(contactData1.mobilePhone());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(contactData1.email());
  }

}
