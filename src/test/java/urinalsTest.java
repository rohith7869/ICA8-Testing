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


}
