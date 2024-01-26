package Uppgifter;

import java.util.Scanner;

public class UppgiftArray78 {
    public static void main(String[] args) {
        //78.Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array med
        //två platser. Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande skrivas ut
        //om så är fallet.

        Scanner sc = new Scanner(System.in);//Skapar enn scanner för att läsa in information.
        int[] arr = new int[2];           //Skapar array med två platser.

        System.out.println("Ange täljare: ");//Ber användare att ange täljare.
        arr[0] = Integer.parseInt(sc.nextLine());            //Läser in information.

        System.out.println("Ange nämnare:");//Ber användare att ange nämnare.
        arr[1] =  Integer.parseInt(sc.nextLine());         //Läser in information.

        if (arr[1] == 0) {

            System.out.println("Det är otillåtet att ha 0 i nämnaren ");
        } else {
            int svar = arr[0]/arr[1];
            System.out.println("Bråket är: " + arr[0] + "/" + arr[1] + " = " + svar);

        }

    }

}
