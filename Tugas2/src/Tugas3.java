public class Tugas3 {
    
        public static void main(String[] args) {
            Tabung tabung = new Tabung();
            tabung.setRadius(7);
            tabung.setTinggi(10);
            tabung.computeAndSetVolume();
            
            System.out.println("Volume Tabung: " + tabung.getVolume());
     } 
}
