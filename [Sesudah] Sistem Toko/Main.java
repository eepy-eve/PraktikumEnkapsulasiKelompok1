public class Main {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Beras 5kg", 65000);
        Produk p2 = new Produk("P002", "Minyak Goreng 2L", 38000, 20);

        p1.setStok(50);
        System.out.println("Stok " + p1.getNama() + " : " + p1.getStok());
        System.out.println("Harga " + p2.getNama() + " : Rp" + p2.getHarga());
        System.out.println();

        System.out.println("Coba isi data tidak valid:");
        p2.setHarga(-1000);
        p2.setStok(-99);
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();

        Transaksi t1 = new Transaksi("T001", "Budi", p1, 3);
        p1.kurangiStok(t1.getJumlah());
        t1.tampilkanStruk();

        Transaksi t2 = new Transaksi("T002", "Siti");
        t2.setProduk(p2);
        t2.setJumlah(0);
        t2.setJumlah(2);
        t2.tampilkanStruk();
    }
}
