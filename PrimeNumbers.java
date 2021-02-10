import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            System.out.print("Enter a value :");
            int var1 = s.nextInt();
            int x = 0;
            for (int i = 1; i <= var1; i++) {
                for (int j = 2; j <= i / 2; j++) {

                    if (i % j == 0)
                        x++;

                }

                if (x > 0)
                    x = 0;
                else {
                    System.out.print(i + " ");
                    x = 0;

                }
            }

        }
    }

}
