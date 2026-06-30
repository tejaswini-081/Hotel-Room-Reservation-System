public class Room {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean booked;

    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookRoom() {
        booked = true;
    }

    public void cancelBooking() {
        booked = false;
    }

    public void displayRoom() {
        System.out.println("Room No : " + roomNumber);
        System.out.println("Type    : " + roomType);
        System.out.println("Price   : ₹" + price);
        System.out.println("Status  : " + (booked ? "Booked" : "Available"));
        System.out.println("----------------------------");
    }
}
