package Anställd;


public class AnställdMain {

    public static void main(String[] args) {

        Anställd anstOne = new Anställd("Håkan",45,"Byggare",30000,1);
        Anställd anstTwo = new Anställd("Micke",55,"Byggare",35000,2);

        anstOne.printAnställd();
        anstTwo.printAnställd();

    }
}
