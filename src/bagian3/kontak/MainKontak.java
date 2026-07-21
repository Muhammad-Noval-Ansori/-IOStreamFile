package kontak;

public class Main {

    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak();

        buku.tambahKontak(new Kontak("Andi", "0811111111", "andi@gmail.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222222", "budi@gmail.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333333", "citra@gmail.com"));

        buku.simpanKeBerkas();

        System.out.println("===== DAFTAR KONTAK =====");
        buku.tampilkanSemua();

        System.out.println("===== CARI KONTAK =====");
        buku.cariKontak("Budi");

        System.out.println("===== HAPUS KONTAK =====");
        buku.hapusKontak("Andi");

        System.out.println("===== SETELAH DIHAPUS =====");
        buku.tampilkanSemua();
    }
}
