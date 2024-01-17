package Uppgifter;

public class UppgiftArray71 {
    public static void main(String[] args) {
        //71.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är större än
        //det första talet.

        int[] inlästTal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int count = 0;
        int first = inlästTal[0];

        for (int i = 1; i < inlästTal.length; i++) {

            count++;

        }
        System.out.println("Första tal är:" + first + "\n" + "Antal tal som är större än det första tal är:" + count);
    }
}
