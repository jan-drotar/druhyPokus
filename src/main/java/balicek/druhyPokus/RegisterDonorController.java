package balicek.druhyPokus;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class RegisterDonorController {
	
	private DonorDAO donorsDao = new DonorDAO();
	


    @FXML
    private TextField nameTextField;

    @FXML
    private TextField surnameTextField;

    @FXML
    private ComboBox<?> bloodTypeComboBox;

    @FXML
    private ComboBox<?> genderComboBox;

    @FXML
    private DatePicker dateOfBirthDatePicker;

    @FXML
    private TextField weightTextField;

    @FXML
    private TextField eMailTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Button registerDonorButton;

    @FXML
    private ListView<Participant> donorListView;
    
    private ParticipantFxModel registerDonor = new ParticipantFxModel();

    @FXML
    void initialize() {
    	
    	//donorListView.setItems(FXCollections.observableArrayList(donors));
    	nameTextField.textProperty().bindBidirectional(registerDonor.nameProperty());
    	surnameTextField.textProperty().bindBidirectional(registerDonor.surnameProperty());
    	
       
    	registerDonorButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				Participant d = registerDonor.getDonor();
				donorsDao.addDonor(d);
				donorListView.getItems().add(d);
				
			}
		});
    }
}

