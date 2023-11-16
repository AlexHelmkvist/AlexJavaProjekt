package Uppgifter;

import java.util.Scanner;

public class Uppgift17 {

    public static void main(String[] args) {
        //17.Skapa ett program som läser in två tal och dividerar det första talet med det andra talet. Om
        //det andra talet (nämnaren) är 0 ska ett felmeddelande ges, annars ska kvoten skrivas ut.

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in första heltal:");
        double tal1 = sc.nextDouble();
        System.out.println("Skriv in andra heltal:");
        double tal2 = sc.nextDouble();
        double resultat = tal1/tal2;
        if (tal2<=0){
            System.out.println("Skriv in tal större än '0'.");
        }
        else {
            System.out.println("Resultatet är:" + resultat);
        }
    }
}
