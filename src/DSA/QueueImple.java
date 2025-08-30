package DSA;

public class QueueImple {

    private class Node {
        Object ele;
        Node next;

        Node(Object ele) {
            this.ele = ele;

        }

        Node(Object ele, Node next,Node tail) {
            this.ele = ele;
            this.next = next;

        }
    }

    Node head;
    int count;
    Node tail;

    public void add(Object ele){
        if (head==null){
            head=new Node(ele);
            tail=head;
            count++;
            return;
        }
        tail.next=new Node(ele);
        tail=tail.next;
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
    public Object peek(){
        return head.ele;
    }
    public Object poll(){
        Object ele=head.ele;
        head=head.next;
        count--;
        return ele;
    }
}
