package Classes;

import java.lang.Math;
import Windows.*;

public class Admin {

    public void Admin() {

    }

    public Node FirstConsole() {
        double rand2 = Math.random() * 3;
        Node node = null;
        if (rand2 <= 1) {
            node = new Node(Menu.consoles, 1);
            Menu.consoles++;
        } else if (rand2 <= 2) {
            node = new Node(Menu.consoles, 2);
            Menu.consoles++;
        } else {
            node = new Node(Menu.consoles, 3);
            Menu.consoles++;
            return node;
        }
        Menu.ConsolesCounter.setText(Integer.toString(Menu.consoles));
        return node;
    }

    public Node CreateConsole() {
        double rand = Math.random() * 100;
        double rand2 = Math.random() * 3;
        System.out.println("rand de se crea o no: "+rand);
        Node node = null;
        if (rand <= 70) {
            
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
        }
        
        Menu.ConsolesCounter.setText(Integer.toString(Menu.consoles));
        return node;
    }

    public void AddConsole(Node node) {
        if (node != null) {
            switch (node.getPriority()) {
                case 1:
                Menu.CMD0.setText(Menu.CMD0.getText()+"\n"+"Nueva consola: ID="+node.getID());
                    Menu.priority1.EnqueueNode(node);
                    break;
                case 2:
                Menu.CMD1.setText(Menu.CMD1.getText()+"\n"+"Nueva consola: ID="+node.getID());
                    Menu.priority2.EnqueueNode(node);
                    break;
                case 3:
                Menu.CMD2.setText(Menu.CMD2.getText()+"\n"+"Nueva consola: ID="+node.getID());
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
                Menu.CMD0.setText(Menu.CMD0.getText()+"\n"+"Retirada consola: ID="+node.getID());
            
        } else if (!Menu.priority2.isEmpty()) {
            node = Menu.priority2.Dequeue();
                Menu.CMD1.setText(Menu.CMD1.getText()+"\n"+"Retirada consola: ID="+node.getID());
        } else if (!Menu.priority3.isEmpty()) {
            node = Menu.priority3.Dequeue();
                Menu.CMD2.setText(Menu.CMD2.getText()+"\n"+"Retirada consola: ID="+node.getID());
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
                    System.out.println("Volvio a su cola");
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
                    System.out.println("a reparar y no es mate");
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
    public void UpdatePriority() {
        Menu.priority1.EnqueueQueue(Menu.priority2.UpdateCounter());
        Menu.priority2.EnqueueQueue(Menu.priority3.UpdateCounter());
    }

}
