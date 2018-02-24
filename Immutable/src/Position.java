/**
 * Instances of this class represent a position on a playing field.
 * This class is mutable. Presence of setter methods imply that.
 */
class Position implements MutablePosition {
    private int x;
    private int y;

    /**
     * Constructor
     * @param x The x position associated with this object.
     * @param y The y position associated with this object.
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Return the x value associated with this object.
     */
    public int getX() { return x; }

    /**
     * Set the value of x
     */
    public void setX(int x) {this.x = x;}

    /**
     * Return the y value associated with this object.
     */
    public int getY() { return y; }

    /**
     * Set the value of y
     */
    public void setY(int y) {this.y = y;}

    /**
     * Return a Position object that has x and y values that are
     * offset from the x and y values of this object by the given
     * amount.
     * @param xOffset The x offset.
     * @param yOffset The y offset.
     */
    public Position offset(int xOffset, int yOffset) {
        return new Position(x+xOffset, y+yOffset);
    } // offset(int, int)
}
    