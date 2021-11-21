package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquareTests {

  @Test //Check the rectangle square
  public void testArea () {
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25);

  }
@Test //Check the distance between points 1
  public void testDistance1 () {
    Point d1 = new Point(7,7,3,3);
    Assert.assertEquals(d1.distance(),4);

  }

  @Test //Check the distance between points 2
  public void testDistance2 () {
    Point d2 = new Point(37, 37, 1, 1);
    Assert.assertEquals(d2.distance(), 6);
  }

}
