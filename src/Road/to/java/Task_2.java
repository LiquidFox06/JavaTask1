package Road.to.java;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите а");
            System.out.println("Введите б");
            System.out.println("Введите с");
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
        System.out.println("а=" + a);
        System.out.println("б=" + b);
        System.out.println("с=" + c);
    }
}
