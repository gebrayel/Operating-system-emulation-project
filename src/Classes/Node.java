package Classes;

public class Node {

    private Node next;
    private int ID;
    private int counter;
    
    public Node(int ID){
        this.ID = ID;
        this.counter = 0;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
}
