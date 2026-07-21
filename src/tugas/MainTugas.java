package tugas;

public class MainTugas {

    public static void main(String[] args) {

        Gudang gudang = new Gudang();

        gudang.tambahBarang(new Barang("Laptop", 8000000, 5));
        gudang.tambahBarang(new Barang("Mouse", 150000, 20));
        gudang.tambahBarang(new Barang("Keyboard", 300000, 10));
        gudang.tambahBarang(new Barang("Printer", 2500000, 3));
        gudang.tambahBarang(new Barang("Monitor", 2200000, 6));

        System.out.println("===== DATA BARANG =====");
        gudang.tampilkanSemua();

        String[] kategori = {
            "Elektronik",
            "Aksesoris",
            "Peralatan"
        };

        System.out.println("===== KATEGORI =====");

        for (String k : kategori) {
            System.out.println(k);
        }

        gudang.simpanKeBerkas();

        Gudang gudangBaru = new Gudang();

        gudangBaru.muatDariBerkas();

        System.out.println("\n===== DATA DARI FILE =====");
        gudangBaru.tampilkanSemua();

        System.out.println("===== TOTAL NILAI PERSEDIAAN =====");
        System.out.println("Rp " + gudangBaru.totalNilai());
    }
}
