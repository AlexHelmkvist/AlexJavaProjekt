package Uppgifter;

import java.util.Scanner;

public class Uppgift3 {
    public static void main(String[] args) {
        /*3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        blir omvandlat till minuter resp sekunder.

         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange antal timmar: ");

        int timmar = Integer.parseInt(scanner.nextLine());
        int minuter = timmar * 60;
        int sekunder = minuter * 60;


        System.out.println(timmar + " timmar är " + minuter + " minuter eller sekunder " + sekunder);



    }
}
