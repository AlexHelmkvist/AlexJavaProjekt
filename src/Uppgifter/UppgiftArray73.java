package Uppgifter;

public class UppgiftArray73 {
    public static void main(String[] args) {
        //73.En array med 50 inlästa tal finns. Beräkna och skriv ut summan och medelvärdet av de 50
        //talen.

        int[] inlästTal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 0};
        int sum = 0;
        int antal = 50;
        int medelvärde;
        for (int num : inlästTal) {
            sum = sum + num;
        }
        medelvärde = sum / antal;
        System.out.println("Summa av de 50 talen är: " + sum + "\n" + "Medelvärde av de 50 talen är: " + medelvärde);
    }


}
