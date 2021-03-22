package Classes;

import java.lang.Math;
import Classes.*;
import Windows.Menu;

/**
 *
 * @author gebra
 */
public class Robot {

    public Robot() {

    }

    public Checked Check(Node node) {
        Checked checked = null;
        if (node != null) {
            Menu.RobotConsole.setText(Integer.toString(node.getID()));
            node.setCounter(0);
            double rand = Math.random() * 100;
            if (rand <= 30) {
                checked = new Checked(node, 0);
            } else if (rand > 30 && rand <= 80) {
                checked = new Checked(node, 1);
            } else {
                checked = new Checked(node, 2);
            }
        }
        return checked;
    }
}
