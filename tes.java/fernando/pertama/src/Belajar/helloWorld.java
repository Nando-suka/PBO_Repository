package Belajar;

import java.util.Scanner;


public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Scanner scanner = new Scanner(System.in);
		
		String nama = "";
		
		System.out.print("Masukkan nama Anda: ");
		String jawaban = scanner.nextLine();
		
		System.out.println("Nama: " + jawaban);
		
		System.out.println("-----------------");
		System.out.println("Pertambahan");
		
		System.out.print("Masukkan angka pertama: ");
		Integer jawaban1 = scanner.nextInt();
		System.out.print("Masukkan angka kedua: ");
		Integer jawaban2 = scanner.nextInt();
		System.out.print("Masukkan angka ketiga: ");
		Integer jawaban3 = scanner.nextInt();
		
		Integer Hasil = jawaban1 + jawaban2 + jawaban3;
		System.out.println("Jawaban dari hasil pertambahan: " + Hasil);
		
	}

}
