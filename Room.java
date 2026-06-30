public class Room {
    int roomNo;
    String roomType;
    boolean isBooked;

    public Room(int roomNo, String roomType) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.isBooked = false;
    }

    public void displayRoom() {
        System.out.println("Room No: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Booked: " + isBooked);
    }
}
