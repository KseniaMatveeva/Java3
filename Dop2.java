public class Dop2 {
    public static void main(String args[]) {
        String Str = new String("Привяу");
        Integer intc=new Integer(5);

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toString());
        System.out.print("Возвращаемое значение: ");
        System.out.println(intc);//в неявном виде используем toString, println сам обращается в toString
        System.out.print("Hello"+ intc);


    }
}

