import java.util.Scanner;

public class WhileLoop {

    public static void Test() {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a value between 1 to 10");

            double value1 = s.nextDouble();

            // using while loop
            while (value1 < 1 || value1 > 10) {

                value1 = s.nextDouble();
                System.out.println("please Enter a value between 1 to 10");

            }
            System.out.println("value between 1 to 10 is" + value1);

            // using for loop finding a number between 1 to 10
            for (; value1 < 1 || value1 > 10;) {

                System.out.println("please Enter a value between 1 to 10");

                value1 = s.nextDouble();

            }
            System.out.println("value between 1 to 10 is" + value1);

        }

    }

}
