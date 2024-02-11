package Uppgifter;

public class BookSwitch {
    //Tern operator
    public static void main(String[] args) {

        for (int number = -5;number <= 5;number++){

            int absval = number < 0 ? - number : number; //<--- Tern operator if-then-else
            System.out.println(" Värde = " + absval);
        }

        for (int x = 1; x <= 13; x++) {
            switch (x) {
                case 1:
                case 2:
                case 12:
                    System.out.println(x + ": vinter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(x + ":vår");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(x + ":sommar");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(x + ":höst");
                    break;
                default:
                    System.out.println(x + ":det finns inga sådana månaden");


            }

        }
        for (int x = 100;x > 0;x -=5){ //<---Minskar med 5 varje gång
         System.out.println("x = " + x);
        }


    }
}
