package Uppgifter;

import java.util.Scanner;

public class Uppgift8 {

    public static void main(String[] args) {

        //8. Skapa ett program som beräknar och skriver ut arean och omkretsen av en rektangel.
        //Rektangelns sidor ska läsas in.
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in höjden på rektangel:");
        double h = sc.nextDouble();
        System.out.println("Skriv in basen på rektangel:");
        double b = sc.nextDouble();
        double area = h*b;
        double omkretsen = h*h+b*b;

        System.out.println("Area är:"+area +"\n"+"Omkretsen är:" + omkretsen);



    }
}
