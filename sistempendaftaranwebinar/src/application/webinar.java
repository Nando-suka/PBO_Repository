package application; 
import java.io.Serializable;
import java.time.LocalDate;

public class webinar implements Serializable {
	/* Property Class atau Attribute Class atau Field Class*/
	private String namaWebinar = "";
	private char jenisWebinar = 'P';
	private int kapasitas = 1;
	private int sisaTempat = 0;
	private LocalDate tanggalPendaftaran;
	
	/* Constructor 
	 * yaitu fungsi/method untuk menginisialisasi objek ketika
	 * baru dibuat
	 */
	public webinar(String namaWebinar, char jenisWebinar, 
			int kapasitas, int sisaTempat, LocalDate tanggalPendaftaran) {
		super();
		this.namaWebinar = namaWebinar;
		this.jenisWebinar = jenisWebinar;
		this.kapasitas = kapasitas;
		this.sisaTempat = sisaTempat;
		this.tanggalPendaftaran = tanggalPendaftaran;
	}

	/* Method Setter dan Getter 
	 * yaitu method untuk mengubah nilai attribute/property/field
	 * dan untuk mengambil/membaca nilai attribute/property/field */
	public String getNamaWebinar() {
		return namaWebinar;
	}

	public void setNamaWebinar(String namaWebinar) {
		this.namaWebinar = namaWebinar;
	}

	public char getJenisWebinar() {
		return jenisWebinar;
	}

	public void setJenisWebinar(char jenisWebinar) {
		this.jenisWebinar = jenisWebinar;
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
	
	public LocalDate getTanggalPendaftaran() {
		return tanggalPendaftaran;
	}

	public void setTanggalPembelian(LocalDate tanggalPendaftaran) {
		this.tanggalPendaftaran = tanggalPendaftaran;
	}

	

	
	
}
