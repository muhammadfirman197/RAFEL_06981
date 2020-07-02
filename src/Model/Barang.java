package Model;

public class Barang {
    private Integer Id_Barang;
    private String Nama_Barang;
    private String Merk;
    private Integer Stok;
    private String Ukuran;
    private Integer Harga_barang;

    public Integer getId_Barang() {
        return Id_Barang;
    }

    public void setId_Barang(Integer Id_Barang) {
        this.Id_Barang = Id_Barang;
    }

    public String getNama_Barang() {
        return Nama_Barang;
    }

    public void setNama_Barang(String Nama_Barang) {
        this.Nama_Barang = Nama_Barang;
    }
    
    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }
    
    public Integer getStok() {
        return Stok;
    }

    public void setStok(Integer Stok) {
        this.Stok = Stok;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }
    
    public Integer getHarga_barang() {
        return Harga_barang;
    }

    public void setHarga_barang(Integer Harga_barang) {
        this.Harga_barang = Harga_barang;
    }
}
