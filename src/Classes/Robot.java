package Classes;

import java.lang.Math;
import Classes.*;

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
            node.setCounter(0);
            double rand = Math.random() * 100;
            System.out.println("This time rand: " + rand);
            if (rand <= 30) {
                checked = new Checked(node, 0);
                System.out.println("Se va pal mercao");
            } else if (rand > 30 && rand <= 80) {
                checked = new Checked(node, 1);
                System.out.println("No estoy seguro, a revision");
            } else {
                checked = new Checked(node, 2);
                System.out.println("Ta chimba, a mejoras");
            }
        }
        return checked;
    }
}
