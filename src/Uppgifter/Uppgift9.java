package Uppgifter;

import java.util.Scanner;

public class Uppgift9 {
    public static void main(String[] args) {
        //9. Skapa ett program där en cirkels radie läses in. Cirkelns diameter, omkrets och area
        //skall beräknas och skrivas ut. (pi = 3.14).

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in en cirkel radie:");
        double radie = sc.nextDouble();
        double p = 3.14;
        double diameter = 2*radie;
        double omkrets = 2*p*radie;
        double area = p*radie;

        System.out.println("Diameter är:" + diameter +"\n"+"Omkrets är:" + omkrets +"\n"+"Area är:" + area);
    }
}
