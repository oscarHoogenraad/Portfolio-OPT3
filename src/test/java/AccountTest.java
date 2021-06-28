import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
@org.junit.jupiter.api.Test
    public void test1(){
    Account a = new Account("Karel", "123");
    String tempuser = a.getUserName();
    String tempww = a.getPassWord();
    assertEquals("Karel", tempuser);
    assertEquals("123", tempww);
}

@Test
public void test2(){
    Account b = new Account("", "");
    String tempuse = b.toString();
    assertEquals("Username: , Password: ", tempuse);
}
}