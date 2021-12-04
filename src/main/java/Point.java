/**
 * Class of leaf nodes in the graph.
 */
public class Point {

  /**
   * Property for coordinates of the point.
   */
  protected Coord2D position = new Coord2D(0, 0);

  /**
   * getter for position of physical point
   *
   * @return respective odject Coord2D
   */
  public Coord2D getPosition() {
    return position;
  }

  /**
   * setter for position of physical point
   *
   * @param newValue respective odject Coord2D
   */
  public void setPosition(Coord2D newValue) {
    position = newValue;
  }

  private boolean beingVisited;
  private boolean visited;

  /**
   * Getter for property beingVisited.
   *
   * @return is the point being visited
   */
  public boolean isBeingVisited() {
    return beingVisited;
  }

  /**
   * Setter for property beingVisited.
   *
   * @param newValue the setting value
   */
  public void setBeingVisited(boolean newValue) {
    beingVisited = newValue;
  }

  /**
   * Getter for property visited.
   *
   * @return is the point already visited
   */
  public boolean isVisited() {
    return visited;
  }

  /**
   * Setter for property visited.
   *
   * @param newValue the setting value
   */
  public void setVisited(boolean newValue) {
    visited = newValue;
  }
}
