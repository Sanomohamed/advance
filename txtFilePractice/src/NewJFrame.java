import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();
        btnload = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("name");

        jLabel2.setText("Age");

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnload.setText("Load");
        btnload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnadd)
                .addGap(54, 54, 54)
                .addComponent(btnload)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(txtage))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnload)
                    .addComponent(btnadd))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
      String message ="";
      for(Students s:student){
          message+=s.toString();
          try {
              FileWriter fw =new FileWriter(file);
              fw.write(message);
              fw.flush();
              fw.close();
          } catch (IOException ex) {
              Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
       
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
       String name = txtname.getText();
       int age = Integer.parseInt(txtage.getText());
       
       student.add(new Students(name,age));
       txtname.setText("");
       txtage.setText("");
 
      String message="Record saved in the list: "+student.size()+"\n";
      txtoutput.setText(message);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadActionPerformed
       student.clear();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String data,message="";
            while((data=br.readLine())!=null){
                String [] fields = data.split(":");
                student.add(new Students(fields[0],Integer.parseInt(fields[1])));  
            }
            br.close();
            fr.close();
            
            for(Students s:student){
                message="name: "+s.getName()+"\nAge: "+s.getAge()+"\n";
                txtoutput.setText(message);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnloadActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    File path = new File("C:\\Users\\Hp\\Desktop");
    File file = new File(path,"student.dat");
    ArrayList<Students> student = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnload;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}
