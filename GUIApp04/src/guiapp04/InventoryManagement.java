/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapp04;

/**
 *
 * @author Suprava Modak
 */
import java.util.*;

class InventoryItem {
    private String name;
    private int quantity;

    public InventoryItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int quantityToAdd) {
        quantity += quantityToAdd;
    }

    public boolean removeQuantity(int quantityToRemove) {
        if (quantity >= quantityToRemove) {
            quantity -= quantityToRemove;
            return true;
        }
        return false;
    }
}

class InventoryManager {
    private List<InventoryItem> inventory;

    public InventoryManager() {
        this.inventory = new ArrayList<>();
    }

    public void addItem(String name, int quantity) {
        InventoryItem newItem = new InventoryItem(name, quantity);
        inventory.add(newItem);
    }

    public void removeItem(String name, int quantity) {
        for (InventoryItem item : inventory) {
            if (item.getName().equals(name)) {
                if (item.removeQuantity(quantity)) {
                    System.out.println(quantity + " " + name + "(s) removed from inventory.");
                    if (item.getQuantity() == 0) {
                        inventory.remove(item);
                    }
                    return;
                } else {
                    System.out.println("Error: Requested quantity exceeds available quantity in inventory for " + name + ".");
                    return;
                }
            }
        }
        System.out.println("Error: Item not found in inventory.");
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (InventoryItem item : inventory) {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add items to inventory");
            System.out.println("2. Remove items from inventory");
            System.out.println("3. Display current inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String addItemName = scanner.next();
                    System.out.print("Enter quantity to add: ");
                    int addQuantity = scanner.nextInt();
                    inventoryManager.addItem(addItemName, addQuantity);
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String removeItemName = scanner.next();
                    System.out.print("Enter quantity to remove: ");
                    int removeQuantity = scanner.nextInt();
                    inventoryManager.removeItem(removeItemName, removeQuantity);
                    break;
                case 3:
                    inventoryManager.displayInventory();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
