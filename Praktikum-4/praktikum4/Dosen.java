package praktikum4;

public class Dosen extends Orang {
    private String departemen;

    public Dosen(String nama, int umur, String departemen) {
        super(nama, umur);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void tampilkanDosen() {
        tampilkanOrang();
        System.out.println("Departemen: " + departemen);
    }
}