package Road.to.java.Part3;
import java.util.Scanner;
public class Task2j7 {
    public static void main(String[] args) {
        Scanner ran=new Scanner(System.in);
        System.out.println("Введите n:");
       // final int min=-5;
        //final int max = 3;
        double a;
        a =ran.nextDouble();
        a=Math.random()*3-5;
        System.out.println("Ответ:"+Math.round(a));
    }
}
