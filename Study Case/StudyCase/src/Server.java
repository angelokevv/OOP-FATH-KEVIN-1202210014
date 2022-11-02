import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database

        // TODO Display Main Menu and User must be Register First

        // TODO Create User from register in Main Menu
        System.out.println("Selamat Datang di Restoran EAD \nSilahkan Register Terlebih Dahulu");
        System.out.println("======================================");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.println("No. Handphone : ");
        int nohandphone = input.nextInt();

        

        input.close();
        // TODO Display Menu

    }
}
