public class Transaksi {
    public String idTransaksi;
    public String namaPembeli;
    public Produk produk;
    public int jumlah;
    public double total;

    public Transaksi(String idTransaksi, String namaPembeli) {
        this.idTransaksi = idTransaksi;
        this.namaPembeli = namaPembeli;
    }

    public Transaksi(String idTransaksi, String namaPembeli, Produk produk, int jumlah) {
        this.idTransaksi = idTransaksi;
        this.namaPembeli = namaPembeli;
        this.produk = produk;
        this.jumlah = jumlah;
        hitungTotal();
    }

    public void hitungTotal() {
        total = produk.harga * jumlah;
    }

    public void tampilkanStruk() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Pembeli      : " + namaPembeli);
        System.out.println("Produk       : " + produk.nama);
        System.out.println("Jumlah       : " + jumlah);
        System.out.println("Total Bayar  : Rp" + total);
    }
}
