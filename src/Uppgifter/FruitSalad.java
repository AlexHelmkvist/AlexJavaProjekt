package Uppgifter;

public class FruitSalad {

    public static void main(String[] args) {

        Fruit fruit = new Fruit("Apple");
        Fruit fruit1 = new Fruit("Apelsin");
        Fruit fruit2 = new Fruit("Peron");

        fruit.printName();
        fruit1.printName();
        fruit2.printName();


        System.out.println("Gör en frukt salad med dem fruktar.");
    }
}
