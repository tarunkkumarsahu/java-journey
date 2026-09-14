import java.util.Scanner;

class Passenger {

    String name, destination, coachType;
    int age;
    double distance, fare;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Destination: ");
        destination = sc.nextLine();

        System.out.print("Enter Distance: ");
        distance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Coach Type: ");
        coachType = sc.nextLine();
    }

    void calculateFare() {

        if (coachType.equalsIgnoreCase("AC")) {
            fare = distance * 3;
        }
        else if (coachType.equalsIgnoreCase("Sleeper")) {
            fare = distance * 2;
        }
        else {
            fare = distance;
        }

        if (age >= 60) {
            fare = fare * 0.80;
        }
        else if (age <= 12) {
            fare = fare * 0.50;
        }
    }

    void display() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance);
        System.out.println("Coach Type: " + coachType);
        System.out.println("Fare: " + fare);
    }

    public static void main(String[] args) {

        Passenger p = new Passenger();

        p.input();
        p.calculateFare();
        p.display();
    }
}