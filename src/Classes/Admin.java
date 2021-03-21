package Classes;

import java.lang.Math;
import Windows.*;

public class Admin {

    public void Admin() {

    }

    public Node FirstConsole() {
        double rand2 = Math.random() * 3;
        Node node = null;
        System.out.println("Va a aniadirse un nuevo auto");
        if (rand2 <= 1) {
            node = new Node(Menu.consoles, 1);
            Menu.consoles++;
        } else if (rand2 <= 2) {
            node = new Node(Menu.consoles, 2);
            Menu.consoles++;
        } else {
            node = new Node(Menu.consoles, 3);
            Menu.consoles++;
            System.out.println("admin");
            return node;
        }
        return node;
    }

    public Node CreateConsole() {
        double rand = Math.random() * 100;
        double rand2 = Math.random() * 3;
        Node node = null;
        if (rand <= 70) {
            System.out.println("Va a aniadirse un nuevo auto");
            if (rand2 <= 1) {
                node = new Node(Menu.consoles, 1);
                Menu.consoles++;
            } else if (rand2 <= 2) {
                node = new Node(Menu.consoles, 2);
                Menu.consoles++;
            } else {
                node = new Node(Menu.consoles, 3);
                Menu.consoles++;
            }
        } else {
            System.out.println("No toca agregar auto");
        }
        System.out.println("admin");
        return node;
    }

    public void AddConsole(Node node) {
        if (node != null) {
            switch (node.getPriority()) {
                case 1:
                    Menu.priority1.EnqueueNode(node);
                    break;
                case 2:
                    Menu.priority2.EnqueueNode(node);
                    break;
                case 3:
                    Menu.priority3.EnqueueNode(node);
                    break;
                default:
                    break;
            }
        }
    }

    public Node SelectConsole() {
        Node node;
        if (!Menu.priority1.isEmpty()) {
            node = Menu.priority1.Dequeue();
        } else if (!Menu.priority2.isEmpty()) {
            node = Menu.priority2.Dequeue();
        } else if (!Menu.priority3.isEmpty()) {
            node = Menu.priority3.Dequeue();
        } else {
            node = null;
        }
        return node;
    }

    public void ManageCheckedNode(Checked checked) {
        if (checked != null) {
            switch (checked.getAction()) {
                case 0:
                    System.out.println("Mercado");
                    break;
                case 1:
                    switch (checked.getNode().getPriority()) {
                        case 1:
                            Menu.priority1.EnqueueNode(checked.getNode());
                            break;
                        case 2:
                            Menu.priority2.EnqueueNode(checked.getNode());
                            break;
                        case 3:
                            Menu.priority3.EnqueueNode(checked.getNode());
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    Menu.purgatory.EnqueueNode(checked.getNode());
                    break;
                default:
                    break;
            }
        }
    }

    public void RepairConsole() {
        if (!Menu.purgatory.isEmpty()) {
            double rand = Math.random() * 100;
            Node node = Menu.purgatory.Dequeue();
            if (rand <= 45) {
                switch (node.getPriority()) {
                    case 1:
                        Menu.priority1.EnqueueNode(node);
                        break;
                    case 2:
                        Menu.priority2.EnqueueNode(node);
                        break;
                    case 3:
                        Menu.priority3.EnqueueNode(node);
                        break;
                    default:
                        break;
                }
            } else {
                Menu.purgatory.EnqueueNode(node);
            }
            System.out.println("admin");
        }
    }

}
