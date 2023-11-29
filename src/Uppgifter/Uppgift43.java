package Uppgifter;

public class Uppgift43 {
    public static void main(String[] args) {
        //43.Beräkna och skriv ut summan av de jämna heltalen från 2 till 30.
        int sum = 0;
        for (int i = 2;i <= 30;i+=2){

            sum = sum + i;


            System.out.println(sum);
        }

    }
}
