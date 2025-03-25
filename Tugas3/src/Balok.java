public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double volume;

    // Constructur panjang dan lebar
    Balok(int ParamPanjang,int ParamLebar){
        panjang = ParamPanjang;
        lebar = ParamLebar;
    }

    // construktor panjang, lebar, dan tinggi
    Balok(int ParamPanjang, int ParamLebar, int ParamTinggi){
        panjang = ParamPanjang;
        lebar = ParamLebar;
        tinggi = ParamTinggi;
    }

    // default construktor
    Balok(){

    }

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