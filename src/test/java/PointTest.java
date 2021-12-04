import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

  @Test
  void testGetPosition() {
    Point current = new Point();
    Coord2D value = new Coord2D(2, 9.8);
    current.setPosition(value);
    assertEquals(value, current.getPosition());
  }

  @Test
  void testSetPosition() {
    Point current = new Point();
    Coord2D value = new Coord2D(4.5, 7.3);
    current.setPosition(value);
    assertEquals(value, current.getPosition());
  }

  @Test
  void testIsBeingVisited() {
    Point current = new Point();
    current.setBeingVisited(true);
    assertEquals(true, current.isBeingVisited());
  }

  @Test
  void testSetBeingVisited() {
    Point current = new Point();
    current.setBeingVisited(false);
    assertEquals(false, current.isBeingVisited());
  }

  @Test
  void testIsVisited() {
    Point current = new Point();
    current.setVisited(false);
    assertEquals(false, current.isVisited());
  }

  @Test
  void testSetVisited() {
    Point current = new Point();
    current.setVisited(true);
    assertEquals(true, current.isVisited());
  }
}