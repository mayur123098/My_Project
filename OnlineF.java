import java.util.Scanner;

public class OnlineF {
    Scanner sc = new Scanner(System.in);
    String storedUsername;
    String storedPassword;

    void createAccount() {
        System.out.println("=== Create Account ===");
        System.out.print("Enter new username: ");
        storedUsername = sc.nextLine();

        System.out.print("Create a password: ");
        storedPassword = sc.nextLine();

        System.out.println("Account created successfully!");
        System.out.println("********************************");
    }

    void login() {
        System.out.println("=== Login ===");

        while (true) {
            System.out.print("Enter Username: ");
            String u = sc.nextLine();

            System.out.print("Enter Password: ");
            String p = sc.nextLine();

            if (u.equals(storedUsername) && p.equals(storedPassword)) {
                System.out.println("LOGIN SUCCESSFUL");
                System.out.println("Welcome " + u);
                System.out.println("********************************");
                break;
            } else {
                System.out.println("Login failed! Invalid username or password. Please try again.\n");
            }
        }
    }

    void menu() {
        while (true) {
            System.out.println("\nEnter your choice");
            System.out.println("1 for Meals, 2 for Drinks, 3 for Exit");

            int c;
            try {
                c = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (c) {
                case 1:
                    System.out.println("You chose Meals");
                    System.out.println("--------------------------------");
                    System.out.println("Pizza $100");
                    System.out.println("Sandwich $50");
                    System.out.println("Burger $20");
                    System.out.println("Fries $70");
                    System.out.println("............................");

                    System.out.print("Enter your order: ");
                    String meal = sc.nextLine().toLowerCase();

                    System.out.print("Enter quantity: ");
                    int qu = Integer.parseInt(sc.nextLine());

                    int priceMeal = 0;
                    switch (meal) {
                        case "pizza":
                            priceMeal = 100;
                            break;
                        case "sandwich":
                            priceMeal = 50;
                            break;
                        case "burger":
                            priceMeal = 20;
                            break;
                        case "fries":
                            priceMeal = 70;
                            break;
                        default:
                            System.out.println("Wrong input");
                            continue;
                    }

                    System.out.println("Order placed");
                    System.out.println("Total amount: $" + (priceMeal * qu));
                    break;

                case 2:
                    System.out.println("You chose Drinks");
                    System.out.println("--------------------------------");
                    System.out.println("Tea $20");
                    System.out.println("Coffee $30");
                    System.out.println("Coke $50");
                    System.out.println("Sprite $50");
                    System.out.println("..........................");

                    System.out.print("Enter your drink: ");
                    String drink = sc.nextLine().toLowerCase();

                    System.out.print("Enter quantity: ");
                    int dq = Integer.parseInt(sc.nextLine());

                    int priceDrink = 0;
                    switch (drink) {
                        case "tea":
                            priceDrink = 20;
                            break;
                        case "coffee":
                            priceDrink = 30;
                            break;
                        case "coke":
                            priceDrink = 50;
                            break;
                        case "sprite":
                            priceDrink = 50;
                            break;
                        default:
                            System.out.println("Wrong input");
                            continue;
                    }

                    System.out.println("Order placed");
                    System.out.println("Total amount: $" + (priceDrink * dq));
                    break;

                case 3:
                    System.out.println("Thank you for visiting!");
                    return;

                default:
                    System.out.println("Wrong input. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        OnlineF obj = new OnlineF();
        obj.createAccount();
        obj.login();
        obj.menu();
    }
}
