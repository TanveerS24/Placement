import java.util.*;

class Slot {
    int id;
    boolean occupied;
    String vehicle;

    Slot(int id) {
        this.id = id;
        this.occupied = false;
        this.vehicle = "";
    }
}

public class ParkingLot {
    static List<Slot> slots = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        while (true) {
            System.out.println("\n1.View Slots\n2.Available Slots\n3.Park Vehicle\n4.Remove Vehicle\n5.Slot Details\n6.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: viewSlots(); break;
                case 2: availableSlots(); break;
                case 3: park(); break;
                case 4: remove(); break;
                case 5: details(); break;
                case 6: System.exit(0);
            }
        }
    }

    static void init() {
        for (int i = 1; i <= 10; i++) slots.add(new Slot(i));
    }

    static void viewSlots() {
        for (Slot s : slots)
            System.out.println("Slot " + s.id + " " + (s.occupied ? "Occupied by " + s.vehicle : "Empty"));
    }

    static void availableSlots() {
        for (Slot s : slots)
            if (!s.occupied)
                System.out.println("Slot " + s.id);
    }

    static void park() {
        System.out.print("Enter Vehicle Number: ");
        String v = sc.next();
        for (Slot s : slots) {
            if (!s.occupied) {
                s.occupied = true;
                s.vehicle = v;
                System.out.println("Parked at Slot " + s.id);
                return;
            }
        }
        System.out.println("No Slots Available");
    }

    static void remove() {
        System.out.print("Enter Vehicle Number: ");
        String v = sc.next();
        for (Slot s : slots) {
            if (s.vehicle.equals(v)) {
                s.occupied = false;
                s.vehicle = "";
                System.out.println("Vehicle Removed from Slot " + s.id);
                return;
            }
        }
        System.out.println("Vehicle Not Found");
    }

    static void details() {
        System.out.print("Enter Slot ID: ");
        int id = sc.nextInt();
        for (Slot s : slots) {
            if (s.id == id) {
                System.out.println("Slot: " + s.id);
                System.out.println("Status: " + (s.occupied ? "Occupied" : "Empty"));
                System.out.println("Vehicle: " + (s.vehicle.equals("") ? "-" : s.vehicle));
                return;
            }
        }
        System.out.println("Invalid Slot");
    }
}