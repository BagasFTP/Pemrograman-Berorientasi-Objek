public class Tugas2 {
    public static void main(String[] args) {
        Balok balok = new Balok();
        balok.setPanjang(10);
        balok.setLebar(5);
        balok.setTinggi(4);
        balok.computeAndSetVolume();
        
        System.out.println("Volume Balok: " + balok.getVolume());
    }
}
