public class Persegi {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }
}