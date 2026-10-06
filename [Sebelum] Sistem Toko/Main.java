public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Beras 5kg", 65000);
        Produk p2 = new Produk("P002", "Minyak Goreng 2L", 38000, 20);

        p1.stok = 50;
        p1.tampilkanInfo();
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();

        p2.harga = -1000;
        p2.stok = -99;
        System.out.println("Setelah diubah langsung (tanpa validasi):");
        p2.tampilkanInfo();
        System.out.println();

        Transaksi t1 = new Transaksi("T001", "Budi", p1, 3);
        p1.kurangiStok(3);
        t1.tampilkanStruk();

        Transaksi t2 = new Transaksi("T002", "Siti");
        t2.produk = p2;
        t2.jumlah = 2;
        t2.hitungTotal();
        System.out.println();
        t2.tampilkanStruk();
    }
}
