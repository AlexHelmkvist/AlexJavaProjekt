package Uppgifter;

import java.util.Scanner;

public class Uppgift13 {

    public static void main(String[] args) {

        //13.Skapa ett program som läser in ett tal och skriver ut om det är jämnt. (Använd
        //modulooperatorn)
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in ett tal:");
        int tal = sc.nextInt();
        if (tal % 2 == 0){
            System.out.println("Det är jämnt.");
        }
        else{
            System.out.println("Det är ojämnt.");
        }
    }
}
