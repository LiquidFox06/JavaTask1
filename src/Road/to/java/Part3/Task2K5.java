package Road.to.java.Part3;
import java.util.Scanner;
public class Task2K5 {
    public static void main(String[] args) {
        Scanner deposit=new Scanner(System.in);
        double DEP1,TimeDep,DepRate,income,lastsummdep; //x
        int rub,penny,totalincome,totalincome1,rub1,penny1;
        System.out.println("Введите величину вклада в рублях:");
        DEP1 = deposit.nextInt();
        System.out.println("Введите срок вклада в днях:");
        TimeDep = deposit.nextInt();
        System.out.println("Введите годовую процентную ставку:");
        DepRate = deposit.nextInt();
        income=((((DEP1/100)*DepRate)/365)*TimeDep);
        totalincome= (int) (income*100);
        rub= (int) Math.floor(income);
        penny= (int) (Math.floor(income*100)%100);
        lastsummdep= income+DEP1;
        totalincome1= (int) (lastsummdep*100);
        rub1= (int) Math.floor(lastsummdep);
        penny1= (int) (Math.floor(lastsummdep*100)%100);
        System.out.println("Доход: "+rub + " Рубля. "+penny+" Копеек. ");
        System.out.println("Сумма по окончании срока вклада: "+ rub1 +" Рубля. "+penny1+ " Копеек. " );


    }
}

// 16-21 строка должна делаться более короче, но я пока не понял как..