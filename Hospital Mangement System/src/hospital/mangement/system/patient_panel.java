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
public class patient_panel extends javax.swing.JFrame {

    /**
     * Creates new form Doctor_after_login
     */
    public patient_panel() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        appointment = new javax.swing.JButton();
        availability = new javax.swing.JButton();
        medical = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PATIENT PANEL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(770, 260, 310, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\check_appointment.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 440, 240, 350);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\availablity.jpg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(860, 500, 225, 250);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\medication.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1470, 510, 240, 220);

        appointment.setBackground(new java.awt.Color(0, 0, 0));
        appointment.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        appointment.setForeground(new java.awt.Color(255, 255, 255));
        appointment.setText("CHECK APPOINTMENT");
        appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentActionPerformed(evt);
            }
        });
        jPanel1.add(appointment);
        appointment.setBounds(280, 820, 310, 29);

        availability.setBackground(new java.awt.Color(0, 0, 0));
        availability.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        availability.setForeground(new java.awt.Color(255, 255, 255));
        availability.setText("CHECK AVAILABLITY");
        availability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityActionPerformed(evt);
            }
        });
        jPanel1.add(availability);
        availability.setBounds(830, 820, 310, 29);

        medical.setBackground(new java.awt.Color(0, 0, 0));
        medical.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        medical.setForeground(new java.awt.Color(255, 255, 255));
        medical.setText("CHECK MEDICAL TREATEMENT");
        medical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalActionPerformed(evt);
            }
        });
        jPanel1.add(medical);
        medical.setBounds(1390, 820, 430, 29);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 99, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\BG NEW.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

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

    private void appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentActionPerformed
        // TODO add your handling code here:
        PatientAppointment_Details al=new PatientAppointment_Details ();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_appointmentActionPerformed

    private void availabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityActionPerformed
        // TODO add your handling code here:
        avaiablity al=new avaiablity ();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_availabilityActionPerformed

    private void medicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalActionPerformed
        // TODO add your handling code here:
        PatientMedical_Details al=new PatientMedical_Details ();
        al.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_medicalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login al=new login ();
        al.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(patient_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient_panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointment;
    private javax.swing.JButton availability;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton medical;
    // End of variables declaration//GEN-END:variables
}
