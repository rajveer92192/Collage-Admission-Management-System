
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class JTABLE extends javax.swing.JFrame {

    Connection c;
    Statement s;
    ResultSet rs;
    int row;
    
    String s1;
    
    public JTABLE() 
    {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(520, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("LOGOUT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database/mohit.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("MR . ABCD");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("HEAD OF DEPARTMENT");

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "USER ID", "NAME", "AGE", "GENDER", "CONTACT", "RANK", "COURSE", "FIELD", "HOSTEL", "FEE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("VIEW ALL ADDMISSIONS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("FOR SEARCH");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "USER ID", "NAME", "AGE", "CONTACT", "COURSE", "FIELD", "RANK", "HOSTEL", "FEE" }));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("FOR UPDATION");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "NAME", "AGE", "COURSE", "FIELD", "CONTACT", "RANK", "HOSTEL", "FEE" }));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(21, 21, 21))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(224, 224, 224)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jTextField4))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5))))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//=====================================================================================================================
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        if(evt.getSource() == jButton6)
        {
            LOGOUT ob = new LOGOUT();
            ob.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

//===============================================================================================================
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if(evt.getSource() == jButton1)
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
                  int k6 = rs.getInt("RANK");
                  String k7 = rs.getString("COURSE");
                  String k8 = rs.getString("FIELD");
                  String k9 = rs.getString("HOSTEL");
                  String k10 = rs.getString("FEE");
                  jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                }
                s.close();
                c.close();
            }
             catch(Exception e)
            {
                System.out.println("NOT CONNECTED"+e);
            } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

//================================================================================================================
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if(evt.getSource() == jButton2)
        {
             DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
             row = jTable1.getSelectedRow();
             String selected = jt.getValueAt(row, 0).toString();
             
             if(row <= 0)
            {
                 jt.removeRow(row);
             try
             {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                s = c.createStatement();
                System.out.println("CONNECTED");
                s.execute("DELETE FROM student WHERE USER_ID = "+selected+"");
             }
             catch(Exception e)
            {
                System.out.println("NOT CONNECTED"+e);
            }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
//==============================================================================================================    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jButton4)
        {
             //SEARCH BY NAME     DONE
             if(jComboBox1.getSelectedItem().toString().equals("NAME"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                     s1 = jTextField1.getText();
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
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
             
             
//=============================================================================================================             
           
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
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }

 

//================================================================================================================
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
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
                
//=============================================================================================================             
           
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
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
             
             
             
//=============================================================================================================             
           
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
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
             
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }
             
                
//=============================================================================================================             
           
             //SEARCH BY RANK     DONE
             if(jComboBox1.getSelectedItem().toString().equals("RANK"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    int s2 = Integer.parseInt(jTextField1.getText());
                    rs = s.executeQuery("Select * from student where RANK = "+s2+"");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
             }

                
                
//=============================================================================================================                
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
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
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
                
               //SEARCH BY HOSTEL  DONE
                if(jComboBox1.getSelectedItem().toString().equals("HOSTEL"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s6 = jTextField1.getText();
                    rs = s.executeQuery("Select * from student where HOSTEl ='"+s6+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
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
                
              //SEARCH BY FEE     DONE
                if(jComboBox1.getSelectedItem().toString().equals("FEE"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s7 = jTextField1.getText();
                    rs = s.executeQuery("Select * from student where FEE ='"+s7+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
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

    }//GEN-LAST:event_jButton4ActionPerformed

    
//==========================================================================================================================
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        // FEE UPDATE                DONE
        if(jComboBox2.getSelectedItem().toString().equals("FEE"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set FEE ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }
        
//==============================================================================================================================        
        
        //NAME UPDATE                       DONE
        if(jComboBox2.getSelectedItem().toString().equals("NAME"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set NAME ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }
     
//===========================================================================================================================

        //AGE UPDATE                   DONE
        if(jComboBox2.getSelectedItem().toString().equals("AGE"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set AGE ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }

//===========================================================================================================================

        // UPDATE                   DONE
        if(jComboBox2.getSelectedItem().toString().equals("CONTACT"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set CONTACT ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }
        
        
//===========================================================================================================================

        //AGE UPDATE                   DONE
        if(jComboBox2.getSelectedItem().toString().equals("AGE"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set AGE ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }
        

//===========================================================================================================================

        //COURSE UPDATE                   DONE
        if(jComboBox2.getSelectedItem().toString().equals("COURSE"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set COURSE ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }        
        
        
//===========================================================================================================================

        //FIELD UPDATE                   DONE
        if(jComboBox2.getSelectedItem().toString().equals("FIELD"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set FIELD ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }        
        
        //===========================================================================================================================

        //HOSTEL UPDATE                   DONE
        if(jComboBox2.getSelectedItem().toString().equals("HOSTEL"))
             {
                 try
                 {
                    Class.forName("com.mysql.jdbc.Driver");
                    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/admission","root","5141");
                    s = c.createStatement();
                    System.out.println("CONNECTED"); 
                    String s8 = jTextField2.getText();
                    String s9 = jTextField4.getText();
                    s.executeUpdate("Update student set HOSTEL ='"+s8+"' where NAME = '"+s9+"'");
                    DefaultTableModel jt = (DefaultTableModel)jTable1.getModel();
                    jt.setRowCount(0);
                     
                    while(rs.next())
                  {
                    int k1 = rs.getInt("USER_ID");
                    String k2 = rs.getString("NAME");
                    int k3 = rs.getInt("AGE");
                
                    String k4 = rs.getString("GENDER");
                    int k5 = rs.getInt("CONTACT");
                    int k6 = rs.getInt("RANK");
                    String k7 = rs.getString("COURSE");
                    String k8 = rs.getString("FIELD");
                    String k9 = rs.getString("HOSTEL");
                    String k10 = rs.getString("FEE");
                    jt.addRow(new Object[]{k1,k2,k3,k4,k5,k6,k7,k8,k9,k10});
                 }
                    s.close();
                    c.close();
                 }
                 catch(Exception e)
                 {
                   System.out.println("NOT CONNECTED"+e);
                 }
                 jTextField2.setText("");
                 jTextField4.setText("");
                 
             }
        
    }//GEN-LAST:event_jButton5ActionPerformed

//=====================================================================================================    
    
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                new JTABLE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
