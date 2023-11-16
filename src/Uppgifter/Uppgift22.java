package Uppgifter;

import java.util.Scanner;

public class Uppgift22 {

    public static void main(String[] args) {
        //22.Skapa ett program som testar om ett tal är 0-9 men inte 5. Skriv ut lämplig text.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange heltal mellan 0-9 men inte 5:");
        int tal = sc.nextInt();
        if (tal >= 0 && tal <= 9 && tal !=5) {
            System.out.println("Du skrev tal mellan 0-9 men inte 5:");
        }
        if(tal == 5){
            System.out.println("Du skrev tal 5");

        }
        else if(tal > 9 || tal < 0) {
            System.out.println("Du skrev tal mindre än 0 eller större än 9:");
        }


    }
}
