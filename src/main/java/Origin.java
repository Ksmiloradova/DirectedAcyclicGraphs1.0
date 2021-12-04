import java.util.Set;

/**
 * Class of parent nodes in the graph.
 */
public class Origin extends Point {

  /**
   * Property for the rectangle limiting the boards of the point and all its children.
   */
  protected BoundBox bounds = new BoundBox();

  /**
   * Getter for minimal square of space needed for the origin with children.
   *
   * @return respective odject Coord2D[] containing coordinates of the diagonal points
   */
  public Coord2D[] getBounds() {
    return bounds.reenumeratePoints(this);
  }

  /**
   * Property for point's neighbours.
   */
  protected Set<Point> children;

  /**
   * Getter for minimal square of space needed for the origin with children.
   *
   * @return respective odject Coord2D
   */
  public Set<Point> getChildren() {
    return children;
  }

  /**
   * Setter for children of the origin.
   *
   * @param newValue new set of children
   * @throws DAGConstraintException there is cycle
   */
  public void setChildren(Set<Point> newValue) throws DAGConstraintException {
    Set<Point> temporal = children;
    children = newValue;
    if (hasCycle(this)) {
      children = temporal;
      throw new DAGConstraintException();
    }
  }

//  /**
//   * Constructor for the node of the graph.
//   *
//   * @param position position of the origin
//   */
//  public Origin(Coord2D position) {
//    this.position = position;
//  }

  /**
   * Method checks if there is a cycle in the point's children.
   *
   * @param sourcePoint point being checked
   * @return is there a cycle
   */
  private static boolean hasCycle(Point sourcePoint) {
    sourcePoint.setBeingVisited(true);

    if (sourcePoint instanceof Origin && ((Origin) sourcePoint).getChildren() != null) {
      for (Point child : ((Origin) sourcePoint).getChildren()) {
        if (child.isBeingVisited()) {
          return true;
        } else if (!child.isVisited() && hasCycle(child)) {
          return true;
        }
      }
    }
    sourcePoint.setBeingVisited(false);
    sourcePoint.setVisited(true);
    return false;
  }
}
