package Uppgifter;

import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        //3. Skriv ett program som läser in två tal och sedan skriver ut kvoten mellan dem (dvs. Utför division mellan de två talen)
        //4. Fånga felen och skriv ut ett felmeddelande
        //5. Uppdatera så att meddelandet i Exception e även kommer med
        //6. Uppdatera programmet så att det fångar olika fel beroende på vilket felmeddelande man får
        //7. Uppdatera programmet så att inläsning upprepas till dess att man har korrekta värden
        //8. Uppdatera programmet så att man enbart behöver läsa in det värde som inte är korrekt (om enbart ett av dem är inkorrekt)

        boolean inkorrektTal = true;

        while (inkorrektTal) {
            Scanner sc = new Scanner(System.in);
            double[] arr = new double[2];

            try {
                System.out.println("Ange första tal: ");
                arr[0] = sc.nextDouble();
                System.out.println("Ange andra tal: ");
                arr[1] = sc.nextDouble();
                double result = arr[0] / arr[1];
                System.out.println("Resultat division mellan första tal och andra är:" + result);
                inkorrektTal = false;
            } catch (Exception e) {

                System.out.println("Ett fel träffade." + e.getMessage());

            }

        }

    }

}
