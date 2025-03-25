public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double volume;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void computeAndSetVolume() {
        this.volume = panjang * lebar * tinggi;
    }

    public double getVolume() {
        return this.volume;
    }
}