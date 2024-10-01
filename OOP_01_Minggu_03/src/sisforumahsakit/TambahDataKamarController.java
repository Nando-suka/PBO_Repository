package sisforumahsakit;

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

    @FXML
    private ChoiceBox<String> jeniskelamin;

    @FXML
    private Spinner<Integer> kapasitas;

    @FXML
    private TextField namakamar;

    @FXML
    private Button rekamdatakamar;
    
    void handlerekamdatakamar(MouseEvent event) {
    	String dataKamar = " ";
    	dataKamar += String.format("Nama Kamar: %s" +
    			"\n Jenis Kelamin: %s" +
    			"\nKapasitas: %s" +
    			namakamar.getText(),
    			jeniskelamin.getSelectionModel().getSelectedItem(),
    			kapasitas.getValue());
    	
    	JOptionPane.showMessageDialog(null, dataKamar);
    }
    
    public void initialize() {
    	jeniskelamin.setItems(FXCollections.observableArrayList("Laki-laki", "Perempuan"));
    	
    	// Memilih pilihan 0 sebagai default
    	jeniskelamin.getSelectionModel().select(0);
    	
    	// Menentukan nilai minimum = 1, maksimum = 0 dan step = 1
    	SpinnerValueFactory<Integer> valueFactory = 
    			new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 8, 1);
    	
    	kapasitas.setValueFactory(valueFactory);
   
    	
    }

}
