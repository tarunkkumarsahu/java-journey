import java.util.Scanner;

class Utility {
    String name;

    double calculateBill() {
        return 0;
    }
}

class Electricity extends Utility {
    double units;

    double calculateBill() {
        return units * 6;
    }
}

class Water extends Utility {
    double units;

    double calculateBill() {
        return units * 3;
    }
}

class PropertyTax extends Utility {
    double propertyValue;

    double calculateBill() {
        return propertyValue * 0.01;
    }
}

class SmartCity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter citizen name: ");
        String name = sc.nextLine();

        Electricity e = new Electricity();
        Water w = new Water();
        PropertyTax p = new PropertyTax();

        e.name = name;
        w.name = name;
        p.name = name;

        System.out.print("Enter electricity units: ");
        e.units = sc.nextDouble();

        System.out.print("Enter water units: ");
        w.units = sc.nextDouble();

        System.out.print("Enter property value: ");
        p.propertyValue = sc.nextDouble();

        double ebill = e.calculateBill();
        double wbill = w.calculateBill();
        double ptax = p.calculateBill();

        double total = ebill + wbill + ptax;

        System.out.println("\n--- Utility Report ---");
        System.out.println("Citizen Name: " + name);
        System.out.println("Electricity Bill: " + ebill);
        System.out.println("Water Bill: " + wbill);
        System.out.println("Property Tax: " + ptax);
        System.out.println("Total Bill: " + total);
    }
}