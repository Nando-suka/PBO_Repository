import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        System.out.println("Pertama");

        Scanner baru = new Scanner(System.in);

        // Membaca nama pengguna
        System.out.print("Silahkan masukkan nama Anda: ");
        String nama = baru.nextLine();

        // Membaca umur pengguna                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          bermai aplikasi java dengan sege
        System.out.print("Masukkan umur Anda: ");
        int umur = baru.nextInt();

        // Membaca gaji pengguna
        System.out.print("Masukkan gaji Anda: ");
        double salary = baru.nextDouble();

        // Menampilkan hasil program
        System.out.println("Nama  :  " + nama);
        System.out.println("Umur  :" + umur);
        System.out.println("Gaji  :" + salary);

        System.out.print("Masukkan nilai Anda: ");
        int score = baru.nextInt();
        
        if (score >= 90) {
            System.out.println("Nilai Anda: A");
        } else if (score >= 80) {
            System.out.println("Nilai Anda: B");
        } else if (score >= 70) {
            System.out.println("Nilai Anda: C");
        } else if (score >= 60) {
            System.out.println("Nilai Anda: D");
        } else {
            System.out.println("Nilai Anda: F");
        }

        // Menutup Scanner
        baru.close();

    }
}