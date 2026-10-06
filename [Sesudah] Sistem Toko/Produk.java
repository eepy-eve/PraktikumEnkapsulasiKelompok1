public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        setHarga(harga);
        this.stok = 0;
    }

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        setHarga(harga);
        setStok(stok);
    }

    public String getKode()  { return kode; }
    public String getNama()  { return nama; }
    public double getHarga() { return harga; }
    public int getStok()     { return stok; }

    public void setKode(String kode) { this.kode = kode; }
    public void setNama(String nama) { this.nama = nama; }

    public void setHarga(double harga) {
        if (harga > 0) {
            this.harga = harga;
        } else {
            System.out.println("[DITOLAK] Harga harus lebih dari 0.");
        }
    }

    public void setStok(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("[DITOLAK] Stok tidak boleh negatif.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("Harga : Rp" + harga);
        System.out.println("Stok  : " + stok);
    }

    public boolean kurangiStok(int jumlah) {
        if (jumlah > 0 && jumlah <= stok) {
            stok = stok - jumlah;
            return true;
        }
        System.out.println("[DITOLAK] Stok tidak cukup / jumlah tidak valid.");
        return false;
    }
}
