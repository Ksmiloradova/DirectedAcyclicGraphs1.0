import java.util.Set;

/**
 * Class for the rectangle covering all points of the node.
 */
public final class BoundBox {

  /**
   * Method for recounting the extreme points of the node.
   *
   * @param node all points of the node.
   * @return bounds of the set
   */
  public Coord2D[] reenumeratePoints(Origin node) {
    Set<Point> coordinates = node.getChildren();
    Coord2D nodeCoordinates = node.getPosition();
    double minX = Double.MAX_VALUE;
    double minY = Double.MAX_VALUE;
    double maxX = -Double.MAX_VALUE;
    double maxY = -Double.MAX_VALUE;
    minX = nodeCoordinates.getX() < minX ? nodeCoordinates.getX() : minX;
    maxX = nodeCoordinates.getX() > maxX ? nodeCoordinates.getX() : maxX;
    minY = nodeCoordinates.getY() < minY ? nodeCoordinates.getY() : minY;
    maxY = nodeCoordinates.getY() > maxY ? nodeCoordinates.getY() : maxY;
    if (coordinates != null) {
      for (Point coordinate :
          coordinates) {
        minX = coordinate.position.getX() < minX ? coordinate.position.getX() : minX;
        maxX = coordinate.position.getX() > maxX ? coordinate.position.getX() : maxX;
        minY = coordinate.position.getY() < minY ? coordinate.position.getY() : minY;
        maxY = coordinate.position.getY() > maxY ? coordinate.position.getY() : maxY;
      }
    }
    return new Coord2D[]{new Coord2D(minX, minY), new Coord2D(maxX, maxY)};
  }
}
