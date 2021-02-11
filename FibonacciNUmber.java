import java.util.Scanner;

public class FibonacciNUmber {

    public static void findNumber() {
        System.out.println("Enter A Number :");
        try (Scanner s = new Scanner(System.in)) {
            int in = s.nextInt();
            int sum = 0;
            int var1 = 1;
            int var2 = 1;
            System.out.println(1 + "th fibonacci number is :" + 1);
            System.out.println(2 + "th fibonacci number is :" + 1);
            for (int i = 3; i <= in; i++) {
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