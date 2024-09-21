import java.util.Scanner;

public class latihan {
    public static void main(String args[]) throws Exception{
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan angka pertama: ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.println("----------------------------");
        System.out.println("           Pertambahan          ");
        System.out.println("Ini adalah angka pertama: " + angka);
        System.out.println("Ini adalah angka kedua: " + angka2);

        int hasil = angka + angka2;
        int kurang = angka - angka2;
        int kali = angka * angka2;

        System.out.println("Hasilnya adalah: " + hasil);
        System.out.println("------- Pengurangan -------");
        System.out.println("Hasilnya adalah: " + kurang);
        System.out.println("------- Perkalian -------");
        System.out.println("Hasilnya adalah: " + kali);
        if (kurang < 10) {
            System.out.println("Hasilnya kurang dari 10.");
        }

    }
}
