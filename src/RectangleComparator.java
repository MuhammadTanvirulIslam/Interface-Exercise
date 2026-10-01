public class RectangleComparator
        implements ComparableInterface<Rectangle> {

    @Override
    public boolean isBigger(Rectangle first, Rectangle second) {

        return second.calculateArea() > first.calculateArea();
    }
}