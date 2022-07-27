package theteacher;

import javax.swing.ImageIcon;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Kent
 */
public class User_name extends javax.swing.JPanel {

    public ImageIcon ii;
    public File sound;
    public Clip c;
    public Connection connection = null;
    public Statement statement = null;
    public String sql = "";
    public ResultSet resultset = null;

    public User_name() {
        initComponents();
        button_name.setVisible(false);
        text_name.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_name_panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        text_name = new javax.swing.JTextField();
        button_name = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(null);

        user_name_panel.setBackground(new java.awt.Color(102, 102, 102));
        user_name_panel.setMaximumSize(new java.awt.Dimension(570, 400));
        user_name_panel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Hi, You want to learn with me? My name is teacher");
        jPanel2.add(label1);
        label1.setBounds(0, 110, 550, 30);

        label2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("and whose with me?");
        jPanel2.add(label2);
        label2.setBounds(0, 140, 550, 21);

        text_name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        text_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial Rounded MT Bold", 0, 12))); // NOI18N
        text_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_nameKeyTyped(evt);
            }
        });
        jPanel2.add(text_name);
        text_name.setBounds(130, 160, 280, 47);

        button_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/name1.png"))); // NOI18N
        button_name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_nameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_nameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_nameMouseReleased(evt);
            }
        });
        jPanel2.add(button_name);
        button_name.setBounds(240, 210, 70, 70);

        name_label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(name_label);
        name_label.setBounds(0, 350, 550, 30);

        user_name_panel.add(jPanel2);
        jPanel2.setBounds(10, 10, 550, 380);

        add(user_name_panel);
        user_name_panel.setBounds(0, 0, 570, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void button_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nameMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            name_clicked();
        }
    }//GEN-LAST:event_button_nameMouseClicked

    private void button_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nameMouseEntered
        hover_sound();
        name_entered();
    }//GEN-LAST:event_button_nameMouseEntered

    private void button_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nameMouseExited
        name_exited();
    }//GEN-LAST:event_button_nameMouseExited

    private void button_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nameMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            name_pressed();
        }
    }//GEN-LAST:event_button_nameMousePressed

    private void button_nameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nameMouseReleased
        name_released();
    }//GEN-LAST:event_button_nameMouseReleased

    private void text_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_nameKeyTyped
        has_name();
    }//GEN-LAST:event_text_nameKeyTyped

    //METHODS
    public void name_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/name2.png"));
        button_name.setIcon(ii);
        if (text_name.getText().isEmpty()) {
            name_label.setText("");
        } else {
            name_label.setText("Okay " + text_name.getText() + " let's get started");
        }
    }

    public void name_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/name1.png"));
        button_name.setIcon(ii);
        name_label.setText("");
    }

    public void name_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/name1.png"));
        button_name.setIcon(ii);
    }

    public void name_released() {
        ii = new ImageIcon(getClass().getResource("/resources/name2.png"));
        button_name.setIcon(ii);
    }

    public void name_clicked() {
        if (!text_name.getText().trim().isEmpty()) {
            insert_user_name();
        } else {
            JOptionPane.showMessageDialog(this, "What's your name please", "Your name", JOptionPane.INFORMATION_MESSAGE);
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

    public void has_name() {
        if (!text_name.getText().trim().equalsIgnoreCase("")) {
            button_name.setVisible(true);
        } else {
            button_name.setVisible(false);
        }
    }

    public void database_connection() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Kent\\Desktop\\The Teacher\\teacher.db");
            //JOptionPane.showMessageDialog(this, "you're connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void insert_user_name() {
        try {
            database_connection();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            sql = "insert into user (name) values('" + text_name.getText() + "')";
            statement.executeUpdate(sql);
            connection.commit();
            statement.close();
            connection.close();
            button_name.setVisible(false);
            text_name.setVisible(false);
            label1.setText("Hi " + text_name.getText() + ", Thank you for using");
            label2.setText("The Teacher");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Insert user: " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel button_name;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel name_label;
    public javax.swing.JTextField text_name;
    public javax.swing.JPanel user_name_panel;
    // End of variables declaration//GEN-END:variables
}
