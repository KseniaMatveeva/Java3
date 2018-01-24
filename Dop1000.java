
import java.util.Scanner;
import java.io.InputStream;


public class Dop1000 {
    public static void main(String[] args) {
        InputStream is = Dop1000.class.getResourceAsStream("f1.txt");
        Scanner sc = new Scanner(is);

        System.out.println(sc.nextLine());
        sc.close();
        System.getProperty("java.class.path");

    }
}
