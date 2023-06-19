/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam;

import static Exam.verification.veri;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hahahahah
 */
public class manage extends javax.swing.JFrame {

    /**
     * Creates new form manage
     */
    ImageIcon icon;

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public manage() {
        initComponents();
//        icon = new ImageIcon ("G:\\Exam Application\\Exam\\src\\Exam\\images\\logolast.png");
//        setIconImage(icon.getImage()); 
        setResizable(false);
        comboBox();
        String ques = mQuestion.getText();
        String Am = mA.getText();
        String Bm = mB.getText();
        String Cm = mC.getText();
        String Dm = mD.getText();
        String ans = answer.getText();
        String sub1 = subject.getText();
    }

    private void comboBox() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "");
            String sql = "SELECT * FROM questions ORDER BY `Q No.` ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("Q No.");
                num1.addItem(name);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mQuestion1 = new javax.swing.JScrollPane();
        mQuestion = new javax.swing.JTextArea();
        mD = new javax.swing.JTextField();
        mA = new javax.swing.JTextField();
        mB = new javax.swing.JTextField();
        createNew = new javax.swing.JLabel();
        mC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        num1 = new javax.swing.JComboBox<>();
        reset1 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        delete1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        getContentPane().setLayout(null);

        mQuestion1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        mQuestion.setColumns(20);
        mQuestion.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        mQuestion.setRows(5);
        mQuestion1.setViewportView(mQuestion);

        getContentPane().add(mQuestion1);
        mQuestion1.setBounds(230, 80, 500, 110);

        mD.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mD);
        mD.setBounds(410, 300, 260, 30);

        mA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mA);
        mA.setBounds(70, 230, 260, 30);

        mB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBActionPerformed(evt);
            }
        });
        getContentPane().add(mB);
        mB.setBounds(70, 300, 260, 30);

        createNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/CREATE_NEW.png"))); // NOI18N
        createNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewMouseClicked(evt);
            }
        });
        getContentPane().add(createNew);
        createNew.setBounds(250, 430, 130, 50);

        mC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mC);
        mC.setBounds(410, 230, 260, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("D.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 300, 30, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel2.setText("A.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 230, 30, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel3.setText("B.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 300, 30, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel6.setText("C.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 230, 30, 30);

        jLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel.setText("ANSWER:");
        getContentPane().add(jLabel);
        jLabel.setBounds(180, 360, 80, 40);

        answer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(answer);
        answer.setBounds(270, 370, 230, 30);

        num.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        getContentPane().add(num);
        num.setBounds(140, 80, 70, 40);

        num1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        num1.setToolTipText("");
        num1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                num1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        getContentPane().add(num1);
        num1.setBounds(20, 80, 90, 40);

        reset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/RESET1.png"))); // NOI18N
        reset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset1MouseClicked(evt);
            }
        });
        getContentPane().add(reset1);
        reset1.setBounds(410, 430, 130, 50);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/UPDATE1.png"))); // NOI18N
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(550, 430, 130, 50);

        delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/DELETE1.png"))); // NOI18N
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });
        getContentPane().add(delete1);
        delete1.setBounds(90, 430, 130, 50);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/Buttons/BACK.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 480, 60, 40);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel8.setText("SUBJECT");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 140, 80, 30);

        subject.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        subject.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });
        getContentPane().add(subject);
        subject.setBounds(100, 140, 110, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/images/log2.JPG"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 0, 60, 60);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel5.setText("Exam");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 0, 80, 50);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel7.setText("Snap");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(110, -10, 70, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exam/images/backg7.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-30, 50, 890, 520);

        setSize(new java.awt.Dimension(851, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mBActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_subjectActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_num1ActionPerformed

    private void num1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_num1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            String tmp = (String) num1.getSelectedItem();
            con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "");
            String sql = "SELECT * FROM `questions` WHERE `Q No.` = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, tmp);
            rs = ps.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("Q No.");
                num.setText(add1);
                String add2 = rs.getString("QUESTION");
                mQuestion.setText(add2);
                String add3 = rs.getString("A");
                mA.setText(add3);
                String add4 = rs.getString("B");
                mB.setText(add4);
                String add5 = rs.getString("C");
                mC.setText(add5);
                String add6 = rs.getString("D");
                mD.setText(add6);
                String add7 = rs.getString("ANSWER");
                answer.setText(add7);
                String add8 = rs.getString("SUBJECT");
                subject.setText(add8);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_num1PopupMenuWillBecomeInvisible

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM `questions` WHERE `Q No.`= ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/exam", "root", "");
            ps = con.prepareStatement(sql);
            ps.setString(1, num1.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted successfully");
            int index = num1.getSelectedIndex();
            num1.removeItemAt(index);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        num.setText("");
        mQuestion.setText("");
        mA.setText("");
        mB.setText("");
        mC.setText("");
        mD.setText("");
        answer.setText("");
    }//GEN-LAST:event_delete1MouseClicked

    private void reset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset1MouseClicked
        // TODO add your handling code here:
        mQuestion.setText("");
        mA.setText("");
        mB.setText("");
        mC.setText("");
        mD.setText("");
        answer.setText("");
    }//GEN-LAST:event_reset1MouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:

        String No = num.getText();
        String ques = mQuestion.getText();
        String Am = mA.getText();
        String Bm = mB.getText();
        String Cm = mC.getText();
        String Dm = mD.getText();
        String ans = answer.getText();
        String sub = subject.getText();

        PreparedStatement ps;
        String query = "INSERT INTO `questions`(`Q No.`, `QUESTION`, `A`, `B`, `C`, `D`, `ANSWER`,`SUBJECT`) VALUES (?,?,?,?,?,?,?,?)";

        try {
            ps = myConnection.getConnection().prepareStatement(query);

            ps.setString(1, No);
            ps.setString(2, ques);
            ps.setString(3, Am);
            ps.setString(4, Bm);
            ps.setString(5, Cm);
            ps.setString(6, Dm);
            ps.setString(7, ans);
            ps.setString(8, sub);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Question Updated.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(manage.class.getName()).log(Level.SEVERE, null, ex);
        }
        num1.addItem(num.getText());

//        try{
//            String submitQuery = "UPDATE `questions` SET `SUBJECT` = ? WHERE SUBJECT IS NULL";
//            String scr = subject.getText();
//            con = DriverManager.getConnection("jdbc:mysql://localhost/exam","root","");
//            ps = con.prepareStatement(submitQuery);
//            ps.setString(1, subject.getText());
//            ps.executeUpdate(); 
//         }catch (Exception ex){
//            JOptionPane.showMessageDialog(this,ex.getMessage());
//    }
    }//GEN-LAST:event_updateMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        admin a = new admin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void createNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewMouseClicked
        // TODO add your handling code here:
        manage m = new manage();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createNewMouseClicked

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
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField answer;
    private javax.swing.JLabel back;
    private javax.swing.JLabel createNew;
    private javax.swing.JLabel delete1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField mA;
    public javax.swing.JTextField mB;
    public javax.swing.JTextField mC;
    private javax.swing.JTextField mD;
    public javax.swing.JTextArea mQuestion;
    private javax.swing.JScrollPane mQuestion1;
    private javax.swing.JTextField num;
    public static javax.swing.JComboBox<String> num1;
    private javax.swing.JLabel reset1;
    public static javax.swing.JTextField subject;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
