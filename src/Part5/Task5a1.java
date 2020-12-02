package Part5;

import java.util.Scanner;

public class Task5a1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, sum = 0;

        System.out.print("Введите a: ");
        a = in.nextInt();
        System.out.print("Введите b: ");
        b = in.nextInt();

        for (int i = a; i <= b; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}


