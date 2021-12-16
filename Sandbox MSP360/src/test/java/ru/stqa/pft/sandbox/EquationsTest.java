package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationsTest {

  @Test

  public void test0 () {
    Equations e = new Equations(1,2,3);
    Assert.assertEquals(e.rootNumber(),0);

  }

  @Test

  public void test1 () {
    Equations e = new Equations(1,2,1);
    Assert.assertEquals(e.rootNumber(),1);

  }

  @Test

  public void test2 () {
    Equations e = new Equations(1,3,1);
    Assert.assertEquals(e.rootNumber(),2);

  }


}
