public class Tugas1 {
        public static void main(String[] args) {
            Kubus kubus1 = new Kubus();
            kubus1.setSisi(5);
            kubus1.computeAndSetVolume();
            System.out.println("Volume Kubus: " + kubus1.getVolume());

            Kubus kubus2 = new Kubus(2);
            kubus2.computeAndSetVolume();
            System.out.println("Volume Kubus: " + kubus2.getVolume());

        }
    
    
}
