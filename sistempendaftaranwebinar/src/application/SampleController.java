package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SampleController {
	
	// Membuat koleksi/arraylist dari class kamar
	ArrayList<webinar> daftarWebinar = new ArrayList<webinar>();

    @FXML
    private Button btnDaftar;

    @FXML
    private ChoiceBox<String> cmbJenisWeb;

    @FXML
    private AnchorPane dateTanggalWeb;

    @FXML
    private Spinner<Integer> spinKapasitas;

    @FXML
    private DatePicker tanggalWebinar;

    @FXML
    private TextField txtnamaWebinar;

    @FXML
    void HandleBtnDaftar(MouseEvent event) {
    	rekamDataWebinarBaru();
    	rekamDataSeluruhWebinarBaru();
    	tampilkanDaftarWebinar();
    }
    
 // Membuat fungsi rekamDataSeluruhPesanBaru()
    private void rekamDataSeluruhWebinarBaru() {
    	// Membuat file pada disk sebagai tujuan perekaman data (output stream)
    	try {
    		FileOutputStream file = new FileOutputStream("webinar.dat");
    		// Membuat objek stream untuk menyimpan data pesan yang sudah berbentuk serial
    		
    		ObjectOutputStream serializedDataPesan =
    				new ObjectOutputStream(file);
    		
    		// Melakukan serialisasi ke output stream
    		serializedDataPesan.writeObject(daftarWebinar);
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    // Membuat fungsi tampilkanDaftarWebinar()
    private void tampilkanDaftarWebinar() {
    	/* Menampilkan daftar semua webinar:
		 * 1. Membuat string untuk menampung seluruh pesanan webinar yang ada
		 * 2. Melakukan loop untuk semua objek di dalam 
		 *    koleksi/arraylist dan menambahkan data pesan ke dalam
		 *    string
		 * 3. Menampilkan string
		 */
    	
    	// 1. Membuat String untuk menampung seluruh daftar webinar.
    	String seluruhDaftarWebinar = "";
    	// 2. Melakukan loop dan menambahkan data pesan ke string
    	for (webinar w:daftarWebinar) {
    		seluruhDaftarWebinar += String.format(
    				"Nama Webinar: %s"
    				+ "\nJenis Webinar: %s"
    				+ "\nTanggal Pendaftaran: %s"
    				+ "\n Kapasitas: %s"
    				+ "\n Sisa Tempat: %s"
    				+ "\n\n",
    				w.getNamaWebinar(),
    				w.getJenisWebinar(),
    				w.getTanggalPendaftaran(),
    				w.getKapasitas(),
    				w.getSisaTempat()
    				);
    		
    	}
    	/* 3. Menampilkan string daftar kamar 
    	 *    menggunakan JTextArea*/
    	  JTextArea textArea = new JTextArea(seluruhDaftarWebinar);
    	    textArea.setEditable(false);  // Agar tidak bisa diedit
    	    textArea.setLineWrap(true);   // Membungkus teks
    	    textArea.setWrapStyleWord(true);
    	    
    	    // 4. Membungkus JTextArea dengan JScrollPane untuk membuat scrollbar
    	    JScrollPane scrollPane = new JScrollPane(textArea);
    	    scrollPane.setPreferredSize(new java.awt.Dimension(350, 250));

    	    // 5. Menampilkan JScrollPane di dalam JOptionPane
    	    JOptionPane.showMessageDialog(null, scrollPane, "Daftar Webinar", JOptionPane.INFORMATION_MESSAGE);
   }
    
 // Membuat fungsi initialize
    public void initialize() {
    	/* Memberi 3 nilai dalam tombol choicebox: 
    	 *   1. Ekonomi
    	 *   2. Standar
    	 *   3. Premium
    	 */
    	 cmbJenisWeb.setItems(FXCollections.observableArrayList(
    			 "Presentasi", "Diskusi Panel", "Workshop", "Kursus Online", "Peluncuran Produk"));
    	// Memilih 0 sebagai default
    	 cmbJenisWeb.getSelectionModel().select(0);
    	 // Menentukan nilai dari jumlah tiket hanya bisa sampai dengan 5
    	 SpinnerValueFactory<Integer> valueJumlahTiket =
    			 new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1);
    	 
    	 spinKapasitas.setValueFactory(valueJumlahTiket);
    	 
    	 // Membaca daftar pesan dari disk
    	 bacaDataSeluruhPesanDariDisk();
    }
    
    @SuppressWarnings("unchecked")
	private void bacaDataSeluruhPesanDariDisk() {
    	try {
    		FileInputStream file = new
    				FileInputStream("webinar.dat");
    		ObjectInputStream deserializePesan = 
    				new ObjectInputStream(file);
    		daftarWebinar =
    				(ArrayList<webinar>)
    				deserializePesan.readObject();
    	} catch (IOException |
    			 ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    }
    
    public void rekamDataWebinarBaru() {
    	/* Merekam data pesan baru ke dalam memori (belum ke storage):
		 * 1. Membaca data yang diketikkan user pada form
    	 * 2. Membuat objek baru dari class pesan
    	 * 3. Menambahkan objek baru ke dalam koleksi/arrayList
    	 */
    	
    	//1. Membaca data yang diketikkan user pada form
    	String namaWebinar = txtnamaWebinar.getText();
        int kapasitas = spinKapasitas.getValue();
        int sisaTempat = kapasitas; 
        char jenisWebinar = 'P';
        LocalDate tanggalPendaftaran = tanggalWebinar.getValue();
        if (cmbJenisWeb.getSelectionModel()
        		.getSelectedIndex()==1) {
        			jenisWebinar= 'D';
        		}
        else if(cmbJenisWeb.getSelectionModel()
        		.getSelectedIndex()==2) {
        	jenisWebinar = 'W';
        }
        else if(cmbJenisWeb.getSelectionModel()
        		.getSelectedIndex()==3) {
        	jenisWebinar = 'K';
        }
        else if(cmbJenisWeb.getSelectionModel()
        		.getSelectedIndex()==4) {
        	jenisWebinar = 'G';
        }
        
        
        
        // 2. Membuat objek baru dari class pesan 
        webinar webinarBaru = new webinar(namaWebinar, jenisWebinar,
        		kapasitas, sisaTempat, tanggalPendaftaran);
        
        // 3. Menambah objek baru ke dalam koleksi/arraylist
        daftarWebinar.add(webinarBaru);
    }
    
}
    
    

