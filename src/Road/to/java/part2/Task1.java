package Road.to.java.part2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int x;
        int nextInt = in.nextInt();
        x = (nextInt % 10) + ((nextInt / 10) % 10) + ((nextInt / 100) % 10);

        System.out.println("Сумма цифр:" + x);// -- Не понял почему тут ошибка.
        System.out.println("Сумма цифр:" + (nextInt % 10) + ((nextInt / 10) % 10) + ((nextInt / 100) % 10));
        System.out.println("Сумма цифр:" + 1 + 5 + ((nextInt / 100) % 10));
        System.out.println("Произведение цифр:" + (nextInt % 10) * ((nextInt / 10) % 10) * ((nextInt / 100) % 10));
    }
}
