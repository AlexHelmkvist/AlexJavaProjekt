package Uppgifter;

import java.util.Scanner;

public class Uppgift12 {

    public static void main(String[] args) {
        //12.Läs in två tal. Testa om det första talet är mer än dubbelt så stort som det andra talet. I så
        //fall ska meddelandet “För stort“ skrivas ut.

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in första tal:");
        int tal1 = sc.nextInt();
        System.out.println("Skriv in andra tal:");
        int tal2 = sc.nextInt();

        if (tal1>2*tal2){
            System.out.println("För stort!");
        }

    }
}
