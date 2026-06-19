package bagian2.bacatulis;

import java.io.*;

public class LatihanMandiri1 {

    public static void main(String[] args) {

        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {

            for (String h : hari) {
                penulis.println(h);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {

                System.out.println(baris);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}