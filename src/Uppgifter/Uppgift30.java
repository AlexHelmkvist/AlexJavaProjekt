package Uppgifter;

import java.util.Scanner;

public class Uppgift30 {
    public static void main(String[] args) {
        //30.Läs in ett tal. Skriv ut om talet är mindre än 10, mindre än 100 eller större än 100.
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in heltal:");
        int tal = sc.nextInt();

        if (tal <= 10){
            System.out.println("Tal mindre än 10.");
        }
        else if (tal <= 100){
            System.out.println("Tal mindre än 100.");
        }
        else{
            System.out.println("Tal större än 100.");
        }


    }
}
