package fr.eni.pooExercices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Owner {
	
	private String lastname;
	private String firstname;
	private Date acquisionDate;
	private int numberOfPoints;
	private Voiture voiture;
	
	
	public Owner(String lastname, String firstname, String acquisionDate, int numberOfPoints, Voiture voiture) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		try {
			this.acquisionDate = new SimpleDateFormat("dd/MM/yyyy").parse(acquisionDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.numberOfPoints = numberOfPoints;
		this.voiture = voiture;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public Date getAcquisionDate() {
		return acquisionDate;
	}


	public void setAcquisionDate(Date acquisionDate) {
		this.acquisionDate = acquisionDate;
	}


	public int getNumberOfPoints() {
		return numberOfPoints;
	}


	public void setNumberOfPoints(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}


	public Voiture getVoiture() {
		return voiture;
	}


	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}


	@Override
	public String toString() {
		return "Owner [lastname=" + lastname + "\n, firstname=" + firstname + "\n, acquisionDate=" + acquisionDate
				+ "\n, numberOfPoints=" + numberOfPoints + "\n, voiture=" + voiture + "]\n";
	}

	
}
