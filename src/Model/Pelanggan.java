package Model;

public class Pelanggan {
    private Integer Id_pelanggan;
    private String Nama_pelanggan;
    private Integer No_tlp;
    
    public Integer getId_pelanggan() {
        return Id_pelanggan;
    }

    public void setId_pelanggan(Integer Id_pelanggan) {
        this.Id_pelanggan = Id_pelanggan;
    }
    
    public String getNama_pelanggan() {
        return Nama_pelanggan;
    }

    public void setNama_pelanggan(String Nama_pelanggan) {
        this.Nama_pelanggan = Nama_pelanggan;
    }
    
    public Integer getNo_tlp() {
        return No_tlp;
    }

    public void setNo_tlp(Integer No_tlp) {
        this.No_tlp = No_tlp;
    }
}
