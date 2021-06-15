package DayEleven.homework;

public class Team implements IFootball, IClubFootball, ITableTennis{

	@Override
	public String adjustTableSize(int centimeters) {
		System.out.println("This Table is not adjustable");
		return "This Table is not adjustable";
	}

	@Override
	public void setBestPlayers(int first11) {
		System.out.println("This is the best team: " + first11);
	}

	@Override
	public boolean play() {
		System.out.println("The match starts now");
		return true;
	}

}
