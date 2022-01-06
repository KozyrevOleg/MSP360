package ru.stqa.pft.addressbook.tests.contact_test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData1;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.tests.TestBase;

import javax.swing.*;
import java.util.Map;


public class ContactModificationTests extends TestBase {

  @Test

  public void testContactsModification() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createAContact(new ContactData1("test 1",
              "test 1", "test 1", "test 1",
              "test 1", "test 1", "11111111",
              "test1@test1.com", "Test 1"), true);
    }
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData1("anna","var","vit","lol","lola","ololol","99999999","lol@email.com", null),false);
    app.getContactHelper().pushEnter();
  }

  @Test

  public void testAddToTheGroup() {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("Test 1", "Test 2", null));
    }
    app.getContactHelper().goToHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createAContact(new ContactData1("test 1",
              "test 1", "test 1", "test 1",
              "test 1", "test 1", "11111111",
              "test1@test1.com", "Test 1"), true);
    }
    app.getContactHelper().addContactToAGroup();
    app.getContactHelper().goToSelectedGroupPage();

  }

  @Test

 public void testRemoveContactFromGroup() {
   app.getContactHelper().selectUserCard();
   if (!app.getContactHelper().contactBelongsToAGroup()) {
     app.getContactHelper().goToHomePage();
     app.getContactHelper().addContactToAGroup();
     app.getContactHelper().selectUserCard();
   }
    app.getContactHelper().selectGroupFromUserCard();
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().removeContactFromGroup();
    app.getContactHelper().goToSelectedGroupPage();
  }

}
