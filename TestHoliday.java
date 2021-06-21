package DayTwelve.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestHoliday {
	public static void main(String[] args) {
		Holiday h1 = new Holiday(300, "Makedonija", 1);
		Holiday h2 = new Holiday(100, "Germanija", 2);
		Holiday h3 = new Holiday(160, "Ungarija", 3);
		Holiday h4 = new Holiday(200, "Holandija", 4);

		List<Holiday> holidaysList = new ArrayList<>();
		holidaysList.add(h1);
		holidaysList.add(h2);
		holidaysList.add(h3);
		holidaysList.add(h4);
		holidaysList.add(h1);
		holidaysList.add(h2);
		holidaysList.add(h3);
		holidaysList.add(h4);

		System.out.println("our holidays are:");
		for (Holiday holiday : holidaysList) {
			System.out.println(holiday);
		}
		System.out.println();

		Set<Holiday> holidaySet = new HashSet<>();
		for (Holiday holiday : holidaysList) {
			holidaySet.add(holiday);
		}

		System.out.println("out holidays set");
		for (Holiday holiday : holidaySet) {
			System.out.println(holiday);
		}
		System.out.println();


		Map<Integer, Holiday> holidayMap = new HashMap<>();
		for (Holiday holiday : holidaySet) {
			holidayMap.put(holiday.clientId, holiday);
		}

		System.out.println(holidayMap.get(4));
		System.out.println(holidayMap.get(1));
		System.out.println(holidayMap.get(3));
		System.out.println(holidayMap.get(2));

	}
}