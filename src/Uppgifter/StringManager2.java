package Uppgifter;

import java.util.Arrays;
import java.util.Scanner;

public class StringManager2 {
    public static void main(String[] args) {
        /*Skriv ett program som läser in text ifrån
          kommandoraden rad för rad tills användaren
          skriver ordet stop.
          När användaren är klar skriver programmet ut
          antal tecken och hur många rader som
          användaren har skrivit, exklusive raden med
          ordet stop*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv din text (skriv 'stop' för att avsluta):");

        int lineCount = 0;
        int charCount = 0;
        String input;


        while (!(input = scan.nextLine()).equals("stop")) {
            lineCount++;
            charCount += input.length();

        }




        System.out.println("Antal rader i texten är: " + lineCount);
        System.out.println("Antal tecken i texten är: " + charCount);



    }

}

