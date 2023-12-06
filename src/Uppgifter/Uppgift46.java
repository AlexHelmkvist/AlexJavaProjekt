package Uppgifter;

public class Uppgift46 {
    public static void main(String[] args) {
        //46.En man erbjuds ett ovanligt riskfyllt arbete. Lönesättningen är också ovanlig. För första
        //dagen erbjuds han 1 öre, för andra dagen 2 öre, för tredje dagen 4 öre osv. Lönen
        //fördubblas alltså varje dag. Skapa ett program som beräknar hur många dagar mannen måste
        //arbeta för att tjäna en miljon kronor.

        int totallön = 0;
        int dagslön = 1;
        int dagar = 0;



        while (totallön < 100000000) {

            totallön = totallön + dagslön;
            dagslön = dagslön * 2;
            dagar = dagar + 1;
            int totaldagar = dagar;

            System.out.println("Antal dagar " + totaldagar);


        }
    }
}
