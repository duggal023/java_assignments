import java.io.IOException;
import java.util.*;

public class linkedodd {

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

    public int getFirst() throws Exception {

        if (isEmpty()) {
            throw new Exception("LL is Empty.");
        }

        return this.head.data;
    }

    public int getLast() throws Exception {

        if (isEmpty()) {
            throw new Exception("LL is Empty.");
        }

        return this.tail.data;
    }

    public int getAt(int idx) throws Exception {
        if (isEmpty()) {
            throw new Exception("LL is Empty.");
        }

        if (idx < 0 || idx >= this.size) {
            throw new Exception("Invalid Index.");
        }

        Node temp = this.head;

        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }

        return temp.data;

    }

    private Node getNodeAt(int idx) throws Exception {

        if (isEmpty()) {
            throw new Exception("LL is Empty.");
        }

        if (idx < 0 || idx >= this.size) {
            throw new Exception("Invalid Index.");
        }

        Node temp = this.head;

        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }

        return temp;

    }

    public void display() {

        System.out.println();
        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }

        System.out.println();
    }

    public void addLast(int item) {

        Node nn = new Node();
        nn.data = item;
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

    public void addFirst(int item) {

        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        nn.next = this.head;

        if (isEmpty()) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.head = nn;
            this.size++;
        }

    }

    public void oddeven() throws Exception {

        Node nn = this.head;

        ArrayList<Integer> ll = new ArrayList<>();

        while (nn != null) {
            if (nn.data % 2 != 0)
                ll.add(nn.data);
            nn = nn.next;
        }
        nn = this.head;

        while (nn != null) {
            if (nn.data % 2 == 0)
                ll.add(nn.data);
            nn = nn.next;

        }
        for (int kk = 0; kk < ll.size(); kk++)
            System.out.print(ll.get(kk) + " ");

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        linkedodd qoq = new linkedodd();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            qoq.addLast(sc.nextInt());
        }

        qoq.oddeven();

    }
}