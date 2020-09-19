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

public class Items extends javax.swing.JFrame {
        
    public Items() {
        initComponents();
         //^ AutoID();
          Items_table();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelgender = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Iname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        IID = new javax.swing.JLabel();
        Isellprice = new javax.swing.JTextField();
        Iquantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Items");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Item ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Description");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ItemName");

        labelgender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelgender.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("sell price");

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Upadate");
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

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items ID", "Items Name", "Description", "Sell price", "Quantity"
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
        jScrollPane2.setViewportView(jTable1);

        Iquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IquantityActionPerformed(evt);
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
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelgender, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Iname)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(IID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Isellprice)
                            .addComponent(Iquantity, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
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
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Iname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Isellprice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelgender, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Iquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
       // String PID = pID.getText();
        String Name = Iname.getText();
        String sell =Isellprice.getText();
        String descript = description.getText();
        String Quantity = Iquantity.getText();
       
       // java.util.Date date =new java.util.Date();
        
      
        if( Name.equals("")|| sell.equals("")|| descript.equals("")||Quantity.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
       else {
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from items ");
            
                
                
         
            
            rs.moveToInsertRow();
            
            //rs.updateString("PatientId", PID);
            rs.updateString("ItemsName", Name);
            rs.updateString("Description", descript);
            rs.updateString("SellPrice", sell);
           
            rs.updateString("Quantity", Quantity);
            rs.insertRow();
            
            JOptionPane.showMessageDialog(rootPane, "item add successfully!!!!!!!!!!!");
                
            IID.setText(" ");
            Iname.setText(" ");
            Isellprice.setText(" ");
            Iquantity.setText(" ");
            description.setText(" ");
            Items_table();
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       
        try{
        
        DefaultTableModel d1 = (DefaultTableModel) jTable1.getModel();
        int SelectIndex = jTable1.getSelectedRow();
       IID.setText(d1.getValueAt(SelectIndex, 0).toString());
       Iname.setText(d1.getValueAt(SelectIndex, 1).toString());
    //   Pnumber.setText(d1.getValueAt(SelectIndex, 2).toString());
       description.setText(d1.getValueAt(SelectIndex, 2).toString());
       Isellprice.setText(d1.getValueAt(SelectIndex, 3).toString());
       Iquantity.setText(d1.getValueAt(SelectIndex, 4).toString());
       
       
       
 //      Date date1;
      
    
        }
       catch (Exception ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         jButton2.setEnabled(false);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        String iID = IID.getText();
        String Name = Iname.getText();
        String sell =Isellprice.getText();
        String descript = description.getText();
        String Quantity = Iquantity.getText();
          if( Name.equals("")|| sell.equals("")|| descript.equals("")||Quantity.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
       else {
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from items  ");
            
                
                
         
            
            rs.next();
            
            //rs.updateString("PatientId", PID);
            //rs.updateString("ItemId", iID);
            rs.updateString("ItemsName", Name);
            rs.updateString("Description", descript);
            rs.updateString("SellPrice", sell);
           
            rs.updateString("Quantity", Quantity);
            rs.updateRow();
            
            JOptionPane.showMessageDialog(rootPane, "row updated successfully!!!!!!!");
             
            
            
            IID.setText(" ");
            Iname.setText(" ");
            Isellprice.setText(" ");
            Iquantity.setText(" ");
            description.setText(" ");
           Items_table();
          
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
       jButton2.setEnabled(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
      
       String pid = IID.getText();
        
         String iID = IID.getText();
        String Name = Iname.getText();
        String sell =Isellprice.getText();
        String descript = description.getText();
        String Quantity = Iquantity.getText();
          if( Name.equals("")|| sell.equals("")|| descript.equals("")||Quantity.equals("")){
         JOptionPane.showMessageDialog(this, "All feild are Required!!!!");
        }
       else {
        
         
        try {
            
             ResultSet rs = DBLoader.executeQuery("select * from items where ItemId = '"+pid+"'");
            
            rs.next();
            
            rs.deleteRow();
            //rs.updateString("PatientId", PID);
          
            
            JOptionPane.showMessageDialog(rootPane, "data deleted successfully!!!!!!!!!");
                
            IID.setText(" ");
            Iname.setText(" ");
            Isellprice.setText(" ");
            Iquantity.setText(" ");
            description.setText(" ");
            jButton2.setEnabled(true);
          
            Items_table();
            
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void IquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IquantityActionPerformed

    
    public void AutoID(){
       
        try {
            ResultSet rs = DBLoader.executeQuery("select MAX(ItemId) from items");
            rs.next();
          
            rs.getString("MAX(ItemId)");
        
            if( rs.getString("MAX(ItemId)") == null){
               
                IID.setText("12001");
                
                
            }
            else{
               // int Id = Integer.parseInt(rs.getString("MAX(PatientId)").substring(2,rs.getString("MAX(PatientId").length()));
                int Id = Integer.parseInt(rs.getString("ItemId"));
                 
                Id++;
                IID.setText(Integer.toString(Id));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void Items_table(){
        try {
            ResultSet rs = DBLoader.executeQuery("select * from items");
            
            ResultSetMetaData  rsm = rs.getMetaData();
            int c = rsm.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            
            df.setRowCount(0);
            
          //  java.sql.Date sqlDate=new java.sql.Date(dob.getTime());
            while(rs.next()){
                 Vector v = new Vector();
                for(int i =1 ; i<= c; i++)
                {
                v.add(rs.getString("ItemId"));
                v.add(rs.getString("ItemsName"));
                v.add(rs.getString("Description"));
                v.add(rs.getString("SellPrice"));
               
                v.add(rs.getString("Quantity"));
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IID;
    private javax.swing.JTextField Iname;
    private javax.swing.JTextField Iquantity;
    private javax.swing.JTextField Isellprice;
    private javax.swing.JTextArea description;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelgender;
    // End of variables declaration//GEN-END:variables
}
