package Uppgifter;

import java.util.Scanner;

public class Uppgift39 {
    public static void main(String[] args) {
        //39.Skapa ett program som läser in ett pris exkl moms och skriver ut priset inkl 25 % moms.
        //Inläsningen ska pågå tills 0 anges.
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv ett pris exkl.moms,skriv '0'om du vill avsluta programmet.");
        double prisExklmoms = sc.nextDouble();


        while (!(prisExklmoms == 0)) {
            double prisInklmoms = prisExklmoms * 1.25;
            System.out.println("Pris inklusive moms är:" + prisInklmoms);
            break;
        }


    }

}
