package Uppgifter;

public class UppgiftArray76 {
    public static void main(String[] args) {
        //76.En array med 10 inlästa tal finns. Lägg över dessa tal i en annan array så att talen
        //kommer i omvänd ordning.

        int[] original = {1, 2, 3, 4, 5,6,7,8,9,10};
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];

            System.out.println(reversed[i]);
        }
    }
}
