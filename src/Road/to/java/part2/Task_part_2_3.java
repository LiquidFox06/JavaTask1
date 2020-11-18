package Road.to.java.part2;
import java.util.Scanner;
public class Task_part_2_3 {
    public static void main(String[] args) {
    Scanner S=new Scanner(System.in);
    int a,b,c,s,h;
    //s - Sn,a-а_1,b-d,c-n ,h-an.

        System.out.println("Введите начальный элемент прогрессии а_1 = ");
        a=S.nextInt();
        System.out.println("Введите разность d =");
        b=S.nextInt();
        System.out.println("Введите номер элемента n =");
        c=S.nextInt();
        h=a+b*(c-1);
        s=(a+h)*c/2;
        System.out.println("Колличество эллемнтов прогрессии=" +h);
        System.out.println("Сумма первых элементов арифметической прогрессии="+s);



    }
}
