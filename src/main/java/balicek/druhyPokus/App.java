package balicek.druhyPokus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	public void start(Stage stage) throws Exception {
		RegisterDonorController controller = new RegisterDonorController();
		FXMLLoader fxmlLoader = new FXMLLoader(
				getClass().getResource("newDonor.fxml"));
		fxmlLoader.setController(controller);
		Parent rootPane = fxmlLoader.load();
		Scene scene = new Scene(rootPane);
		stage.setTitle("Entrance system");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	
	}

