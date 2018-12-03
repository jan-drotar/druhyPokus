package balicek.druhyPokus;

import java.time.LocalDate;

public class Participant {
	//TODO prihlasovanie iba donor
	private Long id;
	private ParticipantRole role;
	private String name;
	private String surname;
	private BloodType bloodType;
	private String eMail;
	private String phoneNumber;
	private char gender;
	private LocalDate dateOfbirth;
	private double weight;
	private boolean passedByQuestionniare;
	private boolean passedByBloodTest;
	//TODO implement special donations
	private LocalDate dateOfLastDonation;
	private int donationsCount;
	private int totalLivesSaved;
	private String noticeFromPhysician;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ParticipantRole getRole() {
		return role;
	}
	public void setRole(ParticipantRole role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public BloodType getBloodType() {
		return bloodType;
	}
	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public LocalDate getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(LocalDate dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean isPassedByQuestionniare() {
		return passedByQuestionniare;
	}
	public void setPassedByQuestionniare(boolean passedByQuestionniare) {
		this.passedByQuestionniare = passedByQuestionniare;
	}
	public boolean isPassedByBloodTest() {
		return passedByBloodTest;
	}
	public void setPassedByBloodTest(boolean passedByBloodTest) {
		this.passedByBloodTest = passedByBloodTest;
	}
	public LocalDate getDateOfLastDonation() {
		return dateOfLastDonation;
	}
	public void setDateOfLastDonation(LocalDate dateOfLastDonation) {
		this.dateOfLastDonation = dateOfLastDonation;
	}
	public int getDonationsCount() {
		return donationsCount;
	}
	public void setDonationsCount(int donationsCount) {
		this.donationsCount = donationsCount;
	}
	public int getTotalLivesSaved() {
		return totalLivesSaved;
	}
	public void setTotalLivesSaved(int totalLivesSaved) {
		this.totalLivesSaved = totalLivesSaved;
	}
	public String getNoticeFromPhysician() {
		return noticeFromPhysician;
	}
	public void setNoticeFromPhysician(String noticeFromPhysician) {
		this.noticeFromPhysician = noticeFromPhysician;
	}
	@Override
	public String toString() {
		if(this.role == ParticipantRole.DONOR) {
			return "Donor ID: "+this.getId()+" "+this.getName()+" "+this.getSurname()+" BT: "+this.getBloodType();
		}
		return "Recipient ID: "+this.getId()+" "+this.getName()+" "+this.getSurname()+" BT: "+this.getBloodType();
}
	
	
}
