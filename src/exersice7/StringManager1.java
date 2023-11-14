package exersice7;

import java.util.Scanner;

public class StringManager1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Läs in en String (scan.nextLine())
        String text = scan.nextLine();
        //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
        if (text.equals("ägg")) {

            //Om man skriver ordet "ägg" så skrivs meningen "ägg är knasigt" ut

            System.out.println("Ägg är knasigt!");

        } else {

            //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
            }

        }


    }
}
