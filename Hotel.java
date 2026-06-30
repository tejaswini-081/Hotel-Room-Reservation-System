import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Hotel() {
        // Add default rooms
        rooms.add(new Room(101, "Single", 1000));
        rooms.add(new Room(102, "Double", 1500));
        rooms.add(new Room(103, "Deluxe", 2500));
        rooms.add(new Room(104, "Suite", 3500));
    }

    // Display all rooms
    public void displayRooms() {
        System.out.println("\n===== Room Details =====");
        for (Room room : rooms) {
            room.displayRoom();
        }
    }

    // Book a room
    public void bookRoom(Customer customer, int roomNumber, int reservationId) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (!room.isBooked()) {

                    room.bookRoom();

                    Reservation reservation =
                            new Reservation(reservationId, customer, room);

                    reservations.add(reservation);

                    System.out.println("\nRoom Booked Successfully!");
                    reservation.displayReservation();

                } else {
                    System.out.println("Room is already booked.");
                }

                return;
            }
        }

        System.out.println("Room not found.");
    }

    // Cancel booking
    public void cancelBooking(int roomNumber) {

        for (Reservation reservation : reservations) {

            if (reservation.getRoom().getRoomNumber() == roomNumber) {

                reservation.getRoom().cancelBooking();

                reservations.remove(reservation);

                System.out.println("Booking Cancelled Successfully!");

                return;
            }
        }

        System.out.println("No reservation found.");
    }

    // View Reservations
    public void displayReservations() {

        if (reservations.isEmpty()) {
            System.out.println("No Reservations Found.");
            return;
        }

        for (Reservation reservation : reservations) {
            reservation.displayReservation();
        }
    }
}
