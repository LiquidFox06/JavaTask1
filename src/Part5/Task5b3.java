package Part5;

import java.util.Scanner;

public class Task5b3 {
    public static void main(String[] args) {
        int num;
        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
        }

        int n, sum = 0;
        for (n = num; n > 0; n /= 10) {
            sum += n % 10;
        }
        System.out.println(sum);
    }
}
