package Uppgifter;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class TestPasswordCheck {
    @Test
    public void testSendingText() {
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;
        boolean actual = pass.check("password");
        assertEquals(expected,actual);


    }
    @Test
    public void testPassword8tecken() {
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;
        boolean actual = pass.check("password");
        assertEquals(expected,actual);


    }



}




