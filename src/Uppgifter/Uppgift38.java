package Uppgifter;

import java.util.Scanner;

public class Uppgift38 {
    public static void main(String[] args) {
        //38.En kommun har gjort följande prognos för befolkningsutvecklingen de närmaste åren: -
        //Vid början av 2016 hade kommunen 26000 invånare.
        //- Antalet födda och avlidna under ett år uppskattas var 0.7 % resp 0.6 % av
        //befolkningen vid årets början.
        //- Antalet inflyttade och antalet utflyttade uppskattas till 300 resp 325 varje år.
        //Skapa ett program som beräknar kommunens uppskattade invånarantal i början av ett visst
        //år. Vilket år det gäller ska läsas in som indata till algoritmen.
        // Skapa en Scanner-objekt för att läsa indata
        Scanner sc = new Scanner(System.in);

        // Fråga användaren vilket år det gäller
        System.out.print("Vilket år vill du beräkna befolkningsprognosen för? ");
        int år = sc.nextInt(); // läs in ett heltal

        // Kontrollera att året är större än eller lika med 2016
        if (år <= 2016 || år >= 2024) {
            System.out.println("Ogiltigt år. Året måste vara större än eller lika med 2016.");
            return; // avsluta programmet
        }

        // Deklarera och initialisera variabler för befolkningsdata
        int befolkning = 26000; // befolkningen vid början av 2016
        double föddProcent = 0.007; // andelen födda per år
        double avlidenProcent = 0.006; // andelen avlidna per år
        int inflyttad = 300; // antalet inflyttade per år
        int utflyttad = 325; // antalet utflyttade per år

        // Beräkna befolkningsprognosen för det angivna året
        for (int i = 2016; i <= år; i++) {
            // Beräkna antalet födda och avlidna under ett år
            int född = (int) Math.round(befolkning * föddProcent);
            int avliden = (int) Math.round(befolkning * avlidenProcent);

            // Uppdatera befolkningen med födda, avlidna, inflyttade och utflyttade
            befolkning = befolkning + född - avliden + inflyttad - utflyttad;
        }

        // Skriv ut befolkningsprognosen
        System.out.println("Befolkningsprognosen för " + år + " är " + befolkning + " invånare.");
    }


}
