package Uppgifter;

import java.util.Scanner;

public class uppgift34 {

    public static void main(String[] args) {

        //34.Skapa ett program som läser in och skriver ut ett tecken i taget tills en * skrivs in.

        Scanner sc = new Scanner(System.in);

        // Deklarera en variabel för att lagra det inlästa tecknet
        char tecken;

        // Skriv ut en instruktion till användaren
        System.out.println("Skriv in ett tecken i taget. Skriv * för att avsluta.");

        // Läs in det första tecknet
        tecken = sc.next().charAt(0);

        // Upprepa processen tills tecknet * matas in
        while (tecken != '*') {
            // Skriv ut det inlästa tecknet
            System.out.println("Du skrev in: " + tecken);

            // Läs in nästa tecken
            tecken = sc.next().charAt(0);
        }

        // Skriv ut ett avslutande meddelande
        System.out.println("Programmet är slut.");
    }
}








