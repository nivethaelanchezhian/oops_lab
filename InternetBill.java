import java.util.Scanner;

class InternetBill {
    int customerId;
    String customerName;
    double dataUsed;
    double billAmount;

    // Constructor
    InternetBill(int id, String name, double data) {
        customerId = id;
        customerName = name;
        dataUsed = data;
    }

    // Method to calculate bill
    void calculateBill() {
        if (dataUsed <= 10) {
            billAmount = dataUsed * 10;
        } else if (dataUsed <= 30) {
            billAmount = (10 * 10) + (dataUsed - 10) * 8;
        } else {
            billAmount = (10 * 10) + (20 * 8) + (dataUsed - 30) * 5;
        }
    }

    // Method to display bill
    void displayBill() {
        System.out.println("\n----- INTERNET BILL -----");
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Data Used     : " + dataUsed + " GB");
        System.out.println("Bill Amount   : Rs." + billAmount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Data Used (GB): ");
        double data = sc.nextDouble();

        // Creating object
        InternetBill bill = new InternetBill(id, name, data);

        // Calculate and display bill
        bill.calculateBill();
        bill.displayBill();

        sc.close();
    }
}
