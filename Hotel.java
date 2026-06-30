public class Hotel {
    Room[] rooms = new Room[5];

    public Hotel() {
        rooms[0] = new Room(101, "Single");
        rooms[1] = new Room(102, "Double");
        rooms[2] = new Room(103, "Single");
        rooms[3] = new Room(104, "Deluxe");
        rooms[4] = new Room(105, "Suite");
    }

    public void checkAvailability() {
        System.out.println("\nAvailable Rooms:");
        for (Room room : rooms) {
            if (!room.isBooked) {
                room.displayRoom();
            }
        }
    }

    public boolean bookRoom(int roomNo) {
        for (Room room : rooms) {
            if (room.roomNo == roomNo && !room.isBooked) {
                room.isBooked = true;
                return true;
            }
        }
        return false;
    }

    public boolean checkout(int roomNo) {
        for (Room room : rooms) {
            if (room.roomNo == roomNo && room.isBooked) {
                room.isBooked = false;
                return true;
            }
        }
        return false;
    }

    public void generateBill(int days, int roomNo) {
        int rate = 1000;

        for (Room room : rooms) {
            if (room.roomNo == roomNo) {
                if (room.roomType.equals("Double"))
                    rate = 1500;
                else if (room.roomType.equals("Deluxe"))
                    rate = 2500;
                else if (room.roomType.equals("Suite"))
                    rate = 4000;
            }
        }

        System.out.println("Total Bill = Rs. " + (days * rate));
    }
}
