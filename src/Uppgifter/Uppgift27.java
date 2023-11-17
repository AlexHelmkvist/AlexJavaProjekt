package Uppgifter;

import java.util.Scanner;

public class Uppgift27 {
    public static void main(String[] args) {
        //27.Skapa ett program som läser in tre tal och avgör vilket tal som är minst. Resultatet ska
        //skrivas ut.
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in första heltal:");
        int tal1 = sc.nextInt();
        System.out.println("Skriv in andra heltal:");
        int tal2 = sc.nextInt();
        System.out.println("Skriv in tredje heltal:");
        int tal3 = sc.nextInt();

        if (tal1 < tal2 && tal1 < tal3){
            System.out.println("Första talet är minst.");
        }
        if (tal2 < tal1 && tal2 < tal3 ){
            System.out.println("Andra talet minst.");
        }
        if(tal3 < tal2 && tal3 < tal1) {
            System.out.println("Tredje tal är minst");
        }

    }
}
