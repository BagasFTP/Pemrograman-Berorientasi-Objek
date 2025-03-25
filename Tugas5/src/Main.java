public class Main{
    public static void main(String[] args) throws Exception {
        Buku buku1 = new Buku("Belajar Programming","Airlangga",2020,"Ahmad Priadi");
        Majalah majalah1 = new Majalah("AutoNetmagz", "Gramedia",2020,"Leberan");
        Skripsi skripsi1 = new Skripsi("Pengelolaan Limbah Sampah","UPN Jatim",2021,"Bagas Firdaus Tri Putra", "23081010161");

        System.out.println(buku1);
        System.out.println(majalah1);
        System.out.println(skripsi1);
    }
}
