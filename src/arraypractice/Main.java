package arraypractice;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //66.I ett array finns ett personnummer. Skapa ett program som kontrollerar att födelsedatum och
        //de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett felmeddelande om så ej är fallet.

        /*String[] myArray = new String[]{"1", "2", "3"};
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray[2]);

        String[] persNum = new String[]{"19900222-2356", "199002222356", "870510-7527"};

        //System.out.println(persNum[0].charAt(8));
        //System.out.println(persNum[2].charAt(8));
        //System.out.println(persNum[1].charAt(persNum[1].length()-5));

        String possibleDash = String.valueOf(persNum[1].charAt(persNum[1].length() - 5)); //<-- Vi sparar det som finns på indexpositionen i en String
        if (!possibleDash.equals("-")) { //<-- kollar vi om innehållet INTE är en "-"
            System.out.println("No dash!");
        }

        //67.Om den näst sista siffran är jämn i personnumret är det en kvinna, om den är ojämn är det
        //en man. Avgör om personen i föregående uppgift är man eller kvinna.

        //System.out.println(persNum[0].charAt(persNum[0].length()-2)); //<-- blir vi osäkra på vad vi kontrollerar mot så
        //kan vi alltid skriva ut innehållet för att vara säkra!

        char[] tempArray = persNum[0].toCharArray(); //<-- vi kan göra om en String till ett char Array med hjälp av .toCharArray()

        if (tempArray[tempArray.length - 2] % 2 == 0) { //<-- Det blir lite mer lättläst, vi kontrollerar om vi får någon rest om vi delar numret på positionen
            //som är på indexen som är arrayets längd minus två!
            System.out.println("Woman!");
        } else {
            System.out.println("Man!");
        }


        if (persNum[0].charAt(persNum[0].length() - 2) % 2 == 0) { //<-- Vi kan även göra på samma sätt som i föregående uppgift.
            System.out.println("Woman!");
        } else {
            System.out.println("Man!");
        }




        /*int[] manyNumbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        //68.En array med 50 inlästa tal finns. Fördubbla värdet på talen på varje plats i arrayet.
        for (int i = 0; i < manyNumbers.length; i++){
            //manyNumbers[i] = manyNumbers[i] * 2;
            manyNumbers[i] *= 2; //<-- vi tar indexpositionen och gångrar innehållet på positionen med två!
        }
        System.out.println(Arrays.toString(manyNumbers)); //<-- Vi skriver ut hela innehållet i vårt array!

         */


        /*int[] manyNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        for (int i = 0; i < manyNumbers.length; i += 2) {
            manyNumbers[i] += 2;

            System.out.print(Arrays.toString(manyNumbers));

            //69.En array med 50 inlästa tal finns. Addera talet 2 till talen på indexplats 0, 2, 4,… i
            //arrayn.
        }

         */
        int[] manyNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, -17, 18, 19, -20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, -43, 44, 45, 46, 47, 48, 49, 50};

        //70.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är positiva.

       /* int counter = 0; //<-- Vi skapar en int för att hålla reda på hur många positiva nummer vi har!
        for (int i = 0; i < manyNumbers.length; i++){
            if (manyNumbers[i] >= 0){ //<-- Vi kontrollerar om numret på indexpositionen i är större eller lika med 0
                counter++; //<-- Om i är större eller lika med 0 så ökar vi counter med ett.
            }
        }
        System.out.println("Positive numbers:" + counter); //<-- Vi skriver sedan ut resultatet efter att vår loop är avklarad.



        char letterA = 'a'; //<-- när vi sparar en char så använder vi alltså single quotes istället för double.
        char letterB = 'b';
        System.out.println(String.valueOf(letterA) + String.valueOf(letterB)); //<-- tänk på att om vi bara försöker att
        //addera char så kommer vi att addera de värden som char ger i form av ascii koder!

        */




        // 71.En array med 50 inlästa tal finns. Ta reda på och skriv ut hur många tal som är större än
        //det första talet.
        int counter = 0;
        for (int i = 0; i < manyNumbers.length; i++){
            if (manyNumbers[0] < manyNumbers[i]){ //<-- Vi kontrollerar att numret på index 0 är mindre än numret på indexposition "i"
                counter++;
            }
        }
        System.out.println("Number of numbers, bigger than first:" + counter);
    }
}

//package temp;
//
//public class Main {
//    public static void main(String[] args) {
//        //Vi undersöker .split för att dela upp
//        //en String i ett array!
//        String input = "Hej Hopp Knopp Hallå";
//        Logic logic = new Logic();
//
//        logic.arraySplitter(input);
//        logic.arraySplitter("Jag gillar att få pengar");
//
//    }
//}

//
//
//public class Logic {
//
//    public void arraySplitter(String input){
//        String[] tempArray = input.split(" "); //<--- Delar upp vår sträng i delar beroende på
//        //Vart det finns ett mellanslag eller vad vi nu väljer att lägga in i "regex" i .split metoden!
//        //System.out.println(Arrays.toString(tempArray)); //<--- Vi kan skriva ut allt innehåll i ett array
//        //med hjälp av toString metoden.
//        //System.out.println(tempArray[3]); //<--- Vi kan också skriva ut en existerande indexposition
//        //igenom att ange dess nummer. Notera att vi räknar ifrån 0,1,2,3 etc.
//        for (int i = 0; i < tempArray.length;i++){
//            System.out.println(tempArray[i]); //<--- Vi skriver ut det som finns på indexposition "i"
//            //inuti vårt array!
//        }
//    }
//}