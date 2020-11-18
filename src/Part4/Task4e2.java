package Part4;
import java.util.Scanner;
public class Task4e2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c, mx, mn;
        System.out.println("Введите 1-е число:");
        a = num.nextInt();
        System.out.println("Введите 2-е число:");
        b = num.nextInt();
        System.out.println("Введите 3-е число::");
        c = num.nextInt();

        if ((a - b) * (c - a) >=0) {              // a >= b and a <= c OR a <= b and a >= c
            System.out.print(a);
        } else if ((b - a) * (c - b) >= 0) {       // b >= a and b <= c OR b <= a and b >= c
            System.out.print(b);
        } else {
            System.out.print(c);
        }

    }}







//Новое.Термальные условия.
//Повтори.


