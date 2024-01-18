package Uppgifter;

import java.util.Scanner;

public class UppgiftArray79 {
    public static void main(String[] args) {
        //79.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Det är inte
        //vanligt att man låter nämnaren vara negativ. Om så är fallet ska bråket ändras så att
        //nämnaren blir positiv.

        Scanner sc = new Scanner(System.in);//Skapar enn scanner för att läsa in information.
        int[] arr = new int[2];           //Skapar array med två platser.

        System.out.println("Ange täljare: ");//Ber användare att ange täljare.
        arr[0] = sc.nextInt();              //Läser in information.

        System.out.println("Ange nämnare:");//Ber användare att ange nämnare.
        arr[1] = sc.nextInt();              //Läser in information.

        if (arr[1] <= 0) {                  //Om nämnare mindre eller lika med 0.
            arr[1] = arr[1] * -1;           //Då nämnaren multipliceras med -1 för att få positiv värde.
            System.out.println("Bråket är: " + arr[0] + "/" + arr[1]);

        }
    }
}
