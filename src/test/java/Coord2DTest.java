import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Coord2DTest {

  @Test
  void testGetX() {
    Coord2D current = new Coord2D(-1.2, 1.3);
    assertEquals(-1.2, current.getX());
  }

  @Test
  void testGetY() {
    Coord2D current = new Coord2D(-1.2, 1.3);
    assertEquals(1.3, current.getY());
  }
}