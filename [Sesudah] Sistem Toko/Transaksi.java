public class Transaksi {
    private String idTransaksi;
    private String namaPembeli;
    private Produk produk;
    private int jumlah;
    private double total;

    public Transaksi(String idTransaksi, String namaPembeli) {
        this.idTransaksi = idTransaksi;
        this.namaPembeli = namaPembeli;
    }

    public Transaksi(String idTransaksi, String namaPembeli, Produk produk, int jumlah) {
        this.idTransaksi = idTransaksi;
        this.namaPembeli = namaPembeli;
        this.produk = produk;
        setJumlah(jumlah);
    }

    public String getIdTransaksi()  { return idTransaksi; }
    public String getNamaPembeli()  { return namaPembeli; }
    public Produk getProduk()       { return produk; }
    public int getJumlah()          { return jumlah; }
    public double getTotal()        { return total; }

    public void setIdTransaksi(String idTransaksi) { this.idTransaksi = idTransaksi; }
    public void setNamaPembeli(String namaPembeli) { this.namaPembeli = namaPembeli; }
    public void setProduk(Produk produk)           { this.produk = produk; }

    public void setJumlah(int jumlah) {
        if (jumlah > 0) {
            this.jumlah = jumlah;
            hitungTotal();
        } else {
            System.out.println("[DITOLAK] Jumlah beli harus lebih dari 0.");
        }
    }

    public void hitungTotal() {
        if (produk != null) {
            total = produk.getHarga() * jumlah;
        }
    }

    public void tampilkanStruk() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Pembeli      : " + namaPembeli);
        System.out.println("Produk       : " + produk.getNama());
        System.out.println("Jumlah       : " + jumlah);
        System.out.println("Total Bayar  : Rp" + total);
    }
}
