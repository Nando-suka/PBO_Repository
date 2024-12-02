package application;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.mercubuana.sisfopw.JenisWebinar;
import com.mercubuana.sisfopw.JenisWebinarDAO;
import com.mercubuana.sisfopw.SistempendaftaranwebinarPersistentManager;
import com.mercubuana.sisfopw.Webinar;
import com.mercubuana.sisfopw.WebinarDAO;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerTambahData {

    @FXML
    private Button btnDaftar;

    @FXML
    private ChoiceBox<JenisWebinar> cmbJenisWebinar;

    @FXML
    private DatePicker dateTanggalPendaftaran;

    @FXML
    private Spinner<Integer> spinnerKapasitas;
    
    @FXML
    private Spinner<Integer> spinnersisakapasitas;

    @FXML
    private TextField txtNamaWebinar;
    
@SuppressWarnings("unchecked")
public void initialize() {
    	
    	// Membuat Kapasitas
    	SpinnerValueFactory<Integer> valueFactoryKapasitas =
    			new SpinnerValueFactory
    			.IntegerSpinnerValueFactory(1, 5, 1);
    		spinnerKapasitas
    	.setValueFactory(valueFactoryKapasitas);
    	spinnerKapasitas.setEditable(true);
    	
    	// Membuat sisa kapasitas
    	SpinnerValueFactory<Integer> valueFactorysisakapasitas =
    			new SpinnerValueFactory
    			.IntegerSpinnerValueFactory(1, 5, 1);
    		spinnersisakapasitas
    	.setValueFactory(valueFactorysisakapasitas);
    	spinnersisakapasitas.setEditable(true);
    	
    	// 
    
    	// Menampilkan pilihan jenis webinar dengan kelas
    	try {
    		List<JenisWebinar> daftarJenisWebinar =
    				JenisWebinarDAO
    				.queryJenisWebinar(null, null);
    		for (JenisWebinar j: daftarJenisWebinar) {
    			cmbJenisWebinar.getItems()
    			.add(j);
    		}
    		//System.out.println("Daftar Jenis Webinar: " + daftarJenisWebinar.size());

    	} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    @FXML
    void btnDaftarWebinar(MouseEvent event) {
    	JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
    	JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Berhasil !!!", 1);
    	rekamDataWebinarBaru();
    }
    
    void rekamDataWebinarBaru() {
    	// Membuat nama webinar
    	String namaWebinar = txtNamaWebinar
    			.getText();
    	
    	// Membuat Kapasitas
    	int kapasitas = spinnerKapasitas
    			.getValue();
    	
    	// Membuat sisa kapasitas
    	int sisakapasitas = spinnersisakapasitas
    			.getValue();
    	
    	// Ambil tanggal pendaftaran dari DatePicker
    	LocalDate selectedDate = dateTanggalPendaftaran.getValue();
    	
    	// Konversi LocalDate ke java.util.Date
        Date tanggalPendaftaran = Date.from(
        		selectedDate.atStartOfDay(
        				ZoneId.systemDefault()).toInstant());

  
//        // tes.
//        JenisWebinar jenisWebinarTerpilih = cmbJenisWebinar.getValue();
//        if (jenisWebinarTerpilih == null) {
//            System.out.println("Jenis Webinar tidak dipilih atau null");
//        } else {
//            System.out.println("Jenis Webinar Terpilih: " + jenisWebinarTerpilih.getNamaJenisWebinar());
//        }

    	
    	
    	// Melakukan perekaman ke database
    	try {
    		PersistentTransaction j;
    		j = SistempendaftaranwebinarPersistentManager
    				.instance().getSession()
    				.beginTransaction();
    		
    		// Buat objek jenis webinar di memori
			Webinar webinarBaru = WebinarDAO
					.createWebinar();
			webinarBaru.setNamaWebinar(namaWebinar);
			webinarBaru.setKapasitas(kapasitas);
			webinarBaru.setSisaKapasitas(sisakapasitas);
		    webinarBaru.setTanggalPendaftaran(tanggalPendaftaran); // Set Date ke field Webinar
			webinarBaru.setJenis_Webinar(
					cmbJenisWebinar.getSelectionModel()
					.getSelectedItem());
			
			
			// Merekam ke db
			WebinarDAO.save(webinarBaru);
			
			// buat komit permanen
			j.commit();
    	} catch (PersistentException e) {
    		e.printStackTrace();
    	}
    }
}
