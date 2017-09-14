package eat7lov8.cci.tests.ch1;

import eat7lov8.cci.ch1.Exercise1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alexander.Zhukov on 10.03.2017.
 */
class Exercise1Test {
    @Test
    void version1() {
        assertTrue(Exercise1.version1(""));
        assertTrue(Exercise1.version1("a"));
        assertTrue(Exercise1.version1("ab"));

        assertFalse(Exercise1.version1("aba"));
        assertFalse(Exercise1.version1("aab"));
        assertFalse(Exercise1.version1("abba"));
    }
}