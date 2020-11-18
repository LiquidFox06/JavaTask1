package Road.to.java.part2;
import java.util.Scanner;
public class Task_part_2_2 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Введите число:");
        int nextInt=S.nextInt();
        System.out.println("Результат:"+(nextInt/100)%10);
    }
}
