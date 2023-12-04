package Uppgifter;

public class Uppgift40 {
    public static void main(String[] args) {
        //40.Skapa ett program som beräknar och skriver ut svaret för funktionen :
        // f (x)= 3x
        //3 -5x
        //2 + 2x - 20
        //Algoritmen ska skriva ut alla värden när x är ett heltal mellan -10 och 10. Dvs x antar
        //värdet -10 och ökar med till ett värdet blir 10.


        for (int x = -10; x <= 10;x++) {
            int fx = 3 * x;
            int f = 3-5*x;
            int c = 2 + 2*x - 20;

            System.out.println("x="+x+"; "+"f(x)="+fx+"; "+"f="+f+"; "+"c="+c);

        }

    }
}


