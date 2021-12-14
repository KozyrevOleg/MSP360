package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

  public void selectCheckbox() {
    driver.findElement(By.id("12")).click();
  }

  public void editContact() {
    driver.findElement(By.cssSelector(".odd:nth-child(3) > .center:nth-child(8) img")).click();
  }

  public void deleteContact() {
    driver.findElement(By.cssSelector("input:nth-child(2)")).click();
  }

  public void selectTheGroup() {
    driver.findElement(By.name("to_group")).click();
    {
      WebElement dropdown = driver.findElement(By.name("to_group"));
      dropdown.findElement(By.xpath("//option[. = 'name']")).click();
    }
  }

  public void confirmSelectedGroup() {
    driver.findElement(By.cssSelector("select:nth-child(2) > option:nth-child(10)")).click();
  }

  public void addToTheGroup() {
    driver.findElement(By.name("add")).click();
  }

  public void goToSelectedGroupPage() {
    driver.findElement(By.linkText("group page \"name\"")).click();
  }

  public void removeContactFromGroup() {
    driver.findElement(By.name("remove")).click();
  }

  public void selectGroupFromUserCard() {
    driver.findElement(By.linkText("name")).click();
  }

  public void selectUserCard() {
    driver.findElement(By.cssSelector("tr:nth-child(6) > .center:nth-child(7) img")).click();
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

  public void fillBday() {
    driver.findElement(By.cssSelector(".odd:nth-child(3) > .center:nth-child(8) img")).click();
    driver.findElement(By.name("bday")).click();
    {
      WebElement dropdown = driver.findElement(By.name("bday"));
      dropdown.findElement(By.xpath("//option[. = '1']")).click();
    }
    driver.findElement(By.cssSelector("select:nth-child(63) > option:nth-child(3)")).click();
    driver.findElement(By.name("bmonth")).click();
    {
      WebElement dropdown = driver.findElement(By.name("bmonth"));
      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
    }
    driver.findElement(By.cssSelector("select:nth-child(64) > option:nth-child(3)")).click();
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).sendKeys("1999");
  }

  public void pushEnter() {
    driver.findElement(By.name("byear")).sendKeys(Keys.ENTER);
  }




}
