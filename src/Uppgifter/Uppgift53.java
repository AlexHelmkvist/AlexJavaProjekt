package Uppgifter;

import java.util.Scanner;

public class Uppgift53 {
    public static void main(String[] args) {
        //53.Skapa ett program som läser in 10 korrekta tal. Korrekta tal är tal som ligger i området 5000
        //< n < 10000. Skriv ut summan samt medelvärdet för de korrekta talen.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange 10 tal mellan 5000 till 10000 :");
        int sum = 0;

        for (int i = 0; i <= 9; i++) {
            int n = sc.nextInt();

            if (n > 5000 && n < 10000) {
                sum += n;

            } else {

                System.out.println("Det är inte korrekt tal, försök igen.");
                return;
            }

        }
        System.out.println("Summa av talet är:" + sum + "\n" + "Medelvärde är:" + sum / 10);

    }
}
