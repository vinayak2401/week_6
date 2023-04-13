/*Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such aacros getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a
 restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost*/

import java.util.Scanner;

class Dish {
    private String name, ingredients;
    private double price;

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getIngredients() {
        return ingredients;
    }
}

class Restaurant {
    Scanner sc = new Scanner(System.in);
    Dish dish[] = new Dish[5];
    Dish dishs = new Dish();
    int noOfDishes = 0;

    void addDish() {
        System.out.println("Enter Dish name : ");
        dishs.setName(sc.nextLine());
        System.out.println("Enter Dish ingrediants : ");
        dishs.setIngredients(sc.nextLine());
        System.out.println("Enter dish price : ");
        dishs.setPrice(sc.nextDouble());
        dish[noOfDishes] = dishs;
        noOfDishes++;
    }

    void removeDish() {
        System.out.println("Enter Dish name to remove: ");
        String name = sc.nextLine();
        int index = 0;
        for (int i = 0; i < noOfDishes; i++) {
            Dish dishs = (Dish) dish[i];
            if (dishs.getName() == name) {
                index = i;
                break;
            }
        }
        for (int i = index; i < noOfDishes; i++) {
            dish[i] = dish[i + 1];
        }
        noOfDishes--;
    }

    void getTotalCost() {
        System.out.println("Enter Dish name: ");
        String name = sc.nextLine();
        System.out.println("Enter Dish quantity : ");
        int quantity = sc.nextInt();
        double totalCost = 0;
        for (int i = 0; i < noOfDishes; i++) {
            Dish dishs = (Dish) dish[i];
            if (dishs.getName() == name) {
                totalCost = dishs.getPrice() * quantity;
            }
        }
        System.out.println("Total Cost is : " + totalCost);
    }
}

public class MacroAssignment3 {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        do {
            System.out.println("Enter 1.Add Dish\n2.Remove Dish\n3.get Total cost\n4.Exit");
            System.out.println("please select..");
            int choice = rest.sc.nextInt();
            if (choice == 4) {
                System.out.println("Terminated..");
                break;
            }
            switch (choice) {
                case 1:
                    rest.addDish();
                    break;
                case 2:
                    rest.removeDish();
                    break;
                case 3:
                    rest.getTotalCost();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (true);
    }
}