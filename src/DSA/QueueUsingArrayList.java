package DSA;

public class QueueUsingArrayList {
    Object[] arr = new Object[10];
    int head = 0;
    int tail = 0;
    int count = 0;

    // Add element to the tail of the queue
    public void add(Object ele) {
        if (count >= arr.length)
            increase();
        arr[tail++] = ele;
        count++;
    }

    // Remove and return the head element
    public Object poll() {
        if (isEmpty()) return null;
        Object ele = arr[head];
        arr[head] = null; // clear reference
        head++;
        count--;
        return ele;
    }

    // Return the head element without removing it
    public Object peek() {
        if (isEmpty()) return null;
        return arr[head];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Return the number of elements in the queue
    public int size() {
        return count;
    }

    // Internal method to increase array size
    private void increase() {
        Object[] newArr = new Object[arr.length + 5];
        for (int i = head, j = 0; i < tail; i++, j++) {
            newArr[j] = arr[i];
        }
        tail = count;
        head = 0;
        arr = newArr;
    }

}
