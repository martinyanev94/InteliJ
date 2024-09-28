import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PosNegTest {
    //Init
    PosNeg pn = null;

    //Set Up
    @BeforeEach
    void setUp() {
        pn = new PosNeg();
    }

//    Given 2 int values, return true if one is negative and one is positive.
//    Except if the parameter "negative" is true, then return true only if both are negative.
    @Test
    void posNegNegativeFalse() {
        assertTrue(pn.posNeg(1, -1, false));
    }

    @Test
    void negPosNegativeFalse() {
        assertTrue(pn.posNeg(-1, 1, false));
    }

    @Test
    void negNegNegativeTrue() {
        assertTrue(pn.posNeg(-44, -100, true));
    }

    @Test
    void posPosNegativeFalse() {
        assertFalse(pn.posNeg(12, 1, false));
    }

}