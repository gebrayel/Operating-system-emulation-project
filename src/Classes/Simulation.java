package Classes;

import Windows.*;
import java.util.concurrent.Semaphore;

public class Simulation extends Thread {

    private Admin admin;
    private Robot robot;

    public Simulation() {

        this.admin = new Admin();
        this.robot = new Robot();

    }

    public void run() {
        while (true) {
            try {
                admin.AddConsole(admin.FirstConsole());
                for (int j = 0; j < 2; j++) {
                    Thread.sleep(500);
                    Node node = admin.SelectConsole();
                    Checked checked = robot.Check(node);
                    admin.ManageCheckedNode(checked);
                    admin.UpdatePriority();
                    admin.RepairConsole();

                }
                admin.AddConsole(admin.CreateConsole());

            } catch (Exception e) {
            }
        }
    }
}
