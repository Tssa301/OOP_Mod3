package tickets.entities;

public class Bus extends Ticket {

    // Constructor Return
    public Bus(String from, String to, String departDate, String returnDate, String cabinClass, double price) {
        super(from, to, departDate, returnDate, cabinClass, price);
    }

    // Constructor Return One way
    public Bus(String from, String to, String departDate, String cabinClass, double price) {
        super(from, to, departDate, cabinClass, price);
    }
}
