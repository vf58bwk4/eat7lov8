package eat7lov8.cci.tests.ch1;

import eat7lov8.cci.ch1.Exercise5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alexander.Zhukov on 13.03.2017.
 */
class Exercise5Test {
    @Test
    void version1() {
        assertEquals( "", Exercise5.version1( "" ) );
        assertEquals( "One", Exercise5.version1( "One" ) );
        assertEquals( "One%20Two", Exercise5.version1( "One Two" ) );
    }
}