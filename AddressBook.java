package Address;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<AddressBookEntry> entries;

    public AddressBook() {
        entries = new ArrayList<AddressBookEntry>(100);
    }

    public void addEntry(AddressBookEntry entry) {
        if (entries.size() < 100) {
            entries.add(entry);
            System.out.println("Entry added successfully!");
        } else {
            System.out.println("Address book is full. Cannot add more entries.");
        }
    }

    public void deleteEntry(String name) {
        AddressBookEntry entryToRemove = null;
        for (AddressBookEntry entry : entries) {
            if (entry.getName().equalsIgnoreCase(name)) {
                entryToRemove = entry;
                break;
            }
        }

        if (entryToRemove != null) {
            entries.remove(entryToRemove);
            System.out.println("Entry deleted.");
        } else {
            System.out.println("Entry not found.");
        }
    }

    public void viewAllEntries() {
        if (entries.isEmpty()) {
            System.out.println("Address book is empty.");
        } else {
            for (AddressBookEntry entry : entries) {
                System.out.println(entry);
            }
        }
    }

    public void updateEntry(String name, AddressBookEntry newEntry) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getName().equalsIgnoreCase(name)) {
                entries.set(i, newEntry);
                System.out.println("Entry updated.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }
}