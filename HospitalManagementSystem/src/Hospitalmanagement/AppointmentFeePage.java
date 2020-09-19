/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospitalmanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AppointmentFeePage extends javax.swing.JFrame {
String pid ;
String name;
    public AppointmentFeePage(String pid , String name) {
        initComponents();
        this.pid = pid;
        this.name = name;
        tfpid.setText(pid);
        tfName.setText(name);
        
    }

   public String getpid(){
         return pid;
    }
    public String getname(){
        return name;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfpid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tffee = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment Fee");
        jLabel1.setOpaque(true);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("patient Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 60, 158, 34);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Appointment Fee");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 150, 158, 34);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("patient ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 230, 158, 34);
        jPanel1.add(tfpid);
        tfpid.setBounds(500, 240, 170, 30);

        jButton1.setText("PAID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 330, 130, 40);
        jPanel1.add(tffee);
        tffee.setBounds(500, 150, 170, 30);
        jPanel1.add(tfName);
        tfName.setBounds(500, 60, 170, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background2.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 880, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String pid = tfpid.getText();
        String PName = tfName.getText();
        String fee =tffee.getText();
        System.out.println("value of pid"+pid);
        System.out.println("value of pname"+PName);
        
               if( PName.equals("")|| pid.equals("")|| fee.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
       else {
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from AppointmentFee ");
  
            rs.moveToInsertRow();
            
            rs.updateString("PID", pid);
            rs.updateString("patientName", PName);
            rs.updateString("Appointmentfee", fee);
           
            rs.insertRow();
            
            JOptionPane.showMessageDialog(rootPane, "Updated to  database  successfully!!!!!!!!!!");
                
            tfpid.setText(" ");
            tffee.setText(" ");
            tfName.setText(" ");
            
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
               }
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
            java.util.logging.Logger.getLogger(AppointmentFeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentFeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentFeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentFeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new AppointmentFeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tffee;
    private javax.swing.JTextField tfpid;
    // End of variables declaration//GEN-END:variables
}
