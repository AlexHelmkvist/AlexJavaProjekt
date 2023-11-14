package Uppgifter;

import java.util.Scanner;

public class scannerclassexampel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Var snäll skriv något: ");
        int input = Integer.parseInt(scan.nextLine());
        System.out.println(input+ input);

    }


}
