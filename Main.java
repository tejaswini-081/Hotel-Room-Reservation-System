import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        int customerId = 1;
        int reservationId = 1001;

        while (true) {

            System.out.println("\n========== HOTEL ROOM RESERVATION SYSTEM ==========");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Reservations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    hotel.displayRooms();
                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    Customer customer =
                            new Customer(customerId++, name, phone);

                    hotel.bookRoom(customer, roomNo, reservationId++);

                    break;

                case 3:

                    System.out.print("Enter Room Number to Cancel: ");
                    int cancelRoom = sc.nextInt();

                    hotel.cancelBooking(cancelRoom);

                    break;

                case 4:

                    hotel.displayReservations();

                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}
