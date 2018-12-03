package balicek.druhyPokus;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ParticipantFxModel {
	
	StringProperty name = new SimpleStringProperty();
	StringProperty surname = new SimpleStringProperty();
	
	
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.setName(name);
	}
	public StringProperty nameProperty() {
		return name;
	}
	//-------------------------------------------------------
	public String getSurname() {
		return surname.get();
	}
	public void setSurname(String surname) {
		this.setSurname(surname);
	}
	public StringProperty surnameProperty() {
		return surname;
	}
	//--------------------------------------------------------
	public Participant getDonor() {
		Participant d = new Participant();
		d.setName(this.getName());
		d.setSurname(this.getSurname());
		return d;
	}

}
 