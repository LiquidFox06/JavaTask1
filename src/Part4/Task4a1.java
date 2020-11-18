package Part4;
import java.util.Scanner;
public class Task4a1 {
    public static void main(String[] args) {
        Scanner inbox = new Scanner(System.in);
        int a;
        boolean value = true;
        boolean value1 = false;
        String x;
        String z;
        String e;
        String d;
        x = "1-знач";
        z = "2-знач";
        e = "3-знач";
        d = "4-знач";
        System.out.println("Введите x: ");
        a = inbox.nextInt();

         if (a < 100) {
             System.out.println("Вход");
             if (value)
                 System.out.println("Ответ: число" + x);

              else if(a>10)
                 System.out.println(z);
             else if(a<10)
                 System.out.println(z);
              else
                  System.out.println("Плохо 1");
         }
         else System.out.println("Не входим");
         if (a>100)
        if (value1)
            System.out.println(e);
        else if (a>1000)
            System.out.println(d);
        else if (a<1000)
            System.out.println(d);
        else System.out.println("Плохо 2");
    }
        }





//Иван просьба прокоментировать. Правильно ли я сделал.


