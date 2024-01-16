package Uppgifter;

public class UppgiftArray67 {
    public static void main(String[] args) {
        //67.Om den näst sista siffran är jämn i personnumret är det en kvinna, om den är ojämn är det
        //en man. Avgör om personen i föregående uppgift är man eller kvinna.

        String[] persNum = {"19900222-2356"};

        char[] tempArray = persNum[0].toCharArray(); //<-- vi kan göra om en String till ett char Array med hjälp av .toCharArray()

        if (tempArray[tempArray.length - 2] % 2 == 0) { //<-- Det blir lite mer lättläst, vi kontrollerar om vi får någon rest om vi delar numret på positionen
            //som är på indexen som är arrayets längd minus två!
            System.out.println("Det är kvinna.");
        } else {
            System.out.println("Det är man.");
        }




    }
}
