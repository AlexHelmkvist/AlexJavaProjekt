package Uppgifter;

public class Uppgift40 {
    public static void main(String[] args) {
        //40.Skapa ett program som beräknar och skriver ut svaret för funktionen :
        // f (x)= 3x
        //3 -5x
        //2 + 2x - 20
        //Algoritmen ska skriva ut alla värden när x är ett heltal mellan -10 och 10. Dvs x antar
        //värdet -10 och ökar med till ett värdet blir 10.

        // Skapa en funktion som beräknar f(x) = 3x




        // Skriv ut alla värden för f(x) när x är ett heltal mellan -10 och 10
        for (int x = -10; x <= 10;x++) {
            int f = 3 * x * x * x -5 * x * x + 2 * x -20;


            System.out.println("f=" + f);
        }
    }
}


