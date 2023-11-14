package bankaccount;

public class BankAccount {
    //Vi skapar en variabel vid namn balance som inte har något värde.
    private int balance;
    private String name;

    //Vi skapar en konstruktor som sätter ett värde på
    //balance (Som den får ifrån myBalance)
    public BankAccount(int myBalance, String myName) {
        //Vi kontrollerar om myBalance är mindre än
        //0 och i sådana fall så sätter vi balance till 0.
        //I annat fall så sätter vi balance till värdet i
        //myBalance.
        if (myBalance < 0) {
            balance = 0;
        } else {
            balance = myBalance;
        }
        name = myName;

    }
    public void printBalance(){
        //Vi skriver ut värdet ifrån balance som bestämts i konstruktorn.
        System.out.println("Your balance is:" + balance);
    }
    public void setBalance(int newBalance){
        //Vi sätter värdet i balance till värdet som vi tar in
        //i metodens "Signatur" (newBalance)
        balance = newBalance;
    }
    public void deposit(int myDeposit){
        //balance = balance + myDeposit; <--Gör samma som
        //balance += myDeposit.
        //Vi lägger till värdet av myDeposit till balance
        //och sparar summan i balance.
        balance += myDeposit;
    }
    public void withdraw(int myWithdrawal){
        //Samma teori som i deposit metoden! :)
        //Om summan av balance och myWithdrawal
        //skulle göra att saldot blir mindre än 0, så utför vi inte
        //operationen.
        if ((balance - myWithdrawal) < 0){
            System.out.println("Can't withdraw! Not enough money in the account!");
        } else {
            balance -= myWithdrawal;
        }

    }
    //Vi kan returnera enbart balance om vi vill använda
    //Värdet utanför vår klass på något sätt igenom att
    //ha en separat get metod.
    public int getBalance(){
        return balance;
    }
    //Vi kan göra samma sak med en String eller andra variabler.
    public String getName(){
        return name;
    }
}



