/**
 * Node class. Basic element for collection.
 */
public class Node {
    private Object data;
    private Node next;

    public Node(Object data){
        this(data,null);
    }

    public Node(Object data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
