package tugas;

public class Konversi {
    
    private double hasil;
    Masukan hasilCek = new Masukan();
    
    public double kgToTon(int kilograms) {
        if (hasilCek.input(kilograms).equals(true)) {
            hasil = kilograms * 1000;
            return hasil;
        }
        else {
            return 0;
        }
    }
    
    public double kgToKwintal(int kilograms) {
        if (hasilCek.input(kilograms).equals(true)) {
            hasil = kilograms * 100;
            return hasil;
        }
        else {
            return 0;
        }
    }
    
    public double kgToGram(int kilograms) {
        if (hasilCek.input(kilograms).equals(true)) {
            hasil = kilograms / 1000;
            return hasil;
        }
        else {
            return 0;
        }
    }
}
