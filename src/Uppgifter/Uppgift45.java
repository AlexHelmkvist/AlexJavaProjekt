package Uppgifter;

import java.util.Scanner;

public class Uppgift45 {
    public static void main(String[] args) {
        //45.Skapa ett program där det undersöks hur många termer som behövs för att summan ska
        //bli större än 100 000. Termen ska läsas in.
        //Ex: Om indata är 7 ska beräkningen vara 7 + 7 + 7 + …7 = 100 000.
        //Utdata = 14286
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett term :");
        int term = sc.nextInt();
        int sum = 0;
        int antal = 0;

        while (sum <= 100000){

            sum += term;
            antal ++;

            System.out.println("Summa av " + antal + " termer är " + sum);
        }







    }
}
