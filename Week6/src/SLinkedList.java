public class SLinkedList {
    public Node head;
    public Node tail;
    public int size;

    ///// Constructors

    /**
     * This constructor creates an empty list.
     */
    public SLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addLast(Object data){
        Node node2AddLast = new Node(data);
        if(size ==0){
            head = node2AddLast;
            tail = node2AddLast;
        }
        else {

            tail.setNext(node2AddLast);
            tail = node2AddLast;
        }
        size++;
    }

    public void addFirst(Object data){
        if(size == 0){
            addLast(data);
        }
        else {
            Node node2AddFirst = new Node(data, head);
            head = node2AddFirst;
            size++;
        }
    }

    public Object retrieveData(int location){
        if(location >= size){
            return 0;
        }
        if(location < 0){
            return 0;
        }
        Node currentNode = head;
        for(int i = 0; i < location; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    @Override
    public String toString(){
        Node currentNode = head;
        String myString = "";
        while(currentNode != null){
            myString += currentNode.getData() + ", ";
            currentNode = currentNode.getNext();
        }
        return myString;
    }



    //public SLinkedList addElement()

}
