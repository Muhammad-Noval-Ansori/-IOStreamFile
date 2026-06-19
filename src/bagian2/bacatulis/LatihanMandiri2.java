package bagian2.bacatulis;

import java.io.*;

public class LatihanMandiri2 {

    public static void main(String[] args) {

        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {

            penulis.println("Sabtu");
            penulis.println("Minggu");

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