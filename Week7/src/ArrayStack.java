/**
 * Stack implementation with an array
 * by T. Lutellier
 */
public class ArrayStack<E> {
    private E[] data;
    private int top = -1; // top is the INDEX of the last element in the stack. -1 means empty stack
    public static final int CAPACITY = 1000;


    //Constructor
    public ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }

    public ArrayStack(){
        this(CAPACITY);
    }

    public int getSize(){
        return top+1;
    }

    public boolean isEmpty(){
        if( top == -1)
            return true;
        return false;
    }

    // push
    public void push(E e){
        // check if stack is full:
        if(getSize() == data.length) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        data[top] = e;
    }

    // pop: remove last element
    public E pop() {
        if(isEmpty())
            return null;
        E answer = data[top];
        data[top] = null; // this cleaner, but not always necessary.
        top--;
        return answer;
    }

    // peek: read the top of the stack without removing the element.
    public E peek(){
        if(isEmpty())
            return null;
        return data[top];
    }

}
