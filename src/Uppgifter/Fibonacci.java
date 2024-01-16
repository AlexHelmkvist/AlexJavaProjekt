package Uppgifter;

public class Fibonacci {

    public static void main(String[] args) {


        System.out.println("Fibonicci nummer 1-100:");

        int num1 = 1;

        System.out.print(num1 + " ");

        int num2 = 1;

        while (num1 <= 100) {

            System.out.print(num1 + " ");
            int num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }

        System.out.println();



    }

}
