package praktikum4;

public class MahasiswaLulus extends Mahasiswa {
    private String judulTugasAkhir;

    public MahasiswaLulus(String nama, int umur, String idMahasiswa, String judulTugasAkhir) {
        super(nama, umur, idMahasiswa);
        this.judulTugasAkhir = judulTugasAkhir;
    }

    public String getJudulTugasAkhir() {
        return judulTugasAkhir;
    }

    public void setJudulTugasAkhir(String judulTugasAkhir) {
        this.judulTugasAkhir = judulTugasAkhir;
    }

    public void tampilkanMahasiswaLulus() {
        tampilkanMahasiswa();
        System.out.println("Judul Tugas Akhir: " + judulTugasAkhir);
    }
}