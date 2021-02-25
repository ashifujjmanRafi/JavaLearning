import java.util.Scanner;

public class Me {

	public static void sayName() {
		System.out.println("enter your name: ");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);

	}

	public static void sayAge() {
		System.out.print("enter your age ");
		Scanner s = new Scanner(System.in);
		int str = s.nextInt();
		System.out.println(str);

	}

	public static void main(String[] args) {
		
		sayName();
		sayAge();

	}
}