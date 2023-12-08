package Uppgifter;

import java.util.Scanner;

public class Uppgift56 {
    public static void main(String[] args) {
        //56.Läs in ett antal tal. 9999 ska vara stoppvärde. Beräkna och skriv ut medelvärdet av de
        //inlästa talen. Tänk på vad som händer om det första inlästa talet är stoppvärdet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett antal tal upp till 9999:");
        int sum = 0;
        int tal = 0;

        for (int i = 1;i <= 9999;i++){
            int n = sc.nextInt();

            sum += n;
            tal++;
        }
        System.out.println("Antal tal är:"+ tal + "\n" + "Summa är:"+sum + "\n" + "Medelvärde är:" + sum/9999);
    }
}
