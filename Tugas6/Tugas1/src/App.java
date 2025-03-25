public class App {
    public static void main(String[] args) throws Exception {
        Vector3 v1 = new Vector3(1, 2, 3);
        Vector3 v2 = new Vector3(4, 5, 6);

        Vector3 hasilSkalar = v1.perkalian(5);
        hasilSkalar.printVector();

        int hasilVector = v1.perkalian(v2);
        System.out.println(hasilVector);
    }

}