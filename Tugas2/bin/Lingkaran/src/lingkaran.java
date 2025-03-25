public class lingkaran {
    double phi = 3.14;
    double jari;

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return this.jari;
    }

    public double getLuas() {
        return phi * this.jari * this.jari;
    }

    public double getKeliling() {
        return phi * this.jari * 2;
    }
}