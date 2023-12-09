package Uppgifter;


import java.util.Scanner;

public class Uppgift58 {
    public static void main(String[] args) {
        //58.Skapa ett program som läser in 10 tal, bestämmer och skriver ut det största av talen.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange 10 heltal mellan 1 och 100.");
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num > max) {
                max = num;

            }

        }
        System.out.println("Max tal:" + max);
    }
}


