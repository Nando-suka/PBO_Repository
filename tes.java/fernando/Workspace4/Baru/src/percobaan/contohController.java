package percobaan;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class contohController {

    @FXML
    private ComboBox<String> cmdkesukaan;

    @FXML
    private TextField cmdnama;

    @FXML
    private Button cmdselesai;

    @FXML
    private ComboBox<String> cmdumur;

    @FXML
    private TextArea cmkdKomentar;
    
    @FXML
    void handleBtnSelesai(MouseEvent event) {
    	
    	// Mengambil data dari formulir
    	String NamaPengguna = cmdnama.getText();
    	String PemilihanKesukaan = cmdkesukaan.getValue();
    	String PemilihanUmur = cmdumur.getValue();
    	String PemberianKomentar = cmkdKomentar.getText();
    	
    	// Menampilkan nya dengan menggunakan library alert
    	Alert tampilan = new Alert(AlertType.INFORMATION);
    	tampilan.setTitle("Formulir hobi");
    	tampilan.setHeaderText(null);
    	tampilan.setContentText("Data Formulir Kesukaan berhasil direkam\n"
    			+ "Nama: " + NamaPengguna +
    			"\n" + "Hobi: " + PemilihanKesukaan + "\n" +
    			"Umur Pengguna: " + PemilihanUmur + "\n" +
    			"Komentar pengguna: " + PemberianKomentar + "\n");
    	tampilan.showAndWait();
    }
    
    public void initialize() {
    	// Membuat daftar list untuk kesukaan
    	cmdkesukaan.setItems(FXCollections.observableArrayList("Menonton Chelsea FC", "Bermain game EA FC", "Menonton drama So Okuno",
    			      "Membaca Novel", "Mengikuti perkembangan teknologi"));
    	// Membuat pilihan default daftar list kesukaan dimulai dari 0
    	cmdkesukaan.getSelectionModel().select(0);
    	
    	// Membuat daftar pilihan umur
    	cmdumur.setItems(FXCollections.observableArrayList("6-10 Tahun", "11-20 Tahun", "21-30 Tahun", "31-40 Tahun", "41-50 Tahun", "51-80 Tahun"));
    	
    }

}
