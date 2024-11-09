package aplikasi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

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
    public void handleRegisterSubmit(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (password.equals(confirmPassword)) {
            if (registerUser(username, password)) {
                messageLabel.setText("Registrasi berhasil!");
            } else {
                messageLabel.setText("Username sudah terdaftar!");
            }
        } else {
            messageLabel.setText("Password dan konfirmasi password tidak cocok!");
        }
    }

    // Method untuk mendaftar ke database
    private boolean registerUser(String username, String password) {
        boolean isRegistered = false;
        String query = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (Connection conn = connectDB();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                isRegistered = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isRegistered;
    }
}
