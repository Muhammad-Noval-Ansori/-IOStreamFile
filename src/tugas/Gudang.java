package tugas;

import java.util.ArrayList;
import java.io.*;

public class Gudang {

    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private final String FILE = "barang.txt";

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanSemua() {
        for (Barang b : daftarBarang) {
            b.info();
        }
    }

    public void simpanKeBerkas() {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));

            for (Barang b : daftarBarang) {
                bw.write(b.keBaris());
                bw.newLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void muatDariBerkas() {

        daftarBarang.clear();

        try {

            BufferedReader br = new BufferedReader(new FileReader(FILE));

            String baris;

            while ((baris = br.readLine()) != null) {

                String[] data = baris.split(";");

                daftarBarang.add(new Barang(
                        data[0],
                        Double.parseDouble(data[1]),
                        Integer.parseInt(data[2])
                ));
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File belum ada.");
        }
    }

    public double totalNilai() {

        double total = 0;

        for (Barang b : daftarBarang) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}
