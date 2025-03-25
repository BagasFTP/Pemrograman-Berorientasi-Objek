public class Tugas5 {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setRadius(7);
        bola.computeAndSetVolume();

        Bola bola2 = new Bola(7);
        bola2.computeAndSetVolume();

        System.out.println("Volume Bola: " + bola.getVolume());
        System.out.println("Volume Bola: " + bola2.getVolume());
    }
}
