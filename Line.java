public class Line extends Shape {//класс линия

    private Point to;//инициализируем вторую точку до которой будет идти линия

    public Line(Point from, Point to) {//откуда будет идти линия - наша точка
        super(from);//фром - наша точка, которая должна передаться
        this.to = to;//ту - наша новая точка
    }

    @Override
    public Point getCenter() {//центр нашей линии - между двумя этими точками
        double x = getPoint().getX() + (to.getX() - getPoint().getX()) / 2;//координата начала + конца - пополам
        double y = getPoint().getY() + (to.getY() - getPoint().getY()) / 2;//коррдината начала + конца - пополам

        return new Point(x, y);//новая точка х у
    }

    @Override
    public Line clone() throws CloneNotSupportedException {//метод делающий клон линии
        Line newLine = (Line) super.clone();
        newLine.to = to.clone();
        return newLine;
    }

    @Override
    public void moveBy(double dx, double dy) {//метод который двигает нашу точку на определенное расстояние
        super.moveBy(dx, dy);
        to = new Point(to.getX() + dx, to.getY() + dy);
    }

    @Override
    public String toString() {//метод тустринг - выводящий нашу линию
        return "Line{" +
                "to=" + to +
                "} " + super.toString();
    }
}