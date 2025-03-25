public class Tugas2 {
    public static void main(String[] args) {

        // default constructor
        Balok balok1 = new Balok();
        balok1.setPanjang(10);
        balok1.setLebar(5);
        balok1.setTinggi(4);
        balok1.computeAndSetVolume();

        //// Constructur panjang dan lebar
        Balok balok2 = new Balok(10,5);
        balok2.setTinggi(4);
        balok2.computeAndSetVolume();

         //// Constructur panjang, lebar, dan tinggi
         Balok balok3 = new Balok(10,5, 4);
         balok3.computeAndSetVolume();
        
        System.out.println("Volume Balok 1: " + balok1.getVolume());
        System.out.println("Volume Balok 2: " + balok2.getVolume());
        System.out.println("Volume Balok 3: " + balok3.getVolume());
    }
}
