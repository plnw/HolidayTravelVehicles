public class Customer {
    private String customerID;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String customerID, String name, String address, String phoneNumber) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void purchaseVehicle() {
        // Implementation for purchasing a vehicle
    }

    public void addTradeInVehicle() {
        // Implementation for adding a trade-in vehicle
    }

    public void requestDealerOptions() {
        // Implementation for requesting dealer options
    }

    // Getters and Setters
    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}