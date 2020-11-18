package Part4;
import java.util.Scanner;
public class Task4r4 {
    public static void main(String[] args) {
        Scanner lab=new Scanner(System.in);
        System.out.println("Введите число x:");
       int nextInt =lab.nextInt();
        if (nextInt>3)
        System.out.println("y: "+Math.pow(nextInt,2)+5);
 else System.out.println("Пропуск");
        if (nextInt<=3)
            System.out.println("y:"+(nextInt-8));
        else System.out.println("Пропуск 2");
    }
}

