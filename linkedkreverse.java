
import java.util.*;

public class linkedkreverse {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node() {

        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addLast(int it) {

        Node nn = new Node();
        nn.data = it;
        nn.next = null;

        if (!isEmpty())
            this.tail.next = nn;

        if (isEmpty()) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }

    }

    public int kthFromLast(int k) {

        Node slow = this.head;
        Node fast = this.head;

        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        linkedkreverse ll = new linkedkreverse();
        while (true) {
            int s = sc.nextInt();
            if (s == -1)
                break;
            else
                ll.addLast(s);

        }
        int k = sc.nextInt();
        System.out.println(ll.kthFromLast(k));

    }

}
