package balicek.druhyPokus;

import java.util.ArrayList;
import java.util.List;

public class DonorDAO {
	private long lastId = 0;
	private List<Participant> donors = new ArrayList<>();
	
	public DonorDAO() {
		Participant p = new Participant();
		p.setName("Andrej");
		p.setSurname("Kiska");

		this.addDonor(p);
	}
	
	public void addDonor(Participant d) {
		if (d != null) {
			this.lastId+=1;
			d.setId(this.lastId);
			donors.add(d);
		}	
	}
	 public List<Participant> getAll(){
		 return donors;
	 }

}
