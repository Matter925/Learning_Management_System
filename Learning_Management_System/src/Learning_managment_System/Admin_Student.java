/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning_managment_System;

import Doctor_Operation.Assignments;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MATTER
 */
public class Admin_Student extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Student
     */
    public Admin_Student() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Add_Student = new javax.swing.JButton();
        Delet_Student = new javax.swing.JButton();
        Update_Data = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID_Search = new javax.swing.JTextField();
        Search_ID = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        StudentID = new javax.swing.JTextField();
        Student_Level = new javax.swing.JTextField();
        Student_Password = new javax.swing.JTextField();
        Student_Depart = new javax.swing.JTextField();
        Student_gpa = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Upate_Data = new javax.swing.JButton();
        Delet_Data = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        Add_Student.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Add_Student.setText("Add_Student");
        Add_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_StudentActionPerformed(evt);
            }
        });

        Delet_Student.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delet_Student.setText("Delet_Student");
        Delet_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delet_StudentActionPerformed(evt);
            }
        });

        Update_Data.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Update_Data.setText("Update_Data");
        Update_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_DataActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Admin_Student");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delet_Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Update_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addGap(73, 73, 73)
                .addComponent(Add_Student)
                .addGap(51, 51, 51)
                .addComponent(Delet_Student)
                .addGap(55, 55, 55)
                .addComponent(Update_Data)
                .addGap(55, 55, 55)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DELET AND UPDATE DATA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        ID_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_SearchActionPerformed(evt);
            }
        });

        Search_ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Search_ID.setText("Search");
        Search_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_IDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("User_Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Student_ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Level");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Depart");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("GPA");

        Student_Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_LevelActionPerformed(evt);
            }
        });

        Student_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_PasswordActionPerformed(evt);
            }
        });

        Student_Depart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_DepartActionPerformed(evt);
            }
        });

        Student_gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_gpaActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Upate_Data.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Upate_Data.setText("Update");
        Upate_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upate_DataActionPerformed(evt);
            }
        });

        Delet_Data.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delet_Data.setText("Delet");
        Delet_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delet_DataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ID_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Search_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(UserName)
                                    .addComponent(StudentID)
                                    .addComponent(Student_Level)
                                    .addComponent(Student_Password)
                                    .addComponent(Student_Depart)
                                    .addComponent(Student_gpa, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(Upate_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Delet_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(StudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Student_Level, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Student_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(Student_Depart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Student_gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Upate_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Delet_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_StudentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Create_New_Account S2=new Create_New_Account();
        S2.setLocation(100, 250);
        S2.setSize(850,700);
        S2.setVisible(true);
    }//GEN-LAST:event_Add_StudentActionPerformed

    private void Update_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_DataActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Admin_Student S1=new Admin_Student();
        S1.setLocation(100, 250);
        S1.setSize(1225,775);
        S1.setVisible(true);
    }//GEN-LAST:event_Update_DataActionPerformed

    private void Delet_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delet_StudentActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Admin_Student S1=new Admin_Student();
        S1.setLocation(100, 250);
        S1.setSize(1225,775);
        S1.setVisible(true);
    }//GEN-LAST:event_Delet_StudentActionPerformed

    private void ID_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_SearchActionPerformed

    private void Student_LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_LevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_LevelActionPerformed

    private void Student_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_PasswordActionPerformed

    private void Student_gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_gpaActionPerformed

    private void Student_DepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_DepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_DepartActionPerformed

    private void Upate_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upate_DataActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            String User_Name=UserName.getText();
            String Student_ID=StudentID.getText();
            String StudentLevel=Student_Level.getText();
            String Student_Pass=Student_Password.getText();
            String Depart=Student_Depart.getText();
            String Strudent_GPA=Student_gpa.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/management system","root","");
            Statement st=c.createStatement();
            String sql="update  student set UserName='"+User_Name+"',Student_ID ='"+Student_ID+"',Student_Level='"+StudentLevel+"',Student_Password='"+Student_Pass+"',Student_Depart='"+Depart+"',Student_GPA='"+Strudent_GPA+"'";
            int result=st.executeUpdate(sql);
            if(result==1)
            {
                UserName.setText("");
                StudentID.setText("");
                Student_Level.setText("");
                Student_Password.setText("");
                Student_Depart.setText("");
                Student_gpa.setText("");
                javax.swing.JOptionPane.showMessageDialog(null,"Opertion has been Update Successful","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(null,"MySQLConnector Not Found!","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Assignments.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_Upate_DataActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Admin A3=new Admin();
        A3.setLocation(100, 250);
        A3.setSize(1030,700);
        A3.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        UserName.setText("");
        StudentID.setText("");
        Student_Level.setText("");
        Student_Password.setText("");
        Student_Depart.setText("");
        Student_gpa.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void Delet_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delet_DataActionPerformed
        // TODO add your handling code here:
        String User_Name=UserName.getText();
        String Student_ID=StudentID.getText();
        String StudentLevel=Student_Level.getText();
        String Student_Pass=Student_Password.getText();
        String Depart=Student_Depart.getText();
        String Strudent_GPA=Student_gpa.getText();
    }//GEN-LAST:event_Delet_DataActionPerformed

    private void Search_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_IDActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String Search_ID;
            Search_ID = ID_Search.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/management system","root","");
            Statement st=c.createStatement();
            String sql;
            sql = "select * from  student where Student_ID  ='"+Search_ID+"' ";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                javax.swing.JOptionPane.showMessageDialog(null,"Data has been found","Success",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                UserName.setText(rs.getString("UserName"));
                StudentID.setText(rs.getString("StudentID"));
                Student_Level.setText(rs.getString("Student_Level"));
                Student_Password.setText(rs.getString("Student_Password"));
                Student_Depart.setText(rs.getString("Student_Depart"));
                Student_gpa.setText(rs.getString("Student_gpa"));
               
              
                
            }
        } catch (ClassNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(null,"MySQLConnector Not Found!","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(Assignments.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_Search_IDActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Student;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delet_Data;
    private javax.swing.JButton Delet_Student;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField ID_Search;
    private javax.swing.JButton Search_ID;
    private javax.swing.JTextField StudentID;
    private javax.swing.JTextField Student_Depart;
    private javax.swing.JTextField Student_Level;
    private javax.swing.JTextField Student_Password;
    private javax.swing.JTextField Student_gpa;
    private javax.swing.JButton Upate_Data;
    private javax.swing.JButton Update_Data;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
