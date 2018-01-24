public class Rectangle extends Shape {//класс прямоугольник

    private double width;//высота и ширина - инициализируем
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);//точка заданная будет левым верхним углом
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(getPoint().getX() + width / 2, getPoint().getY() - height / 2);
    }
// центр нашего прямоугольника будет в точке этой
    @Override
    public Rectangle clone() throws CloneNotSupportedException {//делаем  метод который создает клон прямоугольника
        return (Rectangle) super.clone();
    }

    @Override
    public String toString() {//метод тустринг выводящий
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}