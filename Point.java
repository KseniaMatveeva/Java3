public  class Point implements Cloneable  {//класс поинт, которого можно делать клон

    protected double x;//инициализируем переменные
    protected double y;

    public Point(double x, double y) {
        this.x = x; //говорим что именно определенные наши значения будут х и у
        this.y = y;
    }

    public double getX() {
        return x;
    }//берем х и у и подставляем для координаты нашей точки

    public double getY() {
        return y;
    }

    @Override
    public String toString() { //методом то стринг записываем окончательно нашу точку
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) { //метод сравнения
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//основное сравнение

        Point point = (Point) o;

        if (Double.compare(point.x, x) != 0) return false;//если по х равны, то сравниваем по у
        return Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() { //метод хешкодирования
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);//переводим х в лонг
        result = (int) (temp ^ (temp >>> 32));//результат равен вот этому
        temp = Double.doubleToLongBits(y);//переводим в у
        result = 31 * result + (int) (temp ^ (temp >>> 32));//генерируем наш полученный результат
        return result;
    }

    public Point clone() throws CloneNotSupportedException {//если вызываем метод клон то
        return (Point) super.clone(); //делается клон нашей точки
    }
}
