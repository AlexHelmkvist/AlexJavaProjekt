package Calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRunner {

    //1.Skriv ett test som testar multiplication
    //2.Skriv ett test som testar divide!

    @Test
    public void TestMultiplication(){

        Calculator calc = new Calculator();
        double expected = 9;
        double actual = calc.multiplication(3,3);

        assertEquals(expected,actual,0.01);
    }
    @Test
    public void TestDivide(){

        Calculator calc = new Calculator();
        double expected = 3;
        double actual = calc.divide(9,3);

        assertEquals(expected,actual,0.01);
    }


}
