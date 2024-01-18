package Uppgifter;

import java.util.Scanner;

public class SimplifyFraction {
    public static void main(String[] args) {
        //80.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Algoritmen
        //ska se till att bråket förkortas så långt som möjligt.
        //Ex: Om siffrorna i bråket är 6 och 12 ska det lagras i array som 1 och 2.
        //Tips: Ta reda på SGD (största gemensamma divisor). I exemplet är SGD 6.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange täljaren: ");
        int numerator = scanner.nextInt();

        System.out.print("Ange nämnaren: ");
        int denominator = scanner.nextInt();

        int[] fractionArray = simplifyFraction(numerator, denominator);

        System.out.println("Förkortad form: " + fractionArray[0] + "/" + fractionArray[1]);
    }

    private static int[] simplifyFraction(int numerator, int denominator) {
        int commonDivisor = gcd(numerator, denominator);
        int simplifiedNumerator = numerator / commonDivisor;
        int simplifiedDenominator = denominator / commonDivisor;
        return new int[]{simplifiedNumerator, simplifiedDenominator};
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}



