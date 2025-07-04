import connection.DatabaseConnection;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Matheesha Anjana
 */
public class subjectForm extends javax.swing.JFrame {

    /**
     * Creates new form subjectForm
     */
    public subjectForm() {
        initComponents();
        loadSubjectData();
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
        jLabel2 = new javax.swing.JLabel();
        txtSubjectName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnUpdateSubject = new javax.swing.JButton();
        btnclearSubject = new javax.swing.JButton();
        btnDeleteSubject = new javax.swing.JButton();
        btnAddSubject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSubjectId1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlSubjectDetails = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(5, 8, 28));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Subject ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtSubjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtSubjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Subject Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        btnUpdateSubject.setBackground(new java.awt.Color(255, 204, 0));
        btnUpdateSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSubject.setText("Update");
        btnUpdateSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSubjectActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 290, -1));

        btnclearSubject.setBackground(new java.awt.Color(5, 8, 28));
        btnclearSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnclearSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnclearSubject.setText("Clear");
        btnclearSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclearSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearSubjectActionPerformed(evt);
            }
        });
        jPanel1.add(btnclearSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 290, -1));

        btnDeleteSubject.setBackground(new java.awt.Color(255, 204, 0));
        btnDeleteSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeleteSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSubject.setText("Delete");
        btnDeleteSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteSubjectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteSubjectMouseExited(evt);
            }
        });
        btnDeleteSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSubjectActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 290, -1));

        btnAddSubject.setBackground(new java.awt.Color(255, 204, 0));
        btnAddSubject.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddSubject.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSubject.setText("Add");
        btnAddSubject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSubjectActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 290, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Subject Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));
        jPanel1.add(txtSubjectId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 350, 490));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSubjectDetails.setBackground(new java.awt.Color(5, 8, 28));
        pnlSubjectDetails.setForeground(new java.awt.Color(255, 255, 255));
        pnlSubjectDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pnlSubjectDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSubjectDetailsMouseClicked(evt);
            }
        });
        pnlSubjectDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnlSubjectDetailsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(pnlSubjectDetails);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 440));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 520, 490));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-back-24.png"))); // NOI18N
        jLabel6.setText("Student Grade Management System");
        jLabel6.setIconTextGap(20);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        jLabel7.setBackground(new java.awt.Color(0, 8, 28));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-account-24.png"))); // NOI18N
        jLabel7.setText("Welcome, Admin");
        jLabel7.setIconTextGap(6);
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public boolean validateForm(){
     boolean status = false;
     if(txtSubjectName.getText().equals(""))
     {
       status = true;
     }
     return status;
    }
    
    private void loadSubjectData() {
    DefaultTableModel model = (DefaultTableModel) pnlSubjectDetails.getModel();

    // ✅ Set column headers
    model.setColumnIdentifiers(new String[] {
        "Subject ID", "Subject Name"
    });

    model.setRowCount(0); // clear existing data

    try {
        Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM subject";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String id = rs.getString("subject_id");
            String name = rs.getString("subject_name");

            model.addRow(new Object[]{id, name});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading subject data: " + e.getMessage());
    }
}

    private void btnUpdateSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSubjectActionPerformed
            if (validateForm()) {
        JOptionPane.showMessageDialog(rootPane, "Please fill all fields");
    } else {
        try {
            Connection con = DatabaseConnection.getConnection();
            String sql = "UPDATE subject SET subject_name = ? WHERE subject_id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, txtSubjectName.getText().trim());
            stmt.setString(2, txtSubjectId1.getText().trim());

            int result = stmt.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(rootPane, "Data updated successfully");
                loadSubjectData();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Update failed. ID may not exist.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
        }
    }                              // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSubjectActionPerformed

    private void btnclearSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearSubjectActionPerformed
        txtSubjectId1.setText("");
        txtSubjectName.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_btnclearSubjectActionPerformed

    private void btnDeleteSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSubjectActionPerformed
        String id = txtSubjectId1.getText().trim();
    if (id.equals("")) {
        JOptionPane.showMessageDialog(rootPane, "Please enter Student ID to delete");
    } else {
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete this student?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                Connection con = DatabaseConnection.getConnection();
                String sql = "DELETE FROM subject WHERE subject_id = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, id);

                int result = stmt.executeUpdate();

                if (result > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Student deleted successfully");
                    loadSubjectData();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Delete failed. ID not found.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
            }
        }
    }   // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteSubjectActionPerformed

    private void btnAddSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSubjectActionPerformed
        if(validateForm())
        {
            JOptionPane.showMessageDialog(rootPane,""+"Please fill all");
        }else
        {
            Connection con = DatabaseConnection.getConnection();
            if(validateForm())
        {
            JOptionPane.showMessageDialog(rootPane,""+"Please fill all");
        }else
        {
            try{
                
                String sql = "INSERT INTO subject (subject_name) VALUES (?)";
                PreparedStatement stmt =con.prepareStatement(sql);
                stmt = con.prepareStatement(sql);
                stmt.setString(1, txtSubjectName.getText().trim());

                int result = stmt.executeUpdate();

                if(result >0)
                {
                    JOptionPane.showMessageDialog(rootPane,"Data saved");
                    loadSubjectData();
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Data saved faild");
                }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane,""+e);
            }
        }
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnAddSubjectActionPerformed

    private void txtSubjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectNameActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dashboardForm obj0 = new dashboardForm();
        obj0.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void btnDeleteSubjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteSubjectMouseEntered
    btnDeleteSubject.setBackground(Color.RED);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteSubjectMouseEntered

    private void btnDeleteSubjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteSubjectMouseExited
     btnDeleteSubject.setBackground(new Color(255, 204, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteSubjectMouseExited
    public void Tabledata(){
    int row = pnlSubjectDetails.getSelectedRow();
        txtSubjectId1.setText(pnlSubjectDetails.getValueAt(row, 0).toString());
        txtSubjectName.setText(pnlSubjectDetails.getValueAt(row, 1).toString());        
    }
    private void pnlSubjectDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubjectDetailsMouseClicked
        Tabledata();// TODO add your handling code here:
    }//GEN-LAST:event_pnlSubjectDetailsMouseClicked

    private void pnlSubjectDetailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlSubjectDetailsKeyReleased
      Tabledata();        // TODO add your handling code here:
    }//GEN-LAST:event_pnlSubjectDetailsKeyReleased

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
            java.util.logging.Logger.getLogger(subjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subjectForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subjectForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSubject;
    private javax.swing.JButton btnDeleteSubject;
    private javax.swing.JButton btnUpdateSubject;
    private javax.swing.JButton btnclearSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pnlSubjectDetails;
    private javax.swing.JTextField txtSubjectId1;
    private javax.swing.JTextField txtSubjectName;
    // End of variables declaration//GEN-END:variables
}
