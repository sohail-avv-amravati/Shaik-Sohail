import java.util.Scanner;
   class temperature_converter {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion: ");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        if (choice = 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice = 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
    }
}
