/*11. Напишите программу, выводящую сообщение "Hello, World", воспользовавшись
рефлексией для поиска поля out в классе java.lang.System и методом invoke () для вызова метода println ().*/
import java.lang.reflect.Method;
import java.lang.reflect.Field;
public class Task11 {
    public static void main(String[] args) throws Exception {
        Class<?> systemClass = java.lang.Class.forName("java.lang.System");// не знаем какой тип в классе но мы ищем класс с именем джава ленг систем
        Field outField = systemClass.getDeclaredField("out");// подполе с названием аут
        Class<?> printStreamClass = outField.getType();
        Method printlnMethod = printStreamClass.getDeclaredMethod("println", String.class);
        Object object = outField.get(null);
        printlnMethod.invoke(object, "Hello World!");
    }
}
