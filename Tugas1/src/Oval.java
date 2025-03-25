public class Oval {
    private double sumbuMayor;
    private double sumbuMinor;
    private final double phi = 3.14;

    public void setSumbuMayor(double sumbuMayor) {
        this.sumbuMayor = sumbuMayor;
    }

    public void setSumbuMinor(double sumbuMinor) {
        this.sumbuMinor = sumbuMinor;
    }

    public double getSumbuMayor() {
        return this.sumbuMayor;
    }

    public double getSumbuMinor() {
        return this.sumbuMinor;
    }

    public double getLuas() {
        return phi * sumbuMayor * sumbuMinor;
    }

    public double getKeliling() {
        return phi * (3 * (sumbuMayor + sumbuMinor) - Math.sqrt((3 * sumbuMayor + sumbuMinor) * (sumbuMayor + 3 * sumbuMinor)));
    }
}

