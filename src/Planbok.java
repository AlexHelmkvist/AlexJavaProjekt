import java.util.Scanner;

public class Planbok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hur mycket pengar har du i planbok " + "?");

        int minPlanbok = Integer.parseInt(scan.nextLine());

        for (int i = 1;i<=minPlanbok;i++){
            System.out.println("Du har:" + i);
        }


    }
}
/*System.out.print("Sriv in ditt namn: ");
        String name = scan.nextLine();
        System.out.print("Skriv in din ålder: ");
        String age = scan.nextLine();
        System.out.print("Skriv in din hemstad: ");
        String homeTown = scan.nextLine();
        System.out.print("Skriv in ditt favoritband: ");
        String favouriteBand = scan.nextLine();

        System.out.println("Hello " + name + " ålder " + age + " " + homeTown + " älskar " + favouriteBand);

 */