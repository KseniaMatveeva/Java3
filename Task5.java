public class Task5 {

    public static void main(String[] args) {
        Point point = new Point(5, 6);
        Circle circle = new Circle(point, 60);
        Rectangle rectangle = new Rectangle(point, 70, 80);
        Line line = new Line(point, new Point(80, 90));


        try {
            Point point2 = point.clone();
            System.out.println(point2);
            Circle circle2 = circle.clone();
            circle.moveBy(10, 10);
            System.out.println(circle2);
            Rectangle rectangle2 = rectangle.clone();
            rectangle.moveBy(10, 10);
            System.out.println(rectangle2);
            Line line2 = line.clone();
            line.moveBy(10, 10);
            System.out.println(line2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(point);

    }
}

