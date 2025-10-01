package praktikum4;

public class Main {
    public static void main(String[] args) {
        // Enkapsulasi
        Orang orang = new Orang("Asep", 19);
        orang.tampilkanOrang();
        orang.setNama("Udin");
        orang.setUmur(36);
        orang.tampilkanOrang();

        System.out.println("\n--- Inheritance ---\n");

        // Single Inheritance
        Mahasiswa mhs = new Mahasiswa("Tio", 19, "M12345");
        mhs.tampilkanMahasiswa();

        System.out.println();

        // Multilevel Inheritance
        MahasiswaLulus mhsLulus = new MahasiswaLulus("Ripai", 24, "L54321", "AI di Informatika");
        mhsLulus.tampilkanMahasiswaLulus();

        System.out.println();

        // Hierarchical Inheritance
        Dosen dosen = new Dosen("Fachrul Pralienka Bani Muhamad, M.Kom.", 25, "Ilmu Komputer");
        dosen.tampilkanDosen();
    }
}