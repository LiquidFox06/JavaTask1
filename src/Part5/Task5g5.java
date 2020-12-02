package Part5;
import java.util.Scanner;
public class Task5g5 {
    public static void main(String[] args) {
        Scanner gg=new Scanner(System.in);
        System.out.println("Введите n: ");
        int nextInt=gg.nextInt();
        int i;
        for (i = 100; i < 900; i++) {
        if (i%10==nextInt)
            System.out.println("ответ:"+i);
        }
    }}

