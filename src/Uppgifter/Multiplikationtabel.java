package Uppgifter;

public class Multiplikationtabel {

    public static void main(String[] args) {

        //50.Skapa ett program som skriver ut multiplikationstabellen för ettans till nians tabell.
        // Vi vill alltså skriva ut 1 * 1,2,3,4,5 etc och sedan 2 * 1,2,3,4,5, etc.
        // Problemet är att hålla siffrorna separata!

        // Vi kan lösa problemet med endast en loop!
        // Vi använder g för att kontrollera ett av numren, vi skapar g utanför vår loop och sätter den till 1
        int g = 1;
        for (int i = 1; i < 11; i++) {
            // Vi kontrollerar att om i är 10 och g INTE är 10 så sätter vi i till 1 igen.
            if (i == 10 && g != 10){
                i = 1;
                g++;
            }
            System.out.println("Multiplying: " + g + " and " + i + " = " + (g*i));
        }

        // Vi har en loop som kontrollerar det ena numret med hjälp av i
        for (int i = 1; i <= 10; i++){
            // Vi har en andra loop unti den första loopen som kontrollerar det andra numret.
            for (int j = 1; j <= 10; j++){
                System.out.println("Multiplying: " + i + " and " + j + " = " + (j*i));
            }
        }
    }
}

