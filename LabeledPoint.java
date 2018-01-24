public class LabeledPoint extends Point {//класс ЛэйблдПоинт
    private String label;//инициализируем
    public LabeledPoint(String label, double x, double y) {
        super(x, y);//суперкласс (производные от тех х и у в Поинт)
        this.label = label;//меточка
    }
    @Override
    public String toString() {//метод ту стринг - запишем метку и производный тот класс нашего Поинт
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) { //сравнение с обьектом по той же схеме что и в Поинт
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;//вообще это обычная схема сравнения обьектов, которая нам и в 6 задании пригодится

        LabeledPoint that = (LabeledPoint) o;//говорим что именно эта метка будет нашим обьектом

        return label != null ? label.equals(that.label) : that.label == null;
    }

  /*  @Override
    public int hashCode() {
        return super.hashCode();
    }
*/
     @Override
        public int hashCode() {//хешкод данного выражения
            int result = super.hashCode();
            result = 31 * result + (label != null ? label.hashCode() : 0);
            return result;
        }
    @Override
    public LabeledPoint clone() throws CloneNotSupportedException {//если вызываем метод клон
        return (LabeledPoint) super.clone();//то делается клон нашего суперкласса
    }

}
