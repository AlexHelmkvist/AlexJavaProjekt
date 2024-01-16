package Uppgifter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UppgiftArray66 {
    public static void main(String[] args) {
        //66.I en array finns ett personnummer. Skapa ett program som kontrollerar att födelsedatum och
        //de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett felmeddelande om så ej är fallet.

        // Skapa en array med personnummer
        String[] personnummer = {"19980101-1234", "199902024321", "2000030-35678", "200104048-765", "20020505-9999"};

        // Skapa en regex som matchar personnummerformatet
        String regex = "\\d{8}-\\d{4}";

        // Skapa ett Pattern-objekt från regex
        Pattern pattern = Pattern.compile(regex);

        // Loopa genom arrayen och kontrollera varje personnummer
        for (String nummer : personnummer) {
            // Skapa ett Matcher-objekt från Pattern och personnummer
            Matcher matcher = pattern.matcher(nummer);

            // Använd matches()-metoden för att se om personnumret matchar regex
            if (matcher.matches()) {
                // Skriv ut att personnumret är giltigt
                System.out.println(nummer + " är ett giltigt personnummer.");
            } else {
                // Skriv ut ett felmeddelande
                System.out.println(nummer + " är inte ett giltigt personnummer.");
            }
        }

    }
}
