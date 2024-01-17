package Uppgifter;

public class UppgiftArray70 {
    public static void main(String[] args) {
        //70.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.

        int[]InlästTal = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

        for (int j : InlästTal) {

            if (j % 2 == 0) {
                System.out.println("Jämna tal är : " + j);
            }

        }

    }
}
