import java.util.Scanner;

public class FibonacciNUmber {

    public static void findNumber() {
        System.out.println("Enter A Number :");
        try (Scanner s = new Scanner(System.in)) {
            double in = s.nextDouble();
            double sum = 0;
            double var1 = 1;
            double var2 = 1;
            System.out.println(1 + "th fibonacci number is :" + 1);
            System.out.println(2 + "th fibonacci number is :" + 1);
            for (double i = 3; i <= in; i++) {
                sum = var1 + var2;
                var1 = var2;
                var2 = sum;
                System.out.println(i + " th fibonacci number is :" + sum);
            }

        }

    }

    public static void main(String[] args) {
        findNumber();
    }

}