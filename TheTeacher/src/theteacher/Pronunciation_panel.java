package theteacher;

/**
 *
 * @author Kent
 */
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import KentHipos.AnimationKen;
import java.sql.*;
import java.util.Random;

public class Pronunciation_panel extends javax.swing.JPanel {

    public ImageIcon ii;
    public Clip c;
    public File sound;
    public AnimationKen animate = new AnimationKen();
    public Connection connection = null;
    public Statement statement = null;
    public ResultSet resultset = null;
    public String sql = "", random_value;
    public TextToSpeech tts = new TextToSpeech();
    public String voice = "cmu-rms-hsmm";

    public Pronunciation_panel() {
        initComponents();
        next_word();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pronunciation_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        custom_panel = new javax.swing.JPanel();
        button_collapse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        custom_text_area = new javax.swing.JTextArea();
        button_pronounce = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttons_panel = new javax.swing.JPanel();
        button_custom = new javax.swing.JLabel();
        button_next = new javax.swing.JLabel();
        button_speak = new javax.swing.JLabel();
        word_to_pronounce = new javax.swing.JLabel();
        button_information = new javax.swing.JLabel();
        button_listen = new javax.swing.JLabel();
        listening_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(570, 400));
        setMinimumSize(new java.awt.Dimension(570, 400));
        setPreferredSize(new java.awt.Dimension(570, 400));
        setLayout(null);

        pronunciation_panel.setBackground(new java.awt.Color(102, 102, 102));
        pronunciation_panel.setMaximumSize(new java.awt.Dimension(570, 400));
        pronunciation_panel.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        custom_panel.setBackground(new java.awt.Color(102, 102, 102));
        custom_panel.setLayout(null);

        button_collapse.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        button_collapse.setForeground(new java.awt.Color(255, 255, 255));
        button_collapse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_collapse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/collpase1.png"))); // NOI18N
        button_collapse.setText("Collapse");
        button_collapse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_collapse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_collapse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_collapse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_collapseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_collapseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_collapseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_collapseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_collapseMouseReleased(evt);
            }
        });
        custom_panel.add(button_collapse);
        button_collapse.setBounds(240, 10, 60, 60);

        custom_text_area.setColumns(20);
        custom_text_area.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        custom_text_area.setLineWrap(true);
        custom_text_area.setRows(5);
        custom_text_area.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Custom text", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        jScrollPane1.setViewportView(custom_text_area);

        custom_panel.add(jScrollPane1);
        jScrollPane1.setBounds(30, 80, 470, 180);

        button_pronounce.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        button_pronounce.setForeground(new java.awt.Color(255, 255, 255));
        button_pronounce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_pronounce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pronounce1.png"))); // NOI18N
        button_pronounce.setText("Pronounce");
        button_pronounce.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_pronounce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_pronounce.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_pronounce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_pronounceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_pronounceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_pronounceMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_pronounceMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_pronounceMouseReleased(evt);
            }
        });
        custom_panel.add(button_pronounce);
        button_pronounce.setBounds(220, 270, 90, 80);

        jPanel1.add(custom_panel);
        custom_panel.setBounds(10, 380, 530, 360);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("How to pronounce the italic word");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 80, 550, 30);

        buttons_panel.setBackground(new java.awt.Color(102, 102, 102));
        buttons_panel.setLayout(null);

        button_custom.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        button_custom.setForeground(new java.awt.Color(255, 255, 255));
        button_custom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_custom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/custom1.png"))); // NOI18N
        button_custom.setText("Custom text");
        button_custom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_custom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_custom.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_custom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_customMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_customMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_customMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_customMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_customMouseReleased(evt);
            }
        });
        buttons_panel.add(button_custom);
        button_custom.setBounds(140, 10, 80, 80);

        button_next.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        button_next.setForeground(new java.awt.Color(255, 255, 255));
        button_next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/next1.png"))); // NOI18N
        button_next.setText("Next word");
        button_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_next.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_next.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_nextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_nextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_nextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_nextMouseReleased(evt);
            }
        });
        buttons_panel.add(button_next);
        button_next.setBounds(330, 10, 70, 80);

        button_speak.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        button_speak.setForeground(new java.awt.Color(255, 255, 255));
        button_speak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_speak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/speak1.png"))); // NOI18N
        button_speak.setText("Pronounce");
        button_speak.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_speak.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_speak.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_speak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_speakMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_speakMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_speakMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_speakMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_speakMouseReleased(evt);
            }
        });
        buttons_panel.add(button_speak);
        button_speak.setBounds(240, 10, 70, 80);

        jPanel1.add(buttons_panel);
        buttons_panel.setBounds(10, 270, 530, 100);

        word_to_pronounce.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        word_to_pronounce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word_to_pronounce.setText("word");
        jPanel1.add(word_to_pronounce);
        word_to_pronounce.setBounds(0, 120, 550, 30);

        button_information.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/information1.png"))); // NOI18N
        button_information.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_information.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_informationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_informationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_informationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_informationMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_informationMouseReleased(evt);
            }
        });
        jPanel1.add(button_information);
        button_information.setBounds(510, 230, 30, 30);

        button_listen.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        button_listen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_listen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/listen1.png"))); // NOI18N
        button_listen.setText("Listen");
        button_listen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_listen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button_listen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_listen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_listenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_listenMouseReleased(evt);
            }
        });
        jPanel1.add(button_listen);
        button_listen.setBounds(240, 180, 70, 80);

        listening_label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        listening_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listening_label.setText("Teacher");
        jPanel1.add(listening_label);
        listening_label.setBounds(0, 10, 550, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pronounced word");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 40, 550, 30);

        pronunciation_panel.add(jPanel1);
        jPanel1.setBounds(10, 11, 550, 380);

        add(pronunciation_panel);
        pronunciation_panel.setBounds(0, 0, 570, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void button_customMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_customMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            custom_clicked();
        }
    }//GEN-LAST:event_button_customMouseClicked

    private void button_customMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_customMouseEntered
        custom_entered();
    }//GEN-LAST:event_button_customMouseEntered

    private void button_customMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_customMouseExited
        custom_exited();
    }//GEN-LAST:event_button_customMouseExited

    private void button_speakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_speakMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            pronounce_clicked();
        }
    }//GEN-LAST:event_button_speakMouseClicked

    private void button_speakMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_speakMouseEntered
        speak_entered();
    }//GEN-LAST:event_button_speakMouseEntered

    private void button_speakMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_speakMouseExited
        speak_exited();
    }//GEN-LAST:event_button_speakMouseExited

    private void button_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nextMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            next_clicked();
        }
    }//GEN-LAST:event_button_nextMouseClicked

    private void button_nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nextMouseEntered
        next_entered();
    }//GEN-LAST:event_button_nextMouseEntered

    private void button_nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nextMouseExited
        next_exited();
    }//GEN-LAST:event_button_nextMouseExited

    private void button_customMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_customMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            custom_pressed();
        }
    }//GEN-LAST:event_button_customMousePressed

    private void button_customMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_customMouseReleased
        custom_released();
    }//GEN-LAST:event_button_customMouseReleased

    private void button_speakMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_speakMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            speak_pressed();
        }
    }//GEN-LAST:event_button_speakMousePressed

    private void button_speakMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_speakMouseReleased
        speak_released();
    }//GEN-LAST:event_button_speakMouseReleased

    private void button_nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nextMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            next_pressed();
        }
    }//GEN-LAST:event_button_nextMousePressed

    private void button_nextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_nextMouseReleased
        next_released();
    }//GEN-LAST:event_button_nextMouseReleased

    private void button_collapseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_collapseMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            collapse_clicked();
        }
    }//GEN-LAST:event_button_collapseMouseClicked

    private void button_collapseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_collapseMouseEntered
        collapse_entered();
        hover_sound();
    }//GEN-LAST:event_button_collapseMouseEntered

    private void button_collapseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_collapseMouseExited
        collapse_exited();
    }//GEN-LAST:event_button_collapseMouseExited

    private void button_collapseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_collapseMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            collapse_pressed();
        }
    }//GEN-LAST:event_button_collapseMousePressed

    private void button_collapseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_collapseMouseReleased
        collapse_released();
    }//GEN-LAST:event_button_collapseMouseReleased

    private void button_pronounceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_pronounceMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            sound_click();
            custom_pronounce();
        }
    }//GEN-LAST:event_button_pronounceMouseClicked

    private void button_pronounceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_pronounceMouseEntered
        pronounce_entered();
        hover_sound();
    }//GEN-LAST:event_button_pronounceMouseEntered

    private void button_pronounceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_pronounceMouseExited
        pronounce_exited();
    }//GEN-LAST:event_button_pronounceMouseExited

    private void button_pronounceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_pronounceMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            pronounce_pressed();
        }
    }//GEN-LAST:event_button_pronounceMousePressed

    private void button_pronounceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_pronounceMouseReleased
        pronounce_released();
    }//GEN-LAST:event_button_pronounceMouseReleased

    private void button_informationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_informationMouseClicked
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            information_clicked();
        }
    }//GEN-LAST:event_button_informationMouseClicked

    private void button_informationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_informationMouseEntered
        information_entered();
    }//GEN-LAST:event_button_informationMouseEntered

    private void button_informationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_informationMouseExited
        information_exited();
    }//GEN-LAST:event_button_informationMouseExited

    private void button_informationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_informationMousePressed
        if (!evt.isAltDown() && !evt.isMetaDown()) {
            information_pressed();
        }
    }//GEN-LAST:event_button_informationMousePressed

    private void button_informationMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_informationMouseReleased
        information_released();
    }//GEN-LAST:event_button_informationMouseReleased

    private void button_listenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_listenMousePressed
        listen_pressed();
    }//GEN-LAST:event_button_listenMousePressed

    private void button_listenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_listenMouseReleased
        listen_released();
    }//GEN-LAST:event_button_listenMouseReleased

    //METHODS
    public void custom_clicked() {
        try {
            animate.jPanelYUp(380, 10, 1, 1, custom_panel);
            custom_text_area.requestFocus();
            buttons_panel.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void custom_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/custom2.png"));
        button_custom.setIcon(ii);
        button_custom.setToolTipText("Custom Pronunciation");
        hover_sound();
    }

    public void custom_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/custom1.png"));
        button_custom.setIcon(ii);
        button_custom.setToolTipText("");
    }

    public void custom_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/custom1.png"));
        button_custom.setIcon(ii);
    }

    public void custom_released() {
        ii = new ImageIcon(getClass().getResource("/resources/custom2.png"));
        button_custom.setIcon(ii);
    }

    public void speak_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/speak2.png"));
        button_speak.setIcon(ii);
        button_speak.setToolTipText("Speak");
        hover_sound();
    }

    public void speak_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/speak1.png"));
        button_speak.setIcon(ii);
        button_speak.setToolTipText("");
    }

    public void speak_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/speak1.png"));
        button_speak.setIcon(ii);
    }

    public void speak_released() {
        ii = new ImageIcon(getClass().getResource("/resources/speak2.png"));
        button_speak.setIcon(ii);
    }

    public void next_clicked() {
        next_word();
    }

    public void next_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/next2.png"));
        button_next.setIcon(ii);
        button_next.setToolTipText("Next pronunciations");
        hover_sound();
    }

    public void next_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/next1.png"));
        button_next.setIcon(ii);
        button_next.setToolTipText("");
    }

    public void next_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/next1.png"));
        button_next.setIcon(ii);
    }

    public void next_released() {
        ii = new ImageIcon(getClass().getResource("/resources/next2.png"));
        button_next.setIcon(ii);
    }

    public void collapse_clicked() {
        animate.jPanelYDown(10, 380, 1, 1, custom_panel);
        buttons_panel.setVisible(true);
        custom_text_area.setText("");
    }

    public void collapse_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/collapse2.png"));
        button_collapse.setIcon(ii);
        button_collapse.setToolTipText("Collapse");
    }

    public void collapse_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/collpase1.png"));
        button_collapse.setIcon(ii);
        button_collapse.setToolTipText("");
    }

    public void collapse_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/collpase1.png"));
        button_collapse.setIcon(ii);
    }

    public void collapse_released() {
        ii = new ImageIcon(getClass().getResource("/resources/collapse2.png"));
        button_collapse.setIcon(ii);
    }

    public void pronounce_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/pronounce2.png"));
        button_pronounce.setIcon(ii);
        button_pronounce.setToolTipText("Pronounce");
    }

    public void pronounce_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/pronounce1.png"));
        button_pronounce.setIcon(ii);
        button_pronounce.setToolTipText("");
    }

    public void pronounce_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/pronounce1.png"));
        button_pronounce.setIcon(ii);
    }

    public void pronounce_released() {
        ii = new ImageIcon(getClass().getResource("/resources/pronounce2.png"));
        button_pronounce.setIcon(ii);
    }

    public void pronounce_clicked() {
        pronounce_default_word();
    }

    public void information_entered() {
        ii = new ImageIcon(getClass().getResource("/resources/information2.png"));
        button_information.setIcon(ii);
    }

    public void information_exited() {
        ii = new ImageIcon(getClass().getResource("/resources/information1.png"));
        button_information.setIcon(ii);
    }

    public void information_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/information1.png"));
        button_information.setIcon(ii);
    }

    public void information_released() {
        ii = new ImageIcon(getClass().getResource("/resources/information2.png"));
        button_information.setIcon(ii);
    }

    public void information_clicked() {
        JOptionPane.showMessageDialog(this, "To pronounce the displayed word, "
                + "\npress the button LISTEN and use \nthe microphone of your computer. "
                + "\nSo the system can hear your voice.", "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    }

    public void listen_pressed() {
        ii = new ImageIcon(getClass().getResource("/resources/listen2.png"));
        button_listen.setIcon(ii);
        button_listen.setText("Listening");
        listening_label.setText("Teacher is listening right now");
    }

    public void listen_released() {
        ii = new ImageIcon(getClass().getResource("/resources/listen1.png"));
        button_listen.setIcon(ii);
        button_listen.setText("Listen");
        listening_label.setText("Teacher");
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

    public void custom_pronounce() {
        if (!custom_text_area.getText().trim().equals("")) {
            tts.setVoice(voice);
            tts.speak(custom_text_area.getText(), 2.0f, false, true);
            tts.stopSpeaking();
        } else {
            tts.setVoice(voice);
            tts.speak("Before you click pronounce button, Please type anything in custom text area.", 2.0f, false, true);
            tts.stopSpeaking();
        }
    }

    public void database_connection() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Kent\\Desktop\\The Teacher\\teacher.db");
            //JOptionPane.showMessageDialog(this, "Connected");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    public void next_word() {
        try {
            database_connection();
            random_word();
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            sql = "select * from pronunciation where id='" + random_value + "'";
            resultset = statement.executeQuery(sql);
            if (resultset.next()) {
                String word = resultset.getString("word");
                word_to_pronounce.setText("\"" + word + "\"");
            } else {
                JOptionPane.showMessageDialog(this, "No word to pronounce", "Word", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Next word: " + e);
        }
    }

    public void random_word() {
        Random random = new Random();
        int code = random.nextInt(20) + 1;
        random_value = String.valueOf(code);
    }

    public void pronounce_default_word() {
        tts.setVoice(voice);
        tts.speak(word_to_pronounce.getText(), 2.0f, false, true);
        tts.stopSpeaking();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel button_collapse;
    private javax.swing.JLabel button_custom;
    private javax.swing.JLabel button_information;
    private javax.swing.JLabel button_listen;
    private javax.swing.JLabel button_next;
    private javax.swing.JLabel button_pronounce;
    private javax.swing.JLabel button_speak;
    private javax.swing.JPanel buttons_panel;
    private javax.swing.JPanel custom_panel;
    private javax.swing.JTextArea custom_text_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listening_label;
    public javax.swing.JPanel pronunciation_panel;
    private javax.swing.JLabel word_to_pronounce;
    // End of variables declaration//GEN-END:variables
}
