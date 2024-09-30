import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Selamat datang dan selamat beraktifitas lah engkau kembali ke tanah.");
        System.out.println("Selamat datang dan selamat memutuskan untuk mengambil.");
        System.out.println("Kembali dan lepas dari segala yang ada.");
        System.out.println("Saatnya lepas dan pergi begitu saja.");
        System.out.println("Memaafkan bukan berarti selalu menjnadi jalan.");
        System.out.println("Tolong buatkan yang lebih baik");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan klub kesukaan Anda: ");
        String klub = scanner.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int age = scanner.nextInt();

        System.out.print("Masukkan nomor hp Anda: ");
        int nomor = scanner.nextInt();

        System.out.print("Masukkan manga yang sedang Anda baca: \n");
        String manga = scanner.nextLine();


        System.out.print("Tolong masukkan tempat kesukaan Anda: ");
        String tempat = scanner.nextLine();

        System.out.println("\n--- Output ---");
        System.out.println("Nama: " + name);
        System.out.println("Umur: "+ age);
        System.out.println("Klub kesukaan: " + klub);
        System.out.println("Nomor hp anda: " + nomor);
        System.out.println("Manga yang sedang Anda baca: " + manga);
        System.out.println("Tempat yang Anda ingin kunjungi adalah: " + tempat);
        System.out.println("Selamat datang " + name + " senang bertemu dengan Anda kembali.");
        if (name == "fernando") {
            System.out.println("Ini sudah menjadi hal yang sah.");
            System.out.print("lalu siapa nama panjangmu?: ");
            String nyata = scanner.nextLine();

            if (nyata == "fernando tumanggor" || nyata == "Fernando Tumanggor") {
                System.out.println("Ya anda benar untuk kedua kalinya.");
            }
            else {
                System.out.println("Anda masih salah");
            }
        }
        else {
            System.out.println("Tidak diketahui.");
        }

    }
}
