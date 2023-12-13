package Uppgifter;


import java.util.Scanner;

public class Uppgift62 {
    public static void main(String[] args) {
        //62.Skapa ett program som läser in 10 heltal. Kontrollera att talen ligger i området 5000 till
        //10000. Om alla talen är inom intervallet ska “RÄTT“ skrivas ut.
        //OBS! 10 tal ska läsas in, även om något tal är utanför det tillåtna intervallet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange 10 heltal mellan 5000 och 10000:");

        for (int i = 0; i < 10; i++) {
            int tal = sc.nextInt();
            if (tal > 5000 && tal < 10000) {
                System.out.println("RÄTT");
            } else if (tal < 5000 || tal > 10000) {

                System.out.println("FEL");
            }


        }


    }
}
