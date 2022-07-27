package theteacher;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Kent
 */
public class Splash extends javax.swing.JFrame {

    private Task task;

    public Splash() {
        initComponents();
        task = new Task();
        task.execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        splash_progress = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMaximumSize(new java.awt.Dimension(500, 400));
        Background.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png"))); // NOI18N
        Background.add(jLabel1);
        jLabel1.setBounds(20, 260, 50, 50);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("The Teacher");
        Background.add(jLabel2);
        jLabel2.setBounds(10, 340, 130, 30);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Background.add(jPanel1);
        jPanel1.setBounds(10, 0, 480, 10);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Background.add(jPanel2);
        jPanel2.setBounds(0, 0, 10, 400);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Background.add(jPanel3);
        jPanel3.setBounds(490, 0, 10, 400);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Background.add(jPanel4);
        jPanel4.setBounds(10, 390, 480, 10);

        splash_progress.setBackground(new java.awt.Color(255, 255, 255));
        splash_progress.setBorderPainted(false);
        splash_progress.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        splash_progress.setFocusable(false);
        splash_progress.setVerifyInputWhenFocusTarget(false);
        Background.add(splash_progress);
        splash_progress.setBounds(20, 370, 460, 10);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/The teacher.png"))); // NOI18N
        Background.add(jLabel3);
        jLabel3.setBounds(10, 10, 480, 280);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Copyright © 2019 Kensoft");
        Background.add(jLabel4);
        jLabel4.setBounds(330, 350, 150, 20);

        loading.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        loading.setForeground(new java.awt.Color(102, 102, 102));
        loading.setText("Loading....");
        Background.add(loading);
        loading.setBounds(140, 350, 240, 14);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kensoft.png"))); // NOI18N
        Background.add(jLabel5);
        jLabel5.setBounds(20, 311, 148, 30);

        getContentPane().add(Background);
        Background.setBounds(0, 0, 500, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    //Task
    class Task extends SwingWorker<Void, Void> {

        @Override
        public Void doInBackground() {
            Random ran = new Random();
            int progress = 0;
            setProgress(0);
            while (progress <= 100) {
                try {
                    Thread.sleep(ran.nextInt(1000));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(Splash.this, e);
                }
                progress += ran.nextInt(10);
                setProgress(Math.min(progress, 100));
                splash_progress.setValue(progress);
                loading.setText("Loading " + Integer.toString(progress) + "%");
                if (progress <= 10) {
                    loading.setText("Loading The Teacher " + Integer.toString(progress) + "%");
                } else if (progress <= 25) {
                    loading.setText("Loading Design " + Integer.toString(progress) + "%");
                } else if (progress <= 35) {
                    loading.setText("Loading System AI " + Integer.toString(progress) + "%");
                } else if (progress <= 45) {
                    loading.setText("Loading System resources " + Integer.toString(progress) + "%");
                } else if (progress <= 65) {
                    loading.setText("Loading " + Integer.toString(progress) + "%");
                } else if (progress <= 85) {
                    loading.setText("Almost done " + Integer.toString(progress) + "%");
                } else if (progress <= 95) {
                    loading.setText("Getting Started " + Integer.toString(progress) + "%");
                } else if (progress >= 100) {
                    loading.setText("Done" + Integer.toString(progress) + "%");
                    Splash.this.dispose();
                    try {
                        Thread.sleep(500);
                        Main_teacher show = new Main_teacher();
                        show.setVisible(true);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Splash.this, e);
                    }

                }
            }
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel loading;
    private javax.swing.JProgressBar splash_progress;
    // End of variables declaration//GEN-END:variables
}
