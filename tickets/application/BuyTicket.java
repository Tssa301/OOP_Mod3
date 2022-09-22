package tickets.application;

import tickets.entities.Airplane;
import tickets.entities.Bus;

public class BuyTicket {

        public static void main(String[] args) {

                // Create an Airplane object.
                // Constructor Return
                Airplane airTicket1 = new Airplane("Lisbon", "Ireland", "21/09/2022", "25/09/2022", "Business Class",
                                225.0);
                System.out.println("Air Ticket 1: From " + airTicket1.getFrom() + " to " + airTicket1.getTo() + " from "
                                + airTicket1.getDepartDate() + " to " + airTicket1.getReturnDate() + " in "
                                + airTicket1.getCabinClass()
                                + ", costs € " + airTicket1.getPrice() + " including tax.");

                // Constructor Return One way
                Airplane airTicket2 = new Airplane("Italy", "Spain", "23/09/2022", "Economy Class", 85.0);
                airTicket2.extraBaggage(45.0);
                System.out.println("Air Ticket 2: From " + airTicket2.getFrom() + " to " + airTicket2.getTo() + " on "
                                + airTicket2.getDepartDate() + " in " + airTicket2.getCabinClass()
                                + " with extra baggage, cost € "
                                + airTicket2.getPrice() + " including tax.");

                System.out.println();

                // Create a Bus object.
                // Constructor Return
                Bus busTicket1 = new Bus("Lisbon", "Faro", "01/11/2022", "08/11/2022", "Plus Class", 70.0);
                System.out.println("Bus Ticket 1: From " + busTicket1.getFrom() + " to " + busTicket1.getTo() + " from "
                                + busTicket1.getDepartDate() + " to " + busTicket1.getReturnDate() + " in "
                                + airTicket1.getCabinClass()
                                + ", costs € " + busTicket1.getPrice() + " including tax.");

                // Constructor Return One way
                Bus busTicket2 = new Bus("Porto", "Lisbon", "24/09/2022", "Economy Class", 37.0);
                busTicket2.extraBaggage(15.0);
                System.out.println("Bus Ticket 2: From " + busTicket2.getFrom() + " to " + busTicket2.getTo() + " on "
                                + busTicket2.getDepartDate() + " in " + busTicket2.getCabinClass()
                                + " with extra baggage, cost € "
                                + busTicket2.getPrice() + " including tax.");

        }
}
