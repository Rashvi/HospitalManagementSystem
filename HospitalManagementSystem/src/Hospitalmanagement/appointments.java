/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospitalmanagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class appointments extends javax.swing.JFrame {

    /**
     * Creates new form appointments
     */
    
    String PatientId;
    String patientName;
    public appointments(String PatientId,String patientName) {
        
        initComponents();
        appoint_table();
        loadDoctor();
        lbPid.setText(PatientId);
        lbpatientName.setText(patientName);
        this.patientName = patientName;
        this.PatientId = PatientId;
    }
    public String getPatientId(){
        return PatientId;
    }
    public String getPatientname(){
        return patientName;
    }
     public void setvalue(){
         String PatientId = getPatientId();
         String patientName = getPatientname();
        
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfDate = new com.toedter.calendar.JDateChooser();
        cbDname = new javax.swing.JComboBox<>();
        lbPid = new javax.swing.JLabel();
        lbpatientName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tfRoom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointments");
        jLabel1.setOpaque(true);

        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(null);

        jLabel3.setText("Patient No");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 70, 100, 16);

        jLabel4.setText("Patient Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 120, 110, 20);

        jLabel5.setText("Room No");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 250, 100, 30);

        jLabel6.setText("Doctor Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 180, 90, 30);

        jLabel7.setText("Date");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 320, 90, 30);
        jPanel1.add(tfDate);
        tfDate.setBounds(230, 312, 170, 30);

        cbDname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbDname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDnameActionPerformed(evt);
            }
        });
        jPanel1.add(cbDname);
        cbDname.setBounds(230, 180, 170, 30);

        lbPid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPid.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbPid);
        lbPid.setBounds(230, 70, 160, 30);

        lbpatientName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbpatientName.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lbpatientName);
        lbpatientName.setBounds(230, 120, 160, 30);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(170, 400, 110, 40);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 400, 110, 40);

        jButton3.setText("prescription");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 470, 110, 40);
        jPanel1.add(tfRoom);
        tfRoom.setBounds(230, 230, 170, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 430, 530);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pid", "PatientName", "DoctorName", "RoomNo", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDnameActionPerformed
        // TODO add your handling code here:
          cbDname.addActionListener(new ActionListener() 
      {
          
          
          @Override
          public void actionPerformed(ActionEvent e) {
              String doctor = (String)cbDname.getSelectedItem();
               try {
           
            ResultSet rs = DBLoader.executeQuery("select * from doctor where Name = '"+doctor+"'");
             System.out.println("doctor name outside"+doctor);
            if(doctor.equals("")){
                 JOptionPane.showMessageDialog(rootPane, "Doctor Field Require!!!!!!!!!!"); 
            }else{
                System.out.println("inside else part");
               // System.out.println(rs.getString("RoomNo"));
                 rs.next();
                tfRoom.setText(rs.getString("RoomNo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(receptionappoint.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      });
    }//GEN-LAST:event_cbDnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String PName =  getPatientname();
        String Pid = getPatientId();
        
        String doctor = cbDname.getSelectedItem().toString();
        String room = tfRoom.getText();
         Date dob = tfDate.getDate();
         
      
        java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
        
       
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from appointment  ");
            
                
                
         
            
            rs.next();
            
            rs.updateString("PatientName", PName);
            rs.updateString("Pid", Pid);
            rs.updateString("DoctorName", doctor);
            rs.updateDate("Date", sqlDate);
            rs.updateString("RoomNo", room);
            rs.updateRow();
            
            JOptionPane.showMessageDialog(rootPane, "row updated successfully!!!!!!!");
                
           
            appoint_table();
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String PName =  getPatientname();
        String Pid = getPatientId();
        
        String doctor = cbDname.getSelectedItem().toString();
        String room = tfRoom.getText();
         Date dob = tfDate.getDate();
       
       // java.util.Date date =new java.util.Date();
        
       java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
        
       // String pGender = (String) cb1.getSelectedItem();
        if( PName.equals("")|| Pid.equals("")|| cbDname.equals("")||tfRoom.equals("")||tfDate.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
       else {
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from appointment ");
            
                
                
         
            
            rs.moveToInsertRow();
            
            //rs.updateString("PatientId", PID);
            rs.updateString("PatientName", PName);
            rs.updateString("Pid", Pid);
            rs.updateString("DoctorName", doctor);
            rs.updateDate("Date", sqlDate);
            rs.updateString("RoomNo", room);
            rs.insertRow();
            
            JOptionPane.showMessageDialog(rootPane, "appointmentAdd!!!!!!!!");
                
            
           
           
            appoint_table();
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }                                        

    {
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try{
        
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
        lbPid.setText(d1.getValueAt(SelectIndex,0).toString());
        lbpatientName.setText(d1.getValueAt(SelectIndex, 1).toString());
       cbDname.setSelectedItem(d1.getValueAt(SelectIndex, 2).toString());
       tfRoom.setText(d1.getValueAt(SelectIndex, 3).toString());
       
      // tfDate.setDate(d1.getValueAt(SelectIndex,4).toString());
       
       
       
 //      Date date1;
      
     Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String)d1.getValueAt(SelectIndex, 4).toString());
        
            tfDate.setDate(date1);
       
    
        
        }
       catch (ParseException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
       jButton2.setEnabled(false);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
   
        String PName =  getPatientname();
        String Pid = getPatientId();
        
        String doctor = cbDname.getSelectedItem().toString();
        String room = tfRoom.getText();
         Date dob = tfDate.getDate();
       
       // java.util.Date date =new java.util.Date();
        
       java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
        
       // String pGender = (String) cb1.getSelectedItem();
        if( PName.equals("") || Pid.equals("") || cbDname.equals("") || tfRoom.equals("") || tfDate.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
        else{
            System.out.println(PName+"  "+Pid);
            new prescription(PName,Pid).setVisible(true);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

     public void appoint_table(){
          
          
          
        try {
            ResultSet rs = DBLoader.executeQuery("select * from  appointment ");
            
            ResultSetMetaData  rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            
            df.setRowCount(0);
            
          //  java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
            while(rs.next()){
                 Vector v = new Vector();
                for(int i =1 ; i<= c; i++)
                {
                v.add(rs.getString("Pid"));
                v.add(rs.getString("PatientName"));
                v.add(rs.getString("DoctorName"));
                v.add(rs.getString("RoomNo"));
                v.add(rs.getDate("Date"));
               
                
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void loadDoctor(){
         
        try {
             ResultSet rs = DBLoader.executeQuery("select * from doctor ");
            while(rs.next()){
                cbDname.addItem(rs.getString("Name"));
            }
             
            
        } catch (SQLException ex) {
            Logger.getLogger(appointments.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
             
     
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
            java.util.logging.Logger.getLogger(appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbPid;
    private javax.swing.JLabel lbpatientName;
    private com.toedter.calendar.JDateChooser tfDate;
    private javax.swing.JTextField tfRoom;
    // End of variables declaration//GEN-END:variables
}
