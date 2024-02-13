package Uppgifter;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange första tal:");
        int tal1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ange andra tal:");
        int tal2 = Integer.parseInt(sc.nextLine());

        System.out.println("Vilket operation vill du göra,välj av följande alternativ: (1) addition,(2) subtraktion,(3) multiplikation,(4) division ");



        switch (Integer.parseInt(sc.nextLine())){
            case 1:
                int addition = tal1+tal2;
                System.out.println("Resultat av operation är: " + addition);
                break;
            case 2:
                int subtraktion = tal1-tal2;
                System.out.println("Resultat av operation är: " + subtraktion);
                break;
            case 3:
                int multiplikation = tal1*tal2;
                System.out.println("Resultat av operation är: " + multiplikation);
                break;
            case 4:
                int division = tal1/tal2;
                System.out.println("Resultat av operation är: " + division);
                break;
            default:
                System.out.println("Felaktig värde!");
        }


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ange en siffra mellan 1-7");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Måndag");
                break;
            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Felaktig värde!");
                break;
        }


       /* for (int x = 1; x <= 13; x++) {
            switch (x) {
                case 1:
                case 2:
                case 12:
                    System.out.println(x + ": vinter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(x + ":vår");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(x + ":sommar");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(x + ":höst");
                    break;
                default:
                    System.out.println(x + ":det finns inga sådana månaden");


            }

        }*/
        /*for (int number = -5;number <= 5;number++){  //Tern operator

            int absval = number < 0 ? - number : number; //<--- Tern operator if-then-else
            System.out.println(" Värde = " + absval);
        }
        for (int x = 100;x > 0;x -=5){ //<---Minskar med 5 varje gång
            System.out.println("x = " + x);
        }*/


    }
}
