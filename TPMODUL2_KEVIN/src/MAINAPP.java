public class MAINAPP {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("None", 999, 999);
        System.out.println("");
        perangkat.informasi();
        System.out.println("");

        Laptop laptop = new Laptop("Intel I5 Gen 11", 16, 2, true);
        laptop.informasi();
        laptop.bukagame("VALORANT");
        laptop.kirimEMAIL("angelokevin@gmail.com");
        laptop.kirimEMAIL("FritzAngelo@gmail.com", "Angelo171717@gmail.com");
        System.out.println("");

        Handphone handphone = new Handphone("MediaTek", 8, 1.2f, false);
        handphone.informasi();
        handphone.telfon(773432);
        handphone.kirimSMS(663431);
        handphone.kirimSMS(872321, 99823723);

    }
}
