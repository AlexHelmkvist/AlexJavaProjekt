package Uppgifter;

import java.util.Scanner;

public class Uppgift5 {
    public static void main(String[] args) {

        //Läs in ett heltal motsvarande svenska kronor och skriv ut motsvarande värde i pund
        //respektive dollar. Antag att kursen är : 1 dollar = 6 kr, 1 pund = 10 kr.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange belopp i svenska kronor:");
        double kronor = scanner.nextInt();

        double dollar = kronor/6;
        double pund = kronor/10;

        System.out.printf("Motsvarande belopp i dollar: %.2f\n", dollar);
        System.out.printf("Motsvarande belopp i pund: %.2f\n", pund);

    }
}
