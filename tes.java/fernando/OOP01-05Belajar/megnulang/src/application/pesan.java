package application;

import java.io.Serializable;;

public class pesan implements Serializable {
	// Property Class atau Attribute Class atau Field Class
	private String namaPembeli = "";
	private String nomorHP = "";
	private String namaEmail = "";
	private char jenisTiket = 'E';
	private int jumlahTiket = 1;
	
	// Membuat constructor
	public pesan(String namaPembeli, String nomorHP,
			String namaEmail,char jenisTiket, int jumlahTiket) {
		super();
		this.namaPembeli = namaPembeli;
		this.nomorHP = nomorHP;
		this.namaEmail = namaEmail;
		this.jenisTiket = jenisTiket;
		this.jumlahTiket = jumlahTiket;
		
	}
	// Methode Setter dan Getter

	public String getNamaPembeli() {
		return namaPembeli;
	}

	public void setNamaPembeli(String namaPembeli) {
		this.namaPembeli = namaPembeli;
	}

	public String getNomorHP() {
		return nomorHP;
	}

	public void setNomorHP(String nomorHP) {
		this.nomorHP = nomorHP;
	}

	public String getNamaEmail() {
		return namaEmail;
	}

	public void setNamaEmail(String namaEmail) {
		this.namaEmail = namaEmail;
	}

	public char getJenisTiket() {
		return jenisTiket;
	}

	public void setJenisTiket(char jenisTiket) {
		this.jenisTiket = jenisTiket;
	}

	public int getJumlahTiket() {
		return jumlahTiket;
	}

	public void setJumlahTiket(int jumlahTiket) {
		this.jumlahTiket = jumlahTiket;
	}
	

	
}