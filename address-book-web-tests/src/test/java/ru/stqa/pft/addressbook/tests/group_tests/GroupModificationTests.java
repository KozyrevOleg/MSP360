package ru.stqa.pft.addressbook.tests.group_tests;

import org.junit.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupModificationTests extends TestBase {

  @Test

  public void testGroupModification() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test 1.3", "test 1.3", "test 1.3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnGroupPage();

  }


}
