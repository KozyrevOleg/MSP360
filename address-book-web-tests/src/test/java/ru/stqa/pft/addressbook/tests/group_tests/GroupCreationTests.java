package ru.stqa.pft.addressbook.tests.group_tests;// Generated by Selenium IDE

import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.tests.TestBase;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("Test 1.3", "test 1.3", "test 1.3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnGroupPage();
  }

}