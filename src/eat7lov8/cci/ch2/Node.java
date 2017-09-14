package eat7lov8.cci.ch2;

/**
 * Created by alexander.zhukov on 24.03.2017.
 */
public class Node {
    Node next = null;
    public int data;

    public Node(int d) {
        data = d;
    }

    public void appendToTail(int d) {
        Node end = new Node( d );
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    // delete only first occurence of d
    Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next; /* moved head */
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head; /* head didn’t change */
            }
            n = n.next;
        }
        return head;
    }

    @Override
    public String toString() {
        String s = String.valueOf( data );
        for (Node cn = this.next; cn != null; cn = cn.next) {
            s = s + "->" + String.valueOf( cn.data );
        }
        return s;
    }
}
