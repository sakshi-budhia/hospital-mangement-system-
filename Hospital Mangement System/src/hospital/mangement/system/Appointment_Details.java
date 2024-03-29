/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.mangement.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;

/**
 *
 * @author admin
 */
public class Appointment_Details extends javax.swing.JFrame {

    /**
     * Creates new form Appointment_Details
     */
    public Appointment_Details() {
        initComponents();
        DisplayTable3();
    }
     private void DisplayTable3(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_register","root","sakshi.budhia");
         String sql="select * from create_appointments";
         PreparedStatement pstmt=con.prepareStatement(sql);
         ResultSet rs=pstmt.executeQuery();
         t3.setModel(DbUtils.resultSetToTableModel(rs));
     }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
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
        Did = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        doctorid = new javax.swing.JLabel();
        patientid = new javax.swing.JLabel();
        patientname = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        Pid = new javax.swing.JTextField();
        Pname = new javax.swing.JTextField();
        Date = new com.toedter.calendar.JDateChooser();
        Time = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ENTER YOUR ID  TO SEARCH FOR YOUR APPOINTMENTS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 230, 1270, 48);

        Did.setBackground(new java.awt.Color(0, 0, 0));
        Did.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Did.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Did);
        Did.setBounds(440, 330, 220, 40);

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 0, 0));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(610, 400, 128, 40);

        doctorid.setBackground(new java.awt.Color(255, 255, 255));
        doctorid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        doctorid.setForeground(new java.awt.Color(0, 0, 0));
        doctorid.setText("DOCTOR ID:");
        jPanel1.add(doctorid);
        doctorid.setBounds(110, 330, 140, 32);

        patientid.setBackground(new java.awt.Color(255, 255, 255));
        patientid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        patientid.setForeground(new java.awt.Color(0, 0, 0));
        patientid.setText("PATIENT ID:");
        jPanel1.add(patientid);
        patientid.setBounds(120, 540, 140, 32);

        patientname.setBackground(new java.awt.Color(255, 255, 255));
        patientname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        patientname.setForeground(new java.awt.Color(0, 0, 0));
        patientname.setText("PATIENT NAME");
        jPanel1.add(patientname);
        patientname.setBounds(90, 600, 190, 32);

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setText("DATE");
        jPanel1.add(date);
        date.setBounds(200, 670, 70, 32);

        time.setBackground(new java.awt.Color(255, 255, 255));
        time.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setText("TIME");
        jPanel1.add(time);
        time.setBounds(200, 730, 70, 32);

        Pid.setBackground(new java.awt.Color(0, 0, 0));
        Pid.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Pid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Pid);
        Pid.setBounds(430, 540, 220, 40);

        Pname.setBackground(new java.awt.Color(0, 0, 0));
        Pname.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Pname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Pname);
        Pname.setBounds(430, 600, 220, 40);
        jPanel1.add(Date);
        Date.setBounds(430, 670, 220, 29);

        Time.setBackground(new java.awt.Color(0, 0, 0));
        Time.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Time);
        Time.setBounds(430, 730, 220, 40);

        t3.setBackground(new java.awt.Color(204, 255, 255));
        t3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(t3);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(950, 340, 660, 370);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\PREVIOUS.jpg")); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 100, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\BG NEW.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
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

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_register","root","sakshi.budhia");
           String sql="select * from create_appointments where doctorid=?";
           PreparedStatement pstmt=con.prepareStatement(sql);
           pstmt.setInt(1,Integer.parseInt(Did.getText()));
           ResultSet rs=pstmt.executeQuery();
           if(rs.next()){
               Pid.setText(String.valueOf(rs.getInt("patientid")));
               Pname.setText(rs.getString("patientname"));
               Date.setDate(rs.getDate("date"));
               Time.setText(rs.getString("time"));
           }
       }catch(Exception e){
         JOptionPane.showMessageDialog(null, e);
         
       }
        
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Doctor_after_login al=new Doctor_after_login ();
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
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Appointment_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Appointment_Details().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel patientid;
    private javax.swing.JLabel patientname;
    private javax.swing.JButton submit;
    private javax.swing.JTable t3;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
