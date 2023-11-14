package Uppgifter;

import java.util.Scanner;

public class uppgift37 {

    public static void main(String[] args) {

        //Vi skapar en objekt av klassen scanner
        Scanner scan = new Scanner(System.in);

        //Vi ange hur många tal vi viil skriva ut,samt ändrar vår input
        //till int (scan.
        int iteration = Integer.parseInt(scan.nextLine());
        System.out.println("Hur många tal vill ange?:");
        for (int i = 0; i < iteration; i++){
            System.out.println("Vilket nummet printas?");
            String numberToPrint = scan.nextLine();
            System.out.println(i + ",");
            System.out.println("Number " + (i + 1) + " = " + numberToPrint);
        }
    }
}
