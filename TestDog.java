package DayNine;

public class TestDog {

	public static void main(String[] args) {
		PickUpTheShovel puts = new PickUpTheShovel();
		puts.clean();

		Dog[] c = new Dog[2];
		c[0] = new PickUpTheShovel();
		c[1] = new ThrowInBin();
					
		Cleaner.cleanAllThePoop(c);

	}

}
