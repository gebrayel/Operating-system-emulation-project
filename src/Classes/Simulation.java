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
                    Checked checked = robot.Check(node);
                    Thread.sleep(5000/5);
                    admin.ManageCheckedNode(checked);
                    admin.UpdatePriority();
                    admin.RepairConsole();
                    
                    Menu.RobotConsole.setText(("VAGUEANDO")); /*Nuevamente capricho mio quiero que se vea el vagueando, lo siento*/
                    Thread.sleep(1000/5);
                    
                    Menu.printQueues();

                }
                admin.AddConsole(admin.CreateConsole());

            } catch (Exception e) {
            }
        }
    }
}
