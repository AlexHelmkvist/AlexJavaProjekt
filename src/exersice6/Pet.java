package exersice6;

public class Pet {

    //Konstruktor
    //Konstruktor skrivs på formen
    //public className(type parameter)T.ex.public Pet(String petName);
    private String name;  //attribut

    public Pet(String petName) { //konstruktor

        name = petName;
    }

    //Skapa en ny metod i klassen Pet som skriver ut attributet name
    public void printName() {
        System.out.println("The name of the is:" +name);

    }

   //Skapa en ny metod i klassen Pet som skriver ut returnerar attributet name
    public String getName() {

        return name;
    }
}

