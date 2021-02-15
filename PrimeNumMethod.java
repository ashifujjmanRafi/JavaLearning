import java.util.Scanner;

public class PrimeNumMethod {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)

                return false;
        return true;

    }

    public static void printPrime(int bin, int end) {
        for (int i = bin; i <= end; i++)
            if (isPrime(i))
                System.out.print(i + " ");

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            printPrime(s.nextInt(), s.nextInt());
            System.out.println();

        }
    }

}