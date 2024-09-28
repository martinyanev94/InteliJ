import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    Main mp = null;

    @BeforeEach
    void setUp() {
        mp = new Main();
    }

    @Test
    void firstName() {
        Assertions.assertEquals("Main", mp.firstName());
    }

    @Test
    void subtractNumbers() {
        Assertions.assertEquals(10, mp.subtractNumbers(20,10));
    }
}