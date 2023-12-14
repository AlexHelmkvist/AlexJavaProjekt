package Uppgifter;

import java.util.Scanner;

public class Uppgift63 {
    public static void main(String[] args) {
        //63.Skapa ett program som läser in en följd av positiva tal som ska vara sorterade i växande
        //ordning. Talföljdens slut anges med en nolla. Om det finns fel i sorterings-ordningen ska
        //meddelandet “Fel sorteringsordning“ skrivas ut.

        Scanner in = new Scanner(System.in);
        System.out.println("Ange en följd av positiva tal sorterade i växande ordning. Avsluta med en nolla.");
        int tal = in.nextInt(); // läser första talet
        int förra = 0; // håller reda på föregående tal

        while (tal != 0) {// upprepar tills noll anges

            if (tal < förra) { // om talet är mindre än föregående tal
                System.out.println("Fel sortering ordning."); // skriver ut felet

            }
            förra = tal;//uppdaterar föregående tal
            tal = in.nextInt(); // läser nästa tal
        }
    }
}
