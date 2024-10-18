package sisforumahsakit;

public class Kamar {
	/* Property Class atau Attribute Class atau Field Class*/
	private String namaKamar = "";
	private char jenisKelamin = 'L';
	private int kapasitas = 1;
	private int sisaTempat = 0;
	
	/* Constructor 
	 * yaitu fungsi/method untuk menginisialisasi objek ketika
	 * baru dibuat
	 */
	public Kamar(String namaKamar, char jenisKelamin, 
			int kapasitas, int sisaTempat) {
		super();
		this.namaKamar = namaKamar;
		this.jenisKelamin = jenisKelamin;
		this.kapasitas = kapasitas;
		this.sisaTempat = sisaTempat;
	}

	/* Method Setter dan Getter 
	 * yaitu method untuk mengubah nilai attribute/property/field
	 * dan untuk mengambil/membaca nilai attribute/property/field */
	public String getNamaKamar() {
		return namaKamar;
	}

	public void setNamaKamar(String namaKamar) {
		this.namaKamar = namaKamar;
	}

	public char getJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(char jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public int getKapasitas() {
		return kapasitas;
	}

	public void setKapasitas(int kapasitas) {
		this.kapasitas = kapasitas;
	}

	public int getSisaTempat() {
		return sisaTempat;
	}

	public void setSisaTempat(int sisaTempat) {
		this.sisaTempat = sisaTempat;
	}
	

	
	
}
