package Uppgifter;

import java.util.Scanner;

public class UppgiftArray77 {
    public static void main(String[] args) {
        //77.Skapa ett program som läser in 10 heltal till en array och sedan skriver ut talen baklänges.
        //Endast en array ska användas.
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Ange 10 heltal:");
        for (int i = 0; i < 10; i++) {

            arr[i] = scan.nextInt();
        }
        System.out.println("Arrayen i omvänd ordning är:");
        for (int i = 9; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
    }
}
