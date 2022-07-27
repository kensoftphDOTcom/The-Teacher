package theteacher;

/**
 *
 * @author Kent
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import KentHipos.AnimationKen;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.sql.*;

public class Main_teacher extends javax.swing.JFrame {

    public ImageIcon ii;
    public int x, y, xaxis, yaxis;
    public String name;
    public Font f;
    public AnimationKen animate = new AnimationKen();
    public Clip c;
    public Connection connection = null;
    public ResultSet resultset = null;
    public Statement statement = null;
    public String sql = "";

    public Main_teacher() {
        initComponents();
        database_connection();
        analyze();
        user_close.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        menu_panel = new javax.swing.JPanel();
        user_close = new javax.swing.JPanel();
        user_close_label = new javax.swing.JLabel();
        panel_pronunciation = new javax.swing.JPanel();
        toggle_pronunciation = new javax.swing.JToggleButton();
        panel_correct = new javax.swing.JPanel();
        toggle_correctit = new javax.swing.JToggleButton();
        panel_test = new javax.swing.JPanel();
        toggle_test = new javax.swing.JToggleButton();
        panel_theteacher = new javax.swing.JPanel();
        toggle_theteacher = new javax.swing.JToggleButton();
        panel_canvas = new javax.swing.JPanel();
        canvas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMaximumSize(new java.awt.Dimension(900, 600));
        Background.setLayout(null);

        header.setBackground(new java.awt.Color(102, 102, 102));
        header.setMaximumSize(new java.awt.Dimension(900, 50));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });
        header.setLayout(null);

        title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon.png"))); // NOI18N
        title.setText("The Teacher");
        header.add(title);
        title.setBounds(0, 0, 180, 50);

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize1.png"))); // NOI18N
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        header.add(minimize);
        minimize.setBounds(830, 13, 25, 25);

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close1.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        header.add(close);
        close.setBounds(860, 13, 25, 25);

        Background.add(header);
        header.setBounds(0, 0, 900, 50);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        Background.add(jPanel2);
        jPanel2.setBounds(890, 50, 10, 550);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        Background.add(jPanel3);
        jPanel3.setBounds(0, 50, 10, 550);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        Background.add(jPanel1);
        jPanel1.setBounds(10, 590, 880, 10);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setMaximumSize(new java.awt.Dimension(840, 100));
        jPanel4.setLayout(null);

        welcome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome");
        jPanel4.add(welcome);
        welcome.setBounds(0, 0, 860, 70);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(840, 30));
        jPanel6.setLayout(null);

        status.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(status);
        status.setBounds(0, 0, 840, 30);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(10, 70, 840, 30);

        Background.add(jPanel4);
        jPanel4.setBounds(20, 60, 860, 110);

        menu_panel.setBackground(new java.awt.Color(102, 102, 102));
        menu_panel.setMaximumSize(new java.awt.Dimension(260, 380));
        menu_panel.setLayout(null);

        user_close.setBackground(new java.awt.Color(255, 255, 255));
        user_close.setLayout(null);

        user_close_label.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        user_close_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_close_label.setText("Close");
        user_close_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_close_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_close_labelMouseClicked(evt);
            }
        });
        user_close.add(user_close_label);
        user_close_label.setBounds(0, 0, 280, 70);

        menu_panel.add(user_close);
        user_close.setBounds(0, 0, 280, 70);

        panel_pronunciation.setBackground(new java.awt.Color(102, 102, 102));
        panel_pronunciation.setMaximumSize(new java.awt.Dimension(280, 80));
        panel_pronunciation.setMinimumSize(new java.awt.Dimension(280, 80));
        panel_pronunciation.setLayout(null);

        toggle_pronunciation.setBackground(new java.awt.Color(255, 255, 255));
        toggle_pronunciation.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        toggle_pronunciation.setForeground(new java.awt.Color(255, 255, 255));
        toggle_pronunciation.setText("Pronunciation");
        toggle_pronunciation.setBorderPainted(false);
        toggle_pronunciation.setContentAreaFilled(false);
        toggle_pronunciation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggle_pronunciation.setFocusable(false);
        toggle_pronunciation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggle_pronunciationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toggle_pronunciationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toggle_pronunciationMouseExited(evt);
            }
        });
        panel_pronunciation.add(toggle_pronunciation);
        toggle_pronunciation.setBounds(0, 0, 280, 70);

        menu_panel.add(panel_pronunciation);
        panel_pronunciation.setBounds(0, 50, 280, 70);

        panel_correct.setBackground(new java.awt.Color(102, 102, 102));
        panel_correct.setMaximumSize(new java.awt.Dimension(280, 80));
        panel_correct.setMinimumSize(new java.awt.Dimension(280, 80));
        panel_correct.setPreferredSize(new java.awt.Dimension(280, 80));
        panel_correct.setLayout(null);

        toggle_correctit.setBackground(new java.awt.Color(102, 102, 102));
        toggle_correctit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        toggle_correctit.setForeground(new java.awt.Color(255, 255, 255));
        toggle_correctit.setText("Correct it");
        toggle_correctit.setBorderPainted(false);
        toggle_correctit.setContentAreaFilled(false);
        toggle_correctit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggle_correctit.setFocusable(false);
        toggle_correctit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggle_correctitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toggle_correctitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toggle_correctitMouseExited(evt);
            }
        });
        panel_correct.add(toggle_correctit);
        toggle_correctit.setBounds(0, 0, 280, 70);

        menu_panel.add(panel_correct);
        panel_correct.setBounds(0, 130, 280, 70);

        panel_test.setBackground(new java.awt.Color(102, 102, 102));
        panel_test.setMaximumSize(new java.awt.Dimension(280, 80));
        panel_test.setMinimumSize(new java.awt.Dimension(280, 80));
        panel_test.setPreferredSize(new java.awt.Dimension(280, 80));
        panel_test.setLayout(null);

        toggle_test.setBackground(new java.awt.Color(102, 102, 102));
        toggle_test.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        toggle_test.setForeground(new java.awt.Color(255, 255, 255));
        toggle_test.setText("Test");
        toggle_test.setBorderPainted(false);
        toggle_test.setContentAreaFilled(false);
        toggle_test.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggle_test.setFocusable(false);
        toggle_test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggle_testMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toggle_testMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toggle_testMouseExited(evt);
            }
        });
        panel_test.add(toggle_test);
        toggle_test.setBounds(0, 0, 280, 70);

        menu_panel.add(panel_test);
        panel_test.setBounds(0, 210, 280, 70);

        panel_theteacher.setBackground(new java.awt.Color(102, 102, 102));
        panel_theteacher.setMaximumSize(new java.awt.Dimension(280, 80));
        panel_theteacher.setMinimumSize(new java.awt.Dimension(280, 80));
        panel_theteacher.setPreferredSize(new java.awt.Dimension(280, 80));
        panel_theteacher.setLayout(null);

        toggle_theteacher.setBackground(new java.awt.Color(102, 102, 102));
        toggle_theteacher.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        toggle_theteacher.setForeground(new java.awt.Color(255, 255, 255));
        toggle_theteacher.setText("THE TEACHER");
        toggle_theteacher.setBorderPainted(false);
        toggle_theteacher.setContentAreaFilled(false);
        toggle_theteacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggle_theteacher.setFocusable(false);
        toggle_theteacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggle_theteacherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toggle_theteacherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toggle_theteacherMouseExited(evt);
            }
        });
        panel_theteacher.add(toggle_theteacher);
        toggle_theteacher.setBounds(0, 0, 280, 70);

        menu_panel.add(panel_theteacher);
        panel_theteacher.setBounds(0, 290, 280, 70);

        Background.add(menu_panel);
        menu_panel.setBounds(20, 180, 280, 400);

        panel_canvas.setBackground(new java.awt.Color(102, 102, 102));
        panel_canvas.setMaximumSize(new java.awt.Dimension(560, 380));
        panel_canvas.setLayout(null);

        canvas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        canvas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/abc.png"))); // NOI18N
        panel_canvas.add(canvas);
        canvas.setBounds(0, 0, 570, 400);

        Background.add(panel_canvas);
        panel_canvas.setBounds(310, 180, 570, 400);

        getContentPane().add(Background);
        Background.setBounds(0, 0, 900, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close_entered();
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close_exited();
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            close();
        }
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            minimize();
        }
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize_entered();
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize_exited();
    }//GEN-LAST:event_minimizeMouseExited

    private void toggle_pronunciationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_pronunciationMouseEntered
        pronunciation_entered();
    }//GEN-LAST:event_toggle_pronunciationMouseEntered

    private void toggle_pronunciationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_pronunciationMouseExited
        pronunciation_exited();
    }//GEN-LAST:event_toggle_pronunciationMouseExited

    private void toggle_correctitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_correctitMouseEntered
        correctit_entered();
    }//GEN-LAST:event_toggle_correctitMouseEntered

    private void toggle_correctitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_correctitMouseExited
        correctit_exited();
    }//GEN-LAST:event_toggle_correctitMouseExited

    private void toggle_testMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_testMouseEntered
        test_entered();
    }//GEN-LAST:event_toggle_testMouseEntered

    private void toggle_testMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_testMouseExited
        test_exited();
    }//GEN-LAST:event_toggle_testMouseExited

    private void toggle_theteacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_theteacherMouseEntered
        theteacher_entered();
    }//GEN-LAST:event_toggle_theteacherMouseEntered

    private void toggle_theteacherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_theteacherMouseExited
        theteacher_exited();
    }//GEN-LAST:event_toggle_theteacherMouseExited

    private void toggle_pronunciationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_pronunciationMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            pronunciation_click();
        }
    }//GEN-LAST:event_toggle_pronunciationMouseClicked

    private void toggle_correctitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_correctitMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            correctit_click();
        }
    }//GEN-LAST:event_toggle_correctitMouseClicked

    private void toggle_testMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_testMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            test_click();
        }
    }//GEN-LAST:event_toggle_testMouseClicked

    private void toggle_theteacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggle_theteacherMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            theteacher_click();
        }
    }//GEN-LAST:event_toggle_theteacherMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            x = evt.getX();
            y = evt.getY();
        }
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            xaxis = evt.getXOnScreen();
            yaxis = evt.getYOnScreen();
            this.setLocation(xaxis - x, yaxis - y);
        }
    }//GEN-LAST:event_headerMouseDragged

    private void user_close_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_close_labelMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            click();
            user_panel_close();
        }
    }//GEN-LAST:event_user_close_labelMouseClicked

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
            java.util.logging.Logger.getLogger(Main_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_teacher().setVisible(true);
            }
        });
    }

    //Methods
    public void close_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/close2.png"));
        close.setIcon(ii);
        close.setToolTipText("Close");
        status.setText("Close");
        header_buttons();
    }

    public void close_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/close1.png"));
        close.setIcon(ii);
        close.setToolTipText("");
        status.setText("");
    }

    public void close() {
        click();
        WindowEvent closing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closing);
        System.exit(0);
    }

    public void minimize() {
        this.setState(Main_teacher.ICONIFIED);
        click();
    }

    public void minimize_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/minimize2.png"));
        minimize.setIcon(ii);
        minimize.setToolTipText("Minimize");
        status.setText("Minimize");
        header_buttons();
    }

    public void minimize_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/minimize1.png"));
        minimize.setIcon(ii);
        minimize.setToolTipText("");
        status.setText("");
    }

    public void pronunciation_entered() {
        if (toggle_pronunciation.isSelected()) {
            panel_pronunciation.setBackground(new java.awt.Color(255, 255, 255));
            toggle_pronunciation.setForeground(Color.BLACK);
        } else {
            panel_pronunciation.setBackground(new java.awt.Color(255, 255, 255));
            toggle_pronunciation.setForeground(Color.BLACK);
            ii = new ImageIcon(getClass().getResource("/resources/pronunciation400.png"));
            canvas.setIcon(ii);
            canvas.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        }
        hover_sound();
        status.setText("It will teach you on how to pronounce a word");
    }

    public void pronunciation_exited() {
        if (toggle_pronunciation.isSelected()) {
            panel_pronunciation.setBackground(new java.awt.Color(255, 255, 255));
            toggle_pronunciation.setForeground(Color.BLACK);
        } else {
            panel_pronunciation.setBackground(new java.awt.Color(102, 102, 102));
            toggle_pronunciation.setForeground(Color.WHITE);
            ii = new ImageIcon(getClass().getResource("/resources/abc.png"));
            canvas.setIcon(ii);
            canvas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        }
        status.setText("");
    }

    public void pronunciation_click() {
        if (toggle_pronunciation.isSelected()) {
            panel_pronunciation.setBackground(new java.awt.Color(255, 255, 255));
            toggle_pronunciation.setForeground(Color.BLACK);
            f = new Font("Century Gothic", Font.BOLD, 18);
            toggle_pronunciation.setFont(f);
            animate.jPanelYUp(50, 0, 1, 1, panel_pronunciation);
            panel_correct.setVisible(false);
            panel_test.setVisible(false);
            panel_theteacher.setVisible(false);
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(155);
                        pronunciation_panel_show();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "Pronunciation click show: " + e);
                    }
                }
            }.start();
        } else {
            panel_pronunciation.setBackground(new java.awt.Color(102, 102, 102));
            toggle_pronunciation.setForeground(Color.WHITE);
            f = new Font("Century Gothic", Font.PLAIN, 18);
            toggle_pronunciation.setFont(f);
            animate.jPanelYDown(0, 50, 1, 1, panel_pronunciation);
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(155);
                        panel_correct.setVisible(true);
                        panel_test.setVisible(true);
                        panel_theteacher.setVisible(true);
                        pronunciation_panel_hide();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "Pronunciation click hide: " + e);
                    }
                }
            }.start();
        }
        click();
    }

    public void correctit_entered() {
        if (toggle_correctit.isSelected()) {
            panel_correct.setBackground(new java.awt.Color(255, 255, 255));
            toggle_correctit.setForeground(Color.BLACK);
        } else {
            panel_correct.setBackground(new java.awt.Color(255, 255, 255));
            toggle_correctit.setForeground(Color.BLACK);
            ii = new ImageIcon(getClass().getResource("/resources/nameit400.png"));
            canvas.setIcon(ii);
        }
        hover_sound();
        status.setText("You'll have to correct the rambled word");
    }

    public void correctit_exited() {
        if (toggle_correctit.isSelected()) {
            panel_correct.setBackground(new java.awt.Color(255, 255, 255));
            toggle_correctit.setForeground(Color.BLACK);
        } else {
            panel_correct.setBackground(new java.awt.Color(102, 102, 102));
            toggle_correctit.setForeground(Color.WHITE);
            ii = new ImageIcon(getClass().getResource("/resources/abc.png"));
            canvas.setIcon(ii);
        }
        status.setText("");
    }

    public void correctit_click() {
        if (toggle_correctit.isSelected()) {
            panel_correct.setBackground(new java.awt.Color(255, 255, 255));
            toggle_correctit.setForeground(Color.BLACK);
            f = new Font("Century Gothic", Font.BOLD, 18);
            toggle_correctit.setFont(f);
            animate.jPanelYUp(130, 0, 1, 1, panel_correct);
            panel_pronunciation.setVisible(false);
            panel_test.setVisible(false);
            panel_theteacher.setVisible(false);
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(230);
                        name_it_show();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "Correct it click show: " + e);
                    }
                }
            }.start();

        } else {
            panel_correct.setBackground(new java.awt.Color(102, 102, 102));
            toggle_correctit.setForeground(Color.WHITE);
            f = new Font("Century Gothic", Font.PLAIN, 18);
            toggle_correctit.setFont(f);
            animate.jPanelYDown(0, 130, 1, 1, panel_correct);
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(230);
                        panel_pronunciation.setVisible(true);
                        panel_test.setVisible(true);
                        panel_theteacher.setVisible(true);
                        name_it_hide();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "Correct it click hide: " + e);
                    }
                }
            }.start();
        }
        click();
    }

    public void test_entered() {
        if (toggle_test.isSelected()) {
            panel_test.setBackground(new java.awt.Color(255, 255, 255));
            toggle_test.setForeground(Color.BLACK);
        } else {
            panel_test.setBackground(new java.awt.Color(255, 255, 255));
            toggle_test.setForeground(Color.BLACK);
            ii = new ImageIcon(getClass().getResource("/resources/test400.png"));
            canvas.setIcon(ii);
        }
        hover_sound();
        status.setText("Test is a multiple choice game");
    }

    public void test_exited() {
        if (toggle_test.isSelected()) {
            panel_test.setBackground(new java.awt.Color(255, 255, 255));
            toggle_test.setForeground(Color.BLACK);
        } else {
            panel_test.setBackground(new java.awt.Color(102, 102, 102));
            toggle_test.setForeground(Color.WHITE);
            ii = new ImageIcon(getClass().getResource("/resources/abc.png"));
            canvas.setIcon(ii);
        }
        status.setText("");
    }

    public void test_click() {
        if (toggle_test.isSelected()) {
            panel_test.setBackground(new java.awt.Color(255, 255, 255));
            toggle_test.setForeground(Color.BLACK);
            f = new Font("Century Gothic", Font.BOLD, 18);
            toggle_test.setFont(f);
            animate.jPanelYUp(210, 0, 1, 1, panel_test);
            panel_pronunciation.setVisible(false);
            panel_correct.setVisible(false);
            panel_theteacher.setVisible(false);
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(310);
                        test_panel_show();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "Test click show: " + e);
                    }
                }
            }.start();
        } else {
            panel_test.setBackground(new java.awt.Color(102, 102, 102));
            toggle_test.setForeground(Color.WHITE);
            f = new Font("Century Gothic", Font.PLAIN, 18);
            toggle_test.setFont(f);
            animate.jPanelYDown(0, 210, 1, 1, panel_test);
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(310);
                        panel_pronunciation.setVisible(true);
                        panel_correct.setVisible(true);
                        panel_theteacher.setVisible(true);
                        test_panel_hide();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "Test click hide: " + e);
                    }
                }
            }.start();
        }
        click();
    }

    public void theteacher_entered() {
        if (toggle_theteacher.isSelected()) {
            panel_theteacher.setBackground(new java.awt.Color(255, 255, 255));
            toggle_theteacher.setForeground(Color.BLACK);
        } else {
            panel_theteacher.setBackground(new java.awt.Color(255, 255, 255));
            toggle_theteacher.setForeground(Color.BLACK);
            ii = new ImageIcon(getClass().getResource("/resources/the_teacher400.png"));
            canvas.setIcon(ii);
        }
        hover_sound();
        status.setText("The teacher is an E-Learning application, Click to see the details");
    }

    public void theteacher_exited() {
        if (toggle_theteacher.isSelected()) {
            panel_theteacher.setBackground(new java.awt.Color(255, 255, 255));
            toggle_theteacher.setForeground(Color.BLACK);
        } else {
            panel_theteacher.setBackground(new java.awt.Color(102, 102, 102));
            toggle_theteacher.setForeground(Color.WHITE);
            ii = new ImageIcon(getClass().getResource("/resources/abc.png"));
            canvas.setIcon(ii);
        }
        status.setText("");
    }

    public void theteacher_click() {
        if (toggle_theteacher.isSelected()) {
            panel_theteacher.setBackground(new java.awt.Color(255, 255, 255));
            toggle_theteacher.setForeground(Color.BLACK);
            f = new Font("Century Gothic", Font.BOLD, 18);
            toggle_theteacher.setFont(f);
            animate.jPanelYUp(290, 0, 1, 1, panel_theteacher);
            panel_pronunciation.setVisible(false);
            panel_correct.setVisible(false);
            panel_test.setVisible(false);
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(390);
                        the_teacher_panel_show();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "The teacher click show: " + e);
                    }
                }
            }.start();
        } else {
            panel_theteacher.setBackground(new java.awt.Color(102, 102, 102));
            toggle_theteacher.setForeground(Color.WHITE);
            f = new Font("Century Gothic", Font.PLAIN, 18);
            toggle_theteacher.setFont(f);
            animate.jPanelYDown(0, 290, 1, 1, panel_theteacher);
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(390);
                        panel_pronunciation.setVisible(true);
                        panel_correct.setVisible(true);
                        panel_test.setVisible(true);
                        the_teacher_panel_hide();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(Main_teacher.this, "The teacher click hide: " + e);
                    }
                }
            }.start();
        }
        click();
    }

    public void hover_sound() {
        try {
            File sound = new File("C:\\Users\\Kent\\Desktop\\The Teacher\\sound\\btn_hov.wav");
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Pop sound: " + e);
        }
    }

    public void click() {
        try {
            File sound = new File("C:\\Users\\Kent\\Desktop\\The Teacher\\sound\\click.wav");
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Click sound: " + e);
        }
    }

    public void header_buttons() {
        try {
            File sound = new File("C:\\Users\\Kent\\Desktop\\The Teacher\\sound\\blop.wav");
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "header sound: " + e);
        }
    }

    public void the_teacher_panel_show() {
        The_teacher_panel show = new The_teacher_panel();
        panel_canvas.add(show.the_teacher_mainpanel);
        canvas.setVisible(false);
    }

    public void the_teacher_panel_hide() {
        panel_canvas.removeAll();
        panel_canvas.add(canvas);
        canvas.setVisible(true);
    }

    public void pronunciation_panel_show() {
        Pronunciation_panel show = new Pronunciation_panel();
        panel_canvas.add(show.pronunciation_panel);
        canvas.setVisible(false);
    }

    public void pronunciation_panel_hide() {
        panel_canvas.removeAll();
        panel_canvas.add(canvas);
        canvas.setVisible(true);
    }

    public void name_it_show() {
        Correct_it_panel show = new Correct_it_panel();
        panel_canvas.add(show.name_it_panel);
        canvas.setVisible(false);
    }

    public void name_it_hide() {
        panel_canvas.removeAll();
        panel_canvas.add(canvas);
        canvas.setVisible(true);
    }

    public void test_panel_show() {
        Test_panel show = new Test_panel();
        panel_canvas.add(show.test_panel);
        canvas.setVisible(false);
    }

    public void test_panel_hide() {
        panel_canvas.removeAll();
        panel_canvas.add(canvas);
        canvas.setVisible(true);
    }

    public void database_connection() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Kent\\Desktop\\The Teacher\\teacher.db");
            //JOptionPane.showMessageDialog(this, "Connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void analyze() {
        new Thread() {
            public void run() {
                try {
                    Thread.sleep(500);
                    check_user();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(Main_teacher.this, e);
                }
            }
        }.start();
    }

    public void menu_buttons_hide() {
        panel_pronunciation.setVisible(false);
        panel_correct.setVisible(false);
        panel_test.setVisible(false);
        panel_theteacher.setVisible(false);
    }

    public void menu_buttons_show() {
        panel_pronunciation.setVisible(true);
        panel_correct.setVisible(true);
        panel_test.setVisible(true);
        panel_theteacher.setVisible(true);
    }

    public void check_user() {
        try {
            database_connection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            sql = "Select * from user where id";
            resultset = statement.executeQuery(sql);
            if (resultset.next()) {
                String welcomeUser = resultset.getString("name");
                welcome.setText("Welcome " + welcomeUser);
            } else {
                User_name access = new User_name();
                panel_canvas.add(access.user_name_panel);
                canvas.setVisible(false);
                menu_buttons_hide();
                user_close.setVisible(true);
            }
            connection.close();
            statement.close();
            resultset.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Check user: " + e);
        }
    }

    public void user_panel_close() {
        try {
            database_connection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            sql = "Select * from user where id";
            resultset = statement.executeQuery(sql);
            if (resultset.next()) {
                String welcomeUser = resultset.getString("name");
                welcome.setText("Welcome " + welcomeUser);
                panel_canvas.removeAll();
                panel_canvas.add(canvas);
                canvas.setVisible(true);
                user_close.setVisible(false);
                menu_buttons_show();
            } else {
                JOptionPane.showMessageDialog(this, "What's your name please", "Your name", JOptionPane.INFORMATION_MESSAGE);
            }
            connection.close();
            statement.close();
            resultset.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Check user: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    public javax.swing.JLabel canvas;
    private javax.swing.JLabel close;
    private javax.swing.JPanel header;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel menu_panel;
    private javax.swing.JLabel minimize;
    public javax.swing.JPanel panel_canvas;
    private javax.swing.JPanel panel_correct;
    private javax.swing.JPanel panel_pronunciation;
    private javax.swing.JPanel panel_test;
    private javax.swing.JPanel panel_theteacher;
    private javax.swing.JLabel status;
    public javax.swing.JLabel title;
    private javax.swing.JToggleButton toggle_correctit;
    private javax.swing.JToggleButton toggle_pronunciation;
    private javax.swing.JToggleButton toggle_test;
    private javax.swing.JToggleButton toggle_theteacher;
    public javax.swing.JPanel user_close;
    private javax.swing.JLabel user_close_label;
    public javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
