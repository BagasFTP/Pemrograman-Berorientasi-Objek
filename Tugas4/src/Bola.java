public class Bola extends BangunRuang {
    private double radius;
    private double volume;


    Bola(String name,double radius){
        this.name = name;
        this.radius = radius;
        computeAndSetVolume();
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void computeAndSetVolume() {
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double getVolume() {
        return this.volume;
    }
}