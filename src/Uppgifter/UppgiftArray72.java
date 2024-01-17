package Uppgifter;

public class UppgiftArray72 {
    public static void main(String[] args) {
        //72.En array med 50 inlästa tal finns. Bestäm och skriv ut index för det sista negativa talet i
        //array. (Tips: Börja bakifrån i array).

        int[] inlästTal = new int[]{1, 2, 3, -4, -5, 6, -7, -8, 9, -10, -11, -12, -13, -14, -15, -16, -17, 1 - 8, -19, -20, -21, -22, -23, -24,
                -25, -26, -27, -28, -29, -30, -31, -32, -33, 34, -35, 36, -37, -38, -39, -40, -41, 42, -43, -44, -45, 46, -47, -48, -49, -50};
        int index = -1;

        for (int i = inlästTal.length - 1; i >= 0; i--) {
            if (inlästTal[i] < 0) {
                index = i;
            }
        }
        System.out.println("Index för det sista negativa talet är:" + index);
    }

}
