import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Add strings
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }

        System.out.println("\nArrayList: " + list);

        // Display string operations
        for (String str : list) {
            System.out.println("\nString: " + str);
            System.out.println("Length: " + str.length());
            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " + str.toLowerCase());
            System.out.println("Reverse: " +
                    new StringBuilder(str).reverse());
        }

        // Search
        System.out.print("\nEnter string to search: ");
        String search = sc.nextLine();

        if (list.contains(search))
            System.out.println("String found.");
        else
            System.out.println("String not found.");

        // Remove
        System.out.print("Enter string to remove: ");
        String remove = sc.nextLine();

        if (list.remove(remove))
            System.out.println("String removed.");
        else
            System.out.println("String not found.");

        System.out.println("Final ArrayList: " + list);

        sc.close();
    }
}
