
package even_management;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class newaccount extends javax.swing.JFrame {


    public static final String driver="com.mysql.jdbc.Driver";
    public static final String url="jdbc:mysql://localhost/eventmanage";
    public static final String user="root";
    public static final String pass="";
    public static Connection con=null;
    public static Statement st=null;


    public newaccount() {
        
        
        try {
            initComponents();
            
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,pass);
            st=con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(newaccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtemailaddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        cmblocation = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbsaturday = new javax.swing.JComboBox<>();
        cmbmonday = new javax.swing.JComboBox<>();
        cmbsunday = new javax.swing.JComboBox<>();
        cmbwetnesday = new javax.swing.JComboBox<>();
        cmbthusday = new javax.swing.JComboBox<>();
        cmbtuesday = new javax.swing.JComboBox<>();
        cmbfriday = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("Register");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(267, 6, 183, 58);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email Address");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Location");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtemailaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailaddressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        cmblocation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmblocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Sylheat", "Mymensingh", "Khulna", "Gazipur", "Valuka", "Savar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname)
                    .addComponent(txtemailaddress)
                    .addComponent(txtpassword)
                    .addComponent(cmblocation, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemailaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmblocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4});

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 730, 145);

        jPanel10.setBackground(new java.awt.Color(153, 51, 255));

        jLabel7.setBackground(new java.awt.Color(0, 204, 51));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Time Slot");

        cmbsaturday.setBackground(new java.awt.Color(153, 204, 0));
        cmbsaturday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbsaturday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbmonday.setBackground(new java.awt.Color(153, 204, 0));
        cmbmonday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbmonday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbsunday.setBackground(new java.awt.Color(153, 204, 0));
        cmbsunday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbsunday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbwetnesday.setBackground(new java.awt.Color(153, 204, 0));
        cmbwetnesday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbwetnesday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbthusday.setBackground(new java.awt.Color(153, 204, 0));
        cmbthusday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbthusday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbtuesday.setBackground(new java.awt.Color(153, 204, 0));
        cmbtuesday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbtuesday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbfriday.setBackground(new java.awt.Color(153, 204, 0));
        cmbfriday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbfriday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        jLabel5.setBackground(new java.awt.Color(153, 153, 255));
        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Sunday");

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setText("Monday");

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setText("Tuesday");

        jLabel10.setBackground(new java.awt.Color(153, 153, 255));
        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel10.setText("Wetnesday");

        jLabel11.setBackground(new java.awt.Color(153, 153, 255));
        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel11.setText("Thusday");

        jLabel12.setBackground(new java.awt.Color(153, 153, 255));
        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel12.setText("Friday");

        jLabel13.setBackground(new java.awt.Color(153, 153, 255));
        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel13.setText("Saturday");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbsaturday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbfriday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbwetnesday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbtuesday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsunday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbmonday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbthusday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsaturday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsunday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbmonday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbtuesday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbwetnesday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbthusday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbfriday, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel5, jLabel8, jLabel9});

        getContentPane().add(jPanel10);
        jPanel10.setBounds(0, 221, 470, 284);

        jPanel2.setBackground(new java.awt.Color(142, 105, 179));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Your Personal Description");

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(476, 307, 254, 198);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 523, 184, 34);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 523, 184, 34);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(496, 523, 184, 34);

        jPanel3.setBackground(new java.awt.Color(114, 169, 48));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("NID ID");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtid))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(476, 221, 254, 80);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/even_management/hd-wallpaper-widescreen.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 730, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailaddressActionPerformed
   
    }//GEN-LAST:event_txtemailaddressActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
           try {
            String name,password,email,description,ID;
            name=txtname.getText();
            password=txtpassword.getText();
            email=txtemailaddress.getText();
            description=txtdescription.getText();
            ID = txtid.getText();
            
            String value=cmblocation.getSelectedItem().toString();
            String value1=cmbsaturday.getSelectedItem().toString();
            String value2=cmbsunday.getSelectedItem().toString();
            String value3=cmbmonday.getSelectedItem().toString();
            String value4=cmbtuesday.getSelectedItem().toString();
            String value5=cmbwetnesday.getSelectedItem().toString();
            String value6=cmbthusday.getSelectedItem().toString();
            String value7=cmbfriday.getSelectedItem().toString();

            
            
            String sql="insert into registation (Name,Password,Email,Location,id)values('"+name+"','"+password+"','"+email+"','"+value+"','"+ID+"' )";
            st.execute(sql);
            
            String sql1="insert into time (id,saturday,sunday,monday,tuesday,wetnesday,thusday,friday,description)"
            + "values('"+ID+"','"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"','"+value6+"','"+value7+"','"+description+"' )";
            st.execute(sql1);
            
            //this.setVisible(false);
            
           }
                 
                 catch (SQLException ex) {
            Logger.getLogger(newaccount.class.getName()).log(Level.SEVERE, null, ex); }
        
        
        JOptionPane.showMessageDialog(null, "Complited"); 
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        new firstevent().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

            new newaccount().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbfriday;
    private javax.swing.JComboBox<String> cmblocation;
    private javax.swing.JComboBox<String> cmbmonday;
    private javax.swing.JComboBox<String> cmbsaturday;
    private javax.swing.JComboBox<String> cmbsunday;
    private javax.swing.JComboBox<String> cmbthusday;
    private javax.swing.JComboBox<String> cmbtuesday;
    private javax.swing.JComboBox<String> cmbwetnesday;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtemailaddress;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
