package Uppgifter;

import java.util.Scanner;

public class Uppgift64 {
    public static void main(String[] args) {
        //64.Skapa ett program som läser in 10 positiva tal och bestämmer vilket tal som är störst
        //och vilket som är näst störst. Utnyttja två variabler big och nextBig där de största och det näst
        //största av de hittills lästa talen finns.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange 10 positiva tal.");

        int big = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num > big) {
                big = num;

            }
        }
        int nextBig = big +1;

        System.out.println("Störst tal: " + big + "\n" + "Nästa störst tal: " + nextBig);


    }
}
