package Road.to.java.Part3;
import java.util.Scanner;
public class Task2a1 {
    public static void main(String[] args) {
        Scanner moon=new Scanner(System.in);
        System.out.println("Введите радиус:");
        double square;
        double nextDouble =moon.nextDouble();
        square=Math.PI*Math.pow(nextDouble,2);
        System.out.println("Площадь круга: "+ square);
    }

}
