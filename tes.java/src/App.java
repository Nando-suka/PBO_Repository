import java.util.Scanner;

import javax.swing.JDesktopPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.println("Masukkan umur Anda: ");
        int age = scanner.nextInt();

        System.out.println("\n--- Output ---");
        System.out.println("Nama: " + name);
        System.out.println("Umur: "+ age);


    }
}
