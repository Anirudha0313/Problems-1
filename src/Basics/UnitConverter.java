import java.util.Scanner;

public class UnitConverter {
    private Scanner scanner;

    public UnitConverter() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        UnitConverter converter = new UnitConverter();
        converter.run();
    }

    public void run() {
        boolean done = false;
        while (!done) {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Convert Gallons to Liters");
            System.out.println("2. Convert Meters to Miles");
            System.out.println("3. Convert Grams to Kilograms");
            System.out.println("4. Convert Inches to Meters");
            System.out.println("5. Convert Kilograms to Pounds");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertGallonsToLiters();
                    break;
                case 2:
                    convertMetersToMiles();
                    break;
                case 3:
                    convertGramsToKilograms();
                    break;
                case 4:
                    convertInchesToMeters();
                    break;
                case 5:
                    convertKilogramsToPounds();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private void convertGallonsToLiters() {
        System.out.print("Enter gallons: ");
        double gallons = scanner.nextDouble();
        double liters = gallons * 3.78541;
        System.out.printf("%.2f gallons = %.2f liters%n", gallons, liters);
    }

    private void convertMetersToMiles() {
        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        double miles = meters * 0.000621371;
        System.out.printf("%.2f meters = %.6f miles%n", meters, miles);
    }

    private void convertGramsToKilograms() {
        System.out.print("Enter grams: ");
        double grams = scanner.nextDouble();
        double kilograms = grams / 1000;
        System.out.printf("%.2f grams = %.4f kilograms%n", grams, kilograms);
    }

    private void convertInchesToMeters() {
        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();
        double meters = inches * 0.0254;
        System.out.printf("%.2f inches = %.4f meters%n", inches, meters);
    }

    private void convertKilogramsToPounds() {
        System.out.print("Enter kilograms: ");
        double kg = scanner.nextDouble();
        double pounds = kg * 2.20462;
        System.out.printf("%.2f kilograms = %.2f pounds%n", kg, pounds);
    }
}   
