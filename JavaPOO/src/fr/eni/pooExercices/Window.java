package fr.eni.pooExercices;

public class Window {
	
	private boolean doubleGlazing;
	private boolean tinted;
	private boolean armored;
	
	public Window(boolean doubleGlazing, boolean tinted, boolean armored) {
		super();
		this.doubleGlazing = doubleGlazing;
		this.tinted = tinted;
		this.armored = armored;
	}

	public boolean isDoubleGlazing() {
		return doubleGlazing;
	}

	public void setDoubleGlazing(boolean doubleGlazing) {
		this.doubleGlazing = doubleGlazing;
	}

	public boolean isTinted() {
		return tinted;
	}

	public void setTinted(boolean tinted) {
		this.tinted = tinted;
	}

	public boolean isArmored() {
		return armored;
	}

	public void setArmored(boolean armored) {
		this.armored = armored;
	}

	@Override
	public String toString() {
		return "Window [doubleGlazing=" + doubleGlazing + ", tinted=" + tinted + ", armored=" + armored + "]";
	}
	
	
	
	
}
