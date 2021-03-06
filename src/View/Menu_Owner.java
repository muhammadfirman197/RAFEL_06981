/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M Rafel Daffa Eka F
 */
public class Menu_Owner extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Owner
     */
    public Menu_Owner() {
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

        jLabel1 = new javax.swing.JLabel();
        btbarang = new javax.swing.JButton();
        btinfotransaksi = new javax.swing.JButton();
        btinfopelanggan = new javax.swing.JButton();
        btkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("MENU OWNER");

        btbarang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btbarang.setText("Barang");
        btbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbarangActionPerformed(evt);
            }
        });

        btinfotransaksi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btinfotransaksi.setText("Transaksi");
        btinfotransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinfotransaksiActionPerformed(evt);
            }
        });

        btinfopelanggan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btinfopelanggan.setText("Pelanggan");
        btinfopelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinfopelangganActionPerformed(evt);
            }
        });

        btkembali.setText("Kembali");
        btkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btbarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btinfotransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btinfopelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btkembali)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(btbarang)
                .addGap(27, 27, 27)
                .addComponent(btinfotransaksi)
                .addGap(35, 35, 35)
                .addComponent(btinfopelanggan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btkembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkembaliActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btkembaliActionPerformed

    private void btinfotransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinfotransaksiActionPerformed
        try {
            new GUI_Transaksi().setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btinfotransaksiActionPerformed

    private void btbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbarangActionPerformed
        try {
            new GUI_Barang().setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btbarangActionPerformed

    private void btinfopelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinfopelangganActionPerformed
        try {
            new GUI_Pelanggan().setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Menu_Pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btinfopelangganActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Owner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Owner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbarang;
    private javax.swing.JButton btinfopelanggan;
    private javax.swing.JButton btinfotransaksi;
    private javax.swing.JButton btkembali;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
