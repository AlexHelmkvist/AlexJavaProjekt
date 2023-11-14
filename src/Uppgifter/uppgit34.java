package Uppgifter;

import java.util.Scanner;

public class uppgit34 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Skriv in text ( skriv in ( * ) för att avsluta)");

        while (!(input = scan.nextLine()).equals("*")){
            System.out.println(" Du skrev:");

        }

        System.out.println("Programmet avslutas!");






    }
}
