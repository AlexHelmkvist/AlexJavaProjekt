package Uppgifter;

import java.util.Scanner;

public class Uppgift26 {

    public static void main(String[] args) {
        //26.Skapa ett program som läser in två tal och skriver ut det största talet följt av orden “är störst
        //“. Om talen är lika ska “Talen är lika“ skrivas ut.

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in första heltal:");
        int tal1 = sc.nextInt();
        System.out.println("Skriv in andra heltal:");
        int tal2 = sc.nextInt();

        if (tal1 > tal2){
            System.out.println("Första talet störst.");
        }
        if (tal2 > tal1){
            System.out.println("Andra talet störst.");
        }
        if(tal1 == tal2) {
            System.out.println("Talen är lika.");
        }
    }
}
