package exersice3;

public class WhileLoop {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("Tal mellan 1-100:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ",");
        }


        System.out.println();
        System.out.println();
        System.out.println("Jämna tal 1-100:");

        int tal = 0;

        while (tal <= 100) {

            System.out.print(tal + ",");
            tal = tal + 2;
        }


        System.out.println();
        System.out.println();
        System.out.println("Udda tal 1-100:");


        for (int i = 1; i <= 100; i += 2) {

            System.out.print(i + ",");
        }


        System.out.println();
        System.out.println();
        System.out.println("Fibonicci nummer 1-100:");

        int num1 = 1;

        System.out.print(num1 + " ");

        int num2 = 1;

        while (num1 <= 100) {

            System.out.print(num1 + " ");
            int num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }

        System.out.println();

        System.out.println("Fibonicci nummer 1-100:");

        int numt1 = 1;
        System.out.print(numt1 + " ");
        int numt2 = 1;
        for (int i = 0; i < 11; i++) {
            System.out.print(numt1 + " ");

            int numt3 = numt1 + numt2;
            numt1 = numt2;
            numt2 = numt3;
        }




    }


}



