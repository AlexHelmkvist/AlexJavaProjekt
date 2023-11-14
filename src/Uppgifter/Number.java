package Uppgifter;

public class Number {
    public static void main(String[] args) {
        //Vi kallar på klassen Calculator som ett objekt kallat
        //calc, och skickar in två st doubles.
        Calculator1 calc = new Calculator1(2.0,3.0);

        //9.Uppdatera Calculator så att den har liknande metoder
        //för minus/delat med/gånger

        // Vi kallar på metoden addition i vår calc för att utföra
        // Addition på de två numren.
        //calc.multiply();
        //calc.printSum();
        calc.multiply();
        calc.addition();
        calc.subtraction();
        calc.divide();


    }
}
