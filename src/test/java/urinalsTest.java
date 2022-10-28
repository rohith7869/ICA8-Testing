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


}
