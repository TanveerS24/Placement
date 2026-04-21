import java.util.*;

class Room {
    int id;
    String type;
    boolean available;
    double price;

    Room(int id, String type, boolean available, double price) {
        this.id = id;
        this.type = type;
        this.available = available;
        this.price = price;
    }
}

class Employee {
    int id;
    String name;
    String role;

    Employee(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
}

public class HotelSystem {
    static List<Room> rooms = new ArrayList<>();
    static List<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        while (true) {
            System.out.println("\n1.View Rooms\n2.View Available Rooms\n3.Book Room\n4.Checkout Room\n5.Room Details\n6.Employee Details\n7.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: viewRooms(); break;
                case 2: viewAvailableRooms(); break;
                case 3: bookRoom(); break;
                case 4: checkoutRoom(); break;
                case 5: roomDetails(); break;
                case 6: employeeDetails(); break;
                case 7: System.exit(0);
            }
        }
    }

    static void init() {
        rooms.add(new Room(101, "Single", true, 1000));
        rooms.add(new Room(102, "Double", true, 1500));
        rooms.add(new Room(103, "Suite", false, 3000));
        rooms.add(new Room(104, "Single", true, 1000));
        rooms.add(new Room(105, "Double", false, 1500));

        employees.add(new Employee(1, "Arun", "Manager"));
        employees.add(new Employee(2, "Priya", "Receptionist"));
        employees.add(new Employee(3, "Ravi", "Housekeeping"));
    }

    static void viewRooms() {
        for (Room r : rooms)
            System.out.println(r.id + " " + r.type + " " + (r.available ? "Available" : "Booked") + " Rs. " + r.price);
    }

    static void viewAvailableRooms() {
        for (Room r : rooms)
            if (r.available)
                System.out.println(r.id + " " + r.type + " ₹" + r.price);
    }

    static void bookRoom() {
        System.out.print("Enter Room ID: ");
        int id = sc.nextInt();
        for (Room r : rooms) {
            if (r.id == id) {
                if (r.available) {
                    r.available = false;
                    System.out.println("Booked Successfully");
                } else {
                    System.out.println("Already Booked");
                }
                return;
            }
        }
        System.out.println("Room Not Found");
    }

    static void checkoutRoom() {
        System.out.print("Enter Room ID: ");
        int id = sc.nextInt();
        for (Room r : rooms) {
            if (r.id == id) {
                if (!r.available) {
                    r.available = true;
                    System.out.println("Checkout Successful");
                } else {
                    System.out.println("Room Already Vacant");
                }
                return;
            }
        }
        System.out.println("Room Not Found");
    }

    static void roomDetails() {
        System.out.print("Enter Room ID: ");
        int id = sc.nextInt();
        for (Room r : rooms) {
            if (r.id == id) {
                System.out.println("ID: " + r.id);
                System.out.println("Type: " + r.type);
                System.out.println("Status: " + (r.available ? "Available" : "Booked"));
                System.out.println("Price: ₹" + r.price);
                return;
            }
        }
        System.out.println("Room Not Found");
    }

    static void employeeDetails() {
        for (Employee e : employees)
            System.out.println(e.id + " " + e.name + " " + e.role);
    }
}