/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminDashboard;

import SignUp_LogIn.LogIn;
import static SignUp_LogIn.SignUp.emel;
import static SignUp_LogIn.SignUp.usern;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC
 */
public class newAcc extends javax.swing.JFrame {

    /**
     * Creates new form newAcc
     */
    public newAcc() {
        initComponents();
    }
    
    public static String usernam, emal;
        
    public boolean duplicateCheck(){     
    dbConnector dbc = new dbConnector();
    try{
            String query = "SELECT * FROM lmer_table  WHERE lmer_uname = '" + user.getText() + "' OR lmer_email = '" + emailadd.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
           
            if(resultSet.next()){                
              emal = resultSet.getString("lmer_email");      
              if(emal.equals(emailadd.getText())){
               JOptionPane.showMessageDialog(null, "Email is Already Used!");
               emailadd.setText("");
              }
              usernam = resultSet.getString("lmer_uname");
              if(usernam.equals(user.getText())){
               JOptionPane.showMessageDialog(null, "Username is Already Used!");
               user.setText("");
              }
              return true;
            }else{
                return false;
            }
          
        }catch(SQLException ex) {
            System.out.println("" +ex);
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emailadd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        passwo = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        posit = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Log In");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 480, 120, 30);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Create New Account");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 20, 190, 30);

        user.setBackground(new java.awt.Color(0, 102, 51));
        user.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(user);
        user.setBounds(230, 240, 250, 30);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 90, 90, 30);

        firstname.setBackground(new java.awt.Color(0, 102, 51));
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(firstname);
        firstname.setBounds(230, 90, 250, 30);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(100, 140, 90, 30);

        lastname.setBackground(new java.awt.Color(0, 102, 51));
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lastname);
        lastname.setBounds(230, 140, 250, 30);

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email Address:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(100, 190, 120, 30);

        emailadd.setBackground(new java.awt.Color(0, 102, 51));
        emailadd.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(emailadd);
        emailadd.setBounds(230, 190, 250, 30);

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Username:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 240, 120, 30);

        passwo.setBackground(new java.awt.Color(0, 102, 51));
        passwo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(passwo);
        passwo.setBounds(230, 290, 250, 30);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Password:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(100, 290, 120, 30);

        posit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Inventory-In-Charge" }));
        jPanel1.add(posit);
        posit.setBounds(230, 340, 250, 30);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Position:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(100, 340, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
         if(firstname.getText().isEmpty()
                || lastname.getText().isEmpty()
                || emailadd.getText().isEmpty()
                || user.getText().isEmpty()
                || passwo.getText().isEmpty())
            {
            JOptionPane.showMessageDialog(null, "All Fields should be Filled");
            }else if(passwo.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Minimum password should be above 8 character");
            passwo.setText("");  
            
            }else if(duplicateCheck()){
                System.out.println("Duplicate");
            }else{
            dbConnector db = new dbConnector();

                if(db.insertData("INSERT INTO lmer_table (lmer_fname, lmer_lname, lmer_email, lmer_uname, lmer_pass, lmer_acc, lmer_stat) "
                    + "VALUES ('"+firstname.getText()+"',"
                    + " '"+lastname.getText()+"',"
                    + " '"+emailadd.getText()+"', "
                    + " '"+user.getText()+"', "
                    + "'"+passwo.getText()+"', "
                    + "'"+posit.getSelectedItem()+"', 'Pending' ) ")){

                    JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                }else{
                    JOptionPane.showMessageDialog(null, "Connection Error!");
                }
                    LogIn li = new LogIn();
                    li.setVisible(true);
                    this.dispose(); 
            }
        
        
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailadd;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField passwo;
    private javax.swing.JComboBox<String> posit;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
