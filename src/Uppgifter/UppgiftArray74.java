package Uppgifter;

public class UppgiftArray74 {
    public static void main(String[] args) {
        //74.En array med 50 inlästa tal finns. Leta upp det största och det minsta talet i array och
        //skriv ut dem.

        int[] inlästTal = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : inlästTal) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Största tal:" + max + "\n" + "Minsta tal:" + min);


    }

}

