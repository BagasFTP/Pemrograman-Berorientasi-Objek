public class Kubus extends BangunRuang {
    private double sisi;
    private double volume;

    // construktor sisi 
    Kubus(String name,double sisi){
        this.name = name;
        this.sisi = sisi;
        computeAndSetVolume();
    }


    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }

    public void computeAndSetVolume() {
        this.volume = sisi * sisi * sisi;
    }

    public double getVolume() {
        return this.volume;
    }
}
