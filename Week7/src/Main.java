public class Main {
    public static void main(String[] args) {
        ArrayQueue<Integer> testQueue = new ArrayQueue<>(5);
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.enqueue(4);
        testQueue.enqueue(5);
        System.out.println(testQueue.getSize()); // expect 5
        System.out.println(testQueue.getFront()); // expect 0

        System.out.println(testQueue.front()); // expect 1
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.enqueue(6);
        testQueue.enqueue(7);
        System.out.println(testQueue.getSize()); // expect 4
        System.out.println("Rear Index: " + testQueue.getRear()); // expect 1
        System.out.println("Front Index: " + testQueue.getFront()); // expect 1

        System.out.println(testQueue.front()); // expect 4

    }
}