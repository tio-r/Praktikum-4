package praktikum4;

public class Mahasiswa extends Orang {
    private String idMahasiswa;

    public Mahasiswa(String nama, int umur, String idMahasiswa) {
        super(nama, umur); // panggil konstruktor superclass
        this.idMahasiswa = idMahasiswa;
    }

    public String getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public void tampilkanMahasiswa() {
        tampilkanOrang(); // method dari superclass Orang
        System.out.println("ID Mahasiswa: " + idMahasiswa);
    }
}