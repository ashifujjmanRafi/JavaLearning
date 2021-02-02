import java.util.Scanner;

public class Test26 {
	public static void addInt() {
		Scanner inputx = new Scanner(System.in);
		int total = inputx.nextInt();
		int totalValue = 0;

		for (int i = 0; i < total; i++) {
			int value = inputx.nextInt();
			value = value + i;
			totalValue += value;
			System.out.println(total);
		}
		System.out.println(totalValue);
	}
}
