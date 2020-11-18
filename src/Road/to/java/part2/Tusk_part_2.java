package Road.to.java.part2;
import java.util.Scanner;
public class Tusk_part_2 {
    public static void main(String[] args) {
        Scanner S =new Scanner(System.in);

        System.out.println("Введите целочисленное число:");
        int nextInt=S.nextInt();
        System.out.println("Число тысяч равно:" +(nextInt/1000)%10);
        System.out.println("Число сотен равно:" +(nextInt/100)%10);
        System.out.println("Число десятков равно:" +(nextInt/10)%10);
        System.out.println("Число единиц равно:" +nextInt%10);

    }
}
