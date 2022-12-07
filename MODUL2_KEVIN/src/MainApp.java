public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transair = new TransportasiAir(4, 20000);
        transair.informasi();
        transair.berlayar();
        transair.berlabuh();
        System.out.println("");

        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println("");

        Kapal kapal = new Kapal(50, 100000, "Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(50);
        kapal.berlabuh();
        System.out.println("");

    }
}
