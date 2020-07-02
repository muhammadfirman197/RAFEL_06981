package View;

import Controller.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import Model.Barang;
import Model.Pelanggan;
import Model.Transaksi;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.AWTEvent;
import static javax.swing.text.html.HTML.Tag.DT;

public class GUI_Transaksi extends javax.swing.JFrame {

    private controller control;
    private Integer Total_Harga;
    private Integer Kembalian;
    ArrayList<Transaksi> arrtransaksi;
    ArrayList<Barang> arrbarang;
    ArrayList<Pelanggan> arrpelanggan;
    
    public GUI_Transaksi() throws SQLException{
        initComponents();
        Total_Harga = 0;
        Kembalian = 0;
        control = new controller();
        arrtransaksi = new ArrayList<>();
        showtbtransaksi();
        
        showcbbarang_tr();
        showcbpelanggan();
        showKembalian();
        tftotal.disable();
        tfkembalian.disable();
    }

    public void showcbbarang_tr() throws SQLException{
        DefaultComboBoxModel cbbarang = new DefaultComboBoxModel();
        for (Barang br : control.getBarang()){
            cbbarang.addElement(br.getNama_Barang()+" " +br.getUkuran()+" ");
        }
        cbbarang_tr.removeAllItems();
        cbbarang_tr.setModel(cbbarang);
    }
    public void showcbpelanggan() throws SQLException {
        DefaultComboBoxModel dcbmPelanggan = new DefaultComboBoxModel();
        for (Pelanggan p : control.getPelanggan()) {
            dcbmPelanggan.addElement(p.getNama_pelanggan() + " ");
        }
        cbpelanggan.setModel(dcbmPelanggan);
      }
    
    private void showtbtransaksi() throws SQLException{
        DefaultTableModel dtmtransaksi = new DefaultTableModel(new String[]{
            "Id_transaksi","Jumlah Pesan ", "Harga Total"},0);
        for(Transaksi tr : control.getTransaksi()){
            dtmtransaksi.addRow(new String[]{
               tr.getId_transaksi().toString(),
               tr.getJumlah_pesan().toString(),
               tr.getTotal_Harga().toString()
            });
        }
        tbtransaksi.setModel(dtmtransaksi);
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        Pemesanan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbTambah = new javax.swing.JButton();
        tfbayar_tr = new javax.swing.JTextField();
        tfkembalian = new javax.swing.JTextField();
        tftotal = new javax.swing.JTextField();
        tftanggal = new javax.swing.JTextField();
        tfjumlah = new javax.swing.JTextField();
        cbbarang_tr = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        tbBayar = new javax.swing.JButton();
        cbpelanggan = new javax.swing.JComboBox();
        btkembali = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtransaksi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pemesanan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Pemesanan.setText("PEMESANAN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Barang        ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Jumlah                  ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal Transaksi  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Bayar           ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Kembalian ");

        tbTambah.setText("Tambah");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });

        tfbayar_tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfbayar_trActionPerformed(evt);
            }
        });

        tftotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftotalActionPerformed(evt);
            }
        });

        tfjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfjumlahActionPerformed(evt);
            }
        });

        cbbarang_tr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pelanggan");

        tbBayar.setText("Bayar");
        tbBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBayarActionPerformed(evt);
            }
        });

        cbpelanggan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpelangganActionPerformed(evt);
            }
        });

        btkembali.setText("Kembali");
        btkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkembaliActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Tabel Transaksi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("TRANSAKSI");

        tbtransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbtransaksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Pemesanan)
                        .addGap(305, 305, 305)
                        .addComponent(jLabel9))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbarang_tr, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfbayar_tr, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tbBayar)
                                        .addComponent(tfkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tbTambah)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(tftanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(405, 405, 405)
                                .addComponent(btkembali))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pemesanan)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cbbarang_tr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tftanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(tbTambah)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29)
                                .addComponent(tftotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tfbayar_tr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbBayar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btkembali))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfbayar_trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfbayar_trActionPerformed
        
    }//GEN-LAST:event_tfbayar_trActionPerformed

    private void tfjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfjumlahActionPerformed
    
    
    public void showTotalharga(){
        tftotal.setText(Total_Harga.toString());
    }
    
    public void showKembalian(){
        tfkembalian.setText(Kembalian.toString());
    }
    
    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
       Transaksi tr = new Transaksi();
        try {
            tr.setpelanggan(control.getPelanggan().get(cbpelanggan.getSelectedIndex()));
            tr.setbarang(control.getBarang().get(cbbarang_tr.getSelectedIndex()));
            tr.setJumlah_pesan(Integer.parseInt(tfjumlah.getText()));
            tr.setTanggal_transaksi(new SimpleDateFormat("dd/mm/yyyy").parse(tftanggal.getText()));
            
            Total_Harga += control.getBarang().get(cbbarang_tr.getSelectedIndex()).getHarga_barang()* Integer.parseInt(tfjumlah.getText());
            tr.setTotal_Harga(Total_Harga);
            
           
            showTotalharga();
             Total_Harga=0;
        } catch (SQLException | ParseException err) {
            System.out.println(err);
            Logger.getLogger(GUI_Transaksi.class.getName()).log(Level.SEVERE,null, err);
        } 
                                
    }//GEN-LAST:event_tbTambahActionPerformed

 
        
    private void tftotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftotalActionPerformed
        
    }//GEN-LAST:event_tftotalActionPerformed

    private void tbBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBayarActionPerformed
        Transaksi tr = new Transaksi();
        try {
            tr.setpelanggan(control.getPelanggan().get(cbpelanggan.getSelectedIndex()));
            tr.setbarang(control.getBarang().get(cbbarang_tr.getSelectedIndex()));
            tr.setJumlah_pesan(Integer.parseInt(tfjumlah.getText()));
            tr.setTanggal_transaksi(new SimpleDateFormat("dd/MM/yyyy").parse(tftanggal.getText()));
            
            Total_Harga += control.getBarang().get(cbbarang_tr.getSelectedIndex()).getHarga_barang() * Integer.parseInt(tfjumlah.getText());
   
            tr.setTotal_Harga(Total_Harga);
            tr.setBayar(Integer.parseInt(tfbayar_tr.getText()));
            Kembalian = Integer.parseInt(tfbayar_tr.getText()) - Integer.parseInt(tftotal.getText());
            
            tr.setKembalian(Kembalian);
            control.insertTransaksi(tr);
            showtbtransaksi();
            arrtransaksi = new ArrayList<>();
            showTotalharga();
            showKembalian();
            
            Total_Harga=0;
            Kembalian =0;
                 
        } catch (SQLException | ParseException err) {
            System.out.println(err);
            Logger.getLogger(GUI_Transaksi.class.getName()).log(Level.SEVERE,null, err);
        } 
    }//GEN-LAST:event_tbBayarActionPerformed

    
    
    private void cbpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpelangganActionPerformed

    private void btkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkembaliActionPerformed
        new Menu_Owner().setVisible(true);
        dispose();
    }//GEN-LAST:event_btkembaliActionPerformed

       
    
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
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GUI_Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pemesanan;
    private javax.swing.JButton btkembali;
    private javax.swing.JComboBox cbbarang_tr;
    private javax.swing.JComboBox cbpelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton tbBayar;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTable tbtransaksi;
    private javax.swing.JTextField tfbayar_tr;
    private javax.swing.JTextField tfjumlah;
    private javax.swing.JTextField tfkembalian;
    private javax.swing.JTextField tftanggal;
    private javax.swing.JTextField tftotal;
    // End of variables declaration//GEN-END:variables
}
