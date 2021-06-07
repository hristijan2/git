package DayNine;

public abstract class Cleaner {
	public static void cleanAllThePoop(Dog[] poop) {
		for (Dog dog : poop) {
			dog.clean();
		}
	}

}
