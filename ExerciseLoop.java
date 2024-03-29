import java.util.Scanner;

public class ExerciseLoop {

    public static void nestedLoop() {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");

                for (int k = 1; k <= 2 * i - 1; k++)
                    if (i == n)
                        System.out.print("*");
                    else if (k == 1 || k == 2 * i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");

                // for(int k=1;k<=2*i-1;k++)//printing triangle
                // System.out.print("+");

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        nestedLoop();
    }

}
