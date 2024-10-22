package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;

public class date extends Application {

    @Override
    public void start(Stage stage) {
        // Membuat DatePicker
        DatePicker datePicker = new DatePicker();
        
        // Membuat label untuk menampilkan tanggal yang dipilih
        Label dateLabel = new Label("Pilih tanggal dari DatePicker.");
        
        // Membuat tombol untuk mengambil tanggal yang dipilih
        Button button = new Button("Tampilkan Tanggal");
        button.setOnAction(e -> {
            // Mengambil tanggal yang dipilih
            LocalDate selectedDate = datePicker.getValue();
            // Menampilkan tanggal yang dipilih
            dateLabel.setText("Tanggal yang dipilih: " + selectedDate);
        });

        // Menambahkan elemen-elemen ke dalam layout
        VBox vbox = new VBox(10, datePicker, button, dateLabel);
        
        // Membuat scene
        Scene scene = new Scene(vbox, 300, 200);
        
        // Menampilkan stage
        stage.setTitle("Contoh DatePicker di JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
