package Exersice8;

public class Exercise {

    public static void main(String[] args) {

        //Skapa en metod som heter isLetter(char sign) som kontrollerar om ett tecken (sign) är en engelsk bokstav (a-z)
        //
        //Denna metod returnerar true om tecknet är en engelsk bokstav annars false

        Spellchecker spell = new Spellchecker();

        System.out.println("Values \"1\" bokstav? Svar: " + Character.isLetter('1'));

    }

}
