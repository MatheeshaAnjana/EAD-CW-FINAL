import connection.DatabaseConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Matheesha Anjana
 */
public class dashboardForm extends javax.swing.JFrame {

    /**
     * Creates new form dashboardForm
     */
    public dashboardForm() {
        initComponents();
        loadStudentData();
        loadSubjectData();
        loadResultData();
        loadStudentCount();
        loadSubjectCount();
        
        Timer timer = new Timer(1000, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy / hh:mm:ss a");
        String time = LocalDateTime.now().format(dtf);
        lblLiveTime.setText(time);
    }
});
timer.start();

    }
    private void loadStudentCount() {
    try {
        Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total FROM student";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            int count = rs.getInt("total");
            lblStudentCoubt1.setText("" + count);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading student count: " + e.getMessage());
    }
}
        private void loadSubjectCount() {
    try {
        Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT COUNT(*) AS total FROM subject";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            int count = rs.getInt("total");
            lblSubjectCoubt.setText("" + count);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading student count: " + e.getMessage());
    }
}

    private void loadResultData() {
    
    DefaultTableModel model = (DefaultTableModel) pnlGradeDetail.getModel(); 

    
    model.setColumnIdentifiers(new String[] {
        "Student ID", "Subject ID", "Marks", "Grade"
    });

    model.setRowCount(0); 

    try {
        Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM result_grade ORDER BY student_id DESC";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String studentId = rs.getString("student_id");
            String subjectId = rs.getString("subject_id");
            String grade = rs.getString("grade");
            String marks = rs.getString("marks");

            model.addRow(new Object[]{studentId, subjectId, marks, grade});
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading result data: " + e.getMessage());
    }
}


    
private void loadStudentData() {
    DefaultTableModel model = (DefaultTableModel) pnlStudentDetail.getModel();

    // ✅ Set column headers
    model.setColumnIdentifiers(new String[] {
        "Student ID", "Student Name", "Email", "Phone Number"
    });

    model.setRowCount(0); // clear existing data

    try {
        Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM student ORDER BY student_id DESC";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String id = rs.getString("student_id");
            String name = rs.getString("student_name");
            String email = rs.getString("email");
            String number = rs.getString("phone_number");

            model.addRow(new Object[]{id, name, email, number});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error loading student data: " + e.getMessage());
    }
}

private void loadSubjectData() {
    DefaultTableModel model = (DefaultTableModel) pnlCourseDetail.getModel();

    // ✅ Set column headers
    model.setColumnIdentifiers(new String[] {
        "Subject ID", "Subject Name"
    });

    model.setRowCount(0); // clear existing data

    try {
        Connection con = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM subject ORDER BY subject_id DESC";
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlStudent = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnlSubject = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlGrade = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnlReport = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlRecorrectionlecturer = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlReport2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlCourseDetail = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlStudentDetail = new javax.swing.JTable();
        jSlider1 = new javax.swing.JSlider();
        jScrollPane3 = new javax.swing.JScrollPane();
        pnlGradeDetail = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblSubjectCoubt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblStudentCoubt1 = new javax.swing.JLabel();
        lblLiveTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-more-24.png"))); // NOI18N
        jLabel2.setText("Student Grade Management System");
        jLabel2.setIconTextGap(20);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 30));

        jLabel1.setBackground(new java.awt.Color(0, 8, 28));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-account-24.png"))); // NOI18N
        jLabel1.setText("Welcome, Admin");
        jLabel1.setIconTextGap(6);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

        jPanel2.setBackground(new java.awt.Color(5, 8, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHome.setBackground(new java.awt.Color(5, 8, 28));
        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlHomeMouseClicked(evt);
            }
        });
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-home-24.png"))); // NOI18N
        jLabel3.setText("Home");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setIconTextGap(20);
        pnlHome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        jPanel2.add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 30));

        pnlStudent.setBackground(new java.awt.Color(5, 8, 28));
        pnlStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlStudentMouseClicked(evt);
            }
        });
        pnlStudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-person-24.png"))); // NOI18N
        jLabel4.setText("Student");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setIconTextGap(20);
        pnlStudent.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        jPanel2.add(pnlStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        pnlSubject.setBackground(new java.awt.Color(5, 8, 28));
        pnlSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSubjectMouseClicked(evt);
            }
        });
        pnlSubject.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-book-24.png"))); // NOI18N
        jLabel5.setText("Subject");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setIconTextGap(20);
        pnlSubject.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        jPanel2.add(pnlSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, -1));

        pnlGrade.setBackground(new java.awt.Color(5, 8, 28));
        pnlGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGradeMouseClicked(evt);
            }
        });
        pnlGrade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-grade-24.png"))); // NOI18N
        jLabel6.setText("Grade");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setIconTextGap(20);
        pnlGrade.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        jPanel2.add(pnlGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, -1));

        pnlReport.setBackground(new java.awt.Color(5, 8, 28));
        pnlReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReportMouseClicked(evt);
            }
        });
        pnlReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-report-24.png"))); // NOI18N
        jLabel7.setText("Report");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setIconTextGap(20);
        pnlReport.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        jPanel2.add(pnlReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, -1));

        pnlRecorrectionlecturer.setBackground(new java.awt.Color(5, 8, 28));
        pnlRecorrectionlecturer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRecorrectionlecturerMouseClicked(evt);
            }
        });
        pnlRecorrectionlecturer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-reset-24.png"))); // NOI18N
        jLabel14.setText("Recorrection");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setIconTextGap(20);
        pnlRecorrectionlecturer.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        jPanel2.add(pnlRecorrectionlecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Features");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 50, 20));

        pnlReport2.setBackground(new java.awt.Color(5, 8, 28));
        pnlReport2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReport2MouseClicked(evt);
            }
        });
        pnlReport2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-about-24.png"))); // NOI18N
        jLabel16.setText("About");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.setIconTextGap(20);
        pnlReport2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 30));

        jPanel2.add(pnlReport2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 220, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 500));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCourseDetail.setBackground(new java.awt.Color(0, 8, 28));
        pnlCourseDetail.setForeground(new java.awt.Color(255, 255, 255));
        pnlCourseDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(pnlCourseDetail);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 280, 190));

        pnlStudentDetail.setBackground(new java.awt.Color(0, 8, 28));
        pnlStudentDetail.setForeground(new java.awt.Color(255, 255, 255));
        pnlStudentDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(pnlStudentDetail);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 370, 190));
        jPanel3.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        pnlGradeDetail.setBackground(new java.awt.Color(0, 8, 28));
        pnlGradeDetail.setForeground(new java.awt.Color(255, 255, 255));
        pnlGradeDetail.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(pnlGradeDetail);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 280, 190));

        jLabel9.setBackground(new java.awt.Color(0, 8, 28));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No Of Students");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, 30));

        jLabel10.setBackground(new java.awt.Color(0, 8, 28));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Recent Details");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, 30));

        jPanel5.setBackground(new java.awt.Color(5, 8, 28));
        jPanel5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubjectCoubt.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblSubjectCoubt.setForeground(new java.awt.Color(204, 0, 0));
        lblSubjectCoubt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-book-24.png"))); // NOI18N
        lblSubjectCoubt.setText("0");
        lblSubjectCoubt.setIconTextGap(20);
        jPanel5.add(lblSubjectCoubt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 130, 80));

        jLabel11.setBackground(new java.awt.Color(0, 8, 28));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("No Of Subjects");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Recent Student Details");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel13.setBackground(new java.awt.Color(0, 8, 28));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Recent Subject Details");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, 30));

        jPanel6.setBackground(new java.awt.Color(5, 8, 28));
        jPanel6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudentCoubt1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblStudentCoubt1.setForeground(new java.awt.Color(204, 0, 0));
        lblStudentCoubt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-person-24.png"))); // NOI18N
        lblStudentCoubt1.setText("0");
        lblStudentCoubt1.setIconTextGap(20);
        jPanel6.add(lblStudentCoubt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 60));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 130, 80));

        lblLiveTime.setFont(new java.awt.Font("DS-Digital", 1, 30)); // NOI18N
        lblLiveTime.setForeground(new java.awt.Color(5, 8, 28));
        lblLiveTime.setText("00 : 00 : 00 PM");
        lblLiveTime.setIconTextGap(20);
        jPanel3.add(lblLiveTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 460, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 740, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseClicked
        
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlHomeMouseClicked

    private void pnlStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStudentMouseClicked
        studentForm obj = new studentForm();
        obj.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlStudentMouseClicked

    private void pnlSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSubjectMouseClicked
     subjectForm obj2 = new subjectForm();
    obj2.setVisible(true);
    this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_pnlSubjectMouseClicked

    private void pnlGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGradeMouseClicked
    gradeForm obj3 = new gradeForm();
    obj3.setVisible(true);
    this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_pnlGradeMouseClicked

    private void pnlReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReportMouseClicked
    reportForm obj4 = new reportForm();
    obj4.setVisible(true);
    this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_pnlReportMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    loginForm obj6 = new loginForm();
    obj6.setVisible(true);
     this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pnlRecorrectionlecturerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRecorrectionlecturerMouseClicked
    lectureRecorrectionForm obj8 = new lectureRecorrectionForm();
    obj8.setVisible(true);
    this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_pnlRecorrectionlecturerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pnlReport2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReport2MouseClicked
      aboutForm ob0 = new aboutForm();
      ob0.setVisible(true);
    this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_pnlReport2MouseClicked

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
            java.util.logging.Logger.getLogger(dashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblLiveTime;
    private javax.swing.JLabel lblStudentCoubt1;
    private javax.swing.JLabel lblSubjectCoubt;
    private javax.swing.JTable pnlCourseDetail;
    private javax.swing.JPanel pnlGrade;
    private javax.swing.JTable pnlGradeDetail;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlRecorrectionlecturer;
    private javax.swing.JPanel pnlReport;
    private javax.swing.JPanel pnlReport2;
    private javax.swing.JPanel pnlStudent;
    private javax.swing.JTable pnlStudentDetail;
    private javax.swing.JPanel pnlSubject;
    // End of variables declaration//GEN-END:variables
}
