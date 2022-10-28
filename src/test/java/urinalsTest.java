import org.example.urinals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    @Test
    public void hasAlternateCharsTest()
    {
        System.out.println("========= Rohith Bellapu == TEST ONE EXECUTED =========");
        urinals urinal=new urinals();
        String test="01000";
        assertTrue(urinal.hasAlternateChars(test));
    }

    @Test
    public void hasAlternateCharsTest_1()
    {
        System.out.println("========= Rohith Bellapu == TEST TWO EXECUTED =========");
        urinals urinal=new urinals();
        String test="011";
        assertFalse(urinal.hasAlternateChars(test));
    }

    @Test
    public void hasAlternateCharsTest_2()
    {
        System.out.println("========= Rohith Bellapu == TEST THREE EXECUTED =========");
        urinals urinal=new urinals();
        assertTrue(urinal.hasAlternateChars(null));
    }

    @Test
    public void hasAlternateCharsTest_3()
    {
        System.out.println("========= Rohith Bellapu == TEST FOUR EXECUTED =========");
        urinals urinal=new urinals();
        String test="110";
        assertFalse(urinal.hasAlternateChars(test));
    }

    @Test
    public void countUrinalsTest()
    {
        System.out.println("========= Rohith Bellapu == TEST FIVE EXECUTED =========");
        urinals urinal=new urinals();
        String test="10001";
        assertEquals(1,urinal.countUrinals(test));
    }

    @Test
    public void countUrinalsTest_1()
    {
        System.out.println("========= Rohith Bellapu == TEST SIX EXECUTED =========");
        urinals urinal=new urinals();
        String test="00000";
        assertEquals(3,urinal.countUrinals(test));
    }

    @Test
    public void countUrinalsTest_2()
    {
        System.out.println("========= Rohith Bellapu == TEST SEVEN EXECUTED =========");
        urinals urinal=new urinals();
        String test="01000";
        assertEquals(1,urinal.countUrinals(test));
    }

    @Test
    public void countUrinalsTest_3()
    {
        System.out.println("========= Rohith Bellapu == TEST EIGHT EXECUTED =========");
        urinals urinal=new urinals();
        String test="011";
        assertEquals(-1,urinal.countUrinals(test));
    }



}
