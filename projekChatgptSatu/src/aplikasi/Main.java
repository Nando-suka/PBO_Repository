package aplikasi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load tampilan login
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent loginRoot = loader.load();

        // Siapkan jendela login
        Stage loginStage = new Stage();
        loginStage.setTitle("Login");
        loginStage.initModality(Modality.APPLICATION_MODAL);
        loginStage.setScene(new Scene(loginRoot));
        loginStage.showAndWait(); // Menunggu sampai jendela ditutup

        // Setelah login, Anda bisa memuat tampilan utama di sini
        loadMainApp();
    }

    private void loadMainApp() {
        // Ganti dengan logika untuk memuat tampilan utama setelah login
        System.out.println("Tampilan utama dimuat setelah login.");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
