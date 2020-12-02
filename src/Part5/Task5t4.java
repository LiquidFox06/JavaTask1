package Part5;

import java.util.Scanner;

public class Task5t4 {
    public static void main(String[] args) {
        int nextInt;
        try (Scanner palindrome = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            nextInt = palindrome.nextInt();
        }

        int numCopy = nextInt;
        int reverseNumInt = 0;
        while (numCopy != 0) {
            reverseNumInt = reverseNumInt * 10 + numCopy % 10;
            numCopy /= 10;
        }
        if (reverseNumInt == nextInt) {
            System.out.println(nextInt + " is a Palindrome!");
        } else {
            System.out.println(nextInt + " is not a Palindrome!");
        }
    }
}



