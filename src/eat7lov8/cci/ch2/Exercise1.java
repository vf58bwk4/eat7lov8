package eat7lov8.cci.ch2;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class Exercise1 {
    public static void version1(Node n) {
        if (n == null || n.next == null) return; // 0 or 1 element in list

        Node cn = n;
        while(cn.next != null) {
            for (Node sn = n; sn != null && sn != cn.next; sn = sn.next) {
                if (sn.d)
            }
            cn = cn.next;
        }
    }
}
