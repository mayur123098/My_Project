import java.util.Random;
import java.util.Scanner;

public class CinemaBooking {

    
    private static Scanner sc = new Scanner(System.in);
    private static String storedUsername;
    private static String storedPassword;
    private static int ticketTotal;
    private static int foodTotal;
    private static int bookingID;
    private static Random rand = new Random();

    //  create an account
    public static void createAccount() {
        System.out.println("=== Create Account ===");
        System.out.println("*****************************");
        System.out.print("Enter UserName: ");
        storedUsername = sc.nextLine();
        System.out.print("Create Password: ");
        storedPassword = sc.nextLine();
        System.out.println("Account Created Successfully...");
        System.out.println("---------------------------------");
    }

    //  login
    public static void login() {
        System.out.println("=== Login ===");
        System.out.println("**************************");
        while (true) {
            System.out.print("Enter UserName: ");
            String u = sc.nextLine();
            System.out.print("Enter Password: ");
            String p = sc.nextLine();

            if (u.equals(storedUsername) && p.equals(storedPassword)) {
                System.out.println("Login Successful");
                System.out.println("-----------------------------");
                break;
            } else {
                System.out.println("Invalid username or password ");
            }
        }
    }

    
    public static void welcomeScreen() {
        System.out.println("WELCOME TO NEW CINEMA");
        System.out.println("- ---- ---- ---- ---- ---- -");
        System.out.print("Press 1 to continue: ");
        int c = sc.nextInt();
        sc.nextLine(); 
        if (c == 1) {
            System.out.println("Start booking Your Tickets");
            System.out.println("...............................");
        } else {
            System.out.println("Logging Out...");
            System.exit(0);
        }
    }

    
    public static void selectMovieAndBookTickets() {
        System.out.println("=== Select Movie ===");
        System.out.println("1-- SpiderMan (9AM, 12PM)");
        System.out.println("2-- SuperMan (10AM, 3PM)");
        System.out.println("3-- Uncharted (11AM, 5PM)");
        System.out.print("Select Movie Number: ");
        int movie_num = sc.nextInt();
        sc.nextLine(); 

        String selectedMovie = "";
        String[] showtimes = new String[2];

        switch (movie_num) {
            case 1:
                selectedMovie = "SpiderMan";
                showtimes[0] = "9:00 AM";
                showtimes[1] = "12:00 PM";
                break;
            case 2:
                selectedMovie = "SuperMan";
                showtimes[0] = "10:00 AM";
                showtimes[1] = "3:00 PM";
                break;
            case 3:
                selectedMovie = "Uncharted";
                showtimes[0] = "11:00 AM";
                showtimes[1] = "5:00 PM";
                break;
            default:
                System.out.println("Invalid movie selection.");
                return; // Exit 
        }

        System.out.println("Available Showtimes:");
        System.out.println("1. " + showtimes[0]);
        System.out.println("2. " + showtimes[1]);
        System.out.print("Choose showtime (1 or 2): ");
        int timeChoice = sc.nextInt();
        sc.nextLine(); 

        String selectedTime;
        if (timeChoice == 1) {
            selectedTime = showtimes[0];
        } else if (timeChoice == 2) {
            selectedTime = showtimes[1];
        } else {
            System.out.println("Invalid showtime choice.");
            return; // Exit 
        }


        System.out.print("Enter Date (1-30): ");
        int date = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Select Seats Category:");
        System.out.println("1. Premium ($300)");
        System.out.println("2. Gold ($200)");
        System.out.println("3. Silver ($100)");
        System.out.print("Select Category Number: ");
        int cat = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter number of seats: ");
        int seatNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your seat names (e.g., P1 G2): ");
        System.out.println("Total Avilable Seats are 1-20");
        String seatNames = sc.nextLine();

        ticketTotal = 0;
        if (cat == 1) {
            ticketTotal = 300 * seatNum;
        } else if (cat == 2) {
            ticketTotal = 200 * seatNum;
        } else if (cat == 3) {
            ticketTotal = 100 * seatNum;
        } else {
            System.out.println("Invalid Category.");
            return; 
        }

        bookingID = rand.nextInt(9000) + 1000; 

        System.out.println("\n--- Ticket Confirmation ---");
        System.out.println("Booking ID: #" + bookingID);
        System.out.println("Movie: " + selectedMovie);
        System.out.println("Time: " + selectedTime);
        System.out.println("Date: " + date);
        System.out.println("Seats: " + seatNames);
        System.out.println("Total Ticket Price: $" + ticketTotal);
        System.out.println("----------------------------");
    }


    public static void orderFood() {
        foodTotal = 0; // 
        System.out.println("\n=== Food Menu ===");
        System.out.println("1. Popcorn ($100)");
        System.out.println("2. Coke ($50)");
        System.out.println("3. Sandwich ($80)");
        System.out.print("Do you want to order food? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter number of items: ");
            int items = sc.nextInt();
            sc.nextLine(); 
            for (int i = 0; i < items; i++) {
                System.out.print("Enter item number (1-3): ");
                int item = sc.nextInt();
                switch (item) {
                    case 1: foodTotal += 100; break;
                    case 2: foodTotal += 50; break;
                    case 3: foodTotal += 80; break;
                    default: System.out.println("Invalid item. Skipping this item.");
                }
            }
        }
    }

    public static void displayFinalBill() {
        int grandTotal = ticketTotal + foodTotal;
        System.out.println("\n--- Final Bill ---");
        System.out.println("Booking ID: #" + bookingID);
        System.out.println("Tickets: $" + ticketTotal);
        System.out.println("Food: $" + foodTotal);
        System.out.println("Total Amount to Pay: $" + grandTotal);
        System.out.println("===============================");
    }


    public static void main(String[] args) {
        
        createAccount();         
        login();                  
        welcomeScreen();          
        selectMovieAndBookTickets(); 
        orderFood();              
        displayFinalBill();       

   
    }
}