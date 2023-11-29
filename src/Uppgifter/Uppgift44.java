package Uppgifter;

import java.util.Scanner;

public class Uppgift44 {
    public static void main(String[] args) {
        //44.Skapa ett program som låter användaren bestämma hur många tal han vill summera. Läs in
        //detta antal tal och summera dem Skriv ut summan.
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många tal vill du summera?");
        int n = sc.nextInt();
        int summa = 0;

        for (int i = 0; i < n; i++) {

            System.out.println("Ange tal " + (i + 1) + ":");

            int num = sc.nextInt();
            summa += num;
            System.out.println("Summa är:"  + summa);
        }

    }
}
