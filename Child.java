package dayFive;

public class Child {
	String type = "teen";
	int hight = 150;
	
	public String lenght(int cm) {
		int initialGrowht = 20;
		
		this.hight = hight + cm;
		return "i have grown" + cm + "centimeters. " + "Now i am: " + hight;
	}
	
	public Child() {
		super();
	}

	public String grow(int cm) {
		// TODO Auto-generated method stub
		return null;
	}		
}