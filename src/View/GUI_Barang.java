package View;

import Controller.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Controller.*;

public class GUI_Barang extends javax.swing.JFrame {
    private controller controller;
    
    
    public GUI_Barang() throws SQLException{
        initComponents();
        controller = new controller();
        showtbbarang();
    }
    
    public void showtbbarang() throws SQLException {
        DefaultTableModel dtmBarang = new DefaultTableModel(new String[]{"Nama_Barang", "Harga Barang", "Merk" ,"Stok","Ukuran"},0);        
        for(Barang b : controller.getBarang()) {
            dtmBarang.addRow(new String[]{b.getNama_Barang().toString(), b.getHarga_barang().toString(),b.getMerk().toString(), b.getStok().toString(),b.getUkuran().toString()});
        }
        tbbarang.setModel(dtmBarang);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NamaBarang = new javax.swing.JLabel();
        Merk = new javax.swing.JLabel();
        Ukuran = new javax.swing.JLabel();
        Stok = new javax.swing.JLabel();
        tfstok = new javax.swing.JTextField();
        btupdate = new javax.swing.JButton();
        bttambahbarang = new javax.swing.JButton();
        Harga = new javax.swing.JLabel();
        tfharga = new javax.swing.JTextField();
        Stok1 = new javax.swing.JLabel();
        tfstok2 = new javax.swing.JTextField();
        tfnamabarang = new javax.swing.JTextField();
        tfmerk = new javax.swing.JTextField();
        tfukuran = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbbarang = new javax.swing.JTable();
        Kembali = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NamaBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NamaBarang.setText("Nama Barang ");

        Merk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Merk.setText("Merk              ");

        Ukuran.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ukuran.setText("Ukuran          ");

        Stok.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Stok.setText("Stok              ");

        btupdate.setText("Update");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        bttambahbarang.setText("Tambah");
        bttambahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahbarangActionPerformed(evt);
            }
        });

        Harga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Harga.setText("Harga            ");

        tfharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfhargaActionPerformed(evt);
            }
        });

        Stok1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Stok1.setText("Stok               ");

        tbbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(tbbarang);

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        btdelete.setText("Delete");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INSERT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("UPDATE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("TABEL BARANG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttambahbarang)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ukuran)
                            .addComponent(NamaBarang)
                            .addComponent(Merk)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Harga)
                                .addComponent(Stok)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfukuran, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfmerk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                    .addComponent(tfnamabarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfstok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfharga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btupdate)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Stok1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfstok2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btdelete)
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Kembali)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaBarang)
                    .addComponent(tfnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stok1)
                    .addComponent(tfstok2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Merk)
                            .addComponent(tfmerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btupdate)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ukuran)
                    .addComponent(tfukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stok)
                    .addComponent(tfstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Harga)
                    .addComponent(tfharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bttambahbarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btdelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Kembali)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfhargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfhargaActionPerformed
        
    }//GEN-LAST:event_tfhargaActionPerformed

    private void bttambahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahbarangActionPerformed
        try {
            Barang b = new Barang();
            b.setNama_Barang(tfnamabarang.getText());
            b.setHarga_barang(Integer.parseInt(tfharga.getText()));
            b.setMerk(tfmerk.getText());
            b.setStok(Integer.parseInt(tfstok.getText()));
            b.setUkuran(tfukuran.getText());
            
            controller.insertBarangg(b);
            showtbbarang();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bttambahbarangActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        try {
            Barang b = controller.getBarang().get(tbbarang.getSelectedRow());
            int Stok = Integer.parseInt(tfstok2.getText());
            
            controller.updateBarang(b, Stok);
            showtbbarang();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btupdateActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        new Menu_Owner().setVisible(true);
        dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        try {
            Barang barang = controller.getBarang().get(tbbarang.getSelectedRow());
            controller.deleteBarang(barang);
            showtbbarang();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
     //                new GUI_Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Harga;
    private javax.swing.JButton Kembali;
    private javax.swing.JLabel Merk;
    private javax.swing.JLabel NamaBarang;
    private javax.swing.JLabel Stok;
    private javax.swing.JLabel Stok1;
    private javax.swing.JLabel Ukuran;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton bttambahbarang;
    private javax.swing.JButton btupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbbarang;
    private javax.swing.JTextField tfharga;
    private javax.swing.JTextField tfmerk;
    private javax.swing.JTextField tfnamabarang;
    private javax.swing.JTextField tfstok;
    private javax.swing.JTextField tfstok2;
    private javax.swing.JTextField tfukuran;
    // End of variables declaration//GEN-END:variables
}
