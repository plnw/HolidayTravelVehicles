public class Main {
    public static void main(String[] args) {
        // Create a new Vehicle object
        Vehicle vehicle = new Vehicle("12345", "Toyota Camry", "Camry", 2023, "Toyota", 25000.0);

        // Display vehicle information
        System.out.println("Vehicle Details:");
        System.out.println("Serial Number: " + vehicle.getSerialNumber());
        System.out.println("Name: " + vehicle.getName());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Manufacturer: " + vehicle.getManufacturer());
        System.out.println("Base Cost: $" + vehicle.getBaseCost());
    }
}