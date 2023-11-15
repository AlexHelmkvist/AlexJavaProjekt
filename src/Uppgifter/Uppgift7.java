package Uppgifter;

import java.util.Scanner;

public class Uppgift7 {

    public static void main(String[] args) {
        //7. Skapa ett program som beräknar vad du ska betala för en tank bensin. Indata är antal
        //liter, pris per liter och eventuell rabatt i procent. Utdata är priset som du ska betala
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in antal liters du vill tanka:");
        double liter = sc.nextDouble();
        System.out.println("Vad är pris per liter? Exempel:19,90.");
        double pris = sc.nextDouble();
        System.out.println("Har du rabat? Skriv en hel tal.");
        double rabat = sc.nextDouble();

        double total = pris*liter;//<--Pris utan rabat.
        double rabatterat = total*(1-rabat/100);//<--Pris med rabat.
        double sparad = total-rabatterat;//Hur mycket har du sparat.

        System.out.println("Du ska betala utan rabat:" + total + " kr.");
        System.out.println("Med rabat:" + rabatterat + " kr.");
        System.out.println("Du sparar:" + sparad + " kr.");
    }
}
