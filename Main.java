package Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook myAddressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====================================");
            System.out.println("          Address Book Menu         ");
            System.out.println("====================================");
            System.out.println("1. Add Entry");
            System.out.println("2. Delete Entry");
            System.out.println("3. View All Entries");
            System.out.println("4. Update Entry");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // consume invalid input
                System.out.print("Choose an option (1-5): ");
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter address: ");
                String address = scanner.nextLine();
                System.out.print("Enter telephone number: ");
                String phone = scanner.nextLine();
                System.out.print("Enter email address: ");
                String email = scanner.nextLine();

                AddressBookEntry entry = new AddressBookEntry(name, address, phone, email);
                myAddressBook.addEntry(entry);

            } else if (choice == 2) {
                System.out.print("Enter name to delete: ");
                String nameToDelete = scanner.nextLine();
                myAddressBook.deleteEntry(nameToDelete);

            } else if (choice == 3) {
                myAddressBook.viewAllEntries();

            } else if (choice == 4) {
                System.out.print("Enter name to update: ");
                String nameToUpdate = scanner.nextLine();
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new address: ");
                String newAddress = scanner.nextLine();
                System.out.print("Enter new phone: ");
                String newPhone = scanner.nextLine();
                System.out.print("Enter new email: ");
                String newEmail = scanner.nextLine();

                AddressBookEntry newEntry = new AddressBookEntry(newName, newAddress, newPhone, newEmail);
                myAddressBook.updateEntry(nameToUpdate, newEntry);

            } else if (choice == 5) {
                System.out.println("Thank you for using the Address Book!");

            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}