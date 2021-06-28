import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PsychiaterTest {
    @Test
    public void pKiezenTest(){
        Psychiater a = new Psychiater("", 1);
        Boolean tempBool = a.getMagReceptAanvragen();
        assertEquals(false, tempBool);
    }

    @Test
    public void getterTest(){
        Psychiater b = new Psychiater("", 1);
        String tempNaam = b.getpNaam();
        int tempNum = b.getpNummer();
        assertEquals("", tempNaam);
    }

}