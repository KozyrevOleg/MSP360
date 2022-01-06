package ru.stqa.pft.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData1;
import ru.stqa.pft.addressbook.model.GroupData;

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
    click(By.name("selected[]"));
  }

  public void editContact() {
    click(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr[2]/td[8]/a/img"));
  }

  public void deleteContact() {
    click(By.xpath("/html/body/div/div[4]/form[2]/input[2]"));
  }

  public void selectTheGroup(GroupData groupData) {
    new Select(driver.findElement(By.name("to_group"))).selectByVisibleText(groupData.name());
  }

  public void confirmSelectedGroup() {
    click(By.cssSelector("select:nth-child(2) > option:nth-child(10)"));
  }

  public void addToTheGroup() {
    click(By.name("add"));
  }

  public void goToSelectedGroupPage() {
    click(By.xpath("//*[@id=\"content\"]/div/i/a"));
  }

  public void removeContactFromGroup() {
    click(By.name("remove"));
  }

  public void selectGroupFromUserCard() {
      click(By.xpath("/html/body/div/div[4]/i[2]/a[1]"));
  }

  public void addContactToAGroup() {
    selectCheckbox();
    selectTheGroup(new GroupData("Test 1", null, null));
    addToTheGroup();
    goToSelectedGroupPage();
  }

  public void selectUserCard() {
    click(By.xpath("/html/body/div/div[4]/form[2]/table/tbody/tr[2]/td[7]/a/img"));
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

    // creation or modification contact form (fill group field)
    if (creation) {
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData1.group());
      } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

    /*public void fillBday () {
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
    }*/

    public void pushEnter () {
      driver.findElement(By.name("byear")).sendKeys(Keys.ENTER);
    }

  public void createAContact(ContactData1 contactData1, boolean creation) {
    addNewContact();
    fillContactForm(contactData1, creation);
    submitContactCreation();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public void goToHomePage() {
      if (isElementPresent(By.id("search_count"))
        && driver.findElement(By.id("searchstring")).getText().equals("searchstring")) {
        return;
  }
    click(By.xpath("/html/body/div/div[3]/ul/li[1]/a"));
  }

  // xpath = string "Member of"
    public boolean contactBelongsToAGroup() {
    return isElementPresent(By.xpath("/html/body/div/div[4]/i[2]/a"));
  }

/* don't know why it doesn't work
 public boolean contactBelongsToAGroup() {
      return (isElementPresent(By.tagName("i"))
              && driver.findElement(By.tagName("i")).getText().equals("Member of: "));
  }*/
}

