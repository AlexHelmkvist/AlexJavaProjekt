package Uppgifter;

import java.util.Scanner;

public class Uppgift57 {
    public static void main(String[] args) {
        //57.En bilägare har för ett antal tankningar skrivit upp antal tankade liter bensin och antal
        //körda mil.
        //Skapa ett program som läser in hur många liter som har tankats samt antal körda mil för varje
        //tankningstillfälle. Inmatningen ska avslutas med 0. Algoritmen ska beräkna och visa
        //bensinförbrukning per mil för varje tankning. När data för samtliga tanktillfällen är inlästa
        //ska genomsnittlig bensinförbrukning per mil skrivas ut.

        Scanner sc = new Scanner(System.in);
        double antalLiter;
        double antalMil;
        double förbrukning;
        double totalMil = 0;
        double totalFörbrukning = 0;
        double genomsnitt;
        System.out.println("Välkommen till programmet som beräkna bränsleförbrukning per mil,ange '0' för att avsluta programmet.");
        System.out.println("Ange antal tankade liters:");

        antalLiter = sc.nextDouble();

        while (antalLiter !=0) {
            System.out.println("Ange antal mil som du körde:");
            antalMil = sc.nextDouble();
            förbrukning = antalLiter / antalMil;
            System.out.println("Förbrukning per mil är:" + förbrukning);
            totalFörbrukning += antalLiter;
            totalMil += antalMil;
            System.out.println("Ange antal tankade liters:");
            antalLiter = sc.nextDouble();

        }
        genomsnitt = totalFörbrukning / totalMil;
        System.out.printf("Genomsnittlig bensinförbrukning per mil är:" + genomsnitt + "\n" + "Totalförbrukning:" + totalFörbrukning + "\n" + "Totalmiltar:" + totalMil);

    }

}









