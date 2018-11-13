
public class Animal {
	private String animal;
	private int legs;
	private String tail;
	private String color;
	
	public Animal(String a, int l, boolean t, String c) {
		animal = a;
		setLegs(l);
		getTail(t);
		color = c;
	}


	private void getTail(boolean t) {
		if (t = true) {
			tail = "does";
		}else {
			tail = "doesn't";
		}
		
	}



	private void setLegs(int l) {
		//World record is a millipede with 750 legs
		if (l >= 0 && l <= 750) {
			legs = l;
		}else {
			legs = 4;
			System.out.println("No animal can have " + legs + " legs. Setting legs to 4.");
		}
		
	}
	public String toString() {
		return "This animal is a " + animal + " with " + legs + " legs and " + tail
				+ " have a tail. It also has the body color of "+ color;
	}
}
