import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(id, name, phone);

        int choice;

        do {
            System.out.println("\n----- HOTEL ROOM RESERVATION SYSTEM -----");
            System.out.println("1. Display Customer");
            System.out.println("2. Check Room Availability");
            System.out.println("3. Book Room");
            System.out.println("4. Checkout");
            System.out.println("5. Generate Bill");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    customer.displayCustomer();
                    break;

                case 2:
                    hotel.checkAvailability();
                    break;

                case 3:
                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();
                    if (hotel.bookRoom(roomNo))
                        System.out.println("Room Booked Successfully.");
                    else
                        System.out.println("Room Not Available.");
                    break;

                case 4:
                    System.out.print("Enter Room Number: ");
                    roomNo = sc.nextInt();
                    if (hotel.checkout(roomNo))
                        System.out.println("Checkout Successful.");
                    else
                        System.out.println("Invalid Room Number.");
                    break;

                case 5:
                    System.out.print("Enter Room Number: ");
                    roomNo = sc.nextInt();
                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();
                    hotel.generateBill(days, roomNo);
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
