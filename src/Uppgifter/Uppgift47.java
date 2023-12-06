package Uppgifter;

public class Uppgift47 {
    public static void main(String[] args) {
        //47.Beräkna och skriv ut produkten av de ojämna heltalen från 1 till 15. (D v s 1*3*5*…*15)
        int sum = 1;
        for (int i = 1;i <= 15;i+=2){

            sum = sum * i;
            System.out.println(sum);
        }
    }
}
