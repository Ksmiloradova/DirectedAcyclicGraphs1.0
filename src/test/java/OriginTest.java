import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OriginTest {

  @Test
  void testGetBounds() {
    Coord2D value = new Coord2D(-5.5, 4.3);
    Origin current = new Origin();
    current.setPosition(value);
    assertEquals(value.getX(), current.getBounds()[0].getX());
    assertEquals(value.getY(), current.getBounds()[0].getY());
    assertEquals(value.getX(), current.getBounds()[1].getX());
    assertEquals(value.getY(), current.getBounds()[1].getY());
  }

//  @Test
//  void testGetBounds2() {
//    Coord2D value = new Coord2D(-5.5, 4.3);
//    Origin firstChild = new Origin(new Coord2D(1, -1));
//    Point secondChild = new Point();
//    secondChild.setPosition(new Coord2D(0,6));
//    Set<Point> children = new HashSet<Point>();
//    children.add(firstChild);
//    children.add(secondChild);
//    Origin current = new Origin();
//
//    current.setChildren(children);
//    assertEquals(-5.5, current.getBounds()[0].getX());
//    assertEquals(value.getY(), current.getBounds()[0].getY());
//    assertEquals(value.getX(), current.getBounds()[1].getX());
//    assertEquals(value.getY(), current.getBounds()[1].getY());
//  }

  @Test
  void testGetChildren() {
    Origin current = new Origin();
    Origin firstChild = new Origin();
    firstChild.position = new Coord2D(1, -1);
    Point secondChild = new Point();
    secondChild.position = new Coord2D(0, 6);
    Set<Point> children = new HashSet<Point>();
    children.add(firstChild);
    children.add(secondChild);
    current.children = children;
    assertEquals(children, current.getChildren());
  }

  @Test
  void testSetChildren() throws DAGConstraintException {
    Origin current = new Origin();
    Origin firstChild = new Origin();
    firstChild.position = new Coord2D(1, -1);
    Point secondChild = new Point();
    secondChild.position = new Coord2D(0, 6);
    Set<Point> children = new HashSet<Point>();
    children.add(firstChild);
    children.add(secondChild);
    current.setChildren(children);
    assertEquals(children, current.children);
  }

  @Test
  void testSetChildrenWithException() throws DAGConstraintException {
    Origin firstChild = new Origin();
    firstChild.position = new Coord2D(0, 1);
    Point secondChild = new Origin();
    secondChild.position = new Coord2D(1, 0);
    HashSet<Point> first = new HashSet<Point>();
    first.add(secondChild);
    firstChild.children = first;
    HashSet<Point> second = new HashSet<Point>();
    second.add(firstChild);
    DAGConstraintException thrown = Assertions.assertThrows(DAGConstraintException.class, () -> {
      firstChild.setChildren(second);
    });
  }
}