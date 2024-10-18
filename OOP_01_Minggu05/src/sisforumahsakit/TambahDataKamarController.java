package sisforumahsakit;


import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class TambahDataKamarController {
	/* Membuat koleksi/arraylist dari class Kamar */
    ArrayList<Kamar> daftarKamar = new ArrayList<Kamar>();
    
    @FXML
    private Button btnRekamDataKamar;

    @FXML
    private ChoiceBox<String> cmbJenisKelamin;

    @FXML
    private Spinner<Integer> spinKapasitas;

    @FXML
    private TextField txtNamaKamar;
    
    @FXML
    void handleClickBtnRekamDataKamar(MouseEvent event) {
    	rekamDataKamarBaru();
    	tampilkanDaftarKamar();
    }
    
    private void tampilkanDaftarKamar() {
		/* Menampilkan daftar semua kamar:
		 * 1. Membuat string untuk menampung seluruh data kamar
		 * 2. Melakukan loop untuk semua objek di dalam 
		 *    koleksi/arraylist dan menambahkan data kamar ke dalam
		 *    string
		 * 3. Menampilkan string
		 */
    	
    	/* 1. Membuat string untuk menampung seluruh data kamar*/
    	String seluruhDataKamar = "";
    	/* 2. Melakukan loop dan menambahkan data kamar ke string */
    	for (Kamar k:daftarKamar) {
    		seluruhDataKamar += String.format(
    				"Nama kamar: %s"
    				+ "\nJenis kelamin: %s"
    				+ "\nKapasitas: %s"
    				+ "\nSisa tempat: %s"
    				+ "\n\n", 
    				k.getNamaKamar(),
    				k.getJenisKelamin(),
    				k.getKapasitas(),
    				k.getSisaTempat()
    				);
    	}
    	/* 3. Menampilkan string daftar kamar */
    	JOptionPane.showMessageDialog(null, seluruhDataKamar);
	}

	public void initialize() {
    	/* Memberi 2 nilai, "Laki-laki" dan "Perempuan" 
    	 * ke dalam choicebox
    	 */
    	cmbJenisKelamin.setItems(FXCollections
    			.observableArrayList("Laki-laki", "Perempuan"));
    	/* Memilih pilihan 0 ("Laki-laki")  sebagai default
    	 * 
    	 */
    	cmbJenisKelamin.getSelectionModel().select(0);
    	
    	/* Menentukan nilai minimum = 1, maksimum = 8
    	 * dan step = 1
    	 */
    	SpinnerValueFactory<Integer> valueKapasitasFactory =
    			new SpinnerValueFactory
    			.IntegerSpinnerValueFactory(1,8,1);

    	spinKapasitas.setValueFactory(valueKapasitasFactory);
    	
    }
    
    
    public void rekamDataKamarBaru() {
    	/* Merekam data kamar baru ke dalam memori (belum ke storage):
		 * 1. Membaca data yang diketikkan user pada form
    	 * 2. Membuat objek baru dari class Kamar
    	 * 3. Menambahkan objek baru ke dalam koleksi/arrayList
    	 */
    	/*1. Membaca data yang diketikkan user pada form */
    	String namaKamar = txtNamaKamar.getText();
    	int kapasitas = spinKapasitas.getValue();
    	int sisaTempat = kapasitas; //kamar baru, sisatempat==kapasitas
    	char jenisKelamin = 'L';
    	if (cmbJenisKelamin.getSelectionModel()
    			.getSelectedIndex()==1) {
    		jenisKelamin = 'P';
    	}
    	
    	/*2. Membuat objek baru dari class Kamar (secara otomatis 
    	 * memanggil method Constructor) */
    	Kamar kamarBaru = new Kamar(namaKamar, jenisKelamin, 
    			kapasitas, sisaTempat);
    	
    	/*3. Menambah objek baru ke dalam koleksi/arraylist */
    	daftarKamar.add(kamarBaru);
    	
//    	String dataKamar = "";
//    	dataKamar += String.format("Nama kamar: %s" +
//    			"\nJenis kelamin: %s" +
//    			"\nKapasitas: %s",
//    			txtNamaKamar.getText(),
//    			cmbJenisKelamin.getSelectionModel().getSelectedItem(),
//    			spinKapasitas.getValue());
//    	
//    	JOptionPane.showMessageDialog(null, dataKamar);
    }
}
