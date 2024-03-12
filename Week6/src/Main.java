public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SLinkedList myList = new SLinkedList();
        myList.addLast(5); //myList = {5}
        myList.addFirst(10); // myList = {10, 5}
        myList.addLast(14);

        System.out.println(myList.retrieveData(2));
    }
}