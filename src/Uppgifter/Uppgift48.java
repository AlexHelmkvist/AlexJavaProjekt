package Uppgifter;

import java.util.Scanner;

public class Uppgift48 {
    public static void main(String[] args) {
        //48.Skapa ett program som skriver ut n! (fakulteten). n ska läsas in.
        //Ex: 3! = 1 * 2 * 3 5! = 1 * 2 * 3 * 4 * 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett heltal:");
        int n = sc.nextInt();
        int fakultet = 1;
        for (int i = 1;i<=n;i++){

            fakultet = fakultet * i;

            System.out.println(n + "!=" + fakultet);
        }
    }
}
