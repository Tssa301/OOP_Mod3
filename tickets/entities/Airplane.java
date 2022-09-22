package tickets.entities;

public class Airplane extends Ticket {

    // Constructor Return
    public Airplane(String from, String to, String departDate, String returnDate, String cabinClass, double price) {
        super(from, to, departDate, returnDate, cabinClass, price);
    }

    // Constructor Return One way
    public Airplane(String from, String to, String departDate, String cabinClass, double price) {
        super(from, to, departDate, cabinClass, price);
    }
}
