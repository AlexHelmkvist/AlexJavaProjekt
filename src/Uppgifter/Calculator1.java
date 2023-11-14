package Uppgifter;

public class Calculator1 {

    // Vi skapar två st doubles som vi kommer använda
    // i vår calculator, de har just nu inga värden.
    private double numberOne;
    private double numberTwo;
    private double sum;

    // numberOne och numberTwo får värden i konstruktorn!
    public Calculator1(double myNumberOne, double myNumberTwo){
        numberOne = myNumberOne;
        numberTwo = myNumberTwo;
    }
    public void addition(){
        //Vi adderar numberOne och numberTwo och sparar
        //resultat i sum!
        sum = numberOne + numberTwo;
        printSum();

    }
    public void subtraction() {
        //Vi subtraherar numren och sparar dem!
        sum = numberOne - numberTwo;
        printSum();
    }
    public void divide() {
        //Vi delar och sparar i sum!
        sum = numberOne / numberTwo;
        printSum();
    }
    public void multiply() {
        //Vi multiplicerar och sparar i sum!
        sum = numberOne * numberTwo;
        printSum();
    }
    // Vi kan använda en "getter" för att hämta informationen till vår mainklass
    public double getSum(){
        return sum;
    }
    public void printSum(){
        //Vi kan kalla på en metod ifrån en annan metod, för att slippa
        //skriva om ett kodstycke många gånger i onödan.
        System.out.println(numberOne +" and " + numberTwo
                + " yields " + sum);
    }
}
