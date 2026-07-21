package kontak;

public class Kontak {

    private String nama;
    private String nomor;
    private String email;

    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() {
        return email;
    }

    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    public void info() {
        System.out.println("Nama   : " + nama);
        System.out.println("Nomor  : " + nomor);
        System.out.println("Email  : " + email);
        System.out.println();
    }
}
