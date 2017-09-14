package eat7lov8.cci.tests.ch2;

import eat7lov8.cci.ch2.Exercise1;
import eat7lov8.cci.ch2.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by alexander.zhukov on 24.03.2017.
 */
class Exercise1Test {
    @Test
    void version1() {
        Node l = new Node(3);
        l.appendToTail( 3 );
        l.appendToTail( 3 );
        l.appendToTail( 2 );
        l.appendToTail( 4 );
        l.appendToTail( 3 );
        l.appendToTail( 7 );
        Exercise1.version1(l);
        String actual = l.toString();

        l = new Node(3);
        l.appendToTail( 2 );
        l.appendToTail( 4 );
        l.appendToTail( 7 );
        String expected = l.toString();

        assertEquals (expected, actual  );
    }

}