package DSA;

public class StackUsingArrayList {
    Object[] arr = new Object[10];
    int count = 0;

    // Push an element onto the stack
    public void push(Object ele) {
        if (count >= arr.length)
            increase();
        arr[count++] = ele;
    }

    // Pop the top element from the stack
    public Object pop() {
        if (isEmpty()) return null;
        Object ele = arr[--count];
        arr[count] = null; // clear reference
        return ele;
    }

    // Peek at the top element without removing
    public Object peek() {
        if (isEmpty()) return null;
        return arr[count - 1];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Return number of elements in the stack
    public int size() {
        return count;
    }

    // Internal method to increase capacity
    private void increase() {
        Object[] newArr = new Object[arr.length + 5];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
