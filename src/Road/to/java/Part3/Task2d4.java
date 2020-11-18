package Road.to.java.Part3;
import java.util.Scanner;
public class Task2d4 {
    public static void main(String[] args) {
    Scanner indoo= new Scanner(System.in);
        System.out.println("Введите число:");
        double nextDouble =indoo.nextDouble();
        int x;
        x= (int) (nextDouble *Math.pow(10, 3)% 10);
        System.out.println("Ответ:" +x);
    }
}
