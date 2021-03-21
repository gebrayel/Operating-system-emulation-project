package Classes;

public class Node {

    private Node next;
    private int ID;
    private int counter;
    private int priority;

    public Node(int ID, int priority) {
        this.ID = ID;
        this.counter = 0;
        this.priority = priority;
    }

    public void updatePriority() {
        if (this.priority > 1) {
            this.priority = this.priority - 1;
            System.out.println("Now the priority is: " + this.priority);
        } else {
            System.out.println("Max priority");
        }
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
}
