public class Reservation {
    private int reservationId;
    private Customer customer;
    private Room room;

    public Reservation(int reservationId, Customer customer, Room room) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.room = room;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public void displayReservation() {
        System.out.println("\n===== Reservation Details =====");
        System.out.println("Reservation ID : " + reservationId);
        customer.displayDetails();
        System.out.println("Room Number    : " + room.getRoomNumber());
        System.out.println("Room Type      : " + room.getRoomType());
        System.out.println("Price          : ₹" + room.getPrice());
        System.out.println("===============================");
    }
}
