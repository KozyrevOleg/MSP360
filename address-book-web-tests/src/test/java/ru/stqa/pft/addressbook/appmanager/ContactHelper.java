package ru.stqa.pft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData1;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void addNewContact() {
    click(By.linkText("add new"));
  }

  public void submitContactCreation() {
    click(By.cssSelector("input:nth-child(87)"));
  }

  public void selectCheckbox() {
    click(By.id("12"));
  }

  public void editContact() {
    click(By.cssSelector(".odd:nth-child(3) > .center:nth-child(8) img"));
  }

  public void deleteContact() {
    click(By.cssSelector("input:nth-child(2)"));
  }

  public void selectTheGroup() {
    click(By.name("to_group"));
    {
      WebElement dropdown = driver.findElement(By.name("to_group"));
      dropdown.findElement(By.xpath("//option[. = 'name']")).click();
    }
  }

  public void confirmSelectedGroup() {
    click(By.cssSelector("select:nth-child(2) > option:nth-child(10)"));
  }

  public void addToTheGroup() {
    click(By.name("add"));
  }

  public void goToSelectedGroupPage() {
    click(By.linkText("group page \"name\""));
  }

  public void removeContactFromGroup() {
    click(By.name("remove"));
  }

  public void selectGroupFromUserCard() {
    click(By.linkText("name"));
  }

  public void selectUserCard() {
    click(By.cssSelector("tr:nth-child(6) > .center:nth-child(7) img"));
  }

  public void fillContactForm(ContactData1 contactData1, boolean creation) {
    click(By.name("firstname"));
    typeContact(By.name("firstname"), contactData1.firstName());
    click(By.name("middlename"));
    typeContact(By.name("middlename"), contactData1.middleName());
    click(By.name("lastname"));
    typeContact(By.name("lastname"), contactData1.lastName());
    click(By.name("nickname"));
    typeContact(By.name("nickname"), contactData1.nickName());
    click(By.name("title"));
    typeContact(By.name("title"), contactData1.title());
    click(By.name("company"));
    typeContact(By.name("company"), contactData1.company());
    click(By.name("mobile"));
    typeContact(By.name("mobile"), contactData1.mobilePhone());
    click(By.name("email"));
    typeContact(By.name("email"), contactData1.email());

    if (creation) {
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData1.group());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

    public void fillBday () {
      driver.findElement(By.cssSelector(".odd:nth-child(3) > .center:nth-child(8) img")).click();
      driver.findElement(By.name("bday")).click();
      {
        WebElement dropdown = driver.findElement(By.name("bday"));
        dropdown.findElement(By.xpath("//option[. = '1']")).click();
      }
      click(By.cssSelector("select:nth-child(63) > option:nth-child(3)"));
      click(By.name("bmonth"));
      {
        WebElement dropdown = driver.findElement(By.name("bmonth"));
        dropdown.findElement(By.xpath("//option[. = 'January']")).click();
      }
      click(By.cssSelector("select:nth-child(64) > option:nth-child(3)"));
      click(By.name("byear"));
      typeContact(By.name("byear"), "1999");
    }

    public void pushEnter () {
      driver.findElement(By.name("byear")).sendKeys(Keys.ENTER);
    }
  }
