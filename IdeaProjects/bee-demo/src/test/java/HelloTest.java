import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    @DisplayName("ตรวจสอบ ชื่อ")
    public void caseHelloName(){
        Hello hello = new Hello();
        String name = "Bee";
        String response = hello.getName(name);
        assertEquals("Hello Bee", response);
    }
}