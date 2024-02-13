package Uppgifter;

import java.util.Scanner;

public class RandomSpel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gissa vilket tal mellan 1-100 som har valt dator.");

        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;

        System.out.println(rand);
        int n = Integer.parseInt(sc.nextLine());

        while (n != rand){

            if (n > rand) {
                System.out.println("Gissningen är för hög ):.");

            }
            if (n < rand) {
                System.out.println("Gissningen är för låg ):.");

            }
            n = Integer.parseInt(sc.nextLine());

        }
        System.out.println("Du vann (:!");

    }
}
