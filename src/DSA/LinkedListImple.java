package DSA;

public class LinkedListImple {

    private class Node {
        Object ele;
        Node next;

        public Node(Object ele, Node next) {
            this.ele = ele;
            this.next = next;
        }

        public Node(Object ele) {
            this.ele = ele;
        }

    }


    Node head;
    int count = 0;

    public void add(Object ele) {
        if (head == null) {
            head = new Node(ele);
            count++;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;

        curr.next = new Node(ele, null);
        count++;
    }


    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        Node curr = head;
        for (int i = 1; i <= index; i++)
            curr = curr.next;

        return curr.ele;
    }

    public void addPos(Object ele, int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        Node n = new Node(ele);
        if (index == 0) {
            addFirst(ele);
            return;
        }
        Node curr = head;
        for (int i = 1; i < index; i++)
            curr = curr.next;
        n.next = curr.next;
        curr.next = n;
        count++;
    }

    public void addFirst(Object ele) {
        Node n = new Node(ele);
        n.next = head;
        head = n;
        count++;
        return;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        Node curr = head;
        if (index == 0) {
            head = head.next;
            count--;
            return;
        }
        for (int i = 1; i < index; i++)
            curr = curr.next;
        curr.next = curr.next.next;
        count--;
    }
}
