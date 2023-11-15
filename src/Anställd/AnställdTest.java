package Anställd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AnställdTest {

    @Test
    void getName() {
        Anställd anstOne = new Anställd("Håkan",45,"Byggare",30000,1);
        Anställd anstTwo = new Anställd("Micke",55,"Byggare",35000,2);
        assertEquals("Håkan",anstOne.getName());
        assertEquals("Micke",anstTwo.getName());
    }

    @Test
    void getÅlders() {
        Anställd anstOne = new Anställd("Håkan",45,"Byggare",30000,1);
        Anställd anstTwo = new Anställd("Micke",55,"Byggare",35000,2);
        assertEquals(45,anstOne.getÅlders());
        assertEquals(55,anstTwo.getÅlders());
    }

    @Test
    void getYrke() {
        Anställd anstOne = new Anställd("Håkan",45,"Byggare",30000,1);
        Anställd anstTwo = new Anställd("Micke",55,"Byggare",35000,2);
        assertEquals("Byggare",anstOne.getYrke());
        assertEquals("Byggare",anstTwo.getYrke());
    }

    @Test
    void getLön() {
        Anställd anstOne = new Anställd("Håkan",45,"Byggare",30000,1);
        Anställd anstTwo = new Anställd("Micke",55,"Byggare",35000,2);
        assertEquals(30000,anstOne.getLön());
        assertEquals(35000,anstTwo.getLön());
    }

    @Test
    void getAnställningsnummer() {
        Anställd anstOne = new Anställd("Håkan",45,"Byggare",30000,1);
        Anställd anstTwo = new Anställd("Micke",55,"Byggare",35000,2);
        assertEquals(1,anstOne.getAnställningsnummer());
        assertEquals(2,anstTwo.getAnställningsnummer());
    }
}