public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String nama;
    int nohp;
    User(String nama, int nohp){
        this.nama = nama;
        this.nohp = nohp;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public String register(){
        return "\n Nama : "+this.nama+"\nPhone Number : "+this.nohp+"\n Register Success!";
    }
        



}
