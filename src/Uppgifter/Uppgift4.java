package Uppgifter;

import java.util.Scanner;

public class Uppgift4 {
    public static void main(String[] args) {
       /* 4. Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
        av de tre talen.

        */
        //Scanna in information
        Scanner scanner = new Scanner(System.in);
        //Ber användare skriva in första talet.
        System.out.println("Decemal tal skrivs genom (,)");
        System.out.println("Ange den första talet:");
        //Första variabel att scanna
        double num1 = scanner.nextDouble();

        //Ber användare skriva in andra  talet.
        System.out.println("Ange den andra talet:");
        //Andra variabel att scanna
        double num2 = scanner.nextDouble();

        //Ber användare skriva in tredje talet.
        System.out.println("Ange den tredje talet:");
        //Tredje variabel att scanna
        double num3 = scanner.nextDouble();
        //Variabel summa skriva in formul
        double summa = (num1 + num2 + num3);
        //Variabel medelvärde skriva in formul
        double medelvärde = summa/3;


        System.out.println(" Summa är " + summa + " medelvärde är " + medelvärde);


    }
}
