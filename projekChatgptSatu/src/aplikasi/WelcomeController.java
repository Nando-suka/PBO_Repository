package aplikasi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class WelcomeController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    // Method untuk koneksi ke database
    private Connection connectDB() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/aplikasi_pemesanan";
            String user = "root";
            String pass = ""; // Ganti dengan password MySQL Anda
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    @FXML
    public void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Cek ke database
        if (validateLogin(username, password)) {
            Stage currentStage = (Stage) usernameField.getScene().getWindow();
            currentStage.close();

            Stage welcomeStage = new Stage();
            StackPane pane = new StackPane();
            Text welcomeText = new Text("Selamat datang, " + username + "!\n\n\n");
            Text percobaanText = new Text("Selamat menikmati, fitur yang ada disini :)");
            pane.getChildren().add(welcomeText);
            pane.getChildren().add(percobaanText);
            Scene welcomeScene = new Scene(pane, 300, 200);

            welcomeStage.setTitle("Welcome Screen");
            welcomeStage.setScene(welcomeScene);
            welcomeStage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Username atau Password salah!", ButtonType.OK);
            alert.showAndWait();
        }
    }
    
    @FXML
    public void handleRegister(ActionEvent event) {
        try {
            // Membuka halaman registrasi
            FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));
            Parent root = loader.load();

            // Membuat stage baru untuk halaman registrasi
            Stage stage = new Stage();
            stage.setTitle("Halaman Registrasi");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Method untuk validasi login ke database
    private boolean validateLogin(String username, String password) {
        boolean isValid = false;
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = connectDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            isValid = rs.next(); // Jika ada hasil, maka user valid

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isValid;
    }
}
