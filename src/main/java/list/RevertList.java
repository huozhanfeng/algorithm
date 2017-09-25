package list;

/**
 * Created by zfhuo on 8/25/17.
 */
public class RevertList {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;

        Node begin = a;
        Node second = a.next;
        Node tmp = second != null ? second.next: null;

        begin.next = null;
        second.next = begin;
        while (tmp != null) {
            begin = second;
            second = tmp;
            tmp = tmp.next;
            second.next = begin;
        }

        while (null != second) {
            System.out.println(second.val);
            second = second.next;
        }
    }

    static class Node {
        Node next;
        int val;
        public Node(int val) {
            this.val = val;
        }
    }
}
