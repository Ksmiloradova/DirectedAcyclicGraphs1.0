import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoundBoxTest {

  @Test
  void testReenumeratePoints() {
    Coord2D value = new Coord2D(-5.5, 4.3);
    Point child = new Point();
    child.position = new Coord2D(0, 0);
    Origin current = new Origin();
    current.setPosition(value);
    HashSet<Point> children = new HashSet<Point>();
    children.add(child);
    current.children = children;
    Coord2D[] result = new BoundBox().reenumeratePoints(current);
    assertEquals(value.getX(), result[0].getX());
    assertEquals(child.getPosition().getY(), result[0].getY());
    assertEquals(child.getPosition().getX(), result[1].getX());
    assertEquals(value.getY(), result[1].getY());
  }
}