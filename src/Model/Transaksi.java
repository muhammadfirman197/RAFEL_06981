package Model;

import java.util.Date;
import java.util.ArrayList;

public class Transaksi {
    private Pelanggan pelanggan;
    private Barang barang;
    private Integer Id_transaksi;
    private Date Tanggal_transaksi;
    private Integer Total_Harga;
    private Integer Bayar;
    private Integer Kembalian;
    private Integer Jumlah_pesan;
    private ArrayList<Transaksi>arrtransaksi;

    public Pelanggan getpelanggan() {
        return pelanggan;
    }

    public void setpelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setbarang(Barang barang) {
        this.barang = barang;
    }

    public ArrayList<Transaksi> getArrtransaksi() {
        return arrtransaksi;
    }

    public void setArrtransaksi(ArrayList<Transaksi> arrtransaksi) {
        this.arrtransaksi = arrtransaksi;
    }
    public Barang getbarang() {
        return barang;
    }


    
    public Integer getId_transaksi() {
        return Id_transaksi;
    }

    public void setId_transaksi(Integer Id_transaksi) {
        this.Id_transaksi = Id_transaksi;
    }
    
    public Date getTanggal_transaksi() {
        return Tanggal_transaksi;
    }

    public void setTanggal_transaksi(Date Tanggal_transaksi) {
        this.Tanggal_transaksi = Tanggal_transaksi;
    }
    
    public Integer getTotal_Harga() {
        return Total_Harga;
    }

    public void setTotal_Harga(Integer Total_Harga) {
        this.Total_Harga = Total_Harga;
    }

    public Integer getBayar() {
        return Bayar;
    }

    public void setBayar(Integer Bayar) {
        this.Bayar = Bayar;
    }

    public Integer getKembalian() {
        return Kembalian;
    }

    public void setKembalian(Integer Kembalian) {
        this.Kembalian = Kembalian;
    }
    
    public Integer getJumlah_pesan() {
        return Jumlah_pesan;
    }

    public void setJumlah_pesan(Integer Jumlah_pesan) {
        this.Jumlah_pesan = Jumlah_pesan;
    }
}
