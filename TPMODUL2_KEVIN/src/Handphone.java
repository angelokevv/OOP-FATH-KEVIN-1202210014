public class Handphone extends Perangkat{
    protected boolean fingerprint;

    Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi(){
        if(fingerprint == false){
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu handphone ini tidak memiliki Fingerprint");
        }
        else{
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu handphone ini memiliki Fingerprint");
        }
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambung telepon ke No "+no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp1+" dan ke "+no_hp2);
    }
}
