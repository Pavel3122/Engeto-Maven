import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testDivideOk () {
        Main main = new Main();
        assertEquals(2, main.divide(4,2));
    }

    @Test
    public void testDivideFail () {
        Main main = new Main();
        assertEquals(3, main.divide(6,2));
    }

    @Test
    public void testDivideError() {
        Main main = new Main();
        assertEquals(3, main.divide(6,2));
    }
}
