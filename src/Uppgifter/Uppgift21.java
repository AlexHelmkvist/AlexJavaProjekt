package Uppgifter;

import java.util.Scanner;

public class Uppgift21 {
    public static void main(String[] args) {
        //21.Skapa ett program som testar om ett tal är mindre än -10 eller större än +10. I så fall ska ett
        //lämpligt meddelande ges.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange heltal som är mindre än -10 eller större än 10:");
        int tal = sc.nextInt();
        if (tal <-10 || tal > 10){
            System.out.println("Du skrev:" + tal);
        }
        else {
            System.out.println("Du skrev tal mellan -10 till 10,försök igen.");
        }
    }
}
