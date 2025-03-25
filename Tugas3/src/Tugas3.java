public class Tugas3 {
    
        public static void main(String[] args) {

            //constructor default
            Tabung tabung1 = new Tabung();
            tabung1.setRadius(7);
            tabung1.setTinggi(10);
            tabung1.computeAndSetVolume();

            //construktor radius
            Tabung tabung2 = new Tabung(7);
            tabung2.setTinggi(10);
            tabung2.computeAndSetVolume();

            //construktor radius dan tinggi
            Tabung tabung3 = new Tabung(7,10);
            tabung3.computeAndSetVolume();

            System.out.println("Volume Tabung: " + tabung1.getVolume());
            System.out.println("Volume Tabung: " + tabung2.getVolume());
            System.out.println("Volume Tabung: " + tabung3.getVolume());
     } 
}
