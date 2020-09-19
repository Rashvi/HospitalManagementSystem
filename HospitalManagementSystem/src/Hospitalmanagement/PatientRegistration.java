package Hospitalmanagement;

import com.mysql.jdbc.Util;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class PatientRegistration extends javax.swing.JFrame {
         
    public PatientRegistration() {
        initComponents();
        
          AutoID();
          patient_table();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelgender = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Pname = new javax.swing.JTextField();
        Pnumber = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Paddress = new javax.swing.JTextArea();
        cb1 = new javax.swing.JComboBox<>();
        tfDate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Registration");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Patient ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Phone number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Address ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("PatientName");

        labelgender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelgender.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("D.O.B");

        Pnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnumberActionPerformed(evt);
            }
        });

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        Paddress.setColumns(20);
        Paddress.setRows(5);
        jScrollPane1.setViewportView(Paddress);

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        tfDate.setDateFormatString("yyyy-MM-dd");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "Phone Number", "Address", "D.O.B", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Appointment Fee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelgender, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pname)
                            .addComponent(Pnumber)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                            .addComponent(jButton1))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelgender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnumberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
        String PID = pID.getText();
        String PName = Pname.getText();
        String PPhone =Pnumber.getText();
        String Address = Paddress.getText();
        Date dob = tfDate.getDate();
       
       // java.util.Date date =new java.util.Date();
        
       java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
        
        String pGender = (String) cb1.getSelectedItem();
        if( PName.equals("")|| PPhone.equals("")|| Address.equals("")||dob.equals("")||pGender.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
       else {
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from registration ");

            rs.moveToInsertRow();
            
            //rs.updateString("PatientId", PID);
            rs.updateString("PatientName", PName);
            rs.updateString("Phone", PPhone);
            rs.updateString("Address", Address);
            rs.updateDate("dob", sqlDate);
            rs.updateString("sex", pGender);
            rs.insertRow();
            
            JOptionPane.showMessageDialog(rootPane, "Register successfully!!!!!!!!!!");
                
            pID.setText(" ");
            Pname.setText(" ");
            Pnumber.setText(" ");
            Paddress.setText(" ");
            patient_table();
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // TODO add your handling code here:
       
        try{
        
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
       pID.setText(d1.getValueAt(SelectIndex, 0).toString());
       Pname.setText(d1.getValueAt(SelectIndex, 1).toString());
       Pnumber.setText(d1.getValueAt(SelectIndex, 2).toString());
       Paddress.setText(d1.getValueAt(SelectIndex, 3).toString());
       
       
       
 //      Date date1;
      
     Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String)d1.getValueAt(SelectIndex, 4).toString());
        
            tfDate.setDate(date1);
       
       cb1.setSelectedItem(d1.getValueAt(SelectIndex, 5).toString());
        
        }
       catch (ParseException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         jButton2.setEnabled(false);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String PID = pID.getText();
        System.out.println(" String PID = pID.getText();"+PID);
        String PName = Pname.getText();
        String PPhone =Pnumber.getText();
        String Address = Paddress.getText();
        Date dob = tfDate.getDate();
      
        java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
        
        String pGender = (String) cb1.getSelectedItem();
        System.out.println(pID);
        if( PName.equals("")|| PPhone.equals("")|| Address.equals("")||dob.equals("")||pGender.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
       else {
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from registration  where PatientId = '"+PID+"'");
            
                
                
         
            System.out.println("outside of rs.next"+PID);
           if( rs.next()){
            System.out.println("inside of rs.next"+PID);
            //rs.updateString("PatientId", PID);
            rs.updateString("PatientName", PName);
            rs.updateString("Phone", PPhone);
            rs.updateString("Address", Address);
            rs.updateDate("dob", sqlDate);
            rs.updateString("sex", pGender);
            rs.updateRow();
            
            JOptionPane.showMessageDialog(rootPane, "row updated successfully!!!!!!!");
                
            pID.setText(" ");
            Pname.setText(" ");
            Pnumber.setText(" ");
            Paddress.setText(" ");
            patient_table();
          
           }
           else{
               JOptionPane.showMessageDialog(rootPane, "faild to update the row!!!!!!!");
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
       jButton2.setEnabled(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
 
       String pid = pID.getText();
 
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from registration where PatientId = '"+pid+"'");
            
            rs.next();
            
            rs.deleteRow();
            //rs.updateString("PatientId", PID);
            JOptionPane.showMessageDialog(rootPane, "data deleted successfully!!!!!!!!!");    
            pID.setText(" ");
            Pname.setText(" ");
            Pnumber.setText(" ");
            Paddress.setText(" ");
            patient_table();
            jButton2.setEnabled(true);

        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String PID = pID.getText();
        System.out.println(" String PID = pID.getText();"+PID);
        String PName = Pname.getText();
        if(PID.equals("")||Pname.equals("")){
         JOptionPane.showMessageDialog(rootPane, "Select patient ID and patient name");
        }
        else{
            System.out.println(PID+"  dhsh "+PName);
        new AppointmentFeePage(PID ,PName).setVisible(true); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void AutoID(){
       
        try {
            ResultSet rs = DBLoader.executeQuery("select MAX(PatientId) from registration");
            rs.next();
          
            rs.getString("MAX(PatientId)");
        
            if( rs.getString("MAX(PatientId)") == null){
               
                pID.setText("12001");
    
            }
            else{
               // int Id = Integer.parseInt(rs.getString("MAX(PatientId)").substring(2,rs.getString("MAX(PatientId").length()));
                int Id = Integer.parseInt(rs.getString("MAX(PatientId)"));
                 
                Id++;
                pID.setText(Integer.toString(Id));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void patient_table(){
        try {
            ResultSet rs = DBLoader.executeQuery("select * from registration");
            
            ResultSetMetaData  rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            
            df.setRowCount(0);
            
          //  java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
            while(rs.next()){
                 Vector v = new Vector();
                for(int i =1 ; i<= c; i++)
                {
                v.add(rs.getString("PatientId"));
                v.add(rs.getString("PatientName"));
                v.add(rs.getString("Phone"));
                v.add(rs.getString("Address"));
                v.add(rs.getDate("dob"));
                v.add(rs.getString("sex"));
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Paddress;
    private javax.swing.JTextField Pname;
    private javax.swing.JTextField Pnumber;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelgender;
    private javax.swing.JLabel pID;
    private com.toedter.calendar.JDateChooser tfDate;
    // End of variables declaration//GEN-END:variables
}
