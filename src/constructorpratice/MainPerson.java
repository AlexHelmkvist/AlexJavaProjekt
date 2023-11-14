package constructorpratice;

public class MainPerson {
    public static void main(String[] args) {

        // Vi kan skapa en stor mängd personer/objekt
        // Vi behöver inte skriva om all kod i Person
        // Vi kan alltså återanvända vår kod igenom att ha flera olika
        // "kopior" i de olika objekten.
        // Värt att notera att objekten fungerar individuellt och separat
        // ifrån varandra.
        // Ändrar jag något hos adam, så är det enbart ändrat hos adam,
        // ändrar jag något hos sven, så är det enbart ändrat hos Sven!
        Person adam = new Person("Adam Thelin",36,191,110);
        Person bamse = new Person("Bamse Thelin", 11,40,10);
        Person gunnar = new Person("Gunnar Thelin",32,191,110);
        Person erik = new Person("Erik Thelin", 18,40,10);
        Person tom = new Person("Tom Thelin",36,191,110);
        Person pelle = new Person("Pelle Thelin", 11,185,100);
        Person yngve = new Person("Yngve Thelin",32,191,110);
        Person sven = new Person("Sven Thelin", 18,140,80);


        //System.out.println("Persons name is: " + name);
        //System.out.println("Person is alive: " + adam.getAlive());
        //System.out.println(name + " is " + adam.getAge());

        adam.printPersonInfo();
        bamse.printPersonInfo();
        adam.sayHello();
        bamse.sayHello();
    }
}
