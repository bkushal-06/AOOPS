import java.util.LinkedList;
import java.util.Queue;

class CustomerSupportSystem {
    private Queue<String> ticketQueue;

    public CustomerSupportSystem() {
        ticketQueue = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        ticketQueue.offer(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    public void processNextTicket() {
        if (!ticketQueue.isEmpty()) {
            System.out.println("Processing ticket: " + ticketQueue.poll());
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayPendingTickets() {
        System.out.println("Pending Tickets:");
        for (String ticket : ticketQueue) {
            System.out.println(ticket);
        }
    }
}
