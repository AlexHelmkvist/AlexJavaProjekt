package Uppgifter;

import java.util.Scanner;

public class Uppgift28 {
    public static void main(String[] args) {
        //28.Skapa ett program som läser in en temperatur. Om temperaturen är mellan 18 och
        //25 grader ska meddelandet “Lagom temp“ skrivas ut. Om det är varmare än 25grader ska
        //“För varmt“ skrivas ut och om det är kallare än 18grader ska “För kallt“ skrivas ut.
        Scanner sc = new Scanner(System.in);
        System.out.println("Vilka temperatur är ute?");
        int input = sc.nextInt();
        if (input >= 18 && input <= 25){
            System.out.println("Lagom temp.");
        }
        if (input >= 25){
            System.out.println("För varmt!");
        }
        if(input <= 18) {
            System.out.println("För kalt!");
        }
    }
}
