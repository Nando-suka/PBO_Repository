module BelajarKetigaSceneBuilder {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens utama to javafx.graphics, javafx.fxml;
}
