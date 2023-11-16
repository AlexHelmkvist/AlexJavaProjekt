package Uppgifter;

import java.util.Scanner;

public class Uppgift18 {

    public static void main(String[] args) {
        //18.Skapa ett program där värden på variablerna X och Y läses in. Tilldela variabel A
        //värdet 2 om X är större än 5 + Y, annars tilldela A värdet 5. Skriv ut variabeln A.
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv in värde för X :");
        double x = sc.nextDouble();
        System.out.println("Skriv in värde för Y :");
        double y = sc.nextDouble();

        if (x>5+y){
            double a = 2;
            System.out.println("Värde A är:"+a);
        }
        else {
            double a = 5;
            System.out.println("Värde A är:"+a);
        }



    }
}
