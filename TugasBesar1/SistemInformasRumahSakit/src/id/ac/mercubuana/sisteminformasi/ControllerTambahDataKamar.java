package id.ac.mercubuana.sisteminformasi;

import java.util.List;

import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mercubuana.sisfors.Kamar;
import com.mercubuana.sisfors.KamarDAO;
import com.mercubuana.sisfors.Kelas;
import com.mercubuana.sisfors.KelasDAO;
import com.mercubuana.sisfors.SistemInformasiRSPersistentManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerTambahDataKamar {

    @FXML
    private Button btnRekamDataKamarBaru;

    @FXML
    private ChoiceBox<String> cmbJenisKelamin;
    
    @FXML
    private ChoiceBox<Kelas> cmbKelas;

    @FXML
    private Spinner<Integer> spinnerKapasitas;

    @FXML
    private Spinner<Integer> spinnerSisaTempat;

    @FXML
    private TextField txtNamaKamar;
    
    public void initialize() {
//    	JOptionPane.showMessageDialog(null, 
//    			"Initialize . . .");
    	cmbJenisKelamin.getItems().addAll(
    			"Laki-laki", "Perempuan");
    	cmbJenisKelamin.setValue("Laki-laki");
    	SpinnerValueFactory<Integer> valueFactoryKapasitas = 
    			new SpinnerValueFactory
    			.IntegerSpinnerValueFactory(1, 8, 1);
    	spinnerKapasitas
    	.setValueFactory(valueFactoryKapasitas);
    	spinnerKapasitas.setEditable(true);
    	
    	SpinnerValueFactory<Integer> valueFactorySisaTempat = 
    			new SpinnerValueFactory
    			.IntegerSpinnerValueFactory(1, 8, 1);
    	spinnerSisaTempat
    	.setValueFactory(valueFactorySisaTempat);
    	
    	
    	/* Menampilkan pilihan kelas pada
    	 * cmbKelas
    	 */
    	try {
    	// Baca Semua Data Kelas
    		List<Kelas> daftarKelas = 
				KelasDAO
    			.queryKelas(null, null);
				for (Kelas k : daftarKelas) {
	    			cmbKelas.getItems()
	    			.add(k);
	    		}
    	} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   
   }
    
    @FXML
    void BTNHandleMouseClickRekamDataKamarBaru(MouseEvent event) {
//    	JOptionPane.showMessageDialog(null,
//    		"Tombol Berhasil Diklik");
    	rekamDataKamarBaru();
    }
    
    void rekamDataKamarBaru() {
    	/* 1. Baca data dari GUI */
    	String namaKamar = txtNamaKamar
    			.getText();
    	char jenisKelamin = 'L';
    			if (cmbJenisKelamin.getSelectionModel()
    					.getSelectedIndex()==1) {
    				jenisKelamin = 'P';
    			}
    	int kapasitas = spinnerKapasitas
    			.getValue();
    	int sisaTempat = kapasitas;
    	
    	/*2. Rekam data ke database */
    	//a. Buat transaction
		try {
			PersistentTransaction t;
			t = SistemInformasiRSPersistentManager
			.instance().getSession()
			.beginTransaction();
			//b. Buat objek Kamar baru di memori
			Kamar kamarBaru = 
	    			KamarDAO.createKamar();
	    	kamarBaru.setNamaKamar(namaKamar);
	    	kamarBaru.setJenisKelamin(jenisKelamin);
	    	kamarBaru.setKapasitas(kapasitas);
	    	kamarBaru.setSisa_tempat(sisaTempat);
	    	kamarBaru.setKelas(
	    			cmbKelas.getSelectionModel()
	    			.getSelectedItem());
	    	
	    	//2c. Rekam objek Kamar Baru ke db
	    	KamarDAO.save(kamarBaru);
	    	//2d. BUat komit permanen
	    	t.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
   };

}
