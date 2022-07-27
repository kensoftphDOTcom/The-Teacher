package theteacher;

import KentHipos.AnimationKen;
import java.io.File;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import java.util.Timer;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Kent
 */
public class Correct_it_panel extends javax.swing.JPanel {

    public ImageIcon ii;
    public AnimationKen animate = new AnimationKen();
    int counter = 10;
    public File sound;
    public Clip c;

    public Correct_it_panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name_it_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        play_canvas = new javax.swing.JPanel();
        rambled_word = new javax.swing.JLabel();
        correct_img = new javax.swing.JLabel();
        text_correct = new javax.swing.JTextField();
        time_label = new javax.swing.JLabel();
        score_label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        question_label = new javax.swing.JLabel();
        button_play = new javax.swing.JLabel();
        play_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(null);

        name_it_panel.setBackground(new java.awt.Color(102, 102, 102));
        name_it_panel.setMaximumSize(new java.awt.Dimension(570, 400));
        name_it_panel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        play_canvas.setBackground(new java.awt.Color(102, 102, 102));
        play_canvas.setLayout(null);

        rambled_word.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        rambled_word.setForeground(new java.awt.Color(255, 255, 255));
        rambled_word.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rambled_word.setText("Correct it");
        play_canvas.add(rambled_word);
        rambled_word.setBounds(0, 70, 530, 30);

        correct_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correct_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/picture.png"))); // NOI18N
        play_canvas.add(correct_img);
        correct_img.setBounds(160, 100, 210, 200);

        text_correct.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        text_correct.setForeground(new java.awt.Color(102, 102, 102));
        text_correct.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_correct.setBorder(null);
        play_canvas.add(text_correct);
        text_correct.setBounds(160, 310, 210, 30);

        time_label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        time_label.setForeground(new java.awt.Color(255, 255, 255));
        time_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/time.png"))); // NOI18N
        time_label.setText("Time");
        time_label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        play_canvas.add(time_label);
        time_label.setBounds(140, 10, 80, 50);

        score_label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        score_label.setForeground(new java.awt.Color(255, 255, 255));
        score_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        score_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/score.png"))); // NOI18N
        score_label.setText("0");
        score_label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        play_canvas.add(score_label);
        score_label.setBounds(330, 10, 100, 50);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        play_canvas.add(jSeparator1);
        jSeparator1.setBounds(320, 10, 10, 50);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        play_canvas.add(jSeparator2);
        jSeparator2.setBounds(230, 10, 10, 50);

        question_label.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        question_label.setForeground(new java.awt.Color(255, 255, 255));
        question_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        question_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/questions.png"))); // NOI18N
        question_label.setText("1/10");
        question_label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        play_canvas.add(question_label);
        question_label.setBounds(240, 10, 70, 50);

        jPanel1.add(play_canvas);
        play_canvas.setBounds(10, 380, 530, 360);

        button_play.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        button_play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/play1.png"))); // NOI18N
        button_play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_playMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_playMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_playMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_playMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_playMouseReleased(evt);
            }
        });
        jPanel1.add(button_play);
        button_play.setBounds(220, 150, 110, 80);

        play_label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        play_label.setForeground(new java.awt.Color(102, 102, 102));
        play_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(play_label);
        play_label.setBounds(0, 330, 550, 50);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Correct it");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 550, 50);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("You'll have 10 seconds to answer each rambled word.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 70, 550, 40);

        name_it_panel.add(jPanel1);
        jPanel1.setBounds(10, 11, 550, 380);

        add(name_it_panel);
        name_it_panel.setBounds(0, 0, 570, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void button_playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_playMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            play_clicked();
        }
    }//GEN-LAST:event_button_playMouseClicked

    private void button_playMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_playMouseEntered
        hover_sound();
        play_entered();
    }//GEN-LAST:event_button_playMouseEntered

    private void button_playMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_playMouseExited
        play_exited();
    }//GEN-LAST:event_button_playMouseExited

    private void button_playMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_playMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            play_pressed();
        }
    }//GEN-LAST:event_button_playMousePressed

    private void button_playMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_playMouseReleased
        play_released();
    }//GEN-LAST:event_button_playMouseReleased

    //METHODS
    public void play_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/play2.png"));
        button_play.setIcon(ii);
        play_label.setText("Play");
    }

    public void play_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/play1.png"));
        button_play.setIcon(ii);
        play_label.setText("");
    }

    public void play_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/play1.png"));
        button_play.setIcon(ii);
    }

    public void play_released() {
        ii = new ImageIcon(getClass().getResource("/resources/play2.png"));
        button_play.setIcon(ii);
    }

    public void play_clicked() {
        animate.jPanelYUp(380, 10, 1, 1, play_canvas);
        text_correct.requestFocus();
        int j = JOptionPane.showConfirmDialog(this, "Are you ready?", "Ready", JOptionPane.YES_NO_OPTION);
        if (j == 0) {
            timer();
            button_play.setVisible(false);
        } else {
            animate.jPanelYDown(10, 380, 1, 1, play_canvas);
        }
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
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                time_label.setText(Integer.toString(counter) + " sec");
                counter--;
                if (counter == -1) {
                    t.cancel();
                    animate.jPanelYDown(10, 380, 1, 1, play_canvas);
                    button_play.setVisible(true);
                }
            }
        };
        t.scheduleAtFixedRate(tt, 1000, 1000);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button_play;
    private javax.swing.JLabel correct_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JPanel name_it_panel;
    private javax.swing.JPanel play_canvas;
    private javax.swing.JLabel play_label;
    private javax.swing.JLabel question_label;
    private javax.swing.JLabel rambled_word;
    private javax.swing.JLabel score_label;
    private javax.swing.JTextField text_correct;
    private javax.swing.JLabel time_label;
    // End of variables declaration//GEN-END:variables
}
