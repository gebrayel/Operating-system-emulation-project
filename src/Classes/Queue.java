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
    
    public void Empty() {
        this.head = this.tail = null;
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void Enqueue(int ID, int priority) {
        Node newNode = new Node(ID, priority);
        if (this.isEmpty()) {
            this.head = this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        size++;
    }
    
    public void EnqueueNode(Node node) {
        if (this.isEmpty()) {
            this.head = this.tail = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
        size++;
    }
    
    public Node Dequeue() {
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
    
    public Queue UpdateCounter() {
        Queue aux = new Queue();
        for (int i = 0; i < size; i++) {
            Node auxNode = this.Dequeue();
            auxNode.setCounter(auxNode.getCounter() + 1);
            auxNode.setNext(null);
            if (auxNode.getCounter() < 15) {
                this.EnqueueNode(auxNode);
            }else{
                auxNode.setCounter(0);
                aux.EnqueueNode(auxNode);
            }
        }
        return aux;
    }
    
    public String EnqueueQueue(Queue queue){
        String string = "";
        while(!queue.isEmpty()){
            Node node = queue.Dequeue();
            node.updatePriority();
            string += Integer.toString(node.getID()) + ",";
            this.EnqueueNode(node);
        }
        return string;
    }
    
    public Node DequeuePurgatory() {
        double rand = Math.random() * 100;
        Node newNode = null;
        if (rand > 45) {
            System.out.println("Fracaso, sigue esperando");
//            newNode = this.head;-----> maybe sirve mejor tenerlo en null?
        } else {
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
    
    public String PrintQueue(){
        String string = "";
        for (int i = 0; i < size; i++) {
            Node node = this.Dequeue();
            node.setNext(null);
            if (i == 0) {
                string = Integer.toString(node.getID());
            }else{
                string += "->" + Integer.toString(node.getID());
            }
            this.EnqueueNode(node);
        }
        return string;
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
