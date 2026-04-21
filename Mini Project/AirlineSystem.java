import java.util.*;

class Flight {
    int id;
    String name;
    int seats;
    int available;

    Flight(int id, String name, int seats) {
        this.id = id;
        this.name = name;
        this.seats = seats;
        this.available = seats;
    }
}

public class AirlineSystem {
    static List<Flight> flights = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        while (true) {
            System.out.println("\n1.View Flights\n2.Available Seats\n3.Book Ticket\n4.Cancel Ticket\n5.Flight Details\n6.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: viewFlights(); break;
                case 2: available(); break;
                case 3: book(); break;
                case 4: cancel(); break;
                case 5: details(); break;
                case 6: System.exit(0);
            }
        }
    }

    static void init() {
        flights.add(new Flight(1, "Indigo", 100));
        flights.add(new Flight(2, "AirIndia", 120));
        flights.add(new Flight(3, "SpiceJet", 80));
    }

    static void viewFlights() {
        for (Flight f : flights)
            System.out.println(f.id + " " + f.name + " Seats: " + f.available + "/" + f.seats);
    }

    static void available() {
        for (Flight f : flights)
            System.out.println(f.name + " Available Seats: " + f.available);
    }

    static void book() {
        System.out.print("Enter Flight ID: ");
        int id = sc.nextInt();
        System.out.print("Seats to Book: ");
        int n = sc.nextInt();
        for (Flight f : flights) {
            if (f.id == id) {
                if (f.available >= n) {
                    f.available -= n;
                    System.out.println("Booking Confirmed");
                } else {
                    System.out.println("Not Enough Seats");
                }
                return;
            }
        }
        System.out.println("Flight Not Found");
    }

    static void cancel() {
        System.out.print("Enter Flight ID: ");
        int id = sc.nextInt();
        System.out.print("Seats to Cancel: ");
        int n = sc.nextInt();
        for (Flight f : flights) {
            if (f.id == id) {
                if (f.available + n <= f.seats) {
                    f.available += n;
                    System.out.println("Cancelled Successfully");
                } else {
                    System.out.println("Invalid Cancel");
                }
                return;
            }
        }
        System.out.println("Flight Not Found");
    }

    static void details() {
        System.out.print("Enter Flight ID: ");
        int id = sc.nextInt();
        for (Flight f : flights) {
            if (f.id == id) {
                System.out.println("Flight: " + f.name);
                System.out.println("Total Seats: " + f.seats);
                System.out.println("Available: " + f.available);
                return;
            }
        }
        System.out.println("Flight Not Found");
    }
}