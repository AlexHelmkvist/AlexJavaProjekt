package Uppgifter;

import java.util.Scanner;

public class Uppgift54 {
    public static void main(String[] args) {
        //54.Skapa ett program som läser in 100 heltal. Skriv ut hur många tal som är positiva och hur
        //många som är negativa av de inlästa talen.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett antal tal upp till 100 :");

        int positivTal = 0;
        int negativTal = 0;

        for (int i = 0;i<=100;i++){
            int n = sc.nextInt();

            if (n>0){
                positivTal++;
            }
            if (n<0){
                negativTal++;
            }


        }
        System.out.println("Antal positiva tal är:" + positivTal + "\n"+"Antal negativa tal är:"+negativTal);
    }
}
