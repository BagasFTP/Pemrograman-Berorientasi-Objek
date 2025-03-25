public class Tugas4 {
    public static void main(String[] args) {

        LimasSegiEmpat limas = new LimasSegiEmpat();
        limas.setSisi(6);
        limas.setTinggi(9);
        limas.computeAndSetVolume();

        LimasSegiEmpat limas2 = new LimasSegiEmpat(6);
        limas2.setTinggi(9);
        limas2.computeAndSetVolume();

        LimasSegiEmpat limas3 = new LimasSegiEmpat(6,10);
        limas3.computeAndSetVolume();
        
        System.out.println("Volume Limas Segi Empat: " + limas.getVolume());
        System.out.println("Volume Limas Segi Empat: " + limas2.getVolume());
        System.out.println("Volume Limas Segi Empat: " + limas3.getVolume());
    }
}
