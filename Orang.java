package Manusia;

/**
 *
 * @author Thoriq
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;

    public Orang(String nama, double tinggi, double berat) {
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nTinggi: " + tinggi + "\nBerat: " + berat;
    }
}
