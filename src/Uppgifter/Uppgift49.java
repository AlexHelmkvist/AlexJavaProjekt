package Uppgifter;

import java.util.Scanner;

public class Uppgift49 {
    public static void main(String[] args) {
        //49.Skapa ett program som beräknar f (x)= x
        //n
        //x och n ska läsas in.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange värde för x ");
        double x = sc.nextDouble();
        System.out.println("Ange värde för n ");
        double n = sc.nextDouble();
        double resultat = 1;

        for (int i = 0;i < n;i++){

            resultat = resultat * x;

            System.out.println("f="+ resultat);
        }
    }
}
