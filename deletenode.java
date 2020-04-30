
import java.util.*;

public class deletenode {

    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void addLast(int item) {

        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (this.size > 0)
            this.tail.next = nn;

        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            this.tail = nn;
            this.size++;
        }

    }

    public void deleteNode() {

        Node curr = this.head;
        Node max = this.head;

        Node temp;

        while (curr != null && curr.next != null) {

            if (curr.next.data < max.data) {

                temp = curr.next;
                curr.next = temp.next;
                temp = null;
            } else {

                curr = curr.next;
                max = curr;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        deletenode ne = new deletenode();

        for (int i = 1; i <= 8; i++) {
            int it = sc.nextInt();
            ne.addLast(it);
        }
        ne.deleteNode();
        ne.display();
    }

}
