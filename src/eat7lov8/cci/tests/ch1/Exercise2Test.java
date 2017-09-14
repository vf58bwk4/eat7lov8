package eat7lov8.cci.tests.ch1;

import eat7lov8.cci.ch1.Exercise2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alexander.Zhukov on 10.03.2017.
 */
class Exercise2Test {
    @Test
    void strlen() {
        char[] cs1 = {0};
        assertEquals( 0, Exercise2.strlen( cs1 ));

        char[] cs2 = {'a', 0};
        assertEquals( 1, Exercise2.strlen( cs2 ));

        char[] cs3 = {'a', 'b', 0};
        assertEquals( 2, Exercise2.strlen( cs3 ));
    }

    @Test
    void version1() {
        char[] cs1 = {0};
        char[] ex1 = {0};
        assertArrayEquals( ex1, Exercise2.version1( cs1 ) );

        char[] cs2 = {'a', 0};
        char[] ex2 = {'a', 0};
        assertArrayEquals( ex2, Exercise2.version1( cs2 ));

        char[] cs3 = {'a', 'b', 0};
        char[] ex3 = {'b', 'a', 0};
        assertArrayEquals( ex3, Exercise2.version1( cs3 ));

        char[] cs4 = {'a', 'b', 'c', 0};
        char[] ex4 = {'c', 'b', 'a', 0};
        assertArrayEquals( ex4, Exercise2.version1( cs4 ));
    }
}