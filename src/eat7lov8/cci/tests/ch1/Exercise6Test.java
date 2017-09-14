package eat7lov8.cci.tests.ch1;

import eat7lov8.cci.ch1.Exercise6;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Alexander.Zhukov on 15.03.2017.
 */
class Exercise6Test {
    @Test
    void version1() {
        int matrix[][] = {
                {1, 1, 1, 1, 1, 2},
                {4, 1, 1, 1, 2, 2},
                {4, 4, 1, 2, 2, 2},
                {4, 4, 4, 3, 2, 2},
                {4, 4, 3, 3, 3, 2},
                {4, 3, 3, 3, 3, 3}
        };
        int expected[][] = {
                {4, 4, 4, 4, 4, 1},
                {3, 4, 4, 4, 1, 1},
                {3, 3, 4, 1, 1, 1},
                {3, 3, 3, 2, 1, 1},
                {3, 3, 2, 2, 2, 1},
                {3, 2, 2, 2, 2, 2}
        };
        Exercise6.version1( matrix, matrix.length );
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals( expected[i], matrix[i] );
        }
    }
}