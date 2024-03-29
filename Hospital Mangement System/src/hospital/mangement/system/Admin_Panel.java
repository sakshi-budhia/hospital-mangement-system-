/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.mangement.system;


/**
 *
 * @author admin
 */
public class Admin_Panel extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Panel
     */
    public Admin_Panel() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        doctor = new javax.swing.JButton();
        receptionist = new javax.swing.JButton();
        department = new javax.swing.JButton();
        patient = new javax.swing.JButton();
        lowerStaff = new javax.swing.JButton();
        bed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\doctor.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 420, 240, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\lower staff.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(820, 750, 230, 180);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\receptionist.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(810, 420, 240, 190);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\patient.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 750, 250, 188);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\department.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1340, 420, 250, 190);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\bed.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1350, 750, 250, 180);

        doctor.setBackground(new java.awt.Color(255, 255, 255));
        doctor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doctor.setForeground(new java.awt.Color(0, 0, 0));
        doctor.setText("DOCTOR DETAILS");
        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });
        jPanel1.add(doctor);
        doctor.setBounds(290, 630, 199, 30);

        receptionist.setBackground(new java.awt.Color(255, 255, 255));
        receptionist.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        receptionist.setForeground(new java.awt.Color(0, 0, 0));
        receptionist.setText("RECEPTIONIST DETAILS");
        receptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistActionPerformed(evt);
            }
        });
        jPanel1.add(receptionist);
        receptionist.setBounds(800, 630, 259, 30);

        department.setBackground(new java.awt.Color(255, 255, 255));
        department.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        department.setForeground(new java.awt.Color(0, 0, 0));
        department.setText("DEPARTMENT DETAILS");
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });
        jPanel1.add(department);
        department.setBounds(1340, 630, 246, 30);

        patient.setBackground(new java.awt.Color(255, 255, 255));
        patient.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patient.setForeground(new java.awt.Color(0, 0, 0));
        patient.setText("PATIENT DETAILS");
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });
        jPanel1.add(patient);
        patient.setBounds(290, 950, 201, 30);

        lowerStaff.setBackground(new java.awt.Color(255, 255, 255));
        lowerStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lowerStaff.setForeground(new java.awt.Color(0, 0, 0));
        lowerStaff.setText("OTHER STAFF DETAILS");
        lowerStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerStaffActionPerformed(evt);
            }
        });
        jPanel1.add(lowerStaff);
        lowerStaff.setBounds(810, 950, 243, 30);

        bed.setBackground(new java.awt.Color(255, 255, 255));
        bed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bed.setForeground(new java.awt.Color(0, 0, 0));
        bed.setText("BED DETAILS");
        bed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedActionPerformed(evt);
            }
        });
        jPanel1.add(bed);
        bed.setBounds(1400, 940, 158, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 30, 150, 37);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\admin_panel.jpg")); // NOI18N
        jLabel1.setText("LOG OUT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed
Doctor_details dd=new Doctor_details();
dd.setVisible(true);
this.dispose();        
// TODO add your handling code here:
    }//GEN-LAST:event_doctorActionPerformed

    private void receptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistActionPerformed
Receptionist_details rd=new Receptionist_details();
rd.setVisible(true);
this.dispose();          
// TODO add your handling code here:
    }//GEN-LAST:event_receptionistActionPerformed

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
        Department_details de=new Department_details();
        de.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_departmentActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
        Patient_details pd=new Patient_details();
        pd.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_patientActionPerformed

    private void lowerStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerStaffActionPerformed
        // TODO add your handling code here:
        Lowerstaff_details ld=new Lowerstaff_details();
        ld.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_lowerStaffActionPerformed

    private void bedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedActionPerformed
        // TODO add your handling code here:
        Bed_details bd=new Bed_details();
        bd.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_bedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
login l=new login();
l.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bed;
    private javax.swing.JButton department;
    private javax.swing.JButton doctor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lowerStaff;
    private javax.swing.JButton patient;
    private javax.swing.JButton receptionist;
    // End of variables declaration//GEN-END:variables
}
