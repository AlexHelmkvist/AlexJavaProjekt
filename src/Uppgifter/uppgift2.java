package Uppgifter;

import java.util.Scanner;

public class uppgift2 {
    public static void main(String[] args) {

        /*En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
                Försäljningssumman ska läsas in.

         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange försäljningssumman: ");

        double prestationlön = scanner.nextDouble();

        double grundlön = 8000;
        double tilllägg = 0.09;
        double totalsumma = grundlön + (prestationlön*tilllägg);

        System.out.println("Lönesumman under perioden är: " + totalsumma);



    }
}
