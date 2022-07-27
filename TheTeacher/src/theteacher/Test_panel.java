package theteacher;

import KentHipos.AnimationKen;
import javax.swing.ImageIcon;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Kent
 */
public class Test_panel extends javax.swing.JPanel {

    public ImageIcon ii;
    public AnimationKen animate = new AnimationKen();
    public File sound;
    public Clip c;
    int counter = 10;
    public Timer timer = new Timer();

    public Test_panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        test_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        test_play_canvas = new javax.swing.JPanel();
        time_label = new javax.swing.JLabel();
        question_label = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        score_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_test = new javax.swing.JLabel();
        test_label = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(null);

        test_panel.setBackground(new java.awt.Color(102, 102, 102));
        test_panel.setMaximumSize(new java.awt.Dimension(570, 400));
        test_panel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        test_play_canvas.setBackground(new java.awt.Color(102, 102, 102));
        test_play_canvas.setLayout(null);

        time_label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        time_label.setForeground(new java.awt.Color(255, 255, 255));
        time_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/time.png"))); // NOI18N
        time_label.setText("Time");
        time_label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        test_play_canvas.add(time_label);
        time_label.setBounds(140, 10, 80, 50);

        question_label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        question_label.setForeground(new java.awt.Color(255, 255, 255));
        question_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/questions.png"))); // NOI18N
        question_label.setText("1/10");
        question_label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        test_play_canvas.add(question_label);
        question_label.setBounds(240, 10, 70, 50);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        test_play_canvas.add(jSeparator2);
        jSeparator2.setBounds(230, 10, 10, 50);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        test_play_canvas.add(jSeparator1);
        jSeparator1.setBounds(320, 10, 10, 50);

        score_label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        score_label.setForeground(new java.awt.Color(255, 255, 255));
        score_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        score_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/score.png"))); // NOI18N
        score_label.setText("0");
        score_label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        test_play_canvas.add(score_label);
        score_label.setBounds(330, 10, 100, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Question");
        test_play_canvas.add(jLabel3);
        jLabel3.setBounds(0, 90, 530, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        test_play_canvas.add(jPanel2);
        jPanel2.setBounds(20, 130, 490, 210);

        jPanel1.add(test_play_canvas);
        test_play_canvas.setBounds(550, 10, 530, 360);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("You'll have 10 seconds to answer each question.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 70, 550, 40);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Test");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 550, 50);

        button_test.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_test.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test1.png"))); // NOI18N
        button_test.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_testMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_testMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_testMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_testMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_testMouseReleased(evt);
            }
        });
        jPanel1.add(button_test);
        button_test.setBounds(230, 150, 90, 80);

        test_label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        test_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(test_label);
        test_label.setBounds(0, 340, 550, 40);

        test_panel.add(jPanel1);
        jPanel1.setBounds(10, 11, 550, 380);

        add(test_panel);
        test_panel.setBounds(0, 0, 570, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void button_testMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_testMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            test_clicked();
        }
    }//GEN-LAST:event_button_testMouseClicked

    private void button_testMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_testMouseEntered
        hover_sound();
        test_entered();
    }//GEN-LAST:event_button_testMouseEntered

    private void button_testMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_testMouseExited
        test_exited();
    }//GEN-LAST:event_button_testMouseExited

    private void button_testMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_testMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            test_pressed();
        }
    }//GEN-LAST:event_button_testMousePressed

    private void button_testMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_testMouseReleased
        test_released();
    }//GEN-LAST:event_button_testMouseReleased

    //METHODS
    public void test_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/test2.png"));
        button_test.setIcon(ii);
        test_label.setText("Play");
    }

    public void test_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/test1.png"));
        button_test.setIcon(ii);
        test_label.setText("");
    }

    public void test_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/test1.png"));
        button_test.setIcon(ii);
    }

    public void test_released() {
        ii = new ImageIcon(getClass().getResource("/resources/test2.png"));
        button_test.setIcon(ii);
    }

    public void test_clicked() {
        animate.jPanelXLeft(550, 10, 1, 1, test_play_canvas);
        button_test.setVisible(false);
        timer();
    }

    public void sound_click() {
        try {
            sound = new File("C:\\Users\\Kent\\Desktop\\The Teacher\\sound\\click.wav");
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void hover_sound() {
        try {
            sound = new File("C:\\Users\\Kent\\Desktop\\The Teacher\\sound\\btn_hov.wav");
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void timer() {
        TimerTask tt = new TimerTask() {
            public void run() {
                time_label.setText(Integer.toString(counter) + " sec");
                counter--;
                if (counter == -1) {
                    timer.cancel();
                    animate.jPanelXRight(10, 550, 1, 1, test_play_canvas);
                    button_test.setVisible(true);
                }
            }
        };
        timer.scheduleAtFixedRate(tt, 1000, 1000);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button_test;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel question_label;
    private javax.swing.JLabel score_label;
    private javax.swing.JLabel test_label;
    public javax.swing.JPanel test_panel;
    private javax.swing.JPanel test_play_canvas;
    private javax.swing.JLabel time_label;
    // End of variables declaration//GEN-END:variables
}
