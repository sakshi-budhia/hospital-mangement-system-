/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.mangement.system;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.*;
import javax.swing.table.*;

/**
 *
 * @author admin
 */
public class Bed_details extends javax.swing.JFrame {

    /**
     * Creates new form Bed_details
     */
    public Bed_details() {
        initComponents();
        DisplayTable();
    }
    private void DisplayTable(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_register","root","sakshi.budhia");
         String sql="select * from bed_details";
         PreparedStatement pstmt=con.prepareStatement(sql);
         ResultSet rs=pstmt.executeQuery();
         t1.setModel(DbUtils.resultSetToTableModel(rs));
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
        pic = new javax.swing.JLabel();
        jtable = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        msg = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        category = new javax.swing.JLabel();
        room = new javax.swing.JLabel();
        bedno = new javax.swing.JTextField();
        Category = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        pic.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\bed1.jpg")); // NOI18N
        pic.setText("jLabel2");
        jPanel1.add(pic);
        pic.setBounds(60, 270, 750, 290);

        t1.setBackground(new java.awt.Color(204, 255, 255));
        t1.setModel(new javax.swing.table.DefaultTableModel(
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
        jtable.setViewportView(t1);

        jPanel1.add(jtable);
        jtable.setBounds(1070, 340, 620, 310);

        msg.setBackground(new java.awt.Color(255, 255, 255));
        msg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        msg.setForeground(new java.awt.Color(0, 0, 0));
        msg.setText("BEDS AVAILABLE");
        jPanel1.add(msg);
        msg.setBounds(1248, 271, 270, 40);

        no.setBackground(new java.awt.Color(255, 255, 255));
        no.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        no.setForeground(new java.awt.Color(0, 0, 0));
        no.setText("BED NUMBER:");
        jPanel1.add(no);
        no.setBounds(110, 750, 170, 40);

        category.setBackground(new java.awt.Color(255, 255, 255));
        category.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        category.setForeground(new java.awt.Color(0, 0, 0));
        category.setText("BED CATEGORY:");
        jPanel1.add(category);
        category.setBounds(90, 820, 190, 40);

        room.setBackground(new java.awt.Color(255, 255, 255));
        room.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        room.setForeground(new java.awt.Color(0, 0, 0));
        room.setText("ROOM NUMBER:");
        jPanel1.add(room);
        room.setBounds(80, 890, 200, 40);

        bedno.setBackground(new java.awt.Color(0, 0, 0));
        bedno.setForeground(new java.awt.Color(255, 255, 255));
        bedno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bednoActionPerformed(evt);
            }
        });
        jPanel1.add(bedno);
        bedno.setBounds(370, 760, 210, 29);

        Category.setBackground(new java.awt.Color(0, 0, 0));
        Category.setForeground(new java.awt.Color(255, 255, 255));
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });
        jPanel1.add(Category);
        Category.setBounds(370, 830, 210, 29);

        roomno.setBackground(new java.awt.Color(0, 0, 0));
        roomno.setForeground(new java.awt.Color(255, 255, 255));
        roomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomnoActionPerformed(evt);
            }
        });
        jPanel1.add(roomno);
        roomno.setBounds(370, 890, 210, 29);

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("ADD BED");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(1090, 730, 144, 40);

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("DELETE BED");
        delete.setActionCommand("REMOVE BED");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(1060, 810, 180, 40);

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("UPDATE BED");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(1060, 890, 185, 40);

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 0));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(1130, 960, 111, 40);

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
        jButton1.setBounds(0, 10, 100, 29);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("To delete enter only bedno");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1330, 820, 200, 21);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("To update enter bedno and update the rest ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1330, 900, 320, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\Desktop\\images\\BG NEW.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1090);

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

    private void bednoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bednoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bednoActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void roomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomnoActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_register","root","sakshi.budhia");
            String sql="delete from bed_details where BEDNO = ?";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setInt(1,Integer.parseInt(bedno.getText()));
            pstmt.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)t1.getModel ();
            model.setRowCount(0);
            DisplayTable();
            JOptionPane.showMessageDialog(null, "RECORD DELETED SUCCESSFULLY");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_register","root","sakshi.budhia");
            String sql="insert into bed_details values(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,bedno.getText());
            ps.setString(2,Category.getText());
            ps.setString(3,roomno.getText());
            ps.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)t1.getModel ();
            model.setRowCount(0);
            DisplayTable();
            JOptionPane.showMessageDialog(null,"SUCCESFULLY ADDED BED");
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_register","root","sakshi.budhia");
            String sql="update bed_details set CATEGORY=?,ROOMNO=? where BEDNO=?";
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setString(2,roomno.getText());
            ps.setString(1, Category.getText());
            ps.setString(3,bedno.getText());
            ps.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)t1.getModel ();
            model.setRowCount(0);
            DisplayTable();
            JOptionPane.showMessageDialog(null,"SUCCESFULLY UPDATED BED");
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        bedno.setText(null);
        Category.setText(" ");
        roomno.setText(" ");
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Admin_Panel ap=new Admin_Panel();
        ap.setVisible(true);
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
            java.util.logging.Logger.getLogger(Bed_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bed_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bed_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bed_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bed_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Category;
    private javax.swing.JButton add;
    private javax.swing.JTextField bedno;
    private javax.swing.JLabel category;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jtable;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel no;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel room;
    private javax.swing.JTextField roomno;
    private javax.swing.JTable t1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}