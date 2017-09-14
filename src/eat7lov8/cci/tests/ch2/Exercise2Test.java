package eat7lov8.cci.tests.ch2;

import eat7lov8.cci.ch2.Exercise2;
import eat7lov8.cci.ch2.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by alexander.zhukov on 24.03.2017.
 */
class Exercise2Test {
    @Test
    void version1() {
        Node l = new Node( 7 );
        l.appendToTail( 6 );
        l.appendToTail( 5 );
        l.appendToTail( 4 );
        l.appendToTail( 3 );
        l.appendToTail( 2 );
        l.appendToTail( 1 );
        Node f = Exercise2.version1( l, 3 );
        System.err.println( f.data );
    }

}