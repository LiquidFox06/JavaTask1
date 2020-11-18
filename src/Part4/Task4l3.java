package Part4;
import java.util.Scanner;
public class Task4l3 {
    public static void main(String[] args) {
        Scanner lucky = new Scanner(System.in);
        int a;
        System.out.println("Введите число x:");
        a = lucky.nextInt();
        if ((a >= 1000) &&(a<=9999)&(a%5==0))
            System.out.println("Ответ " + "Удача");
         else System.out.println("Нее");
    }
}