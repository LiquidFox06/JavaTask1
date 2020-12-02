package Part5;

import java.util.Scanner;

public class Task5r2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            int sumOfNumbers = (i / 100) + (i % 100) / 10 + (i % 10);

            if (i % 7 == 0 && sumOfNumbers % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}

