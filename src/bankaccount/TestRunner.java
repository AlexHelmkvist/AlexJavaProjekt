package bankaccount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class
TestRunner {

    @Test
    public void getNameTest() {
        //Arrange
        BankAccount bank = new BankAccount(2500,"Erik");
        String expected = "Erik";
        String actual = bank.getName();

        assertEquals(expected, actual);

    }

    @Test
    public void getBalanceTest() {
        BankAccount bankAccount = new BankAccount(2500,"Erik");

        int expected = 2500;
        int actual = bankAccount.getBalance();

        assertEquals(expected, actual);
    }
    @Test
    public void getDepositTest(){

        BankAccount bank = new BankAccount(1000,"Testson");


    }


}