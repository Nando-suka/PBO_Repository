module Sisfo_Hotel {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens sisfo to javafx.graphics, javafx.fxml;
}
