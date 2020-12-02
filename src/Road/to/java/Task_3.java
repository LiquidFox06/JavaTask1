package Road.to.java;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, d, c, k, x;
        System.out.println("Введите 'a':");
        System.out.println("Введите 'd':");
        System.out.println("Введите 'c':");
        System.out.println("Введите 'k':");
        a = num.nextInt();
        d = num.nextInt();
        c = num.nextInt();
        k = num.nextInt();
        x = (a + 3 * (d - 12)) * (c - 5 * k);
        System.out.println("x=" + x);
    }
}

