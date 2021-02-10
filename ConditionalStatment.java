import java.util.Scanner;

public class  ConditionalStatment {

    public static void main(String[] args) {
        try(Scanner input =new Scanner(System.in)){
            System.out.println("enter a value: ");
            if(input.nextInt()%2==0)
                System.out.println("even");
            else
                System.out.println("odd");

        }
    }
    
}