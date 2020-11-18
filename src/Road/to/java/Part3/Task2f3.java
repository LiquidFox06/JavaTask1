package Road.to.java.Part3;
import java.util.Scanner;
public class Task2f3 {
    public static void main(String[] args) {
        Scanner geo=new Scanner(System.in);
        double a,b,x,s,y;
        System.out.println("Введите длину стороны a:");
        a =geo.nextDouble();
        System.out.println("Введите длину стороны b:");
        b =geo.nextDouble();
        System.out.println("Введите размер угла x:");
        x =geo.nextDouble();
        x = Math.toRadians(x);
        y=Math.sin(x);// --0.49999999999999994
        s=(a*b*y)/2;
        System.out.println("Площадь треугольника равна:" +s);
       // System.out.println(y); -- Это Лишнее.. как ножки в Баскете
    }
}
