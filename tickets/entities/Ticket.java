package tickets.entities;

public class Ticket {

    private String from;
    private String to;
    private String departDate;
    private String returnDate;
    private String cabinClass;
    private double price;

    // Constructor Return
    public Ticket(String from, String to, String departDate, String returnDate, String cabinClass, double price) {
        this.from = from;
        this.to = to;
        this.departDate = departDate;
        this.returnDate = returnDate;
        this.cabinClass = cabinClass;
        this.price = price;
    }

    // Constructor Return One way
    public Ticket(String from, String to, String departDate, String cabinClass, double price) {
        this.from = from;
        this.to = to;
        this.departDate = departDate;
        this.cabinClass = cabinClass;
        this.price = price;
    }

    // Getters and Setters
    public String getFrom() {
        return from;
    }

    public void setrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Methods
    public void extraBaggage(double fee) {
        price += fee;
    }
}
