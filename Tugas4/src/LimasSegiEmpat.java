public class LimasSegiEmpat extends BangunRuang {
    private double sisi;
    private double tinggi;
    private double volume;

    LimasSegiEmpat(String name,double sisi, double tinggi){
        this.name = name;
        this.sisi = sisi;
        this.tinggi = tinggi;
        computeAndSetVolume();
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
