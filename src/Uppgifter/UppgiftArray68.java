package Uppgifter;


public class UppgiftArray68 {
    public static void main(String[] args) {
        //68.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i array.

        int[]InlästTal = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

        for (int i = 1;i < InlästTal.length;i++){

            InlästTal[i] = i*2;
            System.out.println(InlästTal[i]);
        }


    }
}
