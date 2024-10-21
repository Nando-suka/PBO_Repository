package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField; 
import javafx.scene.input.MouseEvent;

public class contohController {
	
	// Membuat koleksi/arraylist dari class kamar
	ArrayList<pesan> daftarPesan = new ArrayList<pesan>();

    @FXML
    private Button btnkirim;

    @FXML
    private ChoiceBox<String> cmbjenistiket;

    @FXML
    private DatePicker datepickertanggalbutt;
    
    @FXML
    private Spinner<Integer> spinjumlahtiket;

    @FXML
    private TextField txtnamaemail;

    @FXML
    private TextField txtnamapembeli;

    @FXML
    private TextField txtnomorhandphone;

    @FXML
    void handleClickBtnKirim(MouseEvent event) {
    	rekamDataPesanBaru();
    	rekamDataSeluruhPesanBaru();
    	tampilkanDaftarPesanan();
    }
    
    // Membuat fungsi rekamDataSeluruhPesanBaru()
    private void rekamDataSeluruhPesanBaru() {
    	try {
    		FileOutputStream file = new FileOutputStream("pesan.dat");
    		
    		ObjectOutputStream serializedDataPesan =
    				new ObjectOutputStream(file);
    		
    		serializedDataPesan.writeObject(daftarPesan);
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    // Membuat fungsi tampilkanDaftarPesanan()
    private void tampilkanDaftarPesanan() {
    	/* Menampilkan daftar semua kamar:
		 * 1. Membuat string untuk menampung seluruh pesanan tiket
		 * 2. Melakukan loop untuk semua objek di dalam 
		 *    koleksi/arraylist dan menambahkan data pesan ke dalam
		 *    string
		 * 3. Menampilkan string
		 */
    	
    	// 1. Membuat String untuk menampung seluruh daftar pesan.
    	String seluruhDaftarPesanan = "";
    	// 2. Melakukan loop dan menambahkan data pesan ke string
    	for (pesan d:daftarPesan) {
    		seluruhDaftarPesanan += String.format(
    				"Nama: %s"
    				+ "\nEmail: %s"
    				+ "\nNomor Handphone: %s"
    				+ "\nJumlah Tiket: %s"
    				+ "\nJenis TIket: %s"
    				+ "\n\n",
    				d.getNamaPembeli(),
    				d.getNamaEmail(),
    				d.getNomorHP(),
    				d.getJumlahTiket(),
    				d.getJenisTiket()
    				);
    		
    		// 3, Menampilkan dengan joptionpane
    		JOptionPane.showMessageDialog(null, seluruhDaftarPesanan);
    	}
    }
    
     // Membuat fungsi initialize
    public void initialize() {
    	/* Memberi 3 nilai dalam tombol choicebox: 
    	 *   1. Ekonomi
    	 *   2. Standar
    	 *   3. Premium
    	 */
    	 cmbjenistiket.setItems(FXCollections.observableArrayList(
    			 "Ekonomi", "Standar", "Premium"));
    	// Memilih 0 sebagai default
    	 cmbjenistiket.getSelectionModel().select(0);
    	 // Menentukan nilai dari jumlah tiket hanya bisa sampai dengan 5
    	 SpinnerValueFactory<Integer> valueJumlahTiket =
    			 new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1);
    	 
    	 spinjumlahtiket.setValueFactory(valueJumlahTiket);
    }
    
    @SuppressWarnings("unchecked")
	private void bacaDataSeluruhPesanDariDisk() {
    	try {
    		FileInputStream file = new
    				FileInputStream("pesan.dat");
    		ObjectInputStream deserializePesan = 
    				new ObjectInputStream(file);
    		daftarPesan =
    				(ArrayList<pesan>)
    				deserializePesan.readObject();
    	} catch (IOException |
    			 ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    }
    
    public void rekamDataPesanBaru() {
    	/* Merekam data pesan baru ke dalam memori (belum ke storage):
		 * 1. Membaca data yang diketikkan user pada form
    	 * 2. Membuat objek baru dari class pesan
    	 * 3. Menambahkan objek baru ke dalam koleksi/arrayList
    	 */
    	
    	//1. Membaca data yang diketikkan user pada form
    	String namaPembeli = txtnamapembeli.getText();
    	String nomorHP = txtnomorhandphone.getText();
        String namaEmail = txtnamaemail.getText();
        int jumlahTiket = spinjumlahtiket.getValue();
        char jenisTiket = 'E';
        if (cmbjenistiket.getSelectionModel()
        		.getSelectedIndex()==1) {
        			jenisTiket = 'S';
        		}
        else if(cmbjenistiket.getSelectionModel()
        		.getSelectedIndex()==2) {
        	jenisTiket = 'P';
        }
        
        // 2. Membuat ibjek baru dari class pesan 
        pesan pesanBaru = new pesan(namaPembeli, nomorHP, namaEmail,
        		jenisTiket, jumlahTiket);
        
        // 3. Menambah objek baru ke dalam koleksi/arraylist
        daftarPesan.add(pesanBaru);
    }
    
    

}
