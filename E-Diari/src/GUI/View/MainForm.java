/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

/**
 *
 * @author dreni
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public MainForm(int userRoli) {
        initComponents();
        setLocationRelativeTo(null);
        if(userRoli!=1){
            personatBtn.setVisible(false);
            pagesatBtn.setVisible(false);
            perdoruesitBtn.setVisible(false);
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

        navMenu = new javax.swing.JDesktopPane();
        personatBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        veturatBtn = new javax.swing.JButton();
        rentBtn = new javax.swing.JButton();
        rentBackBtn = new javax.swing.JButton();
        pagesatBtn = new javax.swing.JButton();
        perdoruesitBtn = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        exitMI = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navMenu.setBackground(new java.awt.Color(255, 255, 255));

        personatBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        personatBtn.setText("Drejtorat");
        personatBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        personatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personatBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Dashboard");

        veturatBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        veturatBtn.setText("Shiko Veturat");
        veturatBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        veturatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veturatBtnActionPerformed(evt);
            }
        });

        rentBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rentBtn.setText("Rent a car");
        rentBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });

        rentBackBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rentBackBtn.setText("Kthe Veturen");
        rentBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBackBtnActionPerformed(evt);
            }
        });

        pagesatBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pagesatBtn.setText("Pagesat");
        pagesatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagesatBtnActionPerformed(evt);
            }
        });

        perdoruesitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        perdoruesitBtn.setText("Perdoruesit");
        perdoruesitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perdoruesitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navMenuLayout = new javax.swing.GroupLayout(navMenu);
        navMenu.setLayout(navMenuLayout);
        navMenuLayout.setHorizontalGroup(
            navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navMenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rentBackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pagesatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(personatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(veturatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perdoruesitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(navMenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        navMenuLayout.setVerticalGroup(
            navMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navMenuLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(veturatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pagesatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rentBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(perdoruesitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navMenu.setLayer(personatBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(veturatBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(rentBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(rentBackBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(pagesatBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        navMenu.setLayer(perdoruesitBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        desktopPane.setPreferredSize(new java.awt.Dimension(823, 557));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        exitMI.setText("Exit");
        exitMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMIActionPerformed(evt);
            }
        });
        jMenu1.add(exitMI);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Copy");
        jMenu2.add(jMenuItem2);

        pasteMenuItem.setText("Paste");
        jMenu2.add(pasteMenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(navMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personatBtnActionPerformed
        // TODO add your handling code here:
        DrejtoriForm df = new DrejtoriForm();
        desktopPane.add(df);
        df.show();
    }//GEN-LAST:event_personatBtnActionPerformed

    private void veturatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veturatBtnActionPerformed
        // TODO add your handling code here:
        NxenesiForm nf = new NxenesiForm();
        desktopPane.add(nf);
        nf.show();
    }//GEN-LAST:event_veturatBtnActionPerformed

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtnActionPerformed
        // TODO add your handling code here:
//        RentForm rf = new RentForm();
//        desktopPane.add(rf);
//        rf.show();
    }//GEN-LAST:event_rentBtnActionPerformed

    private void rentBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBackBtnActionPerformed
        // TODO add your handling code here:
//        RentBackForm rbf = new RentBackForm();
//        desktopPane.add(rbf);
//        rbf.show();
    }//GEN-LAST:event_rentBackBtnActionPerformed

    private void pagesatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagesatBtnActionPerformed
        // TODO add your handling code here:
//        PagesaForm pf = new PagesaForm();
//        desktopPane.add(pf);
//        pf.show();
    }//GEN-LAST:event_pagesatBtnActionPerformed

    private void perdoruesitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perdoruesitBtnActionPerformed
        // TODO add your handling code here:
//        PerdoruesiForm pf = new PerdoruesiForm();
//        desktopPane.add(pf);
//        pf.show();
    }//GEN-LAST:event_perdoruesitBtnActionPerformed

    private void exitMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMIActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_exitMIActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane navMenu;
    private javax.swing.JButton pagesatBtn;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JButton perdoruesitBtn;
    private javax.swing.JButton personatBtn;
    private javax.swing.JButton rentBackBtn;
    private javax.swing.JButton rentBtn;
    private javax.swing.JButton veturatBtn;
    // End of variables declaration//GEN-END:variables
}