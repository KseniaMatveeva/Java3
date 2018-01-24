public class Circle extends Shape {//класс окружность

    private double radius;//инициализируем радиус

    public Circle(Point center, double radius) {
        super(center);//суперкласс нашей точки - центр окружности
        this.radius = radius;//задаем радиус
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }//принимаем нашу точку - центр окружности

    @Override public Circle clone() throws CloneNotSupportedException {//делаем так чтобы можно было клонировать нашу окружность
        return (Circle) super.clone();
    }

    @Override
    public String toString() {//метод то стринг - записать
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
