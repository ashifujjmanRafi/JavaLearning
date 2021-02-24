import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        String str;

        for (int i = 0; i < 5; i++) {
            str = s.next();
            fruits.add(str);

        }
        Collections.sort(fruits);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");

        }

        System.out.println(fruits);// this will print entire arraylist

    }

}
