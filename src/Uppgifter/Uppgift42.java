package Uppgifter;

import java.util.Scanner;

public class Uppgift42 {
    public static void main(String[] args) {
        //42.Skapa ett program som läser in och adderar tjugo heltal. Summan ska skrivas ut.
        Scanner sc = new Scanner(System.in);

        int summa = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Skriv tal:" + i + ".");
            int num = sc.nextInt();
            summa += num;

            System.out.println("Summan av de tjugo talen är: " + summa);
        }

    }
}
