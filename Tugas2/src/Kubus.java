public class Kubus {
    private double sisi;
    private double volume;

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
