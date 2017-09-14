package eat7lov8.cci.tests.ch1;

import eat7lov8.cci.ch1.Exercise4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alexander.Zhukov on 13.03.2017.
 */
class Exercise4Test {
    @Test
    void version1() {
        assertTrue( Exercise4.version1( "", "" ) );
        assertTrue( Exercise4.version1( "Vladimir Nabokov", "Vivian Darkbloom" ) );
        assertTrue( Exercise4.version1( "Arrigo Boito", "Tobia Gorrio" ) );

        assertFalse( Exercise4.version1( "Arri Boito", "Tobia Gorrio" ) );
        assertFalse( Exercise4.version1( "Arrigoo Boito", "Tobia Gorrio" ) );
    }
}