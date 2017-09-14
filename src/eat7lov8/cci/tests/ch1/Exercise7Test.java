package eat7lov8.cci.tests.ch1;

import eat7lov8.cci.ch1.Exercise7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alexander.Zhukov on 16.03.2017.
 */
class Exercise7Test {
    @Test
    void version1() {
        int matrix[][] = {
                {1, 0, 1, 1, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1}
        };
        int expected[][] = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };
        Exercise7.version1( matrix, matrix.length, matrix[0].length );
        for (int cr = 0; cr < matrix.length; cr++) {
            assertArrayEquals( expected[cr], matrix[cr] );
        }
    }
}