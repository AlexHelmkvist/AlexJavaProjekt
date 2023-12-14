package Uppgifter;

import java.util.Scanner;

public class Uppgift65 {
    public static void main(String[] args) {
        //65.Indata består av 100 positiva tal. Skapa ett program för beräkning av skillnaden mellan det
        //största talet och det näst största talet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange 100 positiva tal.");

        int big = Integer.MIN_VALUE;

        for (int i = 0; i < 100; i++) {
            int num = sc.nextInt();

            if (num > big) {
                big = num;

            }
        }
        int nextBig = big +1;
        int skillnaden = nextBig - big;

        System.out.println("Störst tal: " + big + "\n" + "Nästa störst tal: " + nextBig + "\n" + "Skillnaden mellan största tal och näst tal: " + skillnaden);

    }

}
