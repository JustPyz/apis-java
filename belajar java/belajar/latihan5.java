import java.util.Scanner;

public class latihan5 {  
    public static void main(String[] args) {
        //Mengolah input data sederhana
        //menggunakan class scanner
        int NISN, Usia;
        String Nama, Alamat;
        Scanner Input = new Scanner(System.in);

        System.out.println("DATA SISWA");
        System.out.println("----------");

        System.out.print("NISN : ");
        NISN = Input.nextInt();
        Input.nextLine(); // Mengkonsumsi karakter newline setelah nextInt()

        System.out.print("Nama : ");
        Nama = Input.nextLine(); // Memungkinkan dua kata dalam satu input

        System.out.print("Alamat : ");
        Alamat = Input.next();

        System.out.print("Usia : ");
        Usia = Input.nextInt();

        //Menampilkan Data Sisswa
        System.out.println("DATA SISWA");
        System.out.println("----------");
        System.out.println("NISN :  " + NISN);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Usia : " + Usia);

    }
}
