package Uppgifter;

import java.util.Scanner;

public class Uppgift10 {
    public static void main(String[] args) {
        //10.Sambandet mellan Fahrenheit och Celsius grader ges av formeln F=9C / 5 + 32.
        //Skapa ett program där en temperatur i Fahrenheit läses in och motsvarande temperatur
        //i Celsius skrivs ut.
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in en temperatur i Fahrenheit:");

        double f = sc.nextDouble();
        double c = (f-32)*5/9;

        System.out.println("Temperatur i Celsius är:" + c + " grader");

    }
}
