package Part4;
import  java.util.Scanner;
public class Task4t8 {
    public static void main(String[] args) {
        Scanner less =new Scanner(System.in);
        int a,b;
        System.out.println("Введите a :");
        a=less.nextInt();
        System.out.println("Введите b :");
        b=less.nextInt();
        if (a!=0)
        System.out.println("Да это"+ -b/a );
        else System.out.println("Нет не это");

//else System.out.println("не");

    }
}


// Тут я не понял почему у меня не получается ответ. Нужно было решить уровнение ах + b = 0.