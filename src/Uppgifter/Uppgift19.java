package Uppgifter;

import java.util.Scanner;

public class Uppgift19 {
    public static void main(String[] args) {
        //19.En anställd som har timlön får, när arbetstiden överstiger 40 tim en vecka,
        //övertidsbetalning för tiden utöver 40 tim med 1½ tim. Skapa ett program som läser in
        //en anställds timlön och en veckas arbetstid. Den totala veckolönen ska beräknas och
        //skrivas ut.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange timlön:");
        double timlön = sc.nextDouble();
        System.out.println("Ange arbetstid i timmar:");
        double arbetstid = sc.nextDouble();
        double veckolön;

        if (arbetstid<=40){
            veckolön = timlön*arbetstid;

        }
        else {
            veckolön = timlön*40+(timlön*1.5*(arbetstid-40));
        }
        System.out.println("Din veckolön är:" + veckolön);


    }
}
