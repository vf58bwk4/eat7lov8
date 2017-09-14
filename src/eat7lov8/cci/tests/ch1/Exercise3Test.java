package eat7lov8.cci.tests.ch1;

import eat7lov8.cci.ch1.Exercise3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alexander.Zhukov on 10.03.2017.
 */
class Exercise3Test {
    @Test
    void version1() {
        assertEquals( "", Exercise3.version1("") );
        assertEquals( "a", Exercise3.version1("a") );
        assertEquals( "ab", Exercise3.version1("aba") );
        assertEquals( "abc", Exercise3.version1("ababcca") );

        assertEquals( "abcd", Exercise3.version1("abcd") );
        assertEquals( "a", Exercise3.version1("aaaa") );
        assertEquals( "ab", Exercise3.version1("aaabbb") );
        assertEquals( "ab", Exercise3.version1("abababa") );
    }
}