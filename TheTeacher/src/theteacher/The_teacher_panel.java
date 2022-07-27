package theteacher;

/**
 *
 * @author Kent
 */
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class The_teacher_panel extends javax.swing.JPanel {

    public ImageIcon ii;
    public Clip c;
    public File sound;

    public The_teacher_panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        the_teacher_mainpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        web = new javax.swing.JLabel();
        paypal = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(null);

        the_teacher_mainpanel.setBackground(new java.awt.Color(102, 102, 102));
        the_teacher_mainpanel.setMaximumSize(new java.awt.Dimension(500, 500));
        the_teacher_mainpanel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(480, 480));
        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/the_teacher210.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 200);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("The Teacher");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 190, 550, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kensoft.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 220, 550, 40);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel4.setText("Developed by Kensoft");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 280, 130, 14);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel5.setText("Copyright © 2019 Kensoft");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 300, 150, 14);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); // NOI18N
        jLabel6.setText("If you donate me through paypal, it really help me to improve this application");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 320, 430, 14);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 380, 480, 0);

        web.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        web.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/website1.png"))); // NOI18N
        web.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        web.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                webMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                webMouseExited(evt);
            }
        });
        jPanel1.add(web);
        web.setBounds(40, 340, 30, 30);

        paypal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/paypal1.png"))); // NOI18N
        paypal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paypal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paypalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paypalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paypalMouseExited(evt);
            }
        });
        jPanel1.add(paypal);
        paypal.setBounds(10, 340, 30, 30);

        status.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(status);
        status.setBounds(370, 360, 170, 20);

        the_teacher_mainpanel.add(jPanel1);
        jPanel1.setBounds(10, 10, 550, 380);

        add(the_teacher_mainpanel);
        the_teacher_mainpanel.setBounds(0, 0, 570, 400);

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void paypalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paypalMouseEntered
        paypal_entered();
    }//GEN-LAST:event_paypalMouseEntered

    private void paypalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paypalMouseExited
        paypal_exited();
    }//GEN-LAST:event_paypalMouseExited

    private void paypalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paypalMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            paypal_click();
        }
    }//GEN-LAST:event_paypalMouseClicked

    private void webMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webMouseEntered
        website_entered();
    }//GEN-LAST:event_webMouseEntered

    private void webMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webMouseExited
        website_exited();
    }//GEN-LAST:event_webMouseExited

    private void webMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            website_click();
        }
    }//GEN-LAST:event_webMouseClicked

    //METHODS
    public void paypal_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/paypal2.png"));
        paypal.setIcon(ii);
        status.setText("www.paypal.me/kensoft");
        hover_sound();
    }

    public void paypal_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/paypal1.png"));
        paypal.setIcon(ii);
        status.setText("");
    }

    public void website_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/website2.png"));
        web.setIcon(ii);
        status.setText("www.kensoft.ga");
        hover_sound();
    }

    public void website_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/website1.png"));
        web.setIcon(ii);
        status.setText("");
    }

    public void hover_sound() {
        try {
            sound = new File("C:\\Users\\Kent\\Desktop\\The Teacher\\sound\\pop.wav");
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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

    public void paypal_click() {
        site_runtime run = new site_runtime();
        run.execute("www.paypal.me/kensoft");
    }

    public void website_click() {
        site_runtime run = new site_runtime();
        run.execute("www.kensoft.ga");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel paypal;
    private javax.swing.JLabel status;
    public javax.swing.JPanel the_teacher_mainpanel;
    private javax.swing.JLabel web;
    // End of variables declaration//GEN-END:variables
}
