/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import learnswing.DangKy;

/**
 *
 * @author TGDD
 */
public class BaiTH5_2 extends javax.swing.JFrame {

    /**
     * Creates new form BaiTH5_1
     */
    public BaiTH5_2() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        tlbMain = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pnlTextPadField = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edPane = new javax.swing.JTextPane();
        mbMain = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniNew = new javax.swing.JMenuItem();
        mniOpen = new javax.swing.JMenuItem();
        mniSave = new javax.swing.JMenuItem();
        mniExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mnSetting = new javax.swing.JMenu();
        mnWindow = new javax.swing.JMenu();
        mnHelp = new javax.swing.JMenu();
        mnWelcome = new javax.swing.JMenu();
        mniLogin = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tlbMain.setRollover(true);

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Custom-Icon-Design-Pretty-Office-11-New.32.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.setHideActionText(true);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewActionPerformed(evt);
            }
        });
        tlbMain.add(btnNew);

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Custom-Icon-Design-Pretty-Office-9-Open-file.32.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        tlbMain.add(btnOpen);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Custom-Icon-Design-Pretty-Office-7-Save.32.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        tlbMain.add(btnSave);

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Oxygen-Icons.org-Oxygen-Actions-application-exit.32.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        tlbMain.add(btnExit);

        pnlTextPadField.setBorder(javax.swing.BorderFactory.createTitledBorder("TextPad Field"));

        jScrollPane1.setViewportView(edPane);

        javax.swing.GroupLayout pnlTextPadFieldLayout = new javax.swing.GroupLayout(pnlTextPadField);
        pnlTextPadField.setLayout(pnlTextPadFieldLayout);
        pnlTextPadFieldLayout.setHorizontalGroup(
            pnlTextPadFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTextPadFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlTextPadFieldLayout.setVerticalGroup(
            pnlTextPadFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTextPadFieldLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        mbMain.setToolTipText("");
        mbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mbMainMouseReleased(evt);
            }
        });

        mnFile.setText("File");

        mniNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Custom-Icon-Design-Pretty-Office-11-New.32.png"))); // NOI18N
        mniNew.setText("New");
        mniNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewActionPerformed(evt);
            }
        });
        mnFile.add(mniNew);

        mniOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Custom-Icon-Design-Pretty-Office-9-Open-file.32.png"))); // NOI18N
        mniOpen.setText("Open");
        mniOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOpenActionPerformed(evt);
            }
        });
        mnFile.add(mniOpen);

        mniSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Custom-Icon-Design-Pretty-Office-7-Save.32.png"))); // NOI18N
        mniSave.setText("Save");
        mniSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSaveActionPerformed(evt);
            }
        });
        mnFile.add(mniSave);

        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bai5/image/Oxygen-Icons.org-Oxygen-Actions-application-exit.32.png"))); // NOI18N
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnFile.add(mniExit);

        mbMain.add(mnFile);

        mnEdit.setText("Edit");
        mbMain.add(mnEdit);

        mnSetting.setText("Setting");
        mbMain.add(mnSetting);

        mnWindow.setText("Window");
        mbMain.add(mnWindow);

        mnHelp.setText("Help");
        mbMain.add(mnHelp);

        mnWelcome.setText("Welcome");

        mniLogin.setText("Login");
        mniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoginActionPerformed(evt);
            }
        });
        mnWelcome.add(mniLogin);

        mniLogout.setText("Log out");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnWelcome.add(mniLogout);

        mbMain.add(mnWelcome);

        setJMenuBar(mbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTextPadField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tlbMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 559, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tlbMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTextPadField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoginActionPerformed
        // TODO add your handling code here:
        new DangKy().setVisible(true);
    }//GEN-LAST:event_mniLoginActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Dang xuat thanh cong.");
    }//GEN-LAST:event_mniLogoutActionPerformed

    private void mniNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewActionPerformed
        // TODO add your handling code here:
        edPane.setText("");
        edPane.requestFocus();
    }//GEN-LAST:event_mniNewActionPerformed

    private void mniOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser fchooser = new JFileChooser();
        int result = fchooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                edPane.setPage("file:///" + fchooser.getSelectedFile().getPath());
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_mniOpenActionPerformed

    private void mniSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSaveActionPerformed
        // TODO add your handling code here:
        JFileChooser fchooser = new JFileChooser();
        int result = fchooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File fname = fchooser.getSelectedFile();
            PrintWriter pw;
            try {
                pw = new PrintWriter(fname);
                pw.println(edPane.getText());
                pw.close();
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_mniSaveActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void mbMainMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbMainMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) { // Kiểm tra điều kiện hiển thị popup
            jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_mbMainMouseReleased

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
            java.util.logging.Logger.getLogger(BaiTH5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTH5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTH5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTH5_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTH5_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextPane edPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar mbMain;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenu mnSetting;
    private javax.swing.JMenu mnWelcome;
    private javax.swing.JMenu mnWindow;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniNew;
    private javax.swing.JMenuItem mniOpen;
    private javax.swing.JMenuItem mniSave;
    private javax.swing.JPanel pnlTextPadField;
    private javax.swing.JToolBar tlbMain;
    // End of variables declaration//GEN-END:variables
}
