package exersice7;

public class StringManager {
    public static void main(String[] args) {

        String myString = "Jag heter Alex!";
        if (myString.equals("Jag heter Alex!")); {

            System.out.println("Ja, det stämmer!");

        }


        if (myString.length()==15) {

            System.out.println("Ja,det är tre ord");
        }
        System.out.println(myString.charAt(myString.length()-1));
    }
}
