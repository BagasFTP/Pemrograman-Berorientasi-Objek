public class Tugas1 {
    public static void main(String[] args) {
        lingkaran lingkaran = new lingkaran();
        lingkaran.setJari(7);
        System.out.println("Lingkaran:");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());

        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("\nPersegi:");
        System.out.println("Sisi: " + persegi.getSisi());
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());

        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(8);
        pp.setLebar(4);
        System.out.println("\nPersegi Panjang:");
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());

        Oval oval = new Oval();
        oval.setSumbuMayor(6);
        oval.setSumbuMinor(3);
        System.out.println("\nOval:");
        System.out.println("Sumbu Mayor: " + oval.getSumbuMayor());
        System.out.println("Sumbu Minor: " + oval.getSumbuMinor());
        System.out.println("Luas: " + oval.getLuas());
        System.out.println("Keliling: " + oval.getKeliling());
    }
}


    
