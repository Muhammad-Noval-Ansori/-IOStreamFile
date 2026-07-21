package kontak;

import java.util.ArrayList;
import java.io.*;

public class BukuKontak {

    private ArrayList<Kontak> daftar = new ArrayList<>();
    private final String FILE = "kontak.txt";

    public void tambahKontak(Kontak k) {
        daftar.add(k);
    }

    // Soal 1
    public void cariKontak(String nama) {

        for (Kontak k : daftar) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Kontak ditemukan:");
                k.info();
                return;
            }
        }

        System.out.println("Kontak tidak ditemukan.");
    }

    // Soal 3
    public void hapusKontak(String nama) {

        for (int i = 0; i < daftar.size(); i++) {

            if (daftar.get(i).getNama().equalsIgnoreCase(nama)) {
                daftar.remove(i);
                System.out.println("Kontak berhasil dihapus.");
                simpanKeBerkas();
                return;
            }
        }

        System.out.println("Kontak tidak ditemukan.");
    }

    public void tampilkanSemua() {

        for (Kontak k : daftar) {
            k.info();
        }
    }

    public void simpanKeBerkas() {

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));

            for (Kontak k : daftar) {
                bw.write(k.keBaris());
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void muatDariBerkas() {

        daftar.clear();

        try {

            BufferedReader br = new BufferedReader(new FileReader(FILE));

            String baris;

            while ((baris = br.readLine()) != null) {

                String[] data = baris.split(";");

                daftar.add(new Kontak(
                        data[0],
                        data[1],
                        data[2]
                ));
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File belum ada.");
        }
    }
}
