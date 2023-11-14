package bankaccount;


import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        //Skapar ett object av klassen BankAccountLogic
        BankAccount adamAcc = new BankAccount(2000,"Adam");
        //BankAccount staffanAcc = new BankAccount(500);

        //Vi skapar en Scanner för att ta in information ifrån terminalen
        Scanner scan = new Scanner(System.in);

        //System.out.println(adamAcc.getBalance());

        //Vi skapar en meny som fortsätter gå tills vi abryter den (true är alltid = true)
        while (true) {
            //Vi skriver ut en meny, i början av varje loop och hämtar namnet från kontot.
            System.out.println("Welcome to imaginary bank, " + adamAcc.getName());
            System.out.println("Please choose an option!");
            System.out.println("1.Check account");
            System.out.println("2.Set account balance");
            System.out.println("3.Deposit");
            System.out.println("4.Withdraw");
            System.out.println("5.Quit");
            //Vi kollar innehållet i input (som tas in igenom scanner) och
            //omvandlar det till en int med Integer.parseInt.
            int input = Integer.parseInt(scan.nextLine());
            //Vi kontrollerar om input är lika med något av numren mellan
            //1 till 5 och utför i sådana fall det som finns i ifsatsen.
            //Vi kallar på metoderna ifrån BankAccount och skickar in
            //information med hjälp av Scanner.
            if (input == 1) {
                adamAcc.printBalance();
            } else if (input == 2) {
                System.out.print("Please enter new account balance:");
                int newBalance = Integer.parseInt(scan.nextLine());
                adamAcc.setBalance(newBalance);
            } else if (input == 3) {
                System.out.print("Please enter your deposit:");
                int deposit = Integer.parseInt(scan.nextLine());
                adamAcc.deposit(deposit);
            } else if (input == 4) {
                System.out.print("Please enter amount to withdraw:");
                int withdrawal = Integer.parseInt(scan.nextLine());
                adamAcc.withdraw(withdrawal);
            } else if (input == 5) {
                break;
            }
            //Om vi skriver in en siffra som inte är mellan 1 och 5 så
            //Skriver vi ut ett felmedellande!
            else {
                System.out.println("Non-acceptable input!");
                System.out.println("Please try again!");
            }
        }

        //15.  Utöka programmet så att man i programmet
        // som anropar BankAccount får reda på vad     saldot är
        // (så att man kan skriva ut det ifrån     main-programmet
        // istället för direkt i   BankAccount).


    }
    //13.  Utöka programmet så att man kan lägga till
    // och ta bort en viss summa ifrån saldot
    //12.  Utöka programmet så att man kan bestämma
    // ett nytt värde för saldo
    //14.  Utöka programmet så att man aldrig kan få ett
    // saldo som är mindre än 0 kronor
}





