package Uppgifter;

import java.util.Scanner;

public class Uppgift20 {
    public static void main(String[] args) {
        //20.Skapa ett program som läser in ett tal. Om talet är mellan 0 och 9 ska kvadraten på talet
        //skrivas ut. Annars ska lämpligt felmeddelande ges.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange heltal:");
        int tal = sc.nextInt();

        if (tal >= 0 && tal <= 9){
            int resultat = tal*tal;
            System.out.println("Kvadraten på " + tal + " är " + resultat);
        }
        else {
            System.out.println("Talet måste vara mellan 0 och 9");
        }

    }
}
