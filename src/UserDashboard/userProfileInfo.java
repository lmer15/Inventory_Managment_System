/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDashboard;

/**
 *
 * @author Elmer Rapon
 */
public class userProfileInfo extends javax.swing.JFrame {

    /**
     * Creates new form userProfiileInfo
     */
    public userProfileInfo() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        u_username = new javax.swing.JLabel();
        u_position = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        u_accountstat = new javax.swing.JLabel();
        u_fullname = new javax.swing.JLabel();
        u_email = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICTURE/icons8-list-25.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 40, 30);

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Profile");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 10, 130, 28);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PICTURE/icons8-user-100.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 80, 590, 100);

        u_username.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        u_username.setForeground(new java.awt.Color(255, 255, 255));
        u_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(u_username);
        u_username.setBounds(10, 180, 590, 20);

        u_position.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        u_position.setForeground(new java.awt.Color(255, 255, 255));
        u_position.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(u_position);
        u_position.setBounds(11, 210, 590, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ACCOUNT STATUS: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 350, 170, 30);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAME:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 290, 60, 30);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMAIL:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 320, 60, 30);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BACK");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(270, 570, 70, 30);

        u_accountstat.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        u_accountstat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(u_accountstat);
        u_accountstat.setBounds(290, 350, 290, 30);

        u_fullname.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        u_fullname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(u_fullname);
        u_fullname.setBounds(290, 290, 290, 30);

        u_email.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        u_email.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(u_email);
        u_email.setBounds(290, 320, 290, 30);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 2, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("or");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 540, 30, 30);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 2, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Change Password");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 520, 170, 20);

        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 540, 280, 20);

        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 540, 280, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:\
        user usr = new user();
        usr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        changePass cp = new changePass();
        cp.setVisible(true);     
       
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(userProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userProfileInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userProfileInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel u_accountstat;
    public javax.swing.JLabel u_email;
    public javax.swing.JLabel u_fullname;
    public javax.swing.JLabel u_position;
    public javax.swing.JLabel u_username;
    // End of variables declaration//GEN-END:variables
}