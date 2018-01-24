public class Task1 {

    public static void main(String[] args) {//основное тельце
        Point point = new Point(5, 6);//делаем новую точку с координатами 5 и 6
        LabeledPoint labeledPoint = new LabeledPoint("Tochechka1", 4, 2);//делаем новую метку


        try {
            Point point2 = point.clone();//поинт 2 - клон нашей точки поинт
            System.out.println(point2);//выводим ее
            LabeledPoint labeledPoint2 = labeledPoint.clone();//метка 2 - клон нашей метки
            System.out.println(labeledPoint2);

        } catch (CloneNotSupportedException e) {//пишем всегда при рефлексии
            e.printStackTrace();
        }

        System.out.println(point);//выводим точку и метку
        System.out.println(labeledPoint);

    }
}
