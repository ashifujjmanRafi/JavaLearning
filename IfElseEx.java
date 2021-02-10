import java.util.Scanner;

public class IfElseEx {
    public static void luckyNumber() {

        System.out.println("enter an expression: ");
        try (Scanner input = new Scanner(System.in)) {
            double value1 = input.nextDouble();
            char s = input.next().charAt(0);
            double value2 = input.nextDouble();

            if(s =='+')
                System.out.println((int)(value1+value2));
            else if(s == '-')
                System.out.println((int)(value1-value2));
            else if(s == '*')
                System.out.println((int)(value1*value2));
            else
                System.out.println((value1/value2));
        }
    }
}