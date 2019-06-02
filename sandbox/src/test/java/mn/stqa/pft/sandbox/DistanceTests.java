package mn.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

  @Test
  public void testDistanceSame () {
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,0);
    Assert.assertEquals(0.0, p1.distance(p2));
  }

  @Test
  public void testDistanceSameX () {
    Point p1 = new Point(5,8);
    Point p2 = new Point(5, -3);
    Assert.assertEquals(11.0, p1.distance(p2));
  }

  @Test
  public void testDistanceSameY () {
    Point p1 = new Point(3.5, 4.3);
    Point p2 = new Point(8, 4.3);
    Assert.assertEquals(4.5, p1.distance(p2));
  }

  @Test
  public void testDistance () {
    Point p1 = new Point(3, 4);
    Point p2 = new Point(0,0);
    Assert.assertEquals(5.0, p1.distance(p2));
  }
}
