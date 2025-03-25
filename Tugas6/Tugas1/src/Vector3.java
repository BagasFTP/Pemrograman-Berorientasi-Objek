public class Vector3 {
    private int[] vektor;

    public Vector3(int x, int y, int z) {
        this.vektor = new int[]{x, y, z};
    }

    public Vector3 perkalian(int scalar) {
        return new Vector3(vektor[0] * scalar, vektor[1] * scalar, vektor[2] * scalar);
    }

    public int perkalian(Vector3 Vector2) {
        return (this.vektor[0] * Vector2.vektor[0]) + 
               (this.vektor[1] * Vector2.vektor[1]) + 
               (this.vektor[2] * Vector2.vektor[2]);
               
    }
    public void printVector() {
        System.out.println("[" + vektor[0] + " " + vektor[1] + " " + vektor[2] + "]");
    }
}
