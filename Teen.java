package dayFive;

public class Teen extends Child {
	boolean isDresed = false;
	
	public void teen(boolean isDresed) {
		this.hight = 10;
		this.isDresed = isDresed;
	}
	
	@Override
	public String grow(int cm) {
		this.hight = hight + (1 * cm);
		return "i have grown" + (1 * cm) + "centimeters. " + "Now i am" + hight;
	}
}
