package Uppgifter;

import java.util.Scanner;

public class ValAlternativ {


    public static void main(String[] args) {

        //.Skapa ett program som läser in ett tal och skriver ut om det är jämnt. (Använd
        //modulooperatorn)

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Ange ett heltal:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Det är ett jämnt tal.");
        } else {
            System.out.println(num + " Det är ett udda tal.");
        }

        */
        //31.Skapa ett program som läser in ett antal tal och skriver ut dem. Talföljdens slut
        //markeras med 0.
       /* Scanner scan = new Scanner(System.in);
        while (true){
            int input = Integer.parseInt(scan.nextLine());
            System.out.println(input);
            break;
        }

        */
        //32.Skapa ett program där talen 2, 4, 6, …, 100 skrivs ut.

      /*
        }

       */

        //33.Skriv ut talen 100 till 0, dvs 100, 99, 98, …, 0.

        /*for (int i = 100; i >= 0; i--) {
            System.out.print(i + ",");
        }

         */
        //34.Skapa ett program som läser in och skriver ut ett tecken i taget tills en * skrivs in.
        /*int number1 = 5;
        int number2 = 2;

        if (number1== 5 || number2 == 5){
            System.out.println("Detta nummer är 5!");
        } else if (number1 == 5 || number2 == 2) {
            System.out.println("En av dem nummer är 5!");
        }

         */
        //3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        //blir omvandlat till minuter resp sekunder.




        /*int timmar = Integer.parseInt(scan.nextLine());
        int minuter = timmar * 60;
        int sekunder = minuter * 60;

        System.out.println(timmar + " timmar är "  +  minuter + " minuter " + " eller " +  sekunder + " sekunder ");

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange belop i svenska kronor");
        double krona = scan.nextDouble();
        double dollar = krona / 6;
        double pund = krona / 10;

        System.out.println("Motsvarande belop i dollar : " + dollar);
        System.out.println("Motsvarande belop i pund : " + pund);


    }

}
