package Controller;

import Model.*;
import Database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controller {
    Koneksi koneksi;
    ArrayList<Barang> arrbarang;
    ArrayList<Pelanggan> arrpelanggan;
    ArrayList<Transaksi> arrtransaksi;
    
    public controller () throws SQLException {
        this.koneksi = new Koneksi();
        arrbarang = new ArrayList<>();
        arrpelanggan = new ArrayList<>();
        arrtransaksi = new ArrayList<>();
}
    public ArrayList<Barang> getBarang() throws SQLException {
        arrbarang.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM BARANG");
        while(rs.next()){
            Barang br = new Barang();
            br.setId_Barang(rs.getInt("ID_BARANG"));
            br.setNama_Barang(rs.getString("NAMA_BARANG"));
            br.setMerk(rs.getString("MERK"));
            br.setUkuran(rs.getString("UKURAN"));
            br.setStok(rs.getInt("STOK"));
            br.setHarga_barang(rs.getInt("Harga_BARANG"));
            
            arrbarang.add(br);
        }
            return arrbarang;
    }
    
    public ArrayList<Pelanggan> getPelanggan() throws SQLException {
        arrpelanggan.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM PELANGGAN");
        while(rs.next()){
            Pelanggan pl = new Pelanggan();
            pl.setId_pelanggan(rs.getInt("ID_PELANGGAN"));
            pl.setNama_pelanggan(rs.getString("NAMA_PELANGGAN"));
            pl.setNo_tlp(rs.getInt("NO_TLP"));
            
            arrpelanggan.add(pl);
        }
            return arrpelanggan;
    }
    
    public ArrayList<Transaksi> getTransaksi() throws SQLException {
        arrtransaksi.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM TRANSAKSI JOIN BARANG ON TRANSAKSI.ID_BARANG = BARANG.ID_BARANG JOIN PELANGGAN ON TRANSAKSI.ID_PELANGGAN = PELANGGAN.ID_PELANGGAN");
        while(rs.next()){
            
            Barang br = new Barang();
            br.setId_Barang(rs.getInt("ID_BARANG"));
            br.setNama_Barang(rs.getString("NAMA_BARANG"));
            br.setMerk(rs.getString("MERK"));
            br.setUkuran(rs.getString("UKURAN"));
            br.setStok(rs.getInt("STOK"));
            br.setHarga_barang(rs.getInt("HARGA_BARANG"));
            
            Pelanggan pl = new Pelanggan();
            pl.setId_pelanggan(rs.getInt("ID_PELANGGAN"));
            pl.setNama_pelanggan(rs.getString("NAMA_PELANGGAN"));
            pl.setNo_tlp(rs.getInt("NO_TLP"));
            
            Transaksi tr = new Transaksi();
            tr.setId_transaksi(rs.getInt("ID_TRANSAKSI"));
            tr.setTanggal_transaksi(new Date(rs.getString("TANGGAL_TRANSAKSI")));
            tr.setTotal_Harga(rs.getInt("TOTAL_HARGA"));
            tr.setBayar(rs.getInt("BAYAR"));
            tr.setKembalian(rs.getInt("KEMBALIAN"));
            tr.setJumlah_pesan(rs.getInt("JUMLAH_PESAN"));
            arrtransaksi.add(tr);
            
        }
            return arrtransaksi;
    }
    
    public void insertTransaksi(Transaksi tr) {
        try{
            String Tanggal_transaksi = new SimpleDateFormat("dd/MM/yyyy").format(tr.getTanggal_transaksi());
            koneksi.ManipulasiData("INSERT INTO TRANSAKSI VALUES (ID_TRANSAKSI.NEXTVAL,"
                    + tr.getbarang().getId_Barang()+","
                    + tr.getpelanggan().getId_pelanggan()+","
                    + tr.getTotal_Harga() + ","
                    + tr.getBayar()+"," 
                    +tr.getKembalian()
                    +",TO_DATE('" + Tanggal_transaksi+ "','dd/mm/yyyy'), "
                    +tr.getJumlah_pesan()+")");
            ResultSet rs = koneksi.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
            int Id_Transaksi = rs.getInt("CURRVAL");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void insertBarangg(Barang br){
        try {
            koneksi.ManipulasiData("INSERT INTO BARANG VALUES (ID_BARANG.NEXTVAL, '"+ br.getNama_Barang()+"',"+br.getHarga_barang() +",'"+br.getMerk()+"','"+br.getStok() +"','"+br.getUkuran() +"')");
            ResultSet rs = koneksi.GetData("SELECT ID_BARANG.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
        } catch (SQLException ex) {
        }
        }
    
    public void updateBarang(Barang br,int Stok){
        koneksi.ManipulasiData("UPDATE BARANG SET STOK = " + Stok +"WHERE ID_BARANG = " + br.getId_Barang());
    }
    
    public void deleteBarang(Barang barang) {
        koneksi.ManipulasiData("DELETE FROM BARANG WHERE ID_BARANG = " + barang.getId_Barang());
    }
    public void insertPelanggan(Pelanggan pl){
        try{
            koneksi.ManipulasiData("INSERT INTO PELANGGAN VALUES (ID_PELANGGAN.NEXTVAL, '"+ pl.getNama_pelanggan()+"',"+ pl.getNo_tlp()+")");
            ResultSet rs = koneksi.GetData("SELECT ID_PELANGGAN.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
        }catch(SQLException ex){
        }
        }
     public void deletePelanggan(Pelanggan pl) {
        koneksi.ManipulasiData("DELETE FROM PELANGGAN WHERE ID_PELANGGAN = " + pl.getId_pelanggan());
    }
    
    
    }