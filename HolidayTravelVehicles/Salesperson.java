import java.util.List;
import java.util.ArrayList;

public class Salesperson {
    private String salespersonID;
    private String name;
    private List<String> phoneNumbers;

    public Salesperson(String salespersonID, String name) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.phoneNumbers = new ArrayList<>();
    }

    public void createInvoice() {
        // Implementation for creating an invoice
    }

    public void negotiatePrice() {
        // Implementation for negotiating price
    }

    public void addTradeInDetails() {
        // Implementation for adding trade-in details
    }

    public void addDealerOptions() {
        // Implementation for adding dealer options
    }

    // Getters and Setters
    public String getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(String salespersonID) {
        this.salespersonID = salespersonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}