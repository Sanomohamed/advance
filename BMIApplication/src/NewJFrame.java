import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGender = new javax.swing.ButtonGroup();
        gender = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtName = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCalculateBMI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rbm = new javax.swing.JRadioButton();
        rbf = new javax.swing.JRadioButton();
        icone = new javax.swing.JLabel();
        txtBMI = new java.awt.TextArea();
        txtStatus = new java.awt.TextArea();
        st = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        txtName1 = new javax.swing.JTextField();
        label8 = new java.awt.Label();
        txtAge1 = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        txtWeight1 = new javax.swing.JTextField();
        label10 = new java.awt.Label();
        txtHeight1 = new javax.swing.JTextField();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        icone1 = new javax.swing.JLabel();
        btnu = new javax.swing.JButton();
        cbrecord = new javax.swing.JComboBox<>();
        btnde = new javax.swing.JButton();
        btnd = new javax.swing.JButton();
        rbtnf1 = new javax.swing.JRadioButton();
        rbtnm1 = new javax.swing.JRadioButton();
        output1 = new java.awt.TextArea();
        txtStatus1 = new java.awt.TextArea();
        Report = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("Age");

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("Name");

        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("M");

        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("Weight");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCalculateBMI.setText("Calculate BMI");
        btnCalculateBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateBMIActionPerformed(evt);
            }
        });

        jLabel1.setText("Status");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("BMI");

        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("Height");

        label6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label6.setText("KG");

        jLabel3.setText("Gender");

        txtGender.add(rbm);
        rbm.setText("Male");
        rbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmActionPerformed(evt);
            }
        });

        txtGender.add(rbf);
        rbf.setSelected(true);
        rbf.setText("Female");
        rbf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfActionPerformed(evt);
            }
        });

        icone.setBackground(new java.awt.Color(255, 255, 0));
        icone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/female.png"))); // NOI18N

        st.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbf)
                                    .addComponent(rbm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCalculateBMI))
                        .addGap(165, 165, 165))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtHeight, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnSave)
                                    .addGap(8, 8, 8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rbm)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(rbf)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnCalculateBMI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(88, 88, 88))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(101, 101, 101)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("New", jPanel1);

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("Name");

        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("Age");

        label9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label9.setText("Weight");

        label10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label10.setText("Height");

        label11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label11.setText("M");

        label12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label12.setText("KG");

        jLabel4.setText("Gender");

        icone1.setBackground(new java.awt.Color(255, 255, 0));
        icone1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/female.png"))); // NOI18N

        btnu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnu.setText("Update");
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuActionPerformed(evt);
            }
        });

        cbrecord.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrecordActionPerformed(evt);
            }
        });

        btnde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnde.setText("Remove");
        btnde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeActionPerformed(evt);
            }
        });

        btnd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnd.setText("Display");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        gender.add(rbtnf1);
        rbtnf1.setSelected(true);
        rbtnf1.setText("Female");
        rbtnf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnf1ActionPerformed(evt);
            }
        });

        gender.add(rbtnm1);
        rbtnm1.setText("Male");
        rbtnm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnm1ActionPerformed(evt);
            }
        });

        Report.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Report.setText("Report");
        Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtHeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnde, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnrefresh)
                                .addGap(18, 18, 18)
                                .addComponent(btnu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbrecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnf1)
                                    .addComponent(rbtnm1))))
                        .addGap(18, 18, 18)
                        .addComponent(icone1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txtStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbrecord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHeight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))))
                .addGap(52, 52, 52)
                .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icone1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rbtnm1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnf1)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnde, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(txtStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Edit", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

   
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        double weight = Double.parseDouble(txtWeight.getText());
        double height = Double.parseDouble(txtHeight.getText());
        double BMI = Double.parseDouble(txtBMI.getText());
        String gender = null;
        
            if (rbm.isSelected()) {
                gender = "Male"; 
           } else if (rbf.isSelected()) {
              gender = "Female"; 
             }
       
        Users.add(new Person(name,age,weight,height,BMI,gender));
        txtName.setText("");
        txtAge.setText("");
        txtWeight.setText("");
        txtHeight.setText("");
        txtBMI.setText(" ");
        
        txtStatus.setText("Record added!");   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCalculateBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateBMIActionPerformed
       double weight = Double.parseDouble(txtWeight.getText());
       double height = Double.parseDouble(txtHeight.getText());
       
       double BMI = weight/(height*height);
       DecimalFormat df = new DecimalFormat("#.##");
       String formattedBMI = df.format(BMI);
      
       if(BMI < 18.5){
            st.setText("Status: Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            st.setText("Status: Normal Weight");
        }
        else if (BMI >= 25 && BMI <= 29.9){
            st.setText("Status: Overweight");
        }
        else if (BMI >= 30 && BMI <= 34.9) {
        st.setText("Status: Slighly Obese"); 
        }
        else if(BMI >= 35 && BMI <= 39.9){
            st.setText("Status: Moderately Obese");
        }
        
          txtBMI.setText(formattedBMI);
    }//GEN-LAST:event_btnCalculateBMIActionPerformed

    private void rbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmActionPerformed
        if(rbf.isSelected()){
        ImageIcon femaleIcons = new ImageIcon(getClass().getResource("/icons/female.png"));
            icone.setIcon(femaleIcons);
       }else {
            ImageIcon maleIcons = new ImageIcon(getClass().getResource("/icons/male.png"));
            icone.setIcon(maleIcons);
       }
    }//GEN-LAST:event_rbmActionPerformed

    private void rbfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfActionPerformed
      if(rbf.isSelected()){
        ImageIcon femaleIcons = new ImageIcon(getClass().getResource("/icons/female.png"));
            icone.setIcon(femaleIcons);
       }else {
            ImageIcon maleIcons = new ImageIcon(getClass().getResource("/icons/male.png"));
            icone.setIcon(maleIcons);
       }
    }//GEN-LAST:event_rbfActionPerformed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
       String msg="";
       for(Person p: Users){
           msg+=p.toString()+"\n";
           output1.setText(msg);
           
       }
    }//GEN-LAST:event_btndActionPerformed

    private void rbtnm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnm1ActionPerformed
        if(rbtnf1.isSelected()){
        ImageIcon femaleIcons = new ImageIcon(getClass().getResource("/icons/female.png"));
            icone1.setIcon(femaleIcons);
       }else {
            ImageIcon maleIcons = new ImageIcon(getClass().getResource("/icons/male.png"));
            icone1.setIcon(maleIcons);
       }
    }//GEN-LAST:event_rbtnm1ActionPerformed

    private void rbtnf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnf1ActionPerformed
        if(rbtnf1.isSelected()){
        ImageIcon femaleIcons = new ImageIcon(getClass().getResource("/icons/female.png"));
            icone1.setIcon(femaleIcons);
       }else {
            ImageIcon maleIcons = new ImageIcon(getClass().getResource("/icons/male.png"));
            icone1.setIcon(maleIcons);
       }
    }//GEN-LAST:event_rbtnf1ActionPerformed

    private void btndeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeActionPerformed
          if(selection!=-1){
          
           Person P =Users.remove(selection);
           txtName1.setText(" ");
           txtAge1.setText(" ");
           txtWeight1.setText(" ");
           txtHeight1.setText(" ");
           txtStatus1.setText("Record has been remove");
           
              updatecombo();
       }
    }//GEN-LAST:event_btndeActionPerformed

    private void btnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuActionPerformed
    if (selection!=-1){
             
    Person P = Users.get(selection);
    P.setName(txtName1.getText());
    P.setAge(Integer.parseInt(txtAge1.getText()));
    P.setWeight(Double.parseDouble(txtWeight1.getText()));
    P.setHeight(Double.parseDouble(txtHeight1.getText()));
    
        double weight1 = Double.parseDouble(txtWeight1.getText());
        double height1 = Double.parseDouble(txtHeight1.getText());
        double BMI;
        
          BMI = weight1 / (height1 * height1);
          DecimalFormat df = new DecimalFormat("#.00"); // Format to two decimal places
          String formattedBMI = df.format(BMI);
          P.setBMI(Double.parseDouble(formattedBMI));
             
          String gender = null; 
        if (rbtnm1.isSelected()) {
             gender = "Male"; 
       } else if (rbtnf1.isSelected()) {
             gender = "Female"; 
        }
        
        P.setGender(gender);
 
    txtStatus1.setText("Record updated!");
        
     updatecombo();
    }     
   
    }//GEN-LAST:event_btnuActionPerformed

    private void cbrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrecordActionPerformed

    }//GEN-LAST:event_cbrecordActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
            cbrecord.removeAllItems();
        for(Person P : Users){
            cbrecord.addItem(P.getName());
        }
        
        if (Users.size()>0){
          Person p = Users.get(0);
          txtName1.setText(p.getName());
          txtAge1.setText(String.valueOf(p.getAge()));
          txtWeight1.setText(String.valueOf(p.getWeight()));
          txtHeight1.setText(String.valueOf( p.getHeight()));    
        }
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportActionPerformed
         String msg="";
       for(Person p: Users){
           msg+=p.toString()+"\n";
           output1.setText(msg);
       }
    }//GEN-LAST:event_ReportActionPerformed

    public void updatecombo(){
        cbrecord.removeAllItems();
        for(Person P: Users){
            cbrecord.addItem(P.getName());
        }
    }
    
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
         int selection;    
         ArrayList<Person>Users = new ArrayList<>();
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Report;
    private javax.swing.JButton btnCalculateBMI;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btnde;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnu;
    private javax.swing.JComboBox<String> cbrecord;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel icone1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextArea output1;
    private javax.swing.JRadioButton rbf;
    private javax.swing.JRadioButton rbm;
    private javax.swing.JRadioButton rbtnf1;
    private javax.swing.JRadioButton rbtnm1;
    private javax.swing.JTextField st;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAge1;
    private java.awt.TextArea txtBMI;
    private javax.swing.ButtonGroup txtGender;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtHeight1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private java.awt.TextArea txtStatus;
    private java.awt.TextArea txtStatus1;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtWeight1;
    // End of variables declaration//GEN-END:variables
}
