import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        student.add(new Students("Sano","sukd2102014","sano00","mamady00@gmail.com"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerdialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtrid = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        txtrpassword = new javax.swing.JPasswordField();
        txtrcpassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        btnrregister = new javax.swing.JButton();

        jLabel3.setText("       Name:");

        jLabel4.setText("            ID:");

        txtrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtridActionPerformed(evt);
            }
        });

        jLabel5.setText("      Email:");

        jLabel6.setText(" Password:");

        btnregister.setText("Register");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });

        jLabel7.setText(" Password:");

        javax.swing.GroupLayout registerdialogLayout = new javax.swing.GroupLayout(registerdialog.getContentPane());
        registerdialog.getContentPane().setLayout(registerdialogLayout);
        registerdialogLayout.setHorizontalGroup(
            registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerdialogLayout.createSequentialGroup()
                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerdialogLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(registerdialogLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(txtrcpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registerdialogLayout.createSequentialGroup()
                                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(53, 53, 53)
                                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtemail)
                                    .addComponent(txtrpassword)))
                            .addGroup(registerdialogLayout.createSequentialGroup()
                                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(50, 50, 50)
                                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtname)
                                    .addComponent(txtrid, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))))
                    .addGroup(registerdialogLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnregister)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        registerdialogLayout.setVerticalGroup(
            registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerdialogLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtrid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtrpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrcpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(registerdialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnregister)
                .addGap(38, 38, 38))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 51, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jLabel1.setText("           ID:");

        jLabel2.setText("Password:");

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnrregister.setText("Register");
        btnrregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrregisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnlogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(btnrregister))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid)
                            .addComponent(txtpassword))))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin)
                    .addComponent(btnrregister))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        boolean done = false;
        String ID = txtid.getText();
        String password = new String(txtpassword.getPassword());
        currentskd = new Students(" ",ID,password," ");
        
        for(Students S:student){
        if(S.authenticate(currentskd)){
          currentskd.setStatus(Students.sta_auth);
          currentskd.setName(S.getName());
          currentskd.setEmail(S.getEmail());
          
          break;
        }
        }
        if(currentskd.getStatus()== Students.sta_auth){
            new studentdash(currentskd,this).setVisible(true);
            this.setVisible(false);    
        }else
        {
           JOptionPane.showMessageDialog(NewJFrame.this,"Invalid ID or Password","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtridActionPerformed

    private void btnrregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrregisterActionPerformed
       registerdialog.setVisible(true);
       registerdialog.pack();
       //login.dispose();
    }//GEN-LAST:event_btnrregisterActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
       String name = txtname.getText();
       String id = txtrid.getText();
       String password = new String(txtrpassword.getPassword());
       String conpass = new String (txtrcpassword.getPassword());
       String email = txtemail.getText();
       
       if((!name.isEmpty())&&(!id.isEmpty())&&(password.equals(conpass))&& (!email.isEmpty())){
           student.add (new Students (name,id,password,email));
         JOptionPane.showMessageDialog(NewJFrame.this,"Registration is Successfull",
                 "Verified",JOptionPane.CANCEL_OPTION);
         registerdialog.dispose();
       }
       else{
           JOptionPane.showMessageDialog(NewJFrame.this,"you have an empty field","Warning",
                   JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_btnregisterActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    //NewJFrame login;
    Students currentskd;
    ArrayList<Students> student = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnrregister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JDialog registerdialog;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JPasswordField txtrcpassword;
    private javax.swing.JTextField txtrid;
    private javax.swing.JPasswordField txtrpassword;
    // End of variables declaration//GEN-END:variables
}
