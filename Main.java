package bloodDonorManagementSystemProject;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bloodBank bloodBank = new bloodBank();
        while (true) {
            System.out.println("\nBlood Bank Management System");
            System.out.println("1. Add Donor");
            System.out.println("2. Display all added Donor list with Blood type");
            System.out.println("3. Search Donor by Blood Type");
            System.out.println("4. Exit");
            System.out.println("");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Read abobe");
                    System.out.print("Enter donor name: ");
                    String name = scanner.nextLine();
                    System.out.print("please, use capital letter. \nEnter blood type (A+, A-, B+, B-, O+, O-, AB+, AB-): ");
                    String bloodType = scanner.nextLine().toUpperCase();
                    bloodBank.addDonor(name, bloodType);
                    break;
                case 2:
                    bloodBank.displayAvailableBlood();
                    break;
                case 3:
                    System.out.println("Enter blood type to search (A+, A-, B+, B-, O+, O-, AB+, AB-): and");
                    System.out.println("use capital letter!");
                    String searchType = scanner.nextLine().toUpperCase();
                    bloodBank.searchDonorByBloodType(searchType);
                    break;
                case 4:
                    System.out.println("Exiting the Blood Bank Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
