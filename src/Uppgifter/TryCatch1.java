package Uppgifter;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        //   Följande array finns i ditt program: String[] names = {"Ada", "Beda", "Cålle"};
        //1. Läs in ett tal som beskriver vilket namn man skall skriva ut i ordningen. Fånga eventuella exception
        //2. Uppdatera ditt program så att det fångar exceptions vid olika tillfällen (inläsning av tal respektive utskrift av namn)

        System.out.println("Ange ett tal mellan 0-2");
        Scanner sc = new Scanner(System.in);
        try {
            String[] names = {"Ada", "Beda", "Cålle"};

            int num = Integer.parseInt(sc.nextLine());

            System.out.println("Namnet på plats " + num + " är " + names[num]);

        } catch (NumberFormatException e) {
            System.out.println("Ange ett korrekt tal mellan 0-2 och skriv inte decimal tal eller text.");//Decimal tal, text och negativ/största värde


        }catch (Exception e){
            System.out.println("Ange ett korrekt tal mellan 0-2.");//Vid oväntad fel
        }

    }
}
