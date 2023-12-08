package Uppgifter;

import java.util.Scanner;

public class Uppgift55 {
    public static void main(String[] args) {
        //55.Skapa ett program där indata består av 101 tal. Bestäm och skriv ut summan av de tal
        //som är större än första talet samt summan av de tal som är mindre än första talet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett antal tal upp till 101 :");

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= 101; i++) {
            int n = sc.nextInt();

            if (n > 0) {
                sum1 += n;
            }
            if (n < 0) {
                sum2 += n;
            }


        }
        System.out.println("Summa av positiva tal är:" + sum1 + "\n" + "Summa av negativa tal är:" + sum2);
    }

}
