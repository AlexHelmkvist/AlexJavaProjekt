package Uppgifter;

import java.util.Scanner;

public class Uppgift24 {
    public static void main(String[] args) {
        //24.Skapa ett program som läser in kroppstemperaturen och skriver ut ett lämpligt meddelande
        //om temperaturen är mindre än 35 grader eller större än 42 grader.

        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in din kropps temperatur:");
        double input = sc.nextDouble();
        if (input < 35 || input > 42){
            System.out.println("Din kropps temperatur är kritisk! ");
        }
        else {
            System.out.println("Din kropps temperatur är:" + input);
        }

    }
}
