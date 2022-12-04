public class Laptop extends Perangkat{

    protected boolean webcam;

    Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi(){
        if(webcam == false){
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu Laptop ini tidak memiliki Webcam");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu Laptop ini memiliki Webcam");
        }
    }

    public void bukagame(String namaGame){
        System.out.println("Laptop berhasil membuka game "+namaGame);
    }

    public void kirimEMAIL(String email){
        System.out.println("Laptop ini berhasil mengirim E-Mail ke "+email);
    }

    public void kirimEMAIL(String email1, String email2){
        System.out.println("Laptop ini berhasil mengirim E-Mail ke "+email1+" dan ke "+email2);
    }

}
