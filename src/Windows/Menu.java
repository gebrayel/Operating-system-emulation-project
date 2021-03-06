package Windows;

import Classes.*;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public static volatile int consoles;

    public static volatile Queue priority1;
    public static volatile Queue priority2;
    public static volatile Queue priority3;
    public static volatile Queue purgatory;

    private boolean start;
    public static void printQueues(){
        Menu.Queue1.setText(Menu.priority1.PrintQueue());
        Menu.Queue2.setText(Menu.priority2.PrintQueue());
        Menu.Queue3.setText(Menu.priority3.PrintQueue());
        Menu.Queue4.setText(Menu.purgatory.PrintQueue());
    }
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.consoles = 0;

        this.priority1 = new Queue();
        this.priority2 = new Queue();
        this.priority3 = new Queue();
        this.purgatory = new Queue();

        this.start = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        StartButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ConsolesCounter = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RobotConsole = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CMD1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CMD2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Queue1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        CMDRepair = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        CMD0 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        CMDAdmin1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        Queue2 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        Queue3 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        Queue4 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StartButton.setText("Start");
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(StartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 650, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 204, 153));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consola en Robot");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 46));

        ConsolesCounter.setBackground(new java.awt.Color(0, 204, 153));
        ConsolesCounter.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        ConsolesCounter.setForeground(new java.awt.Color(255, 51, 51));
        ConsolesCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConsolesCounter.setText("0");
        ConsolesCounter.setOpaque(true);
        jPanel1.add(ConsolesCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 110, 50));

        jLabel2.setBackground(new java.awt.Color(0, 204, 153));
        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consolas creadas");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, 46));

        RobotConsole.setBackground(new java.awt.Color(0, 204, 153));
        RobotConsole.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        RobotConsole.setForeground(new java.awt.Color(255, 51, 51));
        RobotConsole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RobotConsole.setText("VAGUEANDO");
        RobotConsole.setOpaque(true);
        jPanel1.add(RobotConsole, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 110, 50));

        CMD1.setEditable(false);
        CMD1.setBackground(new java.awt.Color(0, 0, 0));
        CMD1.setColumns(2);
        CMD1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        CMD1.setForeground(new java.awt.Color(0, 204, 153));
        CMD1.setRows(5);
        CMD1.setFocusable(false);
        jScrollPane1.setViewportView(CMD1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 140, 240));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Prioridad 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Prioridad 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Admin");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Purgatorio");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Prioridad 1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, -1));

        CMD2.setEditable(false);
        CMD2.setBackground(new java.awt.Color(0, 0, 0));
        CMD2.setColumns(2);
        CMD2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        CMD2.setForeground(new java.awt.Color(0, 204, 153));
        CMD2.setRows(5);
        CMD2.setFocusable(false);
        jScrollPane2.setViewportView(CMD2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 140, 240));

        Queue1.setEditable(false);
        Queue1.setBackground(new java.awt.Color(0, 0, 0));
        Queue1.setColumns(1);
        Queue1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        Queue1.setForeground(new java.awt.Color(0, 204, 153));
        Queue1.setRows(1);
        Queue1.setFocusable(false);
        jScrollPane3.setViewportView(Queue1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 520, 40));

        CMDRepair.setEditable(false);
        CMDRepair.setBackground(new java.awt.Color(0, 0, 0));
        CMDRepair.setColumns(2);
        CMDRepair.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        CMDRepair.setForeground(new java.awt.Color(0, 204, 153));
        CMDRepair.setRows(5);
        CMDRepair.setFocusable(false);
        jScrollPane4.setViewportView(CMDRepair);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 140, 240));

        CMD0.setEditable(false);
        CMD0.setBackground(new java.awt.Color(0, 0, 0));
        CMD0.setColumns(2);
        CMD0.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        CMD0.setForeground(new java.awt.Color(0, 204, 153));
        CMD0.setRows(5);
        CMD0.setFocusable(false);
        jScrollPane6.setViewportView(CMD0);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, 240));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COLAS DEL ADMIN");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 140, 30));

        CMDAdmin1.setEditable(false);
        CMDAdmin1.setBackground(new java.awt.Color(0, 0, 0));
        CMDAdmin1.setColumns(2);
        CMDAdmin1.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        CMDAdmin1.setForeground(new java.awt.Color(0, 204, 153));
        CMDAdmin1.setRows(5);
        CMDAdmin1.setFocusable(false);
        jScrollPane7.setViewportView(CMDAdmin1);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 240));

        Queue2.setEditable(false);
        Queue2.setBackground(new java.awt.Color(0, 0, 0));
        Queue2.setColumns(1);
        Queue2.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        Queue2.setForeground(new java.awt.Color(0, 204, 153));
        Queue2.setRows(1);
        Queue2.setFocusable(false);
        jScrollPane8.setViewportView(Queue2);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 520, 40));

        Queue3.setEditable(false);
        Queue3.setBackground(new java.awt.Color(0, 0, 0));
        Queue3.setColumns(1);
        Queue3.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        Queue3.setForeground(new java.awt.Color(0, 204, 153));
        Queue3.setRows(1);
        Queue3.setFocusable(false);
        jScrollPane9.setViewportView(Queue3);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 520, 40));

        Queue4.setEditable(false);
        Queue4.setBackground(new java.awt.Color(0, 0, 0));
        Queue4.setColumns(1);
        Queue4.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        Queue4.setForeground(new java.awt.Color(0, 204, 153));
        Queue4.setRows(1);
        Queue4.setFocusable(false);
        jScrollPane10.setViewportView(Queue4);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 520, 40));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cola 2");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        jLabel14.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cola 3");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Purgatorio");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel16.setFont(new java.awt.Font("Gill Sans MT", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cola 1");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 153, 153));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/robot head 2.gif"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 102, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/purge head.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 51, 0));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/robot head 2.gif"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/robot head 2.gif"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 0));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/peach 2.gif"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 50, 50));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/peach 2.gif"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 60, 50));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 0));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/dt.gif"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 102, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/peach 2.gif"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 70, 70));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gif robot 3.gif"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -10, 60, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        if (!start) {
            Simulation simulation = new Simulation();
            simulation.start();
            start = true;
        }else{
            JOptionPane.showMessageDialog(null, "Ya empezaste mano");
        }
    }//GEN-LAST:event_StartButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static volatile javax.swing.JTextArea CMD0;
    public static volatile javax.swing.JTextArea CMD1;
    public static volatile javax.swing.JTextArea CMD2;
    public static volatile javax.swing.JTextArea CMDAdmin1;
    public static volatile javax.swing.JTextArea CMDRepair;
    public static volatile javax.swing.JLabel ConsolesCounter;
    public static volatile javax.swing.JTextArea Queue1;
    public static volatile javax.swing.JTextArea Queue2;
    public static volatile javax.swing.JTextArea Queue3;
    public static volatile javax.swing.JTextArea Queue4;
    public static volatile javax.swing.JLabel RobotConsole;
    private javax.swing.JButton StartButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
