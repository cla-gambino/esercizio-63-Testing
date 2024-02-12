import org.junit.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void checkResult() {
        OffsetDateTime expectedDate = OffsetDateTime.parse(Main.dataString);
        Main.Result result = Main.getResult(expectedDate);

        Main.Result expectedResult = new Main.Result(2023, 03, 01, DayOfWeek.WEDNESDAY);

        assertEquals(expectedResult, result);
    }

}