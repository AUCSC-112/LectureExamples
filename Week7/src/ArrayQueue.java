public class ArrayQueue<E> {

    private int rear = -1;
    private int front =0;
    private int size = 0;
    private E[] queueArray;

    // getters


    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int getSize() {
        return size;
    }

    // Constructors
    public ArrayQueue(int capacity){
        queueArray = (E[]) new Object[capacity];
    }

    // enqueue(): add something to the queue
    public void enqueue(E element){
        if(isFull()){
            throw new RuntimeException("Queue is Full");
        }
//        if(front != 0 && rear == size-1){
//            rear = 0;
//        }
//        else {
//            rear++;
//        }
        rear = (rear +1) % queueArray.length;
        queueArray[rear] = element;
        size++;
    }

    // dequeue()
    public E dequeue(){
        if (empty()){
            throw new RuntimeException("Queue is Empty");
        }

        E result =  queueArray[front];
        size--;
        front = (front +1) % queueArray.length;

        return result;
    }

    //front()
    public E front(){
        return queueArray[front]; // we should check if empty too.
    }

    //empty()
    public boolean empty(){
        return size==0;
    }

    //isFull()
    boolean isFull(){
        return (size == queueArray.length);
    }

  }