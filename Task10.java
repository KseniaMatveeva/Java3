/*10. Воспользуйтесь примером кода из раздела 4.5.1 для перечисления всех методов из класса типа int [ ].
В качестве дополнительного задания можете выявить один метод, обсуждавшийся в этой главе, как неверно описанный.*/
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class  Task10 {
    public static void main(String[] args) { //
        //Integer intc = new Integer(1);
        int[] intc = new int[0];
        //String intc = new String ();
        Class clss = intc.getClass();
        Method[] methods = clss.getMethods();

        for (Method method: methods) {
            System.out.println("Method: "+method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter: parameters){
                System.out.println("Param: "+parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }

    }
}
