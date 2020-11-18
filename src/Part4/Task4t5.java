package Part4;
import java.util.Scanner;
public class Task4t5 {
    public static void main(String[] args) {
        Scanner check1=new Scanner(System.in);
        System.out.println("Введите число:");
        int nextInt =check1.nextInt();
        if ( nextInt/10 == nextInt%10)
            System.out.println("число состоит из одинаковых цифр");
        else System.out.println("число состоит из разных цифр");
    }
}
