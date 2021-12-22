package ru.stqa.pft.addressbook.tests.contact_test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData1;
import ru.stqa.pft.addressbook.tests.TestBase;

import java.util.Map;


public class ContactModificationTests extends TestBase {

  @Test

  public void testContactsModification() {
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData1("anna","var","vit","lol","lola","ololol","99999999","lol@email.com", null),false);
    app.getContactHelper().pushEnter();
  }

  @Test

  public void testAddToTheGroup() {
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().addToTheGroup();
    app.getContactHelper().goToSelectedGroupPage();

  }

  @Test

  public void testRemoveContactFromGroup() {

    app.getContactHelper().selectUserCard();
    app.getContactHelper().selectGroupFromUserCard();
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().removeContactFromGroup();
    app.getContactHelper().goToSelectedGroupPage();
  }

}
