package Uppgifter;

public class Uppgift50 {
    public static void main(String[] args) {
        //50.Skapa ett program som skriver ut multiplikationstabellen för ettans till nians tabell.


        for (int i = 1;i<=10;i++){
            for (int j = 1;j<=10;j++){

                System.out.print(String.format(" %2d * %2d = %3d ",j,i,i*j));
            }
            System.out.println();


        }

    }
}
