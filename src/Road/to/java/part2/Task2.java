package Road.to.java.part2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int nextInt;
        try (Scanner S = new Scanner(System.in)) {
            System.out.println("Введите число:");
            nextInt = S.nextInt();
        }
        System.out.println("Результат:" + (nextInt / 100) % 10);
    }
}
