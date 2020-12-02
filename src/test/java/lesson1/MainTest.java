package lesson1;

import lesson1.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    private final Main myMain = new Main();
    private final ByteArrayOutputStream outForTests = new ByteArrayOutputStream();
    private final PrintStream originalOutput = System.out;


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outForTests));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOutput);
    }


    // a * (b + c / d);
    @Test
    public void testEq() {
        assertEquals(myMain.getEquation(1, 2, 4, 2), 4, 0.1);
        assertEquals(myMain.getEquation(1, 2, 3, 2), 3.5, 0.1);
        assertEquals(myMain.getEquation(1, 1, 3, 2), 2.5, 0.1);
    }

    @Test
    public void testSum() {
        assertEquals(myMain.sum(1, 2), false);
        assertEquals(myMain.sum(10, 0), true);
        assertEquals(myMain.sum(20, 0), true);
        assertEquals(myMain.sum(21, 0), false);
    }


    @Test
    public void testIsNegative() {
        assertEquals(myMain.isNegative(1), false);
        assertEquals(myMain.isNegative(-1), true);
        assertEquals(myMain.isNegative(0), false);
    }

    @Test
    public void outputTest() {
        String message = "hello, this is test.";
        System.out.print(message);
        assertEquals(message, outForTests.toString());
    }

    @Test
    public void testPrintSignPos() {
        myMain.printSign(1);
        assertEquals(outForTests.toString(), "This is positive number.\n");
    }

    @Test
    public void testPrintSignNeg() {
        myMain.printSign(-1);
        assertEquals(outForTests.toString(), "This is negative number.\n");

    }

    @Test
    public void testPrintSignZero() {
        myMain.printSign(0);
        assertEquals(outForTests.toString(), "This is positive number.\n");

    }


    @Test
    public void testGreeter() {
        myMain.greeter("Tony Stark");
        assertEquals("Hello Tony Stark", outForTests.toString());
    }

    @Test
    public void checkIsLeapYear(){
        assertEquals(myMain.isLeapYear(2112), true);
        assertEquals(myMain.isLeapYear(2113), false);
        assertEquals(myMain.isLeapYear(2116), true);
    }

    @Test
    public void checkIsLeapYearBeforeLocalDate(){
        for (int year = 0; year < 2000; year++) {
            assertEquals(myMain.isLeapYearBeforeLocalDate(year), myMain.isLeapYear(year));
        }
    }


}
