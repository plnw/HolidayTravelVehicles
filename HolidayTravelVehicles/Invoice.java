import java.util.Date;

public class Invoice {
    private String invoiceID;
    private Date date;
    private double finalPrice;
    private double tradeInAllowance;

    public Invoice(String invoiceID, Date date, double finalPrice, double tradeInAllowance) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.finalPrice = finalPrice;
        this.tradeInAllowance = tradeInAllowance;
    }

    public void calculateTotalCost() {
        // Implementation for calculating total cost
    }

    public void addDealerOptions() {
        // Implementation for adding dealer options
    }

    public void printInvoice() {
        // Implementation for printing invoice
    }

    // Getters and Setters
    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public double getTradeInAllowance() {
        return tradeInAllowance;
    }

    public void setTradeInAllowance(double tradeInAllowance) {
        this.tradeInAllowance = tradeInAllowance;
    }
}