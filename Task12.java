//12. Определите отличие в производительносги обычного вызова метода от его вызова через рефлексию.
public class Task12 {
    public static void main(String[] args) throws Exception {
        Object object = new Object();
        Class<Object> c = Object.class;

        int loops = 100;

        long start = System.currentTimeMillis();

        Object s;
        for (int i = 0; i < loops; i++) {
            s = object.toString();
        }

        long regCalls = System.currentTimeMillis() - start;



        start = System.currentTimeMillis();
        for (int i = 0; i < loops; i++) {
            java.lang.reflect.Method method = c.getMethod("toString");
            s = method.invoke(object);
        }

        long reflCalls = System.currentTimeMillis() - start;

        System.out.println(loops + " regular method calls:" + regCalls
                + " milliseconds.");

        System.out.println(loops + " reflective method:"
                + reflCalls+ " milliseconds.");

    }}