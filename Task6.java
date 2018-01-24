/*6.Допустим, что в методе I tern, equals (), представленном в разделе 4.2.2,
 используется проверка с помощью операции instanceof. Реализуйте метод Discountedltem. equals ()
 таким образом, чтобы выполнять в нем сравнение только с суперклассом, если его параметр otherObject
 относится к типу Item, но с учетом скидки, если эго тип Discountedltem. Продемонстрируйте,
 что этот метод сохраняет симметричность, но не транзитивность, т.е. способность обнаруживать
 сочетание товаров по обычной цене и со скидкой, чтобы делать вызовы х. equals (у) и у .equals (z), но не х. equals (z).
*/
import java.util.Objects;
class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;// смотрим одинаковые ли обьекты
        if (otherObject == null) return false;//если нулевой параметр то вернет фолс
        if (!(otherObject instanceof Item)) return false;//смотрит другой обьект является ли Итем
        Item other = (Item) otherObject;//смотрим наши переменные имеют ли идентичное значение
        return Objects.equals(description, other.description)
                && price == other.price;
    }

    public int hashCode() {
        return Objects.hash(description, price);
    }
}


class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public boolean equals(Object otherObject) {
        if (otherObject.getClass() == Item.class) {
            if (super.equals(otherObject))
                return true;
        } else {
            if (!super.equals(otherObject))
                return false;
            DiscountedItem other = (DiscountedItem) otherObject;
            return discount == other.discount;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}

public class Task6 {

    public static void main(String[] args) {
        Item item = new Item("Item1", 100);
        DiscountedItem dItem =  new DiscountedItem("Item1", 100, 10);
        DiscountedItem dItem2 = new DiscountedItem("Item1", 100, 5);

        System.out.println(dItem.equals(item));
        System.out.println(item.equals(dItem2));
        System.out.println(dItem.equals(dItem2));
    }

}

