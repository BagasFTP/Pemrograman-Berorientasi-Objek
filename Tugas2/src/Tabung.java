public class Tabung {
    private double radius;
    private double tinggi;
    private double volume;
    private double PHI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void computeAndSetVolume() {
        this.volume = PHI * radius * radius * tinggi;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
