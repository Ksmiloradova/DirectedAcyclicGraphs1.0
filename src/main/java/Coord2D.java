/**
 * Class for coordinates in 2D space.
 */
public class Coord2D {

  private final double x;
  private final double y;

  /**
   * Constructor for Coord2D.
   *
   * @param x abscissa
   * @param y ordinate
   */
  public Coord2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

//  /**
//   * something like operator overloading ==
//   *
//   * @param other current object will be compared with 'other' one
//   * @return if this object is equal to other
//   */
//  boolean equal(Coord2D other) {
//    return other.x == x && other.y == y;
//  }

  /**
   * Getter for double x coordinate.
   *
   * @return x coordinate value
   */
  public double getX() {
    return x;
  }

  /**
   * Getter for double y coordinate.
   *
   * @return y coordinate value
   */
  public double getY() {
    return y;
  }
}
