package Uppgifter;

import java.util.Scanner;

public class Uppgift15 {

    public static void main(String[] args) {
        //15.Skapa ett program som läser in två tal och avgör och skriver ut om det första talet är jämnt
        //delbart med det andra talet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in första heltal:");
        int tal1 = sc.nextInt();
        System.out.println("Skriv in andra heltal:");
        int tal2 = sc.nextInt();

        if (tal1 % tal2 == 0){
            System.out.println("Det är jämnt delbart.");

        }
        else {
            System.out.println("Det är inte jämnt delbart.");
        }
    }
}
