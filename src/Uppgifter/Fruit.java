package Uppgifter;

import javax.naming.Name;

public class Fruit {

    private String fruit;

    public Fruit(String fruitName) {

        fruit = fruitName;

    }

    public void printName() {
        System.out.println("Det är frukt:" + fruit);

    }
    public String getName() {

        return fruit;
    }

}


