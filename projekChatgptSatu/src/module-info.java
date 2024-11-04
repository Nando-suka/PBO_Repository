module projekChatgptSatu {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens aplikasi to javafx.graphics, javafx.fxml;
}
