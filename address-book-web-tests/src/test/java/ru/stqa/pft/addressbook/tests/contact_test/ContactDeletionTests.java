package ru.stqa.pft.addressbook.tests.contact_test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import ru.stqa.pft.addressbook.model.ContactData1;
import ru.stqa.pft.addressbook.tests.TestBase;

public class ContactDeletionTests extends TestBase {

  @Test

  public void testDeletionContact() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createAContact(new ContactData1("test 1", "test 1",
              "test 1", "test 1", "test 1", "test 1",
              "11111111", "test1@test1.com", "test 1"), true);
    }
    app.getContactHelper().selectCheckbox();
    app.getContactHelper().editContact();
    app.getContactHelper().deleteContact();
  }


}
