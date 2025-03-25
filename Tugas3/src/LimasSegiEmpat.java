public class LimasSegiEmpat {
    private double sisi;
    private double tinggi;
    private double volume;

    LimasSegiEmpat(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    LimasSegiEmpat(double sisi){
        this.sisi = sisi;
    }

    LimasSegiEmpat(){
        
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void computeAndSetVolume() {
        double luasAlas = sisi * sisi; 
        this.volume = (1.0 / 3.0) * luasAlas * tinggi;
    }
    
    public double getVolume() {
        return this.volume;
    }
}
