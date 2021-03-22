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
            if (Menu.CMDAdmin1.getText().split("\n").length < 12) {
                Menu.CMDAdmin1.setText(Menu.CMDAdmin1.getText() + "Creada consola: " + node.getID() + "\n");
            } else {
                Menu.CMDAdmin1.setText("Creada consola: " + node.getID() + "\n");
            }
            switch (node.getPriority()) {
                case 1:
                    if (Menu.CMD0.getText().split("\n").length < 12) {
                        Menu.CMD0.setText(Menu.CMD0.getText() + "Añadida consola: " + node.getID() + "\n");
                    } else {
                        Menu.CMD0.setText("Añadida consola: " + node.getID() + "\n");
                    }
                    Menu.priority1.EnqueueNode(node);
                    break;
                case 2:
                    if (Menu.CMD1.getText().split("\n").length < 12) {
                        Menu.CMD1.setText(Menu.CMD1.getText() + "Añadida consola: " + node.getID() + "\n");
                    } else {
                        Menu.CMD1.setText("Añadida consola: " + node.getID() + "\n");
                    }
                    Menu.priority2.EnqueueNode(node);
                    break;
                case 3:
                    if (Menu.CMD2.getText().split("\n").length < 12) {
                        Menu.CMD2.setText(Menu.CMD2.getText() + "Añadida consola: " + node.getID() + "\n");
                    } else {
                        Menu.CMD2.setText("Añadida consola: " + node.getID() + "\n");
                    }
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
            if (Menu.CMD0.getText().split("\n").length < 12) {
                Menu.CMD0.setText(Menu.CMD0.getText() + "Retirada consola " + node.getID() + "\n");
            } else {
                Menu.CMD0.setText("Retirada consola " + node.getID() + "\n");
            }
        } else if (!Menu.priority2.isEmpty()) {
            node = Menu.priority2.Dequeue();
            if (Menu.CMD1.getText().split("\n").length < 12) {
                Menu.CMD1.setText(Menu.CMD1.getText() + "Retirada consola " + node.getID() + "\n");
            } else {
                Menu.CMD1.setText("Retirada consola " + node.getID() + "\n");
            }
        } else if (!Menu.priority3.isEmpty()) {
            node = Menu.priority3.Dequeue();
            if (Menu.CMD2.getText().split("\n").length < 12) {
                Menu.CMD2.setText(Menu.CMD2.getText() + "Retirada consola " + node.getID() + "\n");
            } else {
                Menu.CMD2.setText("Retirada consola " + node.getID() + "\n");
            }
        } else {
            node = null;
        }
        return node;
    }

    public void ManageCheckedNode(Checked checked) {
        if (checked != null) {
            switch (checked.getAction()) {
                case 0:
                    if (Menu.CMDAdmin1.getText().split("\n").length < 12) {
                        Menu.CMDAdmin1.setText(Menu.CMDAdmin1.getText() + "Vendida consola: " + checked.getNode().getID() + "\n");
                    } else {
                        Menu.CMDAdmin1.setText("Vendida consola: " + checked.getNode().getID() + "\n");
                    }
                    break;
                case 1:
                    switch (checked.getNode().getPriority()) {
                        case 1:
                            if (Menu.CMD0.getText().split("\n").length < 12) {
                                Menu.CMD0.setText(Menu.CMD0.getText() + "Añadida consola: " + checked.getNode().getID() + "\n");
                            } else {
                                Menu.CMD0.setText("Añadida consola: " + checked.getNode().getID() + "\n");
                            }
                            Menu.priority1.EnqueueNode(checked.getNode());
                            break;
                        case 2:
                            if (Menu.CMD1.getText().split("\n").length < 12) {
                                Menu.CMD1.setText(Menu.CMD1.getText() + "Añadida consola: " + checked.getNode().getID() + "\n");
                            } else {
                                Menu.CMD1.setText("Añadida consola: " + checked.getNode().getID() + "\n");
                            }
                            Menu.priority2.EnqueueNode(checked.getNode());
                            break;
                        case 3:
                            if (Menu.CMD2.getText().split("\n").length < 12) {
                                Menu.CMD2.setText(Menu.CMD2.getText() + "Añadida consola: " + checked.getNode().getID() + "\n");
                            } else {
                                Menu.CMD2.setText("Añadida consola: " + checked.getNode().getID() + "\n");
                            }
                            Menu.priority3.EnqueueNode(checked.getNode());
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    if (Menu.CMDRepair.getText().split("\n").length < 12) {
                        Menu.CMDRepair.setText(Menu.CMDRepair.getText() + "Añadida consola: " + checked.getNode().getID() + "\n");
                    } else {
                        Menu.CMDRepair.setText("Añadida consola: " + checked.getNode().getID() + "\n");
                    }
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
            if (Menu.CMDRepair.getText().split("\n").length < 12) {
                Menu.CMDRepair.setText(Menu.CMDRepair.getText() + "Retirada consola: " + node.getID() + "\n");
            } else {
                Menu.CMDRepair.setText("Retirada consola: " + node.getID() + "\n");
            }
            if (rand <= 45) {
                switch (node.getPriority()) {
                    case 1:
                        if (Menu.CMD0.getText().split("\n").length < 12) {
                            Menu.CMD0.setText(Menu.CMD0.getText() + "Reparada consola: " + node.getID() + "\n");
                        } else {
                            Menu.CMD0.setText("Reparada consola: " + node.getID() + "\n");
                        }
                        Menu.priority1.EnqueueNode(node);
                        break;
                    case 2:
                        if (Menu.CMD1.getText().split("\n").length < 12) {
                            Menu.CMD1.setText(Menu.CMD1.getText() + "Reparada consola: " + node.getID() + "\n");
                        } else {
                            Menu.CMD1.setText("Reparada consola: " + node.getID() + "\n");
                        }
                        Menu.priority2.EnqueueNode(node);
                        break;
                    case 3:
                        if (Menu.CMD2.getText().split("\n").length < 12) {
                            Menu.CMD2.setText(Menu.CMD2.getText() + "Reparada consola: " + node.getID() + "\n");
                        } else {
                            Menu.CMD2.setText("Reparada consola: " + node.getID() + "\n");
                        }
                        Menu.priority3.EnqueueNode(node);
                        break;
                    default:
                        break;
                }
            } else {
                if (Menu.CMDRepair.getText().split("\n").length < 12) {
                    Menu.CMDRepair.setText(Menu.CMDRepair.getText() + "Añadida consola: " + node.getID() + "\n");
                } else {
                    Menu.CMDRepair.setText("Añadida consola: " + node.getID() + "\n");
                }
                Menu.purgatory.EnqueueNode(node);
            }
        }
    }

    public void UpdatePriority() {
        String string;
        String[] strings;
        string = Menu.priority1.EnqueueQueue(Menu.priority2.UpdateCounter());
        if (!string.equals("")) {
            strings = string.split(",");
            for (int i = 0; i < strings.length; i++) {
                if (Menu.CMD0.getText().split("\n").length < 12) {
                    Menu.CMD0.setText(Menu.CMD0.getText() + "Priority UP: " + strings[i] + "\n");
                } else {
                    Menu.CMD0.setText("Priority UP: " + strings[i] + "\n");
                }
            }
        }
        string = Menu.priority2.EnqueueQueue(Menu.priority3.UpdateCounter());
        if (!string.equals("")) {
            strings = string.split(",");
            for (int i = 0; i < strings.length; i++) {
                if (Menu.CMD1.getText().split("\n").length < 12) {
                    Menu.CMD1.setText(Menu.CMD1.getText() + "Priority UP: " + strings[i] + "\n");
                } else {
                    Menu.CMD1.setText("Priority UP: " + strings[i] + "\n");
                }
            }
        }
    }

}
