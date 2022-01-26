package ru.stqa.pft.addressbook.tests.group_tests;

import org.junit.Test;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupModificationTests extends TestBase {

  @Test

  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    //check preconditions
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test 1", "Test 2", "Test 3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(before,after);

  }


}
