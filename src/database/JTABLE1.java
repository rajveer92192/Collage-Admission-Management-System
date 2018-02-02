
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class JTABLE1 extends javax.swing.JFrame
{
    Connection c;
    Statement s;
    ResultSet rs;
    
    public JTABLE1()
    {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/prem.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MR . ABCD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CET DEPARTMENT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FACULTY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "USER ID", "NAME", "AGE", "GENDER", "CONTACT", "COURSE", "FIELD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("VIEW ALL ADMISSION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setText("FOR SEARCH");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "USER ID", "NAME", "AGE", "GENDER", "CONTACT", "COURSE", "FIELD" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(0, 78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(evt.getSource() == jButton2)
        {
          try
            {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                s = c.createStatement();
                rs = s.executeQuery("Select * from student");
                System.out.println("CONNECTED");
                
                DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                jt.setRowCount(0);
                
                while(rs.next())
                {
                  int k1 = rs.getInt("USER_ID");
                  String k2 = rs.getString("NAME");
                  int k3 = rs.getInt("AGE");
                
                  String k4 = rs.getString("GENDER");
                  int k5 = rs.getInt("CONTACT");
                //  int k6 = rs.getInt("RANK");
                  String k7 = rs.getString("COURSE");
                  String k8 = rs.getString("FIELD");
                //  String k9 = rs.getString("HOSTEL");
                //  String k10 = rs.getString("FEE");
                  jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                }
                s.close();
                c.close();
            }
             catch(Exception e)
            {
                System.out.println("NOT CONNECTED"+e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jButton3)
        {
            
               //SEARCH BY GENDER       DONE
         if(jComboBox1.getSelectedItem().toString().equals("GENDER"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s1 = jTextField1.getText();
                    rs = s.executeQuery("Select * from student where GENDER ='"+s1+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
            //SEARCH BY NAME       DONE
         if(jComboBox1.getSelectedItem().toString().equals("NAME"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s1 = jTextField1.getText();
                    rs = s.executeQuery("Select * from student where NAME ='"+s1+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
//==========================================================================================================================         
         
           //SEARCH BY USER ID     DONE
             if(jComboBox1.getSelectedItem().toString().equals("USER ID"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    int s2 = Integer.parseInt(jTextField1.getText());
                    rs = s.executeQuery("Select * from student where USER_ID = "+s2+"");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                   
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                 
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
         
//===========================================================================================================================


                 //SEARCH BY COURSE    DONE
                if(jComboBox1.getSelectedItem().toString().equals("COURSE"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s4 = jTextField1.getText();
                    rs = s.executeQuery("Select * from student where COURSE ='"+s4+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                   
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
         
 //================================================================================================================================
 
 
 
                  //SEARCH BY AGE     DONE
             if(jComboBox1.getSelectedItem().toString().equals("AGE"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    int s2 = Integer.parseInt(jTextField1.getText());
                    rs = s.executeQuery("Select * from student where AGE = "+s2+"");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                  
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
         
 //=================================================================================================================================
 
 
                //SEARCH BY CONTACT   DONE
             if(jComboBox1.getSelectedItem().toString().equals("CONTACT"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    int s2 = Integer.parseInt(jTextField1.getText());
                    rs = s.executeQuery("Select * from student where CONTACT = "+s2+"");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                 }
             
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
         
//======================================================================================================================


                    //SEARCH BY FIELD        DONE
                if(jComboBox1.getSelectedItem().toString().equals("FIELD"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s5 = jTextField1.getText();
                    rs = s.executeQuery("Select * from student where FIELD ='"+s5+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                   
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k7,k8});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
         
         
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jButton1)
        {
            LOGOUT2 ob = new LOGOUT2();
            ob.setVisible(true);
            this.setVisible(false);
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
            java.util.logging.Logger.getLogger(JTABLE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTABLE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTABLE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTABLE1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JTABLE1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
