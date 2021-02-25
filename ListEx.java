import java.util.ArrayList;
import java.util.Scanner;

public class ListEx {
    // array list exercise add,remove,show

    public static void displayOption() {
        System.out.println("enter your choice: ");
        System.out.print("1.add  value, ");
        System.out.print("2.remove,");
        System.out.print("3.set value, ");
        System.out.print("4.display, ");
        System.out.println("5.exit ");
        // System.out.println();
    }

    public static void showChoice() {
        ArrayList<Integer> integer = new ArrayList<>();

        try (Scanner s = new Scanner(System.in)) {

            int choice;

            while (true) {
                displayOption();
                choice = s.nextInt();
                if (choice == 1) {
                    System.out.println("enter your number: ");
                    int element = s.nextInt();
                    integer.add(element);
                    System.out.println("number added ");

                } else if (choice == 2) {
                    System.out.println("enter your number to remove: ");
                    int element = s.nextInt();
                    if (integer.contains(element)) {
                        integer.remove(Integer.valueOf(element));
                        System.out.println("number removed");
                    } else
                        System.out.println("number not found ");

                } else if (choice == 3) {
                    System.out.println("enter an index and a value to set ");
                    integer.set(s.nextInt(), s.nextInt());
                    System.out.println("the value is set to the index ");
                }

                else if (choice == 4) {
                    System.out.println("yout array " + integer);

                } else {
                    System.out.println("goood bye");
                    return;
                }

            }

        }
    }

    public static void main(String[] args) {
        showChoice();
    }

}