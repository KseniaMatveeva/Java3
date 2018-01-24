
public abstract class Shape implements Cloneable {//класс шейп, в котором можно использовать клонирование
    private Point point;

    Shape(Point point) {
        this.point = point;
    }

    protected Point getPoint() {
        return point;
    }

    public void moveBy(double dx, double dy) {
        point = new Point(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCenter();

    public Shape clone() throws CloneNotSupportedException {
        Shape newShape = (Shape) super.clone();
        newShape.point = point.clone();
        return newShape;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "point=" + point +
                '}';
    }
}