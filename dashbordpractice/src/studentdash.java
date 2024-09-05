public class studentdash extends javax.swing.JFrame {

    public studentdash() {
        initComponents();
    }
    
    public studentdash(Students currentskd, NewJFrame form){
        initComponents();
        login=form;
        txtcurrentskd.setText(currentskd.getId());
        curname.setText(currentskd.getName());
        curemail.setText(currentskd.getEmail());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtcurrentskd = new javax.swing.JLabel();
        curname = new javax.swing.JLabel();
        curemail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("welcome");

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtcurrentskd.setText("ID:");

        curname.setText("Name:");

        curemail.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtcurrentskd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(curemail)
                            .addComponent(curname))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(txtcurrentskd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(curname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(curemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentdash().setVisible(true);
            }
        });
    }

    NewJFrame login;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel curemail;
    private javax.swing.JLabel curname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtcurrentskd;
    // End of variables declaration//GEN-END:variables
}
