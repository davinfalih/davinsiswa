package siswa;

public class Siswa {
    //variabel
    int id;
    String nama;
    double ipk;

    //constructor (yang membangun object)
    public Siswa() {
        id= 0;
        nama= "kosong";
        ipk= 0;
    }

    //Getter
    //Setter
    //Method
    public void print() {
        System.out.println("ID : " + id);
        System.out.println("NAMA : " + nama);
        System.out.println("IPK: " + ipk);
    }
}
