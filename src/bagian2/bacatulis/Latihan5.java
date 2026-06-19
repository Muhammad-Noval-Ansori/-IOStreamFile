package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan5 {

    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt", true))) {

            penulis.println("Dewi");
            penulis.println("Eka");

            System.out.println("Data berhasil ditambahkan.");

        } catch (IOException e) {

            System.out.println("Gagal : " + e.getMessage());

        }

    }

}