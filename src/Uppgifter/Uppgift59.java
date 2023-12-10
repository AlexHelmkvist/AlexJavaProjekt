package Uppgifter;

import java.util.Scanner;

public class Uppgift59 {
    public static void main(String[] args) {
        //59.Skapa ett program som låter användaren bestämma hur många tal han vill läsa in. Det största
        //och minsta värdet av talen ska beräknas och skrivas ut.
        Scanner sc = new Scanner(System.in);
        System.out.print("Hur många tal vill du skriva in?");

        int tal = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1;i<=tal;i++){
            System.out.print("Ange tal" + i + ": ");
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Största tal:" + max + "\n" + "Minsta tal:" + min);


    }
}
