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
public class Appointment_Details1 extends javax.swing.JFrame {

    /**
     * Creates new form Appointment_Details
     */
    public Appointment_Details1() {
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
        doctorid = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        patientid = new javax.swing.JLabel();
        Did = new javax.swing.JTextField();
        patientname = new javax.swing.JLabel();
        Pid = new javax.swing.JTextField();
        Time = new javax.swing.JTextField();
        Pname = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        doctorid.setBackground(new java.awt.Color(255, 255, 255));
        doctorid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        doctorid.setForeground(new java.awt.Color(0, 0, 0));
        doctorid.setText("ENTER YOUR ID");
        jPanel1.add(doctorid);
        doctorid.setBounds(570, 310, 190, 60);

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("APPOINTMENT DATE");
        jPanel1.add(date);
        date.setBounds(560, 810, 260, 60);

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setText("APPOINTMENT TIME");
        jPanel1.add(time);
        time.setBounds(550, 730, 290, 60);

        patientid.setBackground(new java.awt.Color(255, 255, 255));
        patientid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        patientid.setForeground(new java.awt.Color(0, 0, 0));
        patientid.setText("PATIENT ID");
        jPanel1.add(patientid);
        patientid.setBounds(630, 560, 140, 60);

        Did.setBackground(new java.awt.Color(0, 0, 0));
        Did.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Did);
        Did.setBounds(950, 330, 200, 29);

        patientname.setBackground(new java.awt.Color(255, 255, 255));
        patientname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        patientname.setForeground(new java.awt.Color(0, 0, 0));
        patientname.setText("PATIENT NAME");
        jPanel1.add(patientname);
        patientname.setBounds(600, 650, 190, 60);

        Pid.setBackground(new java.awt.Color(0, 0, 0));
        Pid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Pid);
        Pid.setBounds(930, 580, 200, 29);

        Time.setBackground(new java.awt.Color(0, 0, 0));
        Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Time);
        Time.setBounds(930, 740, 200, 29);

        Pname.setBackground(new java.awt.Color(0, 0, 0));
        Pname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Pname);
        Pname.setBounds(930, 660, 200, 29);

        Date.setBackground(new java.awt.Color(0, 0, 0));
        Date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Date);
        Date.setBounds(930, 820, 200, 29);

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 0, 0));
        submit.setText("SUBMIT");
        jPanel1.add(submit);
        submit.setBounds(1110, 390, 128, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\BG NEW.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        jLabel2.setText("ENTER YOUR ID TO CHECK YOUR APPOINTMENTS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(690, 250, 332, 21);

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
            java.util.logging.Logger.getLogger(Appointment_Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_Details1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date;
    private javax.swing.JTextField Did;
    private javax.swing.JTextField Pid;
    private javax.swing.JTextField Pname;
    private javax.swing.JTextField Time;
    private javax.swing.JLabel date;
    private javax.swing.JLabel doctorid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel patientid;
    private javax.swing.JLabel patientname;
    private javax.swing.JButton submit;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
