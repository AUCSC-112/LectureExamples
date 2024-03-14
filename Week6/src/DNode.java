/**
 *
 * @author lutellie
 */
public class DNode {
    public Object element;
    public DNode next;
    public DNode prev;

    // Empty Node creation
    public DNode() {
        element = null;
        next = null;
        prev = null;
    }

    // Node constructor
    public DNode(Object element, DNode next, DNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}