import org.incubyte.KataStringCalculatorTDD;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataStringCalculatorTDDTest {

    KataStringCalculatorTDD kataStringCalculatorTDD;

    @BeforeEach
    public void init() {

        kataStringCalculatorTDD = new KataStringCalculatorTDD();
    }

    @AfterEach
    public void destroy() {
        kataStringCalculatorTDD=null;
    }

    @Test
    public void testEmptyString() throws IllegalAccessException {
        assertEquals(0,kataStringCalculatorTDD.addString(""));
    }

    @Test
    public void testAddOneNumber() throws IllegalAccessException {
        assertEquals(30,kataStringCalculatorTDD.addString("30"));
    }

    @Test
    public void testTwoNumbers() throws IllegalAccessException {
        assertEquals(50,kataStringCalculatorTDD.addString("30,20"));
    }

    @Test
    public void testMultipleNumbers() throws IllegalAccessException {
        assertEquals(100,kataStringCalculatorTDD.addString("20,55,25"));
    }

    @Test
    public void testWithNegativeNumbers() {
        try {
            kataStringCalculatorTDD.addString("-25,5");
        } catch (IllegalAccessException e) {
            assertEquals(e.getMessage(),"negative numbers are not allowed -25");
        }
    }

    @Test
    public void testNumbersInNewLine() throws IllegalAccessException {
        assertEquals(42, kataStringCalculatorTDD.addString("15\n20,3\n4"));
    }


}
