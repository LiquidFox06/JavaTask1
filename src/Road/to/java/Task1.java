package Road.to.java;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int nextInt;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите длину ребра куба:");
            nextInt = in.nextInt();
        }

        System.out.printf("Объем = %d%n", nextInt * nextInt * nextInt);
        System.out.printf("Площадь поверхности = %d%n", nextInt * nextInt * 6);
    }
}
