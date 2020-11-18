package Part4;
import java.util.Scanner;
public class Task4u7 {
    public static void main(String[] args) {
        Scanner palindrome = new Scanner(System.in);
        System.out.println("Введите число:");
        int nexInt = palindrome.nextInt();
        if (nexInt < 100 && nexInt > 999)
            System.out.println(nexInt);
        else if (nexInt / 100 == nexInt % 100 % 10)
            System.out.println("Ответ: "+"число является палиндромом ");
        else
            System.out.println("Ответ: "+ (nexInt + 1));

    }
}






