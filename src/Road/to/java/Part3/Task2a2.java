package Road.to.java.Part3;
import java.util.Scanner;
public class Task2a2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите количество верст:");
        double nextDouble =in.nextDouble();
        System.out.println("Количество километров равно: \n" +nextDouble* 1066.8);
    }
}
