public class Tugas4 {
    public static void main(String[] args) {
        LimasSegiEmpat limas = new LimasSegiEmpat();
        limas.setSisi(6);
        limas.setTinggi(9);
        limas.computeAndSetVolume();
        
        System.out.println("Volume Limas Segi Empat: " + limas.getVolume());
    }
}
