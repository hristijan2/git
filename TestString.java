package DayEight;

public class TestString {

	public static void main(String[] args) {
		String r = reverse("123456789");
		System.out.println(r);
	}
	
	public static String reverse(String s) {
		char[] letters = new char [s.length()];
			
		int letterIndex = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			letters[letterIndex] = s.charAt(i);
			letterIndex++;
		}
		
		String reverse = "";
		for(int i = 0; i < s.length(); i++) {
			reverse = reverse + letters[i];
		}
		
		return reverse;
	}

//		for (int i = 0; i< s1.length(); i++) {
//			System.out.println(s1.charAt(i) + ", ");
//		}
//
//		System.out.println();
//
//		int j = 0;
//		LabelName1: while (j < s1.length()) {
//			System.out.print(s1.charAt(j) + ", ");
//			j++;
//		}
//
//		LabelName2: {
//
//		}
//
//		System.out.println();
//
//		int k = 0;
//		do {
//			System.out.println(s1.charAt(k) + ", ");
//			k++;		
//		} while (k < s1.length());
//
//		System.out.println();
//
//		for (int i = 0; i< s1.length(); i++) {
//			if (i >= 7) { 
//				break;
//			}
//			if ( i % 2 == 0) {
//				System.out.println(s1.charAt(i));					
//			} else {
//				continue;
//			}
//			System.out.print(" - something - ");
//		}
//		
//		
//		someLabel: {
//			System.out.println("one");
//			if (s1.length() > 0) {
//				break someLabel;
//			}
//			System.out.println("two");
//		}





		//		while (true) {
		//			int k = 0;
		//			if (k < s1.length()) {
		//				System.out.println(s1.charAt(k) + ", ");
		//			}
		//			k++;
		//		}
	}

