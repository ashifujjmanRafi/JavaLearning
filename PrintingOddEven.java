import java.util.Scanner;

public class PrintingOddEven {

    public static void doSum() {
        try (Scanner s = new Scanner(System.in)) {

            // System.out.println("enter value untill its 100: ");
            int x = 0;

            while (x <= 100) {
                System.out.println("enter   value untill its 100: ");
                int i = s.nextInt();
                x = x + i;
            }
            System.out.println("Done");

        }
    }

    public static void strictDivisors() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("enter a vLUE: ");
            int var1 = s.nextInt();
            int sum = 0;
            System.out.print(var1 + "= ");
            for (int i = 1; i <= var1 / 2; i++) {
                if (var1 % i == 0) {
                    System.out.print(i + " + ");
                    sum += i;
                }

            }
            System.out.println(" ="+sum);

        }
    }

}
