package Uppgifter;

import java.util.Scanner;

public class Uppgift52 {
    public static void main(String[] args) {
        //52.Skapa ett program som läser in 100 tal och beräknar och skriver ut summan av de positiva
        //talen.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett antal tal upp till 100 :");

        int totalTal = 0;

        for (int i = 0;i<=100;i++){
            int n = sc.nextInt();

            if (n>0){
                totalTal++;
            }


        }
        System.out.println("Antal positiva tal är:" + totalTal);
    }
}
