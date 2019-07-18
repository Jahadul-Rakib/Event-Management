
package even_management;

import static even_management.firstevent.statement;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class UserDesh extends javax.swing.JFrame {
    
    
    public static final String driver="com.mysql.jdbc.Driver";
    public static final String url="jdbc:mysql://localhost/eventmanage";
    public static final String user="root";
    public static final String pass="";
    public static Connection con=null;
    public static Statement st=null;
    public static ResultSet rs;
    private TableModel Model;


    public UserDesh() {
        
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("eventmanage?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        registationQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Registation r");
        registationList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : registationQuery.getResultList();
        eventQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Event e");
        eventList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : eventQuery.getResultList();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmblocationeu = new javax.swing.JComboBox<>();
        txtnameeu = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtdescriptioneu = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtid1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbdurationeu = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtminimumnumbereu = new javax.swing.JTextField();
        txtminimumthresholdeu = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtableattendis = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableinvite = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        btninvaited = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        btninvite = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablenotification = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblinvaition = new javax.swing.JTable();
        btninvaitation = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtevent_idai = new javax.swing.JTextField();
        txtemailai = new javax.swing.JTextField();
        txtnameai = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbsaturdayua = new javax.swing.JComboBox<>();
        cmbmondayua = new javax.swing.JComboBox<>();
        cmbsundayua = new javax.swing.JComboBox<>();
        cmbwetnesdayua = new javax.swing.JComboBox<>();
        cmbthusdayua = new javax.swing.JComboBox<>();
        cmbtuesdayua = new javax.swing.JComboBox<>();
        cmbfridayua = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnameua = new javax.swing.JTextField();
        txtemailaddressua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpasswordua = new javax.swing.JTextField();
        cmblocationua = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        txtdescriptionua = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnshow = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 51, 255));
        setPreferredSize(new java.awt.Dimension(824, 637));
        setResizable(false);
        setSize(new java.awt.Dimension(824, 637));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane5.setBackground(new java.awt.Color(0, 204, 102));
        jTabbedPane5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane5.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTabbedPane5.setMaximumSize(new java.awt.Dimension(813, 605));
        jTabbedPane5.setMinimumSize(new java.awt.Dimension(813, 605));

        jPanel6.setBackground(new java.awt.Color(0, 204, 153));
        jPanel6.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Create New Event");
        jPanel6.add(jLabel15);
        jLabel15.setBounds(10, 11, 180, 34);

        jLabel16.setBackground(new java.awt.Color(0, 102, 102));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Name");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(10, 57, 94, 17);

        jLabel17.setBackground(new java.awt.Color(0, 102, 102));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Location");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(10, 89, 94, 17);

        cmblocationeu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmblocationeu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Sylheat", "Mymensingh", "Khulna", "Gazipur", "Valuka", "Savar" }));
        jPanel6.add(cmblocationeu);
        cmblocationeu.setBounds(323, 88, 199, 21);

        txtnameeu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnameeu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameeuActionPerformed(evt);
            }
        });
        jPanel6.add(txtnameeu);
        txtnameeu.setBounds(323, 56, 199, 21);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Event Description");

        txtdescriptioneu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescriptioneuActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Event ID:");

        txtid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid1ActionPerformed(evt);
            }
        });

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Event ID = NID No+1,2,3.........................");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(55, 55, 55))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtdescriptioneu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(txtid1)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtdescriptioneu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jPanel6.add(jPanel7);
        jPanel7.setBounds(548, 56, 244, 166);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Event Duration");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(10, 120, 104, 29);

        cmbdurationeu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbdurationeu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Hour", "2 Hour", "3 Hour" }));
        jPanel6.add(cmbdurationeu);
        cmbdurationeu.setBounds(323, 125, 199, 21);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Minimum Number Of Attendis");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(10, 154, 204, 28);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Minimum (%) Of threshold");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(10, 188, 185, 28);

        txtminimumnumbereu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(txtminimumnumbereu);
        txtminimumnumbereu.setBounds(323, 159, 199, 21);

        txtminimumthresholdeu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(txtminimumthresholdeu);
        txtminimumthresholdeu.setBounds(323, 193, 199, 21);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(311, 257, 172, 31);

        jtableattendis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, registationList, jtableattendis);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane3.setViewportView(jtableattendis);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(10, 333, 329, 224);

        jtableinvite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtableinvite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Email"
            }
        ));
        jtableinvite.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtableinviteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(jtableinvite);

        jPanel6.add(jScrollPane5);
        jScrollPane5.setBounds(461, 333, 331, 224);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Attendis");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(142, 299, 72, 28);

        btninvaited.setBackground(new java.awt.Color(102, 102, 255));
        btninvaited.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btninvaited.setText("Select");
        btninvaited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninvaitedActionPerformed(evt);
            }
        });
        jPanel6.add(btninvaited);
        btninvaited.setBounds(349, 407, 98, 31);

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel27.setText("Invaited Attendis");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(570, 299, 107, 28);

        btninvite.setBackground(new java.awt.Color(255, 102, 102));
        btninvite.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btninvite.setText("Invite");
        btninvite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninviteActionPerformed(evt);
            }
        });
        jPanel6.add(btninvite);
        btninvite.setBounds(349, 449, 98, 32);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/even_management/miscellaneous_digital_art_hd_wallpapers_colorful_night.jpg"))); // NOI18N
        jPanel6.add(jLabel30);
        jLabel30.setBounds(0, 0, 800, 570);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Event", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setLayout(null);

        tablenotification.setBackground(new java.awt.Color(153, 255, 102));

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, eventList, tablenotification);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${eventId}"));
        columnBinding.setColumnName("Event Id");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${location}"));
        columnBinding.setColumnName("Location");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${eventduration}"));
        columnBinding.setColumnName("Eventduration");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${eventDescription}"));
        columnBinding.setColumnName("Event Description");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane4.setViewportView(tablenotification);

        jPanel3.add(jScrollPane4);
        jScrollPane4.setBounds(10, 300, 782, 257);

        jLabel26.setBackground(new java.awt.Color(102, 102, 255));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("ALL Event");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(347, 269, 97, 25);

        tblinvaition.setBackground(new java.awt.Color(153, 255, 153));
        tblinvaition.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event ID", "Name", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblinvaition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblinvaitionMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblinvaition);
        if (tblinvaition.getColumnModel().getColumnCount() > 0) {
            tblinvaition.getColumnModel().getColumn(0).setResizable(false);
            tblinvaition.getColumnModel().getColumn(1).setResizable(false);
            tblinvaition.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel3.add(jScrollPane6);
        jScrollPane6.setBounds(10, 32, 597, 231);

        btninvaitation.setBackground(new java.awt.Color(204, 0, 204));
        btninvaitation.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btninvaitation.setText("MY Invaitation");
        btninvaitation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninvaitationActionPerformed(evt);
            }
        });
        jPanel3.add(btninvaitation);
        btninvaitation.setBounds(625, 32, 167, 46);

        jButton3.setBackground(new java.awt.Color(204, 0, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(709, 0, 83, 30);
        jPanel3.add(txtevent_idai);
        txtevent_idai.setBounds(625, 89, 167, 34);
        jPanel3.add(txtemailai);
        txtemailai.setBounds(625, 179, 167, 34);
        jPanel3.add(txtnameai);
        txtnameai.setBounds(625, 134, 167, 34);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Accept");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(625, 232, 167, 31);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/even_management/6798385-high-resolution-space-wallpaper.jpg"))); // NOI18N
        jPanel3.add(jLabel21);
        jLabel21.setBounds(0, 0, 800, 570);

        jTabbedPane5.addTab("Notification", jPanel3);

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(813, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(153, 102, 255));

        jLabel7.setBackground(new java.awt.Color(0, 204, 51));
        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Time Slot");

        cmbsaturdayua.setBackground(new java.awt.Color(153, 204, 0));
        cmbsaturdayua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbsaturdayua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbmondayua.setBackground(new java.awt.Color(153, 204, 0));
        cmbmondayua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbmondayua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbsundayua.setBackground(new java.awt.Color(153, 204, 0));
        cmbsundayua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbsundayua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbwetnesdayua.setBackground(new java.awt.Color(153, 204, 0));
        cmbwetnesdayua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbwetnesdayua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbthusdayua.setBackground(new java.awt.Color(153, 204, 0));
        cmbthusdayua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbthusdayua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbtuesdayua.setBackground(new java.awt.Color(153, 204, 0));
        cmbtuesdayua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbtuesdayua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

        cmbfridayua.setBackground(new java.awt.Color(153, 204, 0));
        cmbfridayua.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cmbfridayua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am_12:00am", "12:01pm_3:00pm", "3:01pm_6:00pm", "6:01pm_9:00pm", "9:01pm_12:00pm", "Not Available", "All are Available" }));

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
                    .addComponent(cmbsaturdayua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbfridayua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbwetnesdayua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbtuesdayua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsundayua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbmondayua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbthusdayua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(cmbsaturdayua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsundayua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbmondayua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbtuesdayua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbwetnesdayua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbthusdayua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbfridayua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10);
        jPanel10.setBounds(0, 226, 470, 284);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("Upgrade account");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(264, 11, 233, 28);

        jPanel4.setBackground(new java.awt.Color(204, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email Address");

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Location");

        txtnameua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameuaActionPerformed(evt);
            }
        });

        txtemailaddressua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailaddressuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        txtpasswordua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassworduaActionPerformed(evt);
            }
        });

        cmblocationua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmblocationua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Chittagong", "Sylheat", "Mymensingh", "Khulna", "Gazipur", "Valuka", "Savar" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnameua)
                    .addComponent(txtemailaddressua)
                    .addComponent(txtpasswordua)
                    .addComponent(cmblocationua, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtnameua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtemailaddressua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmblocationua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpasswordua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 70, 802, 150);

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Your Personal Description");

        lbldescription.setBackground(new java.awt.Color(255, 255, 255));
        lbldescription.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtdescriptionua, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333)
                .addComponent(lbldescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtdescriptionua))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(480, 307, 322, 203);

        jPanel8.setBackground(new java.awt.Color(0, 204, 153));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Upgrade");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel8);
        jPanel8.setBounds(0, 516, 802, 52);

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid);
        txtid.setBounds(553, 226, 170, 33);

        jPanel9.setBackground(new java.awt.Color(153, 51, 255));

        jLabel23.setBackground(new java.awt.Color(153, 51, 255));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("ID");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9);
        jPanel9.setBounds(480, 226, 67, 33);

        jPanel11.setBackground(new java.awt.Color(204, 102, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11);
        jPanel11.setBounds(480, 226, 322, 33);

        btnshow.setBackground(new java.awt.Color(204, 153, 255));
        btnshow.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnshow.setText("Show All Please");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });
        jPanel1.add(btnshow);
        btnshow.setBounds(480, 270, 322, 31);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/even_management/spider-web-hd-1.jpg"))); // NOI18N
        jPanel1.add(jLabel29);
        jLabel29.setBounds(0, 0, 800, 570);

        jTabbedPane5.addTab("Profile", jPanel1);

        getContentPane().add(jTabbedPane5);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        try {
            
           
            String name,attendies,thresold, description,id,event_id;
            
            attendies= txtminimumnumbereu.getText();
            thresold = txtminimumthresholdeu.getText();
            description = txtdescriptioneu.getText();
            name= txtnameeu.getText();
            String location=cmblocationeu.getSelectedItem().toString();
            String duration=cmbdurationeu.getSelectedItem().toString();
            id = txtid.getText();
            event_id= txtid1.getText();
            
            String Sql ="insert into event (id,event_id,Name,Location,eventduration,minimum_number_of_attendies,minimum_number_of_thresold,event_description)values('"+txtid.getText()+"','"+txtid1.getText()+"','"+name+"','"+location+"','"+duration+"','"+attendies+"','"+thresold+"','"+description+"' )";
            st.execute(Sql);
            
             JOptionPane.showMessageDialog(null,"event Created");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"try again");
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnameeuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameeuActionPerformed

    }//GEN-LAST:event_txtnameeuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String name,password,email,description,id;
            name=txtnameua.getText();
            password=txtpasswordua.getText();
            email=txtemailaddressua.getText();
            description=txtdescriptionua.getText();
            id =txtid.getText();

            String value=cmblocationua.getSelectedItem().toString();
            
            String value1=cmbsaturdayua.getSelectedItem().toString();
            String value2=cmbsundayua.getSelectedItem().toString();
            String value3=cmbmondayua.getSelectedItem().toString();
            String value4=cmbtuesdayua.getSelectedItem().toString();
            String value5=cmbwetnesdayua.getSelectedItem().toString();
            String value6=cmbthusdayua.getSelectedItem().toString();
            String value7=cmbfridayua.getSelectedItem().toString();

            
            String sql=" update `registation` SET `Name`= '"+txtnameua.getText()+"',"
                    + "`Email`='"+txtemailaddressua.getText()+"',`Location`='"+cmblocationua.getSelectedItem()+"',"
                    + "`Password`='"+txtpasswordua.getText()+"'  WHERE id = '"+txtid.getText()+"' ";
            st.execute(sql);

            String sql1=" update `time` SET `saturday`='"+cmbsaturdayua.getSelectedItem()+"',`sunday`='"+cmbsundayua.getSelectedItem()+"',`monday`='"+cmbmondayua.getSelectedItem()+"',`tuesday`='"+cmbtuesdayua.getSelectedItem()+"',`wetnesday`='"+cmbwetnesdayua.getSelectedItem()+"',`thusday`='"+cmbthusdayua.getSelectedItem()+"',`friday`='"+cmbfridayua.getSelectedItem()+"',`description`='"+txtdescriptionua.getText()+"'  WHERE id = '"+txtid.getText()+"'" ;
            st.execute(sql1);
            
            JOptionPane.showMessageDialog(null,"Updated");

            this.setVisible(true);
            

        }

        catch (SQLException ex) {
            Logger.getLogger(newaccount.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"try again");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpassworduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassworduaActionPerformed

    }//GEN-LAST:event_txtpassworduaActionPerformed

    private void txtemailaddressuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailaddressuaActionPerformed

    }//GEN-LAST:event_txtemailaddressuaActionPerformed

    private void txtnameuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameuaActionPerformed

    }//GEN-LAST:event_txtnameuaActionPerformed

    private void txtdescriptioneuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescriptioneuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescriptioneuActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        try {
               String sql1 = "select * from `time` where id = '"+txtid.getText()+"'";
               ResultSet rs1=statement.executeQuery(sql1); 
        while(rs1.next()){
            if ((txtid.getText().equals(rs1.getString("id")))){
                
                JOptionPane.showMessageDialog(null, "thank you"); 
                
          
         cmbsaturdayua.setSelectedItem(rs1.getString("saturday"));    
         cmbsundayua.setSelectedItem(rs1.getString("sunday"));    
         cmbmondayua.setSelectedItem(rs1.getString("monday"));    
         cmbtuesdayua.setSelectedItem(rs1.getString("tuesday"));    
         cmbwetnesdayua.setSelectedItem(rs1.getString("wetnesday"));    
         cmbthusdayua.setSelectedItem(rs1.getString("thusday"));    
         cmbfridayua.setSelectedItem(rs1.getString("friday"));    
         txtdescriptionua.setText(rs1.getString("description"));    
     }
          
     } }
        catch (SQLException e) {
            }
    }//GEN-LAST:event_btnshowActionPerformed

    private void btninvaitedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninvaitedActionPerformed
        
        TableModel model1 = jtableattendis.getModel();
        int[] indexs = jtableattendis.getSelectedRows();
        Object[] row = new Object[3];
        DefaultTableModel model2 = (DefaultTableModel) jtableinvite.getModel();
        
        for(int i = 0; i < indexs.length; i++){
        
        row[0] = model1.getValueAt(indexs[i], 0);
        row[1] = model1.getValueAt(indexs[i], 1);
        row[2] = model1.getValueAt(indexs[i], 2);
        
        
        model2.addRow(row);

        }    

        
     JOptionPane.showMessageDialog(null, "selectd");    
  
   
    }//GEN-LAST:event_btninvaitedActionPerformed

    private void jtableinviteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtableinviteAncestorAdded
        
    }//GEN-LAST:event_jtableinviteAncestorAdded

    private void btninviteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninviteActionPerformed
        
        
try{
int rows=jtableinvite.getRowCount();
Class.forName("com.mysql.jdbc.Driver").newInstance();
con.setAutoCommit(false);
String g = "INSERT INTO `invaitation`(`id`, `event_id`, `Name`, `Email`, `creatorid`) VALUES (?,? ,?,?,?)";
st = con.prepareStatement(g);

for(int row = 0; row<rows; row++)
{
    
    String id = (String)jtableinvite.getValueAt(row, 0);
    String event_id= txtid1.getText();
    String Name = (String)jtableinvite.getValueAt(row, 1);
    String Email = (String)jtableinvite.getValueAt(row, 2);
    String creatorid= txtid.getText();

    PreparedStatement stmt = con.prepareStatement(g);
    stmt.setString(1,id);
    stmt.setString(2,event_id);
    stmt.setString(3,Name);
    stmt.setString(4,Email);
    stmt.setString(5,creatorid);
    
    stmt.addBatch();
    
    stmt.executeBatch();
    con.commit();
}
JOptionPane.showMessageDialog(null,"ok");
}
catch(Exception e){
    JOptionPane.showMessageDialog(this,e.getMessage());
}
        
        
        
    }//GEN-LAST:event_btninviteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new firstevent().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid1ActionPerformed

    private void btninvaitationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninvaitationActionPerformed
        
        
         try {
            String sqlin ="select event_id, Name, Email from `invaitation` where id = '"+txtid.getText()+"'";
            statement = con.createStatement();
            rs=statement.executeQuery(sqlin);;
            
            TableModel Model = DbUtils.resultSetToTableModel(rs);
            tblinvaition.setModel(Model);
        } catch (Exception e) {
            
            
        }
        
        
    }//GEN-LAST:event_btninvaitationActionPerformed

    private void tblinvaitionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblinvaitionMouseClicked
       
        DefaultTableModel Model1 = (DefaultTableModel)tblinvaition.getModel();
        int selectedRowIndex = tblinvaition.getSelectedRow();
        
        txtevent_idai.setText(Model1.getValueAt(selectedRowIndex, 0).toString());
        txtnameai.setText(Model1.getValueAt(selectedRowIndex, 1).toString());
        txtemailai.setText(Model1.getValueAt(selectedRowIndex, 2).toString());
        
        

   
    }//GEN-LAST:event_tblinvaitionMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           try {
                
           int choice;
           JDialog.setDefaultLookAndFeelDecorated(false);
           int YES_NO_OPTION = JOptionPane.YES_NO_OPTION; 
           int YES_Option =0;

           choice = JOptionPane.showConfirmDialog( null,"do you want to attand  ?");

           if( choice == YES_Option){
           
           String sql12=  ("update `invaitation` SET `attandis`= 1 WHERE Email='"+txtemailai.getText()+ "' AND event_id='"+txtevent_idai.getText()+"' ");
           
           ResultSet rs12=statement.executeQuery(sql12);
 
           while(rs12.next()){
           if ((txtemailai.getText().equals(rs12.getString("Email"))) && (txtevent_idai.getText().equals(rs12.getString("event_id"))) ) {
           
                
        
        }  
        }}
           
           else if(choice != YES_Option){
           JOptionPane.showMessageDialog(null, "thats ok");} 
           
           } catch (Exception e) {
                          JOptionPane.showMessageDialog(null, "Error");

           }
 
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserDesh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDesh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDesh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDesh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDesh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninvaitation;
    private javax.swing.JButton btninvaited;
    private javax.swing.JButton btninvite;
    private javax.swing.JButton btnshow;
    private javax.swing.JComboBox<String> cmbdurationeu;
    public javax.swing.JComboBox<String> cmbfridayua;
    private javax.swing.JComboBox<String> cmblocationeu;
    public javax.swing.JComboBox<String> cmblocationua;
    public javax.swing.JComboBox<String> cmbmondayua;
    public javax.swing.JComboBox<String> cmbsaturdayua;
    public javax.swing.JComboBox<String> cmbsundayua;
    public javax.swing.JComboBox<String> cmbthusdayua;
    public javax.swing.JComboBox<String> cmbtuesdayua;
    public javax.swing.JComboBox<String> cmbwetnesdayua;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<even_management.Event> eventList;
    private javax.persistence.Query eventQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane5;
    public javax.swing.JTable jtableattendis;
    public javax.swing.JTable jtableinvite;
    public javax.swing.JLabel lbldescription;
    private java.util.List<even_management.Registation> registationList;
    private javax.persistence.Query registationQuery;
    public javax.swing.JTable tablenotification;
    public javax.swing.JTable tblinvaition;
    private javax.swing.JTextField txtdescriptioneu;
    public javax.swing.JTextField txtdescriptionua;
    public javax.swing.JTextField txtemailaddressua;
    private javax.swing.JTextField txtemailai;
    private javax.swing.JTextField txtevent_idai;
    public javax.swing.JTextField txtid;
    private javax.swing.JTextField txtid1;
    private javax.swing.JTextField txtminimumnumbereu;
    private javax.swing.JTextField txtminimumthresholdeu;
    private javax.swing.JTextField txtnameai;
    private javax.swing.JTextField txtnameeu;
    public javax.swing.JTextField txtnameua;
    private javax.swing.JTextField txtpasswordua;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

   
}
