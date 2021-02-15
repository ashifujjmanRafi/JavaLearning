import java.util.Scanner;

public class Me {

	public static void sayName() {
		try (Scanner s = new Scanner(System.in)) {
			String str = s.nextLine();
			System.out.println(str);
		}

	}

	public static void sayAge() {
		Scanner s = new Scanner(System.in);
			int str = s.nextInt();
			System.out.println(str);
		
	}
	public static void main(String[] args) {
		sayAge();
		sayName();
		
	}
}