import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        
        DTM = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }     
        };
        
        for (String s:Lecturercolumns){
            DTM.addColumn(s);
            DTM.setRowCount(0);
            TL.setModel(DTM);
            TL.setComponentPopupMenu(POP_L);
            
         }
        
        CDTM = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
           for (String s:Coursescolumns){
            CDTM.addColumn(s);
            CDTM.setRowCount(0);
            TC.setModel(CDTM);
            TC.setComponentPopupMenu(POP_C);
        }
           
           SDTM = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
           };
           
           for(String s:Studentcolumns){
               SDTM.addColumn(s);
               SDTM.setRowCount(0);
               TS.setModel(SDTM);
               TS.setComponentPopupMenu(POP_S);
           }
           
           SADTM = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
           };
           
           for(String s:AddStudentcolumns){
               SADTM.addColumn(s);
               SADTM.setRowCount(0);
               TLAS.setModel(SADTM);
               TLAS.setComponentPopupMenu(POP_LS);
           }    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DDA = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        TL = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TS = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TC = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Linsert = new javax.swing.JMenu();
        btnaddL = new javax.swing.JMenuItem();
        Sinsert = new javax.swing.JMenu();
        btnaddS = new javax.swing.JMenuItem();
        Cinsert = new javax.swing.JMenu();
        btnaddC = new javax.swing.JMenuItem();
        DAL = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        txtlid = new javax.swing.JTextField();
        txtlcontact = new javax.swing.JTextField();
        btnDALS = new javax.swing.JButton();
        btnDALC = new javax.swing.JButton();
        POP_L = new javax.swing.JPopupMenu();
        mm_editL = new javax.swing.JMenuItem();
        mm_deleteL = new javax.swing.JMenuItem();
        DAS = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsn = new javax.swing.JTextField();
        txtsid = new javax.swing.JTextField();
        txtsc = new javax.swing.JTextField();
        btnDASS = new javax.swing.JButton();
        btnDASC = new javax.swing.JButton();
        POP_S = new javax.swing.JPopupMenu();
        mm_editS = new javax.swing.JMenuItem();
        mm_deleteS = new javax.swing.JMenuItem();
        DAC = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        txtcid = new javax.swing.JTextField();
        txtcc = new javax.swing.JTextField();
        btnDACS = new javax.swing.JButton();
        btnDACC = new javax.swing.JButton();
        POP_C = new javax.swing.JPopupMenu();
        mm_editC = new javax.swing.JMenuItem();
        mm_deleteC = new javax.swing.JMenuItem();
        DDL = new javax.swing.JDialog();
        jMenuBar2 = new javax.swing.JMenuBar();
        SA = new javax.swing.JMenu();
        btnSA = new javax.swing.JMenuItem();
        MA = new javax.swing.JMenu();
        btnMA = new javax.swing.JMenuItem();
        DLAS = new javax.swing.JDialog();
        cbas = new javax.swing.JComboBox<>();
        cbac = new javax.swing.JComboBox<>();
        btnDLASS = new javax.swing.JButton();
        btnDALSC = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TLAS = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        addstudent = new javax.swing.JButton();
        POP_LS = new javax.swing.JPopupMenu();
        lm_editS = new javax.swing.JMenuItem();
        lm_deleteS = new javax.swing.JMenuItem();
        DLAM = new javax.swing.JDialog();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField16 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        TM = new javax.swing.JTable();
        btnDLAMS = new javax.swing.JButton();
        btnDLAMC = new javax.swing.JButton();
        POP_LM = new javax.swing.JPopupMenu();
        lm_editM = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtlaid = new javax.swing.JTextField();
        txtlap = new javax.swing.JTextField();
        btnAL = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLL = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        btnSL = new javax.swing.JButton();

        DDA.setBounds(new java.awt.Rectangle(200, 250, 0, 0));

        TL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Lecturer Name", "Lecturer_ID", "Lecturer Contact"
            }
        ));
        jScrollPane1.setViewportView(TL);

        TS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "ID", "Contact"
            }
        ));
        jScrollPane2.setViewportView(TS);

        TC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Name", "Course_ID", "Credit "
            }
        ));
        jScrollPane3.setViewportView(TC);

        Linsert.setText("Lecturer");

        btnaddL.setText("ADD");
        btnaddL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddLActionPerformed(evt);
            }
        });
        Linsert.add(btnaddL);

        jMenuBar1.add(Linsert);

        Sinsert.setText("Student");
        Sinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinsertActionPerformed(evt);
            }
        });

        btnaddS.setText("ADD");
        btnaddS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddSActionPerformed(evt);
            }
        });
        Sinsert.add(btnaddS);

        jMenuBar1.add(Sinsert);

        Cinsert.setText("Course");
        Cinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CinsertActionPerformed(evt);
            }
        });

        btnaddC.setText("ADD");
        btnaddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddCActionPerformed(evt);
            }
        });
        Cinsert.add(btnaddC);

        jMenuBar1.add(Cinsert);

        DDA.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout DDALayout = new javax.swing.GroupLayout(DDA.getContentPane());
        DDA.getContentPane().setLayout(DDALayout);
        DDALayout.setHorizontalGroup(
            DDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DDALayout.createSequentialGroup()
                .addGroup(DDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DDALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DDALayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DDALayout.setVerticalGroup(
            DDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DDALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        DAL.setBounds(new java.awt.Rectangle(200, 150, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Lecturer Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("     Lecturer_ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Lecturer Contact:");

        txtlname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });

        txtlid.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtlid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlidActionPerformed(evt);
            }
        });

        txtlcontact.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtlcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlcontactActionPerformed(evt);
            }
        });

        btnDALS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDALS.setText("SAVE");
        btnDALS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDALSActionPerformed(evt);
            }
        });

        btnDALC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDALC.setText("CANCEL");
        btnDALC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDALCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DALLayout = new javax.swing.GroupLayout(DAL.getContentPane());
        DAL.getContentPane().setLayout(DALLayout);
        DALLayout.setHorizontalGroup(
            DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DALLayout.createSequentialGroup()
                .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DALLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DALLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DALLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDALS)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtlcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtlid, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(DALLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDALC)
                .addGap(92, 92, 92))
        );
        DALLayout.setVerticalGroup(
            DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DALLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DALLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(txtlname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtlcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(DALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDALS)
                    .addComponent(btnDALC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mm_editL.setText("Edit");
        mm_editL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_editLActionPerformed(evt);
            }
        });
        POP_L.add(mm_editL);

        mm_deleteL.setText("Delete");
        mm_deleteL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_deleteLActionPerformed(evt);
            }
        });
        POP_L.add(mm_deleteL);

        DAS.setBounds(new java.awt.Rectangle(200, 150, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Student Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Student_ID:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Student Contact:");

        txtsn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        txtsid.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        txtsc.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        btnDASS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDASS.setText("SAVE");
        btnDASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDASSActionPerformed(evt);
            }
        });

        btnDASC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDASC.setText("CANCEL");

        javax.swing.GroupLayout DASLayout = new javax.swing.GroupLayout(DAS.getContentPane());
        DAS.getContentPane().setLayout(DASLayout);
        DASLayout.setHorizontalGroup(
            DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(btnDASS))
                .addGroup(DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DASLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsid)
                            .addComponent(txtsc)
                            .addComponent(txtsn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DASLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(btnDASC)
                        .addGap(78, 78, 78))))
        );
        DASLayout.setVerticalGroup(
            DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DASLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(DASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDASS)
                    .addComponent(btnDASC))
                .addContainerGap())
        );

        mm_editS.setText("Edit");
        mm_editS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_editSActionPerformed(evt);
            }
        });
        POP_S.add(mm_editS);

        mm_deleteS.setText("Delete");
        mm_deleteS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_deleteSActionPerformed(evt);
            }
        });
        POP_S.add(mm_deleteS);

        DAC.setBounds(new java.awt.Rectangle(200, 150, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Course Name:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Course ID:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Credit:");

        txtcname.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        txtcid.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcidActionPerformed(evt);
            }
        });

        txtcc.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        btnDACS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDACS.setText("Save");
        btnDACS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDACSActionPerformed(evt);
            }
        });

        btnDACC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDACC.setText("Cancel");
        btnDACC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDACCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DACLayout = new javax.swing.GroupLayout(DAC.getContentPane());
        DAC.getContentPane().setLayout(DACLayout);
        DACLayout.setHorizontalGroup(
            DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DACLayout.createSequentialGroup()
                .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DACLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnDACS))
                    .addGroup(DACLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(119, 119, 119)
                        .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcname)
                                .addComponent(txtcid)
                                .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDACC))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        DACLayout.setVerticalGroup(
            DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DACLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(DACLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDACC)
                    .addComponent(btnDACS))
                .addGap(45, 45, 45))
        );

        mm_editC.setText("Edit");
        mm_editC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_editCActionPerformed(evt);
            }
        });
        POP_C.add(mm_editC);

        mm_deleteC.setText("Delete");
        mm_deleteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_deleteCActionPerformed(evt);
            }
        });
        POP_C.add(mm_deleteC);

        DDL.setBounds(new java.awt.Rectangle(200, 150, 0, 0));

        SA.setText("Student");

        btnSA.setText("ADD");
        btnSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAActionPerformed(evt);
            }
        });
        SA.add(btnSA);

        jMenuBar2.add(SA);

        MA.setText("Grade");

        btnMA.setText("ADD");
        btnMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAActionPerformed(evt);
            }
        });
        MA.add(btnMA);

        jMenuBar2.add(MA);

        DDL.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout DDLLayout = new javax.swing.GroupLayout(DDL.getContentPane());
        DDL.getContentPane().setLayout(DDLLayout);
        DDLLayout.setHorizontalGroup(
            DDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DDLLayout.setVerticalGroup(
            DDLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        DLAS.setBounds(new java.awt.Rectangle(200, 150, 0, 0));

        cbas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbasItemStateChanged(evt);
            }
        });
        cbas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbasActionPerformed(evt);
            }
        });

        cbac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbac.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbacItemStateChanged(evt);
            }
        });
        cbac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbacActionPerformed(evt);
            }
        });

        btnDLASS.setText("Save");
        btnDLASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDLASSActionPerformed(evt);
            }
        });

        btnDALSC.setText("Cancel");

        TLAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student Name", "Student_ID", "Student Contact", "Course Name", "Course_ID", "Credit"
            }
        ));
        jScrollPane4.setViewportView(TLAS);

        jLabel16.setText("Students");

        jLabel17.setText("Courses");

        addstudent.setText("Add");
        addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DLASLayout = new javax.swing.GroupLayout(DLAS.getContentPane());
        DLAS.getContentPane().setLayout(DLASLayout);
        DLASLayout.setHorizontalGroup(
            DLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DLASLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(cbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(DLASLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(58, 58, 58))
            .addGroup(DLASLayout.createSequentialGroup()
                .addGroup(DLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DLASLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DLASLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(DLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DLASLayout.createSequentialGroup()
                                .addComponent(btnDLASS)
                                .addGap(89, 89, 89)
                                .addComponent(btnDALSC))
                            .addGroup(DLASLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(addstudent)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        DLASLayout.setVerticalGroup(
            DLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DLASLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(DLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addstudent)
                .addGap(23, 23, 23)
                .addGroup(DLASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDLASS)
                    .addComponent(btnDALSC))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        lm_editS.setText("Edit");
        POP_LS.add(lm_editS);

        lm_deleteS.setText("Delete");
        POP_LS.add(lm_deleteS);

        DLAM.setBounds(new java.awt.Rectangle(200, 150, 0, 0));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Students");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Grade:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Courses");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        TM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student Name", "Student_ID", "Course Name", "Course_ID", "Grade"
            }
        ));
        jScrollPane5.setViewportView(TM);

        btnDLAMS.setText("Save");

        btnDLAMC.setText("Cancel");

        javax.swing.GroupLayout DLAMLayout = new javax.swing.GroupLayout(DLAM.getContentPane());
        DLAM.getContentPane().setLayout(DLAMLayout);
        DLAMLayout.setHorizontalGroup(
            DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DLAMLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DLAMLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DLAMLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(DLAMLayout.createSequentialGroup()
                .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DLAMLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DLAMLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnDLAMS)
                        .addGap(114, 114, 114)
                        .addComponent(btnDLAMC)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        DLAMLayout.setVerticalGroup(
            DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DLAMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DLAMLayout.createSequentialGroup()
                        .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(DLAMLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(DLAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDLAMS)
                    .addComponent(btnDLAMC))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lm_editM.setText("Edit");
        POP_LM.add(lm_editM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 150, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Password:");

        txtlaid.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        txtlap.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        btnAL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAL.setText("Login");
        btnAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtlaid)
                            .addComponent(txtlap, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnAL)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnAL)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Admin", jPanel1);

        btnLL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLL.setText("Login");
        btnLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLLActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ID:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Password:");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField9)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLL)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnLL)
                .addGap(15, 15, 15))
        );

        jTabbedPane1.addTab("Lecturer", jPanel2);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ID:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Password:");

        jTextField11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        btnSL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSL.setText("Login");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jTextField12)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnSL)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnSL)
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Student", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void btnDALCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDALCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDALCActionPerformed

    private void btnLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLLActionPerformed
        DDL.setVisible(true);
        DDL.pack();
    }//GEN-LAST:event_btnLLActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void txtcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcidActionPerformed

    private void btnDACCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDACCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDACCActionPerformed

    private void txtlcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlcontactActionPerformed

    private void btnDALSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDALSActionPerformed
       
        String lecname = txtlname.getText();
        int lecid = Integer.parseInt(txtlid.getText());
        int lecc = Integer.parseInt(txtlcontact.getText());
        
        if(mode==0){    
            Lecturer.add(new Lecturers (lecname,lecid,lecc));
            DTM.addRow(new Object[]{lecname,lecid,lecc}); 
        }
        else if (mode==1){
            Lecturers L = Lecturer.get(index);
            L.setLname(lecname);
            L.setLID(lecid);
            L.setLc(lecc);
            
            DTM.setValueAt(lecname,index,0);
            DTM.setValueAt(lecid,index,1);
            DTM.setValueAt(lecc,index,2);
        }
        
        DAL.dispose();        
    }//GEN-LAST:event_btnDALSActionPerformed

    private void txtlidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlidActionPerformed

    private void btnDLASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDLASSActionPerformed
        
        index = cbas.getSelectedIndex();
        indexc = cbac.getSelectedIndex();
        
        if(index!=1){
        String sname = txtsn.getText();
        int Sid = Integer.parseInt(txtsid.getText());
        int Sc = Integer.parseInt(txtsc.getText());
        }
        
        if(indexc!=-1){
            String Cname = txtcname.getText();
           int Cid = Integer.parseInt(txtcid.getText());
           int Cc = Integer.parseInt(txtsid.getText());
        } 
    }//GEN-LAST:event_btnDLASSActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void btnALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALActionPerformed
   
        aidpattern = "^sukd\\d+$";                     
        apasswordpattern = "^(?=.*[A-Za-z])(?=.*\\d).{6,8}$";
        validate=true;
        
        // Lname = txtlname.getText();
        Lid = (txtlaid.getText()); 
        Lcontact = txtlap.getText();//password
        Lname = txtlname.getText();
        
        lidpattern ="^suka\\d+$";
        lpasswordpattern = "^(?=.*[A-Za-z])(?=.*\\d).{6,8}$";
        vald=true;
        
        Sid= txtlaid.getText();
        Sc = txtlap.getText();
        
        validid();
        validpassword();
        validlid();
        validlpassword();
        
         if(validate){
           //Lecturer = new Lecturers(Lname,Lid,Lcontact);
           JOptionPane.showMessageDialog(this, "Login Successfull!", 
                   "Status", JOptionPane.INFORMATION_MESSAGE);
           
            DDA.setVisible(true);
            DDA.pack();
       }
         
          if(vald){
            //Student = new Students();
           JOptionPane.showMessageDialog(this, "Login Successfull!", 
                   "Status", JOptionPane.INFORMATION_MESSAGE);
           
           DDL.setVisible(true);
           DDL.pack();
          } 
    }//GEN-LAST:event_btnALActionPerformed

    private void btnaddLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddLActionPerformed
        DAL.setVisible(true);
        DAL.pack();
        mode=0;
    }//GEN-LAST:event_btnaddLActionPerformed

    private void btnaddSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddSActionPerformed
      DAS.setVisible(true);
      DAS.pack();
    }//GEN-LAST:event_btnaddSActionPerformed

    private void CinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CinsertActionPerformed
        DAC.setVisible(true);
        DAC.pack();
    }//GEN-LAST:event_CinsertActionPerformed

    private void SinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinsertActionPerformed
        DAS.setVisible(true);
        DAS.pack();
    }//GEN-LAST:event_SinsertActionPerformed

    private void btnaddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddCActionPerformed
        DAC.setVisible(true);
        DAC.pack();
    }//GEN-LAST:event_btnaddCActionPerformed

    private void btnSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAActionPerformed
     // if(!Courses.isEmpty){
     //       DLAS.setVisible(true);
     //       DLAS.pack();
     //   }else{
      //      JOptionPane.showMessageDialog(this,"Course does not Exist");
      //  }
      DLAS.setVisible(true);
      DLAS.pack();
    }//GEN-LAST:event_btnSAActionPerformed

    private void btnMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMAActionPerformed
         //if(!Courses.isEmpty){
          //  DLAS.setVisible(true);
          //  DLAS.pack();
       // }else{
       //     JOptionPane.showMessageDialog(this,"Course does not Exist");
       // }
    }//GEN-LAST:event_btnMAActionPerformed

    private void mm_editLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_editLActionPerformed
        index = TL.getSelectedRow();
        mode=1;
        if (index!=-1){
            Lecturers L = Lecturer.get(index);
            txtlname.setText(L.getLname());
            txtlid.setText(String.valueOf(L.getLID()));
            txtlcontact.setText(String.valueOf(L.getLc()));
            DAL.setVisible(true);
        }   
    }//GEN-LAST:event_mm_editLActionPerformed

    private void mm_deleteLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_deleteLActionPerformed
       index = TL.getSelectedRow();
       
       if(index!=-1){
           Lecturer.remove(index);
           DTM.removeRow(index);
       }
         DAL.dispose();
    }//GEN-LAST:event_mm_deleteLActionPerformed

    private void btnDACSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDACSActionPerformed
        String CN = txtcname.getText();
        int Cid = Integer.parseInt(txtcid.getText());
        int credit = Integer.parseInt(txtcc.getText());
        
        if (mode==0){
            Course.add(new Courses(CN,Cid,credit));
            CDTM.addRow(new Object[]{CN,Cid,credit});
        }
        else if(mode==1){
            Courses C = Course.get(indexc);
            C.setCname(CN);
            C.setCid(Cid);
            C.setCc(credit);
            
            CDTM.setValueAt(CN,indexc,0);
            CDTM.setValueAt(Cid,indexc,1);
            CDTM.setValueAt(credit,indexc,2);
        }
        
        DAC.dispose();
    }//GEN-LAST:event_btnDACSActionPerformed

    private void mm_editCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_editCActionPerformed
        index = TC.getSelectedRow();
        mode=1;
        if (index!=-1){
            Courses C = Course.get(index);
            txtcname.setText(C.getCname());
            txtcid.setText(String.valueOf(C.getCid()));
            txtcc.setText(String.valueOf(C.getCc()));
            DAC.setVisible(true);
        }
    }//GEN-LAST:event_mm_editCActionPerformed

    private void mm_deleteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_deleteCActionPerformed
         index = TC.getSelectedRow();
       
       if(index!=-1){
           Course.remove(indexc);
           CDTM.removeRow(indexc);
       }
    }//GEN-LAST:event_mm_deleteCActionPerformed

    private void cbasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbasItemStateChanged
       
    }//GEN-LAST:event_cbasItemStateChanged

    private void cbacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbacItemStateChanged
       
    }//GEN-LAST:event_cbacItemStateChanged

    private void btnDASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDASSActionPerformed
        String SN = txtsn.getText();
        int Sid = Integer.parseInt(txtsid.getText());
        int Sc = Integer.parseInt(txtsc.getText());
        
        if (mode==0){
            Student.add(new Students(SN,Sid,Sc));
            SDTM.addRow(new Object[]{SN,Sid,Sc});
        }
        else if(mode==1){
            Students S= Student.get(index);
            S.setSname(SN);
            S.setSid(Sid);
            S.setSc(Sc);
            
            SDTM.setValueAt(SN,index,0);
            SDTM.setValueAt(Sid,index,1);
            SDTM.setValueAt(Sc,index,2);
        }
        
        DAS.dispose();
    }//GEN-LAST:event_btnDASSActionPerformed

    private void cbasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbasActionPerformed
           cbas.removeAllItems();
        for(Students S : Student){
            cbas.addItem(S.getSname());
        }
        
        if (Student.size()>0){
            Students S = Student.get(0);
            txtsn.setText(S.getSname());
          txtsid.setText(String.valueOf(S.getSid()));
          txtsc.setText(String.valueOf(S.getSc()));
        }
    }//GEN-LAST:event_cbasActionPerformed

    private void cbacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbacActionPerformed
        cbac.removeAllItems();
        for(Courses C : Course){
            cbac.addItem(C.getCname());
        }
        
        if (Course.size()>0){
            Courses C = Course.get(0);
            txtcname.setText(C.getCname());
          txtcid.setText(String.valueOf(C.getCid()));
          txtcc.setText(String.valueOf(C.getCc()));
        }
    }//GEN-LAST:event_cbacActionPerformed

    private void addstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentActionPerformed
        index = cbas.getSelectedIndex();
        indexc= cbac.getSelectedIndex();
        
        if(index!=-1){
            String SN = txtsn.getText();
           int Sid = Integer.parseInt(txtsid.getText());
           int Sc = Integer.parseInt(txtsc.getText());
            Lecturer.get(index).getStudents().add(new Students(SN,Sid,Sc));
            SDTM.addRow(new Object[]{SN,Sid,Sc});
        }
        if (indexc!=1){
            String Cname = txtcname.getText();
           int Cid = Integer.parseInt(txtcid.getText());
           int Cc = Integer.parseInt(txtsid.getText());
           
           Lecturer.get(indexc).getCourse().add(new Courses(Cname,Cid,Cc));
           SDTM.addRow(new Object[]{Cname,Cid,Cc});
        }
    }//GEN-LAST:event_addstudentActionPerformed

    private void mm_editSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_editSActionPerformed
       index = TS.getSelectedRow();
        mode=1;
        if (index!=-1){
            Students S = Student.get(index);
            txtsn.setText(S.getSname());
            txtsid.setText(String.valueOf(S.getSid()));
            txtsc.setText(String.valueOf(S.getSc()));
            DAS.setVisible(true);
        }
    }//GEN-LAST:event_mm_editSActionPerformed

    private void mm_deleteSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_deleteSActionPerformed
          index = TS.getSelectedRow();
       
       if(index!=-1){
           Student.remove(index);
           SDTM.removeRow(index);
       }
         DAS.dispose();
    }//GEN-LAST:event_mm_deleteSActionPerformed

    public void validid(){
         pattern = Pattern.compile(aidpattern);
         matcher = pattern.matcher(Lid);
         
         if(matcher.matches()){
             
         }
         else{
             validate = false;
         }
         
     }
      public void validpassword(){
         
         pattern = Pattern.compile(apasswordpattern);
         matcher = pattern.matcher(Lcontact);
         
         if(matcher.matches()){
             
         }
         else{
             validate = false;
         }
      }
       public void validlid(){
         
         pattern = Pattern.compile(lidpattern);
         matcher = pattern.matcher(Sid);
         
         if(matcher.matches()){
             
         }
         else{
             validate = false;
         }
         
     }
      public void validlpassword(){
         
         pattern = Pattern.compile(lpasswordpattern);
         matcher = pattern.matcher(Sc);
         
         if(matcher.matches()){
             
         }
         else{ 
             validate = false;
         }
      }
         
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    
       Pattern pattern;
       Matcher matcher;
       boolean validate,vald;
       String aidpattern,apasswordpattern,lidpattern,lpasswordpattern,Lname,Lid,Lcontact,Sid,Sc;
       
      // Lecturers Lecturer;
       String[] Lecturercolumns = {"Lecturer Name","Lecturer_ID","Lecturer Contact"};
       String[] Coursescolumns = {"Course Name","Course_ID","Credit"};
       String[] Studentcolumns={"Student Name","Student_ID","Student Contact"};
       String[] AddStudentcolumns={"Student Name","Student_ID","Student Contact","Course Name","Course_ID","Credit"};
       
       DefaultTableModel DTM,CDTM,SDTM,SADTM;    
       int mode,index,indexc;
       
       ArrayList<Courses> Course = new ArrayList<>();
       ArrayList<Lecturers>  Lecturer = new ArrayList<>();
       ArrayList<Students> Student = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cinsert;
    private javax.swing.JDialog DAC;
    private javax.swing.JDialog DAL;
    private javax.swing.JDialog DAS;
    private javax.swing.JDialog DDA;
    private javax.swing.JDialog DDL;
    private javax.swing.JDialog DLAM;
    private javax.swing.JDialog DLAS;
    private javax.swing.JMenu Linsert;
    private javax.swing.JMenu MA;
    private javax.swing.JPopupMenu POP_C;
    private javax.swing.JPopupMenu POP_L;
    private javax.swing.JPopupMenu POP_LM;
    private javax.swing.JPopupMenu POP_LS;
    private javax.swing.JPopupMenu POP_S;
    private javax.swing.JMenu SA;
    private javax.swing.JMenu Sinsert;
    private javax.swing.JTable TC;
    private javax.swing.JTable TL;
    private javax.swing.JTable TLAS;
    private javax.swing.JTable TM;
    private javax.swing.JTable TS;
    private javax.swing.JButton addstudent;
    private javax.swing.JButton btnAL;
    private javax.swing.JButton btnDACC;
    private javax.swing.JButton btnDACS;
    private javax.swing.JButton btnDALC;
    private javax.swing.JButton btnDALS;
    private javax.swing.JButton btnDALSC;
    private javax.swing.JButton btnDASC;
    private javax.swing.JButton btnDASS;
    private javax.swing.JButton btnDLAMC;
    private javax.swing.JButton btnDLAMS;
    private javax.swing.JButton btnDLASS;
    private javax.swing.JButton btnLL;
    private javax.swing.JMenuItem btnMA;
    private javax.swing.JMenuItem btnSA;
    private javax.swing.JButton btnSL;
    private javax.swing.JMenuItem btnaddC;
    private javax.swing.JMenuItem btnaddL;
    private javax.swing.JMenuItem btnaddS;
    private javax.swing.JComboBox<String> cbac;
    private javax.swing.JComboBox<String> cbas;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuItem lm_deleteS;
    private javax.swing.JMenuItem lm_editM;
    private javax.swing.JMenuItem lm_editS;
    private javax.swing.JMenuItem mm_deleteC;
    private javax.swing.JMenuItem mm_deleteL;
    private javax.swing.JMenuItem mm_deleteS;
    private javax.swing.JMenuItem mm_editC;
    private javax.swing.JMenuItem mm_editL;
    private javax.swing.JMenuItem mm_editS;
    private javax.swing.JTextField txtcc;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtlaid;
    private javax.swing.JTextField txtlap;
    private javax.swing.JTextField txtlcontact;
    private javax.swing.JTextField txtlid;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtsc;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsn;
    // End of variables declaration//GEN-END:variables
}
