import java.util.Scanner;

public class app2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pengandaian");

        System.out.print("Ibukota Indonesia adalah Jakarta [y/t]: ");

        String pilihan = scanner.nextLine();
        String jawaban = "y";                                                                                                               

        if (pilihan == jawaban) {
            System.out.println("Iya jawaban Anda benar.");
        }
        else {
            System.out.println("Maaf jawaban Anda salah.");
        }
    }
}

