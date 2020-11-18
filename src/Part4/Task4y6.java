package Part4;
import java.util.Scanner;
public class Task4y6 {
    public static void main(String[] args) {
        Scanner time= new Scanner(System.in);
        System.out.println("Введите возраст:");
        int nextInt=time.nextInt();
        if (nextInt<=13)
            System.out.println("Детство");
        if (nextInt>=14 && nextInt<=24)
            System.out.println("Молодость");
        if (nextInt>=25 && nextInt<=59)
            System.out.println("Зрелость");
        if (nextInt>=60 )
            System.out.println("Старость");
    }
}
