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
        admin.AddConsole(admin.FirstConsole());
        Menu.printQueues();
        while (true) {
            try {
                for (int j = 0; j < 2; j++) {
                    Node node = admin.SelectConsole();
                    Menu.printQueues();
                    Thread.sleep(1000);
                    Checked checked = robot.Check(node);
                    Thread.sleep(5000);
                    admin.ManageCheckedNode(checked);
                    Menu.printQueues();
                    admin.UpdatePriority();
                    Menu.printQueues();
                    admin.RepairConsole();
                    Menu.printQueues();

                    Menu.RobotConsole.setText(("VAGUEANDO"));
                    /*Nuevamente capricho mio quiero que se vea el vagueando, lo siento*/
                    Thread.sleep(1000);
                }
                admin.AddConsole(admin.CreateConsole());
                Menu.printQueues();

            } catch (Exception e) {
            }
        }
    }
}
