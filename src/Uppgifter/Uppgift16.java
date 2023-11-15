package Uppgifter;

import java.util.Scanner;

public class Uppgift16 {
    public static void main(String[] args) {
        //16.En firma erbjuder sina kunder 10 procents rabatt om man vid ett inköpstillfälle handlar för
        //minst 1000 kr. Antag för enkelhetens skull att man bara handlar varor av ett visst slag. Skapa ett
        //program som beräknar vad en kund ska betala. Indata till algoritmen ska vara antalet
        //köpta enheter och priset per enhet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange antalet köpta enheter:");
        int antal = sc.nextInt();
        System.out.println("Skriv pris per enhet:");
        double pris = sc.nextDouble();
        double kostnad = antal * pris;

        if (kostnad>=1000){
            double rabatt = kostnad * 0.1;
            kostnad = kostnad - rabatt;
            System.out.println("Du ska betala efter rabatt:" + kostnad);

        }
        else{

            System.out.println("Du har inte fåt rabatt.");
        }

    }
}
