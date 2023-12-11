package Uppgifter;

import java.util.Scanner;

public class Uppgift61 {
    public static void main(String[] args) {
        //61.Skapa ett program som läser en följd av positiva tal sorterade i växande ordning.
        //Talföljdens slut anges med en nolla. Om det finns fel i sorteringsordningen ska utskrift ske
        //enligt följande exempel:
        // 1 1 2 7 4 6 12 16 13 8 12 24
        //Talföljden ger utskriften:
        // Tal nr 5 är fel, dess värde är 4
        // Tal nr 9 är fel, dess värde är 13
        // Tal nr 10 är fel, dess värde är 8

        Scanner in = new Scanner(System.in);
        System.out.println("Ange en följd av positiva tal sorterade i växande ordning. Avsluta med en nolla.");
        int tal = in.nextInt(); // läser första talet
        int index = 1; // håller reda på talens position
        int forra = 0; // håller reda på föregående tal
        boolean fel = false; // håller reda på om det finns fel i sorteringsordningen
        while (tal != 0) { // upprepar tills noll anges
            if (tal < forra) { // om talet är mindre än föregående tal
                System.out.println("Tal nr " + index + " är fel, dess värde är " + tal); // skriver ut felet
                fel = true; // sätter fel till true
            }
            forra = tal; // uppdaterar föregående tal
            index++; // ökar positionen
            tal = in.nextInt(); // läser nästa tal
        }
        if (!fel) { // om det inte fanns något fel
            System.out.println("Talföljden är korrekt sorterad."); // skriver ut det
        }
    }

}
