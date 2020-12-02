package Part5;
import java.util.Scanner;
public class Task5k6 {
    public static void main(String[] args) {
        int a,b,sum=0;
       int i;
        Scanner stage=new Scanner(System.in);
        System.out.println("Введите a: ");
        a=stage.nextInt();
        System.out.println("Введите b: ");
        b=stage.nextInt();

        for (i=a;i<=b;i++){
           sum+=(i*i);
          System.out.println("Отевет: "+sum);
        }
        //System.out.println(sum);
    }
}
