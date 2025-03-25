public class main {
    public static void main(String[] args) {


        
    BangunRuang bangunruang[] = new BangunRuang[5];
    
    bangunruang[0] = new Kubus("Kubus",50);
    bangunruang[1] = new Balok("Balok",4, 5, 6);
    bangunruang[2] = new Tabung("Tabung",7, 8);
    bangunruang[3] = new LimasSegiEmpat("Limas Segi Empat",5,6);
    bangunruang[4] = new Bola("Bola",5);

    for(int i = 0; i<bangunruang.length;i++){
        System.out.println("Volume " + bangunruang[i].name + " adalah : "+ bangunruang[i].getVolume());
    }


    double totalVolume = 0;

    for(BangunRuang bangun : bangunruang){

        totalVolume +=  bangun.getVolume();
    }

    System.out.println("Rata - Rata Volumenya : " + totalVolume);

    }
}
