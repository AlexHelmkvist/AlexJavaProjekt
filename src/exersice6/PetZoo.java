package exersice6;

public class PetZoo {
    public static void main(String[] args) {
        //Skapa en klass PetZoo som har en main-metod och som anropar konstruktorn i Pet
        //
        //Spara tre olika djur i ditt PetZoo
        //Skapa tre objekt av Pet

        Pet katt = new Pet("Stessi");
        Pet hund = new Pet("Hugo");
        Pet lamm = new Pet("Fido");

        //Använd denna metod ifrån klassen PetZoo på dina tre nyligen skapade objekt

        /*katt.printName();
        hund.printName();
        lamm.printName();
         System.out.println("Katt heter " + katt + "Hund heter" + hund + "Lamm heter" + lamm);
         */

        //Använd denna metod ifrån klassen PetZoo på dina tre nyligen skapade objekt och spara värdet i en variabel

        String hundName = hund.getName();
        String kattName = katt.getName();
        String lammName = lamm.getName();

        for (int i =0;i<1;i++){

            System.out.println(hundName + "\n" + kattName + "\n" + lammName);
        }


    }
}
