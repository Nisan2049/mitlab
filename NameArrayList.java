//23. Write a program to enter 5 Name and print it using ArrayList.
import java.util.ArrayList;
import java.util.Scanner;

public class NameArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        System.out.println("\nNames are:");
        for (String name = names) {
            System.out.println(name);
        }
    }
}
