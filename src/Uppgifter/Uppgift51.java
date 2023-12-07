package Uppgifter;

import java.util.Scanner;

public class Uppgift51 {
    public static void main(String[] args) {
        //51.Skapa ett program som läser in 100 tal och räknar och skriver ut hur många gånger talet 7 har
        //lästs in.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange ett tal mellan 10 till 100:");
        int n = sc.nextInt();
        int antalTal7 = n / 7;

        System.out.println("Antal talet sju är:" + antalTal7);


    }



}
