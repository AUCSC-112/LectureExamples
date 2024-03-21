public class SLinkedStack {
    private SLinkedList data = new SLinkedList();



    //constructors

    // pop

    //push
    public void push(Object o){
        data.addFirst(o);
    }

    public Object pop(){
        return data.removeFirst();
    }

    public Object peek(){
        return data.head.getData();
    }

    public int size(){
        return data.size;
    }
    //peek

}
