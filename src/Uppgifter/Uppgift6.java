package Uppgifter;


import java.util.Scanner;

public class Uppgift6 {

    public static void main(String[] args) {
    //Skapa ett program som beräknar funktionen ax3 + 7 och skriver ut resultatet. Variablerna
        //a och x ska läsas in.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skrin in värde för variabeln 'a:'");
        int a = scanner.nextInt();
        System.out.println("Skriv in värde för variabeln 'x:'");
        int x = scanner.nextInt();
        int resultat = a*a*a*x+7;
        System.out.println(resultat);


    }

}
