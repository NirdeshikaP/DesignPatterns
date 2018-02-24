/**
 * Interface to represent a position that is mutable.
 * Presence of setter methods imply it is mutable.
 */
public interface MutablePosition extends ImmutablePosition{
    public void setX(int x);
    public void setY(int y);
}
