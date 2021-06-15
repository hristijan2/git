package DayEleven.homework;

public class TestTeam {
	
	public static void main(String[] args) {
		Team[] teams = new Team[] {
				new Team(),
				new Team(),
				new Team(),
				new Team(),
				new Team()
		};

		print();
		
		for (Team team : teams) {
			team.toString();
			team.setBestPlayers(11);
			team.adjustTableSize(200);
		}
	}

	private static void print() {		
	}

	}


