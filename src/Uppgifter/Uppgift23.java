package Uppgifter;
import java.util.Scanner;

public class Uppgift23 {
    public static void main(String[] args) {


        // 23.Skapa ett program som testar om ett inläst tal är jämnt delbart med 3,
        // men inte med 30. Om så, så skall talet divideras med 3!

        Scanner scan = new Scanner(System.in);
        System.out.print("Var snäll och skriv ett nummer:");
        double number = Double.parseDouble(scan.nextLine());
        if (number % 3 == 0 && number % 30 != 0){
            System.out.println("Vi dividerar talet med 3 och får: " + (number/3));
        } else {
            System.out.println("Inte jämnt delbart!");
        }
    }
}
