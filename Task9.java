/*9.Напишите "универсальный" метод toString (), в котором применяется рефлексия для получения
символьной строки со всеми переменными экземпляра объекта. В качестве дополнительного задания
можете организовать обработку циклических ссылок.*/
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Task9 {
    public static void main(String[] args) { //
        String intc = new String();
       Class clss = intc.getClass();
        System.out.println(toString(clss));

    }
    public static String toString(Class clss){
        Field[] fields = clss.getDeclaredFields();//все поля берем
        String s = "";
        for (Field field: fields)//для всех полей
             {
          s = s + " "+"FieldName: "+field.getName()+"\n";
          s = s+ " "+"FieldType: "+field.getType().getName()+"\n";
          s = s+ " "+"FieldModif: "+ Modifier.toString(field.getModifiers()) + "; " +"\n";//модификатор доступа
        }
        return s;

    }
}