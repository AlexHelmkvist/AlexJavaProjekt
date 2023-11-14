package FirstTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//
public class TestRunner {
    private String password;

    @Test
    public void testGetUserName(){
        User user = new User("Alex", "password");
        String expected = "Alex";
        String actual = user.getUserName();

        assertEquals(expected,actual);
    }
    @Test
    public void testGetPassword(){
        User user = new User("Alex","arg");
        String expected = "arg";
        String actual = user.getPassword();
        assertEquals(expected,actual);

    }
    @Test
    public void testGetUser(){

        User user = new User("Alex","password");
        String expected = "normal";


    }




}



