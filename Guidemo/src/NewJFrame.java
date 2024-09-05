import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
       // dmt = (DefaultTableModel)table_program.getModel();
       
       dmt  = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
       };
       
       for (String s:ProgramColumns)
           dmt.addColumn(s);
           dmt.setRowCount(0);
           table_program.setModel(dmt);
           
          
           table_program.setComponentPopupMenu(cm_program);
           
             sdmt  = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }   
       };
             
           for (String s:studentcolum)
           sdmt.addColumn(s);
           sdmt.setRowCount(0);
           tablestudent.setModel(sdmt);
           tablestudent.setComponentPopupMenu(cm_student);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popdialog = new javax.swing.JDialog();
        txtpro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcredithour = new javax.swing.JTextField();
        save_program = new javax.swing.JButton();
        cancel_program = new javax.swing.JButton();
        cm_program = new javax.swing.JPopupMenu();
        cm_program_edit = new javax.swing.JMenuItem();
        cm_program_delete = new javax.swing.JMenuItem();
        studentdialog = new javax.swing.JDialog();
        cbprogram = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtstudent_Id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtstudent_name = new javax.swing.JTextField();
        btnadd_Student = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablestudent = new javax.swing.JTable();
        btnsave_student = new javax.swing.JButton();
        btncancel_student = new javax.swing.JButton();
        cm_student = new javax.swing.JPopupMenu();
        cm_student_edit = new javax.swing.JMenuItem();
        Cm_student_delete = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_program = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mm_add = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mm_student = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jLabel1.setText("Program Name:");

        jLabel2.setText("Duration: ");

        txtduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdurationActionPerformed(evt);
            }
        });

        jLabel3.setText("Credit Hours:");

        jLabel4.setText("Years");

        save_program.setText("Save");
        save_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_programActionPerformed(evt);
            }
        });

        cancel_program.setText("Cancel");
        cancel_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_programActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout popdialogLayout = new javax.swing.GroupLayout(popdialog.getContentPane());
        popdialog.getContentPane().setLayout(popdialogLayout);
        popdialogLayout.setHorizontalGroup(
            popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popdialogLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(save_program)
                    .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popdialogLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpro)
                            .addComponent(txtduration)
                            .addComponent(txtcredithour, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popdialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel_program)
                        .addGap(87, 87, 87))))
        );
        popdialogLayout.setVerticalGroup(
            popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popdialogLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtcredithour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(popdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_program)
                    .addComponent(cancel_program))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        cm_program.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cm_programAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        cm_program_edit.setText("Edit");
        cm_program_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm_program_editActionPerformed(evt);
            }
        });
        cm_program.add(cm_program_edit);

        cm_program_delete.setText("Delete");
        cm_program_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm_program_deleteActionPerformed(evt);
            }
        });
        cm_program.add(cm_program_delete);

        cbprogram.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbprogramItemStateChanged(evt);
            }
        });

        jLabel5.setText("Student ID:");

        jLabel6.setText("Student Name:");

        txtstudent_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudent_nameActionPerformed(evt);
            }
        });

        btnadd_Student.setText("Add");
        btnadd_Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd_StudentActionPerformed(evt);
            }
        });

        tablestudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Program name"
            }
        ));
        jScrollPane2.setViewportView(tablestudent);

        btnsave_student.setText("Save");
        btnsave_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave_studentActionPerformed(evt);
            }
        });

        btncancel_student.setText("Cancel");

        javax.swing.GroupLayout studentdialogLayout = new javax.swing.GroupLayout(studentdialog.getContentPane());
        studentdialog.getContentPane().setLayout(studentdialogLayout);
        studentdialogLayout.setHorizontalGroup(
            studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentdialogLayout.createSequentialGroup()
                .addGroup(studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentdialogLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(cbprogram, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentdialogLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addGroup(studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtstudent_name)
                            .addComponent(txtstudent_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(studentdialogLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(studentdialogLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnsave_student)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncancel_student))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(studentdialogLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnadd_Student)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        studentdialogLayout.setVerticalGroup(
            studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentdialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbprogram, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtstudent_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtstudent_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnadd_Student)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave_student)
                    .addComponent(btncancel_student))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        cm_student_edit.setText("edit");
        cm_student_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cm_student_editActionPerformed(evt);
            }
        });
        cm_student.add(cm_student_edit);

        Cm_student_delete.setText("delete");
        Cm_student_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cm_student_deleteActionPerformed(evt);
            }
        });
        cm_student.add(Cm_student_delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        table_program.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Program Name", "Duration", "Credit Hours"
            }
        ));
        jScrollPane1.setViewportView(table_program);

        jMenu1.setText("Program");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mm_add.setSelected(true);
        mm_add.setText("Add");
        mm_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_addActionPerformed(evt);
            }
        });
        jMenu1.add(mm_add);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Edit");
        jMenu1.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Show");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem3);
        jMenu1.add(jSeparator1);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Exit");
        jMenu1.add(jCheckBoxMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Student");

        mm_student.setSelected(true);
        mm_student.setText("Add ");
        mm_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_studentActionPerformed(evt);
            }
        });
        jMenu2.add(mm_student);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
    }//GEN-LAST:event_formMouseClicked

    private void cancel_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_programActionPerformed
      // addProgramDialog.dispose();
    }//GEN-LAST:event_cancel_programActionPerformed

    private void mm_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_addActionPerformed
   popdialog.setVisible(true);
   popdialog.pack();
   mode=0;
    }//GEN-LAST:event_mm_addActionPerformed

    private void save_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_programActionPerformed
       String pro = txtpro.getText();
       int duration = Integer.parseInt(txtduration.getText());
       int credithour = Integer.parseInt(txtcredithour.getText());
       
       if(mode==0){
       program.add(new program(pro,duration,credithour));
       
       dmt.addRow(new Object[]{pro,duration,credithour});
       
       }
       else if(mode==1){
          program p =  program.get(index);
          p.setProname(pro);
          p.setProduration(duration);
          p.setProcredithours(credithour);
          
          dmt.setValueAt(pro,index,0);
          dmt.setValueAt(duration,index,1);
          dmt.setValueAt(credithour,index,2);
       }
       updatecombo();
       popdialog.dispose();
        //program.add(new program());   
    }//GEN-LAST:event_save_programActionPerformed

    private void txtdurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdurationActionPerformed

    private void cm_program_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm_program_editActionPerformed
        index = table_program.getSelectedRow();
        mode=1;
        if(index!=-1){
            program p = program.get(index);
            txtpro.setText(p.getProname());
            txtduration.setText(String.valueOf(p.getProduration()));
            txtcredithour.setText(String.valueOf(p.getProcredithours()));
            popdialog.setVisible(true);
        }
    }//GEN-LAST:event_cm_program_editActionPerformed

    private void cm_program_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm_program_deleteActionPerformed
       index = table_program.getSelectedRow();
       
        if(index!=-1){
            program.remove(index);
            dmt.removeRow(index);
        }
        popdialog.dispose();
    }//GEN-LAST:event_cm_program_deleteActionPerformed

    private void txtstudent_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudent_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudent_nameActionPerformed

    private void mm_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_studentActionPerformed
        if(!program.isEmpty()){
            studentdialog.setVisible(true);
            studentdialog.pack();
        }else{
            JOptionPane.showMessageDialog(this,"Program does not Exist");
        }
    }//GEN-LAST:event_mm_studentActionPerformed

    private void cbprogramItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbprogramItemStateChanged
       int ind = cbprogram.getSelectedIndex();
       if (ind!=-1){
           ArrayList<Student> students = program.get(ind).getStudent();
           for(Student student:students){
            sdmt.addRow(new Object[]{student.getStudent_ID(),student.getStudent_name()});
           }
       }
    }//GEN-LAST:event_cbprogramItemStateChanged

    private void btnsave_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave_studentActionPerformed
        // TODO add your handling code here:
        index = cbprogram.getSelectedIndex();
        if(index!=1){
        String id = txtstudent_Id.getText();
        String name = txtstudent_name.getText();
       // program.get(index).getStudent().add();
        }   
    }//GEN-LAST:event_btnsave_studentActionPerformed

    private void btnadd_StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd_StudentActionPerformed
         index = cbprogram.getSelectedIndex();
        
        if(index!=-1){
            String id = txtstudent_Id.getText();
            String name = txtstudent_name.getText();
            String pro = txtpro.getText();
            program.get(index).getStudent().add(new Student(id,name));
            sdmt.addRow(new Object[]{id,name,pro});
        }
    }//GEN-LAST:event_btnadd_StudentActionPerformed

    private void cm_student_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cm_student_editActionPerformed
        index = table_program.getSelectedRow();
        sindex = tablestudent.getSelectedRow();
        mode=1;
        if(index!=-1){
            smode = 1;
            Student s = program.get(index).getStudent().get(index);
           txtstudent_Id.setText(s.getStudent_ID());
           txtstudent_name.setText(s.getStudent_name());
        }
    }//GEN-LAST:event_cm_student_editActionPerformed

    private void Cm_student_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cm_student_deleteActionPerformed
          index =  table_program.getSelectedRow();
          sindex = tablestudent.getSelectedRow();
          
        mode=1;
        if(index!=-1 &&sindex!=-1){
           program.get(index).getStudent().remove(index);
        }
    }//GEN-LAST:event_Cm_student_deleteActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void cm_programAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cm_programAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cm_programAncestorAdded

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    public void updatecombo(){
        cbprogram.removeAllItems();
        for(program p :program){
          cbprogram.addItem(p.getProname());  
        }
    }

    String[] ProgramColumns = {"Program Name","Duration","Credithours"};
    String[] studentcolum = {"Student_ID","Student_name"};
    int index,mode,smode,sindex;
    DefaultTableModel dmt,sdmt;
    ArrayList<program>program = new ArrayList<>();
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Cm_student_delete;
    private javax.swing.JButton btnadd_Student;
    private javax.swing.JButton btncancel_student;
    private javax.swing.JButton btnsave_student;
    private javax.swing.JButton cancel_program;
    private javax.swing.JComboBox<String> cbprogram;
    private javax.swing.JPopupMenu cm_program;
    private javax.swing.JMenuItem cm_program_delete;
    private javax.swing.JMenuItem cm_program_edit;
    private javax.swing.JPopupMenu cm_student;
    private javax.swing.JMenuItem cm_student_edit;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JCheckBoxMenuItem mm_add;
    private javax.swing.JCheckBoxMenuItem mm_student;
    private javax.swing.JDialog popdialog;
    private javax.swing.JButton save_program;
    private javax.swing.JDialog studentdialog;
    private javax.swing.JTable table_program;
    private javax.swing.JTable tablestudent;
    private javax.swing.JTextField txtcredithour;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtpro;
    private javax.swing.JTextField txtstudent_Id;
    private javax.swing.JTextField txtstudent_name;
    // End of variables declaration//GEN-END:variables
}
