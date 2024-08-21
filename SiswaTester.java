package siswa;

public class SiswaTester {
    public static void main(String[] args) {
        //membuat object
        //namaClass namaObject = new
        // Constructor

        Siswa raffi = new Siswa();
        Siswa zaky = new Siswa();
        Siswa angga = new Siswa();
        Siswa rama = new Siswa();
        Siswa samid = new Siswa();
        Siswa dewa = new Siswa(14, "dewa", 80);
    
        raffi.id = 8;
        raffi.nama = "Muhammad Raffi";
        raffi.ipk = 87.0;
        zaky.id = 3;
        zaky.nama = "ValentinoZaky";
        zaky.ipk = 97.0;
        angga.id = 9;
        angga.nama = "DewanggaFirmansyah";
        angga.ipk = 98.0;
        rama.id = 16;
        rama.nama = "IqbalRizkyRamadhan";
        rama.ipk = 99.0;
        samid.id = 10;
        samid.nama = "DimasArdiyanFirmansyah";
        samid.ipk = 90.0;
        
        raffi.print();
        System.out.println("----------------");
        zaky.print();
        System.out.println("----------------");
        angga.print();
        System.out.println("----------------");
        rama.print();
        System.out.println("----------------");
        samid.print();
        System.out.println("----------------");
        dewa.print();
        System.out.println("----------------");

        



    }
}
