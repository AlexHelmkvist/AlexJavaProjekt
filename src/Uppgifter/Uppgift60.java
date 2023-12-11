package Uppgifter;

import java.util.Scanner;

public class Uppgift60 {
    public static void main(String[] args) {
        //60.Skapa ett program där indata består av en följd av positiva heltal. Avbryt inläsningen
        //med 0. Beräkna antalet gånger två intilliggande tal är lika.
        // Skapa en Scanner för att läsa in tal från tangentbordet
        Scanner sc = new Scanner(System.in);

        // Deklarera variabler för att lagra det inlästa talet, det föregående talet och räknaren
        int tal, föregående, räknare;

        // Skriv ut en instruktion till användaren
        System.out.println("Skriv in en följd av positiva heltal. Skriv 0 för att avsluta.");

        // Läs in det första talet
        tal = sc.nextInt();

        // Kontrollera att det är ett positivt tal
        if (tal < 0) {
            System.out.println("Du måste skriva in ett positivt tal.");
            return;
        }

        // Sätt det föregående talet till det inlästa talet
        föregående = tal;

        // Sätt räknaren till 0
        räknare = 0;

        // Upprepa processen tills 0 matas in
        while (tal != 0) {
            // Läs in nästa tal
            tal = sc.nextInt();

            // Kontrollera att det är ett positivt tal eller 0
            if (tal < 0) {
                System.out.println("Du måste skriva in ett positivt tal eller 0.");
                return;
            }

            // Jämför det inlästa talet med det föregående talet
            if (tal == föregående) {
                // Öka räknaren med 1
                räknare++;
            }

            // Sätt det föregående talet till det inlästa talet
            föregående = tal;
        }

        // Skriv ut resultatet
        System.out.println("Antalet gånger två intilliggande tal är lika är: " + räknare);

    }
}
