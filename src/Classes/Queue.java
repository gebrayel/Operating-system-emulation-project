package Classes;
import java.lang.Math;
public class Queue {

    private Node head;
    private Node tail;
    private int size;
    
    public Queue() {
        this.head = this.tail = null;
        this.size = 0;
    }
    
    public void Empty(){
        this.head = this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void Enqueue(int ID, int priority){
        Node newNode = new Node(ID, priority);
        if (this.isEmpty()) {
            this.head = this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        size++;
    }
    
    public Node DequeueLevel(){
        Node newNode = null;
        switch (this.size) {
            case 0:
                break;
            case 1:
                newNode = this.head;
                this.Empty();
                break;
            default:
                newNode = this.head;
                head = head.getNext();
                size--;
                break;
        }
        return newNode;
    }
    public Node DequeuePurgatory(){
        double rand = Math.random()*100;
        Node newNode = null;
        if(rand > 45){
            System.out.println("Fracaso, sigue esperando");
//            newNode = this.head;-----> maybe sirve mejor tenerlo en null?
        }else{
        switch (this.size) {
            case 0:
                break;
            case 1:
                newNode = this.head;
                this.Empty();
                break;
            default:
                newNode = this.head;
                head = head.getNext();
                size--;
                break;
        }
        }
        return newNode;
        
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    
}
