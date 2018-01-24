package lab4.dop1;

import java.util.Scanner;
import java.io.InputStream;


public class Dop1 {
    public static void main(String[] args) {
        InputStream is = Dop1.class.getResourceAsStream("/lab41/dop1/f2.txt");
        Scanner sc = new Scanner(is);
        System.out.println(sc.nextLine());
        sc.close();


    }
}
