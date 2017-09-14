package eat7lov8.cci.ch2;

/**
 * Implement an algorithm to find the nth to last element of a singly linked list.
 */
public class Exercise2 {
    public static Node version1(Node h, int n) { // non recursive
        if (n < 1) return null;
        Node hp = h;
        Node tp = h;
        for (int i = 0; i < n; i++) {
            if (tp == null) return null;
            tp = tp.next;
        }
        while (tp != null) {
            hp = hp.next;
            tp = tp.next;
        }
        return hp;
    }
}
