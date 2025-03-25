public class Tabung {
    private double radius;
    private double tinggi;
    private double volume;
    private double PHI = 3.14;
    
    //construktor radius dan tinggi
    Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
        double PHI = 3.14;
    }

    //construktor radius
    Tabung(double radius){
        this.radius = radius;
        double PHI = 3.14;
    }

    //constructor default
    Tabung(){

    }

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
