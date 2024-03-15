/**
 *
 * @author lutellie
 */
public class DLinkedList {

    private DNode head;
    private DNode tail;
    private int size;

    public DLinkedList() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

    //Add first element
    public void addFirst(Object element) {
        DNode tmp = new DNode(element, head, null);
        // Check if we add an element to non empty list
        if(head != null ) {
            head.prev = tmp;
        }
        head = tmp;

        // if it's the only element of the list, we need to update the tail
        if(tail == null) {
            tail = tmp;
        }

        size++;
        System.out.println("Adding element: "+element);
    }

    //Add Last
    public void addLast(Object element) {
        DNode tmp = new DNode(element, null, tail);

        //If it's not the only element
        if(tail != null) {
            tail.next = tmp;
        }
        tail = tmp;

        // if it is the only element
        if(head == null) {
            head = tmp;
        }
        size++;
    }

    public boolean removeAtIndex(int index) {
        if(index >= size || index < 0){
            return false;
        }
        size--;
        if(index == size - 1){ //if it's the last element,
            tail.prev.next = null;
            tail = tail.prev;
            return true;

        }
        if(index == 0){
            head.next.prev = null;
            head = head.next;
            return true;
        }

        DNode node2Remove;
        if(index > size /2 ){
            node2Remove = iterateBackward(index);
        }
        else{
            node2Remove = iterateForward(index);
        }
        node2Remove.prev.next = node2Remove.next;
        node2Remove.next.prev = node2Remove.prev;
        return true;


    }

    private DNode iterateForward(int index){
        int counter = 0;
        DNode current = head;
        while (counter < index){
            current = current.next;
            counter++;
        }
        return current;
    }

}