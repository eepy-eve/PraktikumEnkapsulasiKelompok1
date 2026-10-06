public class Main {
    public static void main(String[] args) {
        // Object 1 pakai constructor 1 (tanpa stok)
        Produk p1 = new Produk("P001", "Beras 5kg", 65000);
        // Object 2 pakai constructor 2 (dengan stok)
        Produk p2 = new Produk("P002", "Minyak Goreng 2L", 38000, 20);

        // Atribut public bisa diakses LANGSUNG dari luar class
        p1.stok = 50;
        p1.tampilkanInfo();
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();

        // Bahayanya: data bisa diisi nilai ngawur, tidak ada yang menjaga
        p2.harga = -1000;
        p2.stok = -99;
        System.out.println("Setelah diubah langsung (tanpa validasi):");
        p2.tampilkanInfo();
        System.out.println();

        // Transaksi pakai constructor 2
        Transaksi t1 = new Transaksi("T001", "Budi", p1, 3);
        p1.kurangiStok(3);
        t1.tampilkanStruk();

        // Transaksi pakai constructor 1
        Transaksi t2 = new Transaksi("T002", "Siti");
        t2.produk = p2;
        t2.jumlah = 2;
        t2.hitungTotal();
        System.out.println();
        t2.tampilkanStruk();
    }
}
