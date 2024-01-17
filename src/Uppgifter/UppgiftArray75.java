package Uppgifter;

public class UppgiftArray75 {
    public static void main(String[] args) {
        //75.En array med 50 inlästa tal finns. Beräkna och skriv ut summan av alla positiva tal och
        //summan av alla negativa tal i array.
        int[] inlästTal = new int[]{1, 2, 3, -4, -5, 6, -7, -8, 9, -10, -11, -12, -13, -14, -15, -16, -17, 1 - 8, -19, -20, -21, -22, -23, -24,
                -25, -26, -27, -28, -29, -30, -31, 32, -33, 34, -35, 36, -37, 38, -39, -40, -41, 42, -43, -44, -45, 46, -47, -48, 49, -50};
        int negativTal = 0;
        int positivTal = 0;

        for (int j : inlästTal) {
            if (j < 0) {
                negativTal++;
            }
            if (j > 0) {
                positivTal++;
            }
        }
        System.out.println("Antal negativa tal är:" + negativTal);
        System.out.println("Antal positiv tal är:" + positivTal);

    }
}
