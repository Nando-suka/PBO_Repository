package aplikasi;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController {
    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (checkLogin(username, password)) {
            System.out.println("Login berhasil!");
            // Arahkan ke tampilan berikutnya di sini
        } else {
            System.out.println("Username atau password salah!");
        }
    }

    private boolean checkLogin(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/aplikasi_pemesanan";
        String user = "root"; // Sesuaikan dengan username database kamu
        String pass = ""; // Sesuaikan dengan password database kamu, kosong jika tidak ada

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next(); // Mengembalikan true jika ada baris yang ditemukan
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
