package praktikum4;

public class Orang {
    // Enkapsulasi: variabel private
    private String nama;
    private int umur;

    // Konstruktor
    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk umur
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid");
        }
    }

    // Method menampilkan data orang
    public void tampilkanOrang() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}