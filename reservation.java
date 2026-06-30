public class Reservation {

    Customer customer;
    Room room;
    int days;

    public Reservation(Customer customer, Room room, int days) {
        this.customer = customer;
        this.room = room;
        this.days = days;
    }

    public void displayReservation() {
        System.out.println("\n----- Reservation Details -----");
        customer.displayCustomer();
        room.displayRoom();
        System.out.println("Number of Days: " + days);
    }

    public void generateBill() {
        int rate = 1000;

        if (room.roomType.equals("Double")) {
            rate = 1500;
        } else if (room.roomType.equals("Deluxe")) {
            rate = 2500;
        } else if (room.roomType.equals("Suite")) {
            rate = 4000;
        }

        int total = rate * days;
        System.out.println("Total Bill = Rs. " + total);
    }
}
