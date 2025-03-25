public class Bola {
    private double radius;
    private double volume;


    Bola(double radius){
        this.radius = radius;
    }

    Bola(){
        
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