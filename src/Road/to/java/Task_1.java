package Road.to.java;


import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int a,b,с;
        String t;
        System.out.println("В каком году вы родились?");
        a = in.nextInt();
        System.out.println("Сколько вам лет?");
        b = in.nextInt();
        System.out.println("В каком году  тебе будет 16?");
        с = in.nextInt();
        System.out.println("какой твой город?");
        t=in.next();
        System.out.println("Вы родились в  " + a);
        System.out.println("Мне  " + b);
        System.out.println("В  " +с );
        System.out.println("Твой город " + t);
       // t=in.nextLine();
    }
}
