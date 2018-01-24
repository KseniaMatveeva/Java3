/*8. В классе Class имеются шесть методов, возвращающих строковое представление типа,
 описываемого объектом типа Class. Чем отличается их применение к массивам, обобщенным типам,
 внутренним классам и примитивным типам?*/
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {


    public static <T> void printNames(T t) {
        System.out.println("Canonical: " + t.getClass().getCanonicalName());
        System.out.println("Simple: " + t.getClass().getSimpleName());
        System.out.println("Type name: " + t.getClass().getTypeName());
        System.out.println("Name: " + t.getClass().getName());
        System.out.println("String: " + t.getClass().toString());
        System.out.println("Generic: " + t.getClass().toGenericString());
    }
    private class Inner {}

    public static <T> void printMethods(T t) {
        Class<?> cl = t.getClass();
        while (cl != null) {

            for (Method m : cl.getDeclaredMethods()) {
                System.out.print(Modifier.toString(m.getModifiers()) + " ");
                System.out.print(m.getReturnType().getCanonicalName() + " ");
                System.out.print(m.getName());
                System.out.println(Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }
    public static void main(String[] args) {
        printNames(1);

        printNames(new int[] { 2, 3 });

        printNames(new ArrayList<String>());

        printNames(new Task8().new Inner());

        printMethods(new int[] { 2, 3 });

}}
