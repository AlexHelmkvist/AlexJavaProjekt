package Uppgifter;

import java.util.Scanner;

public class Uppgift11 {

    public static void main(String[] args) {
        //11.Skapa ett program där två tal läses in och det första talet skrivs ut om det är störst.
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in ett tal:");
        int tal1 = sc.nextInt();
        System.out.println("Skriv in andra tal:");
        int tal2 = sc.nextInt();

        if (tal1>tal2){
            System.out.println("Tal1 är störst!");
        }
        else if (tal1<tal2){
            System.out.println("Tal2 är störst!");

        }
    }
}
