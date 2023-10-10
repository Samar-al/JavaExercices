package fr.eni.pooExercices;

public class Voiture {

		
		 private String brand;
		 private String makenModel;
		 private int kilometers;
		 private String plateNumber;
		 private boolean technicalControl = false;
		 private Window window;
		 
		 private static final int WHEELS_NUMBER = 4;
		 
		 public Voiture (String brand, String makenModel, int kilometers, String plateNumber, boolean technicalControl, Window window) {
		    	this.brand = brand;
		    	this.makenModel = makenModel;
		    	this.kilometers = kilometers;
		    	this.plateNumber = plateNumber;
		    	this.technicalControl = technicalControl;
		    	this.window = window;
		    }
		 
		 public Voiture () {
			 //constructeur vide permettant d'instancier l'objet sans donner d'information.
		 }
		 
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getMakenModel() {
			return makenModel;
		}
		public void setMakenModel(String makingModel) {
			this.makenModel = makingModel;
		}
		public int getKilometers() {
			return kilometers;
		}
		public void setKilometers(int kilometers) {
			this.kilometers = kilometers;
		}
		public String getPlateNumber() {
			return plateNumber;
		}
		public void setPlateNumber(String plateNumber) {
			this.plateNumber = plateNumber;
		}
		public int getWheelsNumber() {
			return WHEELS_NUMBER;
		}
		public boolean isTechnicalControl() {
			return technicalControl;
		}
		public void setTechnicalControl(boolean technicalControl) {
			this.technicalControl = technicalControl;
		}
		public Window getWindow() {
			return window;
		}

		@Override
		public String toString() {
			return "Voiture "
					+ "["
					+ "brand=" + brand 
					+ ", makenModel=" + makenModel 
					+ ", kilometers=" + kilometers
					+ ", plateNumber=" + plateNumber 
					+ ", technicalControl=" + technicalControl 
					+ ", getWheelsNumber()=" + getWheelsNumber() 
					+ "\n, getWindow()=" + getWindow()
					+ "]";
		}
		 
		 
		 
		 
		

	

}
