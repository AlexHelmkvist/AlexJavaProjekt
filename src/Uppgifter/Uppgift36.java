package Uppgifter;

import java.util.Scanner;

public class Uppgift36 {
    public static void main(String[] args) {
        //36.Skapa ett program som räknar ut hur mycket man har på banken under vart och ett av de
        //följande 10 åren om man sätter in 1000 kr. Räntan ska läsas in och är densamma för alla
        //åren.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ränta i procent:");
        double ränta = sc.nextDouble();
        double saldo = 1000;
        for (int år = 2; år <=10;år++){
            saldo = saldo*(0.01+ränta);
            System.out.println("År"+ år + ":" + saldo + " kr.");
        }
    }
}
