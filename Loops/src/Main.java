import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	static private String[] months =
		{"January", "February", "March",
		"April", "May", "June",
		"July", "August", "September",
		"October", "November", "December"};

	public static void main(String[] args) {

		for (int i = 0; i < months.length; i++) {
			System.out.println("For Loop: " + months[i]);

		}

		for (String  month : months) {
			System.out.println("For Each Loop: " + month);
		}

		int counter = 0;
		while (counter < months.length){
			System.out.println("While Loop: " + months[counter]);
			counter++;
		}

		int counterdo = 0;
		do {
			System.out.println("Do Loop: " + months[counterdo]);
			counterdo++;
		}while (counterdo < months.length);

		}

	}
