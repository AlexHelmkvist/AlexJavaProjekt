package Uppgifter;

import java.util.Scanner;

public class Uppgift25 {
    public static void main(String[] args) {
        //25.Skapa ett program där ett tal läses in och det skrivs ut om talet är positivt eller
        //negativt.  '

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange negativ eller positiv heltal:");
        int tal = Integer.parseInt(sc.nextLine());
        if (tal <= 0) {
            System.out.println("Du skrev en negativ tal.");
        }
        if(tal >= 0){
            System.out.println("Du skrev en positiv tal.");

        }

    }
}
