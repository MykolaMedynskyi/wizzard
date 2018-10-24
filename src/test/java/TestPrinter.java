import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestPrinter {

    private static final int NUM1 = -7;
    private static final int NUM2 = 0;
    private static final int NUM3 = 12;

    @Test
    public void sholdGoOn() {
        Printer tester = new Printer();
        String expectedString = "Is your number " + NUM3 + "?";
        assertEquals(expectedString, tester.yourNum(NUM3));
    }

    @Test
    public void sholdWriteAboutMistakeWhenZero() {
        Printer tester = new Printer();
        String expectedString = "mistake was made...";
        assertEquals(expectedString, tester.yourNum(NUM2));
    }

    @Test
    public void sholdWriteAboutMistakeWhenNegative() {
        Printer tester = new Printer();
        String expectedString = "mistake was made...";
        assertEquals(expectedString, tester.yourNum(NUM1));
    }

}
